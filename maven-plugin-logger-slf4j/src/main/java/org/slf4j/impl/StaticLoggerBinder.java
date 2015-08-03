package org.slf4j.impl;

import org.apache.maven.plugin.logging.Log;
import org.slf4j.ILoggerFactory;
import org.slf4j.spi.LoggerFactoryBinder;

import fr.ms.maven.slf4j.impl.MavenLoggerFactory;

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

    /**
     * Constructeur Privé il est impossible d'instancer cette classe sans passer
     * par la methode singleton qui crée une instance unique
     */
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

    /**
     * @implementation
     *
     */
    @Override
    public ILoggerFactory getLoggerFactory() {
	return loggerFactory;
    }

    /**
     * @implementation
     *
     */
    @Override
    public String getLoggerFactoryClassStr() {
	return MavenLoggerFactory.class.getName();
    }

    /**
     * @param mavenLog
     *            mavenLog:
     */
    public void setMavenLog(final Log mavenLog) {
	loggerFactory.setMavenLog(mavenLog);
    }
}
