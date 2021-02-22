package com.zp4rker.log4kt

import org.slf4j.Logger
import org.slf4j.Marker
import org.slf4j.event.Level

/**
 * @author zp4rker
 */
class Log4KtLogger(private val name: String) : Logger {
    override fun getName(): String = name
    /* TRACE always disabled */
    override fun isTraceEnabled(): Boolean = false
    override fun isTraceEnabled(marker: Marker?): Boolean = false

    override fun trace(msg: String) {}
    override fun trace(format: String?, arg: Any?) {}
    override fun trace(format: String?, arg1: Any?, arg2: Any?) {}
    override fun trace(format: String?, vararg arguments: Any?) {}
    override fun trace(msg: String?, t: Throwable?) {}
    override fun trace(marker: Marker?, msg: String?) {}
    override fun trace(marker: Marker?, format: String?, arg: Any?) {}
    override fun trace(marker: Marker?, format: String?, arg1: Any?, arg2: Any?) {}
    override fun trace(marker: Marker?, format: String?, vararg argArray: Any?) {}
    override fun trace(marker: Marker?, msg: String?, t: Throwable?) {}

    override fun isDebugEnabled(): Boolean = true
    override fun isDebugEnabled(marker: Marker?): Boolean = true

    override fun debug(msg: String?) {
        print(Level.DEBUG, msg)
    }

    override fun debug(format: String?, arg: Any?) {
        print(Level.DEBUG, format, null, arg)
    }

    override fun debug(format: String?, arg1: Any?, arg2: Any?) {
        print(Level.DEBUG, format, null, arg1, arg2)
    }

    override fun debug(format: String?, vararg arguments: Any?) {
        print(Level.DEBUG, format, null, arguments)
    }

    override fun debug(msg: String?, t: Throwable?) {
        print(Level.DEBUG, msg, t)
    }

    override fun debug(marker: Marker?, msg: String?) {
        debug(msg)
    }

    override fun debug(marker: Marker?, format: String?, arg: Any?) {
        debug(format, arg)
    }

    override fun debug(marker: Marker?, format: String?, arg1: Any?, arg2: Any?) {
        debug(format, arg1, arg2)
    }

    override fun debug(marker: Marker?, format: String?, vararg arguments: Any?) {
        debug(format, arguments)
    }

    override fun debug(marker: Marker?, msg: String?, t: Throwable?) {
        debug(msg, t)
    }

    override fun isInfoEnabled(): Boolean = true
    override fun isInfoEnabled(marker: Marker?): Boolean = true

    override fun info(msg: String?) {
        print(Level.INFO, msg)
    }

    override fun info(format: String?, arg: Any?) {
        print(Level.INFO, format, null, arg)
    }

    override fun info(format: String?, arg1: Any?, arg2: Any?) {
        print(Level.INFO, format, null, arg1, arg2)
    }

    override fun info(format: String?, vararg arguments: Any?) {
        print(Level.INFO, format, null, arguments)
    }

    override fun info(msg: String?, t: Throwable?) {
        print(Level.INFO, msg, t)
    }

    override fun info(marker: Marker?, msg: String?) {
        info(msg)
    }

    override fun info(marker: Marker?, format: String?, arg: Any?) {
        info(format, arg)
    }

    override fun info(marker: Marker?, format: String?, arg1: Any?, arg2: Any?) {
        info(format, arg1, arg2)
    }

    override fun info(marker: Marker?, format: String?, vararg arguments: Any?) {
        info(format, arguments)
    }

    override fun info(marker: Marker?, msg: String?, t: Throwable?) {
        info(msg, t)
    }

    override fun isWarnEnabled(): Boolean = true
    override fun isWarnEnabled(marker: Marker?): Boolean = true

    override fun warn(msg: String?) {
        TODO("Not yet implemented")
    }

    override fun warn(format: String?, arg: Any?) {
        TODO("Not yet implemented")
    }

    override fun warn(format: String?, vararg arguments: Any?) {
        TODO("Not yet implemented")
    }

    override fun warn(format: String?, arg1: Any?, arg2: Any?) {
        TODO("Not yet implemented")
    }

    override fun warn(msg: String?, t: Throwable?) {
        TODO("Not yet implemented")
    }

    override fun warn(marker: Marker?, msg: String?) {
        TODO("Not yet implemented")
    }

    override fun warn(marker: Marker?, format: String?, arg: Any?) {
        TODO("Not yet implemented")
    }

    override fun warn(marker: Marker?, format: String?, arg1: Any?, arg2: Any?) {
        TODO("Not yet implemented")
    }

    override fun warn(marker: Marker?, format: String?, vararg arguments: Any?) {
        TODO("Not yet implemented")
    }

    override fun warn(marker: Marker?, msg: String?, t: Throwable?) {
        TODO("Not yet implemented")
    }

    override fun isErrorEnabled(): Boolean = true
    override fun isErrorEnabled(marker: Marker?): Boolean = true

    override fun error(msg: String?) {
        TODO("Not yet implemented")
    }

    override fun error(format: String?, arg: Any?) {
        TODO("Not yet implemented")
    }

    override fun error(format: String?, arg1: Any?, arg2: Any?) {
        TODO("Not yet implemented")
    }

    override fun error(format: String?, vararg arguments: Any?) {
        TODO("Not yet implemented")
    }

    override fun error(msg: String?, t: Throwable?) {
        TODO("Not yet implemented")
    }

    override fun error(marker: Marker?, msg: String?) {
        TODO("Not yet implemented")
    }

    override fun error(marker: Marker?, format: String?, arg: Any?) {
        TODO("Not yet implemented")
    }

    override fun error(marker: Marker?, format: String?, arg1: Any?, arg2: Any?) {
        TODO("Not yet implemented")
    }

    override fun error(marker: Marker?, format: String?, vararg arguments: Any?) {
        TODO("Not yet implemented")
    }

    override fun error(marker: Marker?, msg: String?, t: Throwable?) {
        TODO("Not yet implemented")
    }

    private fun print(level: Level, msg: String?, t: Throwable? = null, vararg args: Any?) {
        TODO("Not yet implemented")
    }
}