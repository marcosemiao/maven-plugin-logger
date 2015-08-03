package fr.ms.maven.slf4j.impl;

import org.apache.maven.plugin.logging.Log;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.helpers.FormattingTuple;
import org.slf4j.helpers.MessageFormatter;

/**
 * Adaptateur Simple Logging Facade For Java (SLF4J) Pour le Logger Apache Maven
 *
 * Cet adapateur permet d'utiliser l'api de slf4j en loggant sur le logger
 * d'origine de maven
 *
 * @author msemiao
 */
public class MavenLoggerAdapter implements Logger {

    /**
     * Apache Maven Logger
     */
    private Log mavenLog;

    /**
     * @param mavenLog
     *            mavenLog:
     */
    public void setMavenLog(final Log mavenLog) {
	this.mavenLog = mavenLog;
    }

    /**
     * @implementation
     *
     */
    @Override
    public void debug(final String msg) {
	mavenLog.debug(msg);
    }

    /**
     * @implementation
     *
     */
    @Override
    public void debug(final String format, final Object arg) {
	final FormattingTuple msgStr = MessageFormatter.format(format, arg);
	mavenLog.debug(msgStr.getMessage());
    }

    /**
     * @implementation
     *
     */
    @Override
    public void debug(final String format, final Object[] argArray) {
	final FormattingTuple msgStr = MessageFormatter.format(format, argArray);
	mavenLog.debug(msgStr.getMessage());
    }

    /**
     * @implementation
     *
     */
    @Override
    public void debug(final String msg, final Throwable t) {
	mavenLog.debug(msg, t);

    }

    /**
     * @implementation
     *
     */
    @Override
    public void debug(final Marker marker, final String msg) {
	debug(msg);
    }

    /**
     * @implementation
     *
     */
    @Override
    public void debug(final String format, final Object arg1, final Object arg2) {
	final FormattingTuple msgStr = MessageFormatter.format(format, arg1, arg2);
	mavenLog.debug(msgStr.getMessage());
    }

    /**
     * @implementation
     *
     */
    @Override
    public void debug(final Marker marker, final String format, final Object arg) {
	debug(format, arg);
    }

    /**
     * @implementation
     *
     */
    @Override
    public void debug(final Marker marker, final String format, final Object[] argArray) {
	debug(format, argArray);
    }

    /**
     * @implementation
     *
     */
    @Override
    public void debug(final Marker marker, final String msg, final Throwable t) {
	debug(msg, t);
    }

    /**
     * @implementation
     *
     */
    @Override
    public void debug(final Marker marker, final String format, final Object arg1, final Object arg2) {
	debug(format, arg1, arg2);
    }

    /**
     * @implementation
     *
     */
    @Override
    public void error(final String msg) {
	mavenLog.error(msg);
    }

    /**
     * @implementation
     *
     */
    @Override
    public void error(final String format, final Object arg) {
	final FormattingTuple msgStr = MessageFormatter.format(format, arg);
	mavenLog.error(msgStr.getMessage());
    }

    /**
     * @implementation
     *
     */
    @Override
    public void error(final String format, final Object[] argArray) {
	final FormattingTuple msgStr = MessageFormatter.format(format, argArray);
	mavenLog.error(msgStr.getMessage());
    }

    /**
     * @implementation
     *
     */
    @Override
    public void error(final String msg, final Throwable t) {
	mavenLog.error(msg, t);
    }

    /**
     * @implementation
     *
     */
    @Override
    public void error(final Marker marker, final String msg) {
	error(msg);
    }

    /**
     * @implementation
     *
     */
    @Override
    public void error(final String format, final Object arg1, final Object arg2) {
	final FormattingTuple msgStr = MessageFormatter.format(format, arg1, arg2);
	mavenLog.error(msgStr.getMessage());
    }

    /**
     * @implementation
     *
     */
    @Override
    public void error(final Marker marker, final String format, final Object arg) {
	error(format, arg);
    }

    /**
     * @implementation
     *
     */
    @Override
    public void error(final Marker marker, final String format, final Object[] argArray) {
	error(format, argArray);
    }

    /**
     * @implementation
     *
     */
    @Override
    public void error(final Marker marker, final String msg, final Throwable t) {
	error(msg, t);
    }

    /**
     * @implementation
     *
     */
    @Override
    public void error(final Marker marker, final String format, final Object arg1, final Object arg2) {
	error(format, arg1, arg2);
    }

    /**
     * @implementation
     *
     */
    @Override
    public String getName() {
	return mavenLog.getClass().getName();
    }

    /**
     * @implementation
     *
     */
    @Override
    public void info(final String msg) {
	mavenLog.info(msg);

    }

    /**
     * @implementation
     *
     */
    @Override
    public void info(final String format, final Object arg) {
	final FormattingTuple msgStr = MessageFormatter.format(format, arg);
	mavenLog.info(msgStr.getMessage());
    }

    /**
     * @implementation
     *
     */
    @Override
    public void info(final String format, final Object[] argArray) {
	final FormattingTuple msgStr = MessageFormatter.format(format, argArray);
	mavenLog.info(msgStr.getMessage());
    }

    /**
     * @implementation
     *
     */
    @Override
    public void info(final String msg, final Throwable t) {
	mavenLog.info(msg, t);

    }

    /**
     * @implementation
     *
     */
    @Override
    public void info(final Marker marker, final String msg) {
	info(msg);
    }

    /**
     * @implementation
     *
     */
    @Override
    public void info(final String format, final Object arg1, final Object arg2) {
	final FormattingTuple msgStr = MessageFormatter.format(format, arg1, arg2);
	mavenLog.info(msgStr.getMessage());
    }

    /**
     * @implementation
     *
     */
    @Override
    public void info(final Marker marker, final String format, final Object arg) {
	info(format, arg);
    }

    /**
     * @implementation
     *
     */
    @Override
    public void info(final Marker marker, final String format, final Object[] argArray) {
	info(format, argArray);
    }

    /**
     * @implementation
     *
     */
    @Override
    public void info(final Marker marker, final String msg, final Throwable t) {
	info(msg, t);
    }

    /**
     * @implementation
     *
     */
    @Override
    public void info(final Marker marker, final String format, final Object arg1, final Object arg2) {
	info(format, arg1, arg2);
    }

    /**
     * @implementation
     *
     */
    @Override
    public boolean isDebugEnabled() {
	return mavenLog.isDebugEnabled();
    }

    /**
     * @implementation
     *
     */
    @Override
    public boolean isDebugEnabled(final Marker marker) {
	return isDebugEnabled();
    }

    /**
     * @implementation
     *
     */
    @Override
    public boolean isErrorEnabled() {
	return mavenLog.isErrorEnabled();
    }

    /**
     * @implementation
     *
     */
    @Override
    public boolean isErrorEnabled(final Marker marker) {
	return isErrorEnabled();
    }

    /**
     * @implementation
     *
     */
    @Override
    public boolean isInfoEnabled() {
	return mavenLog.isInfoEnabled();
    }

    /**
     * @implementation
     *
     */
    @Override
    public boolean isInfoEnabled(final Marker marker) {
	return isInfoEnabled();
    }

    /**
     * @implementation
     *
     */
    @Override
    public boolean isTraceEnabled() {
	return isDebugEnabled();
    }

    /**
     * @implementation
     *
     */
    @Override
    public boolean isTraceEnabled(final Marker marker) {
	return isDebugEnabled(marker);
    }

    /**
     * @implementation
     *
     */
    @Override
    public boolean isWarnEnabled() {
	return mavenLog.isWarnEnabled();
    }

    /**
     * @implementation
     *
     */
    @Override
    public boolean isWarnEnabled(final Marker marker) {
	return isWarnEnabled();
    }

    /**
     * @implementation
     *
     */
    @Override
    public void trace(final String msg) {
	debug(msg);

    }

    /**
     * @implementation
     *
     */
    @Override
    public void trace(final String format, final Object arg) {
	debug(format, arg);
    }

    /**
     * @implementation
     *
     */
    @Override
    public void trace(final String format, final Object[] argArray) {
	debug(format, argArray);
    }

    /**
     * @implementation
     *
     */
    @Override
    public void trace(final String msg, final Throwable t) {
	debug(msg, t);
    }

    /**
     * @implementation
     *
     */
    @Override
    public void trace(final Marker marker, final String msg) {
	debug(marker, msg);
    }

    /**
     * @implementation
     *
     */
    @Override
    public void trace(final String format, final Object arg1, final Object arg2) {
	debug(format, arg1, arg2);

    }

    /**
     * @implementation
     *
     */
    @Override
    public void trace(final Marker marker, final String format, final Object arg) {
	trace(format, arg);
    }

    /**
     * @implementation
     *
     */
    @Override
    public void trace(final Marker marker, final String format, final Object[] argArray) {
	trace(format, argArray);
    }

    /**
     * @implementation
     *
     */
    @Override
    public void trace(final Marker marker, final String msg, final Throwable t) {
	trace(msg, t);
    }

    /**
     * @implementation
     *
     */
    @Override
    public void trace(final Marker marker, final String format, final Object arg1, final Object arg2) {
	trace(format, arg1, arg2);
    }

    /**
     * @implementation
     *
     */
    @Override
    public void warn(final String msg) {
	mavenLog.warn(msg);

    }

    /**
     * @implementation
     *
     */
    @Override
    public void warn(final String format, final Object arg) {
	final FormattingTuple msgStr = MessageFormatter.format(format, arg);
	mavenLog.warn(msgStr.getMessage());
    }

    /**
     * @implementation
     *
     */
    @Override
    public void warn(final String format, final Object[] argArray) {
	final FormattingTuple msgStr = MessageFormatter.format(format, argArray);
	mavenLog.warn(msgStr.getMessage());
    }

    /**
     * @implementation
     *
     */
    @Override
    public void warn(final String msg, final Throwable t) {
	mavenLog.warn(msg, t);

    }

    /**
     * @implementation
     *
     */
    @Override
    public void warn(final Marker marker, final String msg) {
	warn(msg);
    }

    /**
     * @implementation
     *
     */
    @Override
    public void warn(final String format, final Object arg1, final Object arg2) {
	final FormattingTuple msgStr = MessageFormatter.format(format, arg1, arg2);
	mavenLog.warn(msgStr.getMessage());
    }

    /**
     * @implementation
     *
     */
    @Override
    public void warn(final Marker marker, final String format, final Object arg) {
	warn(format, arg);
    }

    /**
     * @implementation
     *
     */
    @Override
    public void warn(final Marker marker, final String format, final Object[] argArray) {
	warn(format, argArray);
    }

    /**
     * @implementation
     *
     */
    @Override
    public void warn(final Marker marker, final String msg, final Throwable t) {
	warn(msg, t);
    }

    /**
     * @implementation
     *
     */
    @Override
    public void warn(final Marker marker, final String format, final Object arg1, final Object arg2) {
	warn(format, arg1, arg2);
    }
}