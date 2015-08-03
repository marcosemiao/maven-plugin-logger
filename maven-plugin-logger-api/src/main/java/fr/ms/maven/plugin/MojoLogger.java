package fr.ms.maven.plugin;

import org.apache.maven.plugin.logging.Log;

public interface MojoLogger {

    void setMavenLogger(Log log);
}
