package fr.ms.maven.slf4j.impl;

import org.apache.maven.plugin.logging.Log;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;

/**
 *
 * @author msemiao
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