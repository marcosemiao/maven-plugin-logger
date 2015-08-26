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
package org.slf4j.impl;

import org.apache.maven.plugin.logging.Log;
import org.slf4j.ILoggerFactory;
import org.slf4j.spi.LoggerFactoryBinder;

import fr.ms.maven.slf4j.impl.MavenLoggerFactory;

/**
 *
 * @see <a href="http://marcosemiao4j.wordpress.com">Marco4J</a>
 *
 *
 * @author Marco Semiao
 *
 */
public class StaticLoggerBinder implements LoggerFactoryBinder {

    /**
     * une instance unique de StaticLoggerBinder
     *
     */
    private static final StaticLoggerBinder singleton = new StaticLoggerBinder();

    /**
     * Le Logger Maven-slf4j
     */
    private static final MavenLoggerFactory loggerFactory = new MavenLoggerFactory();

    private StaticLoggerBinder() {
    }

    /**
     * Retourne le singleton de StaticLoggerBinder Cette méthode est appelé par
     * l'api slf4j, c'est donc le point d'entrée de cette classe
     *
     * @return the StaticLoggerBinder singleton
     */
    public static final StaticLoggerBinder getSingleton() {
	return singleton;
    }

    @Override
    public ILoggerFactory getLoggerFactory() {
	return loggerFactory;
    }

    @Override
    public String getLoggerFactoryClassStr() {
	return MavenLoggerFactory.class.getName();
    }

    public void setMavenLog(final Log mavenLog) {
	loggerFactory.setMavenLog(mavenLog);
    }
}
