/*
 * Copyright 2015 Marco Semiao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package fr.ms.maven.plugin;

import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.logging.Log;

/**
 *
 * @see <a href="http://marcosemiao4j.wordpress.com">Marco4J</a>
 *
 *
 * @author Marco Semiao
 *
 */
public abstract class AbstractLoggerMojo extends AbstractMojo {

    @Override
    public void setLog(final Log log) {
	super.setLog(log);
	MojoLoggerHolder.mojoLogger.setMavenLogger(log);
    }

    @Override
    public Log getLog() {
	final Log log = super.getLog();

	MojoLoggerHolder.mojoLogger.setMavenLogger(log);

	return log;
    }

    private static class MojoLoggerHolder {
	private final static MojoLogger mojoLogger = createInstance();

	private final static MojoLogger createInstance() {
	    try {
		final ServiceLoader<MojoLogger> load = ServiceLoader.load(MojoLogger.class);

		final Iterator<MojoLogger> iterator = load.iterator();
		final MojoLogger singleton = iterator.next();

		if (iterator.hasNext()) {
		    throw new ServiceConfigurationError("Plusieurs implémentations de MojoLogger trouvées");
		}
		return singleton;
	    } catch (final Exception e) {
		throw new ServiceConfigurationError("Aucune implémentation de MojoLogger trouvée", e);
	    }
	}
    }
}
