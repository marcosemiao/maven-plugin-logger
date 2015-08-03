package fr.ms.maven.plugin;

import java.util.Iterator;
import java.util.ServiceLoader;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.logging.Log;

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
	    final ServiceLoader<MojoLogger> load = ServiceLoader.load(MojoLogger.class);

	    final Iterator<MojoLogger> iterator = load.iterator();
	    final MojoLogger singleton = iterator.next();
	    return singleton;
	}
    }
}
