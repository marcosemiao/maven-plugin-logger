package fr.ms.maven.slf4j.impl;

import org.apache.maven.plugin.logging.Log;
import org.slf4j.impl.StaticLoggerBinder;

import fr.ms.maven.plugin.MojoLogger;
import fr.ms.util.ServiceProvider;

@ServiceProvider
public class Slf4jMojoLogger implements MojoLogger {

    private final static StaticLoggerBinder staticLoggerBinder = StaticLoggerBinder.getSingleton();

    @Override
    public void setMavenLogger(final Log log) {
	staticLoggerBinder.setMavenLog(log);
    }
}
