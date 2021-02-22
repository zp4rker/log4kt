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
        log(Level.DEBUG, msg)
    }

    override fun debug(format: String?, arg: Any?) {
        log(Level.DEBUG, format, null, arg)
    }

    override fun debug(format: String?, arg1: Any?, arg2: Any?) {
        log(Level.DEBUG, format, null, arg1, arg2)
    }

    override fun debug(format: String?, vararg arguments: Any?) {
        log(Level.DEBUG, format, null, arguments)
    }

    override fun debug(msg: String?, t: Throwable?) {
        log(Level.DEBUG, msg, t)
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
        log(Level.INFO, msg)
    }

    override fun info(format: String?, arg: Any?) {
        log(Level.INFO, format, null, arg)
    }

    override fun info(format: String?, arg1: Any?, arg2: Any?) {
        log(Level.INFO, format, null, arg1, arg2)
    }

    override fun info(format: String?, vararg arguments: Any?) {
        log(Level.INFO, format, null, arguments)
    }

    override fun info(msg: String?, t: Throwable?) {
        log(Level.INFO, msg, t)
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
        log(Level.WARN, msg)
    }

    override fun warn(format: String?, arg: Any?) {
        log(Level.WARN, format, null, arg)
    }

    override fun warn(format: String?, arg1: Any?, arg2: Any?) {
        log(Level.WARN, format, null, arg1, arg2)
    }

    override fun warn(format: String?, vararg arguments: Any?) {
        log(Level.WARN, format, null, arguments)
    }

    override fun warn(msg: String?, t: Throwable?) {
        log(Level.WARN, msg, t)
    }

    override fun warn(marker: Marker?, msg: String?) {
        warn(msg)
    }

    override fun warn(marker: Marker?, format: String?, arg: Any?) {
        warn(format, arg)
    }

    override fun warn(marker: Marker?, format: String?, arg1: Any?, arg2: Any?) {
        warn(format, arg1, arg2)
    }

    override fun warn(marker: Marker?, format: String?, vararg arguments: Any?) {
        warn(format, arguments)
    }

    override fun warn(marker: Marker?, msg: String?, t: Throwable?) {
        warn(msg, t)
    }

    override fun isErrorEnabled(): Boolean = true
    override fun isErrorEnabled(marker: Marker?): Boolean = true

    override fun error(msg: String?) {
        log(Level.ERROR, msg)
    }

    override fun error(format: String?, arg: Any?) {
        log(Level.ERROR, format, null, arg)
    }

    override fun error(format: String?, arg1: Any?, arg2: Any?) {
        log(Level.ERROR, format, null, arg1, arg2)
    }

    override fun error(format: String?, vararg arguments: Any?) {
        log(Level.ERROR, format, null, arguments)
    }

    override fun error(msg: String?, t: Throwable?) {
        log(Level.ERROR, msg, t)
    }

    override fun error(marker: Marker?, msg: String?) {
        error(msg)
    }

    override fun error(marker: Marker?, format: String?, arg: Any?) {
        error(format, arg)
    }

    override fun error(marker: Marker?, format: String?, arg1: Any?, arg2: Any?) {
        error(format, arg1, arg2)
    }

    override fun error(marker: Marker?, format: String?, vararg arguments: Any?) {
        error(format, arguments)
    }

    override fun error(marker: Marker?, msg: String?, t: Throwable?) {
        error(msg, t)
    }

    private fun log(level: Level, msg: String?, t: Throwable? = null, vararg args: Any?) {
        val prepareEvent = Log4KtPrepareLogEvent(this, level, msg, t, args)
        Log4KtEventListener.pushEvent(prepareEvent)
        if (prepareEvent.isCancelled) return

        val name = this.name.run { split(".").getOrElse(2) { this } }.run {
            when {
                length > 7 -> "${this.substring(0..4)}.."
                else -> this
            }
        }

        val message = prepareEvent.msg?.run {
            if (args.isEmpty()) {
                this
            } else {
                this.let {
                    var s = it
                    for (arg in args) {
                        s = s.replaceFirst("{}", arg.toString())
                    }
                    s
                }
            }
        } ?: "No message"

        runCatching {
            with(org.fusesource.jansi.Ansi.ansi()) {
                reset()

                fgBrightBlack()
                a(name.padEnd(8))

                when (prepareEvent.level) {
                    Level.INFO -> fgBrightGreen()
                    Level.WARN -> fgBrightYellow()
                    Level.ERROR -> fgBrightRed()
                    else -> fgBlack()
                }
                a(prepareEvent.level.name.padEnd(8))

                reset()
                a(message)

                t?.let { a("\n${it.stackTraceToString()}") }

                println(this)
            }
        }.onFailure {
            println("${name.padEnd(8)}${prepareEvent.level.name.padEnd(8)}$message${t?.let { "\n${it.stackTraceToString()}" } ?: ""}")
        }

        val logEvent = Log4KtLogEvent(this, level, msg, t, args)
        Log4KtEventListener.pushEvent(logEvent)
    }
}