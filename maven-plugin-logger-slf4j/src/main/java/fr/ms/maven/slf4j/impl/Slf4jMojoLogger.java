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
package fr.ms.maven.slf4j.impl;

import org.apache.maven.plugin.logging.Log;
import org.slf4j.impl.StaticLoggerBinder;

import fr.ms.maven.plugin.MojoLogger;
import fr.ms.util.ServiceLoader;

/**
 *
 * @see <a href="http://marcosemiao4j.wordpress.com">Marco4J</a>
 *
 *
 * @author Marco Semiao
 *
 */
@ServiceLoader
public class Slf4jMojoLogger implements MojoLogger {

    private final static StaticLoggerBinder staticLoggerBinder = StaticLoggerBinder.getSingleton();

    @Override
    public void setMavenLogger(final Log log) {
	staticLoggerBinder.setMavenLog(log);
    }
}
