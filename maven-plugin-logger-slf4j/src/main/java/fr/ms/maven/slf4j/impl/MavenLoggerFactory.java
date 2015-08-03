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
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;

/**
 *
 * @see <a href="http://marcosemiao4j.wordpress.com">Marco4J</a>
 *
 *
 * @author Marco Semiao
 *
 */
public class MavenLoggerFactory implements ILoggerFactory {

    /**
     * SLF4J Logger
     */
    private final MavenLoggerAdapter slf4jLogger = new MavenLoggerAdapter();

    /**
     * @implementation
     *
     */
    @Override
    public Logger getLogger(final String name) {
	return slf4jLogger;
    }

    public void setMavenLog(final Log mavenLog) {
	slf4jLogger.setMavenLog(mavenLog);
    }
}