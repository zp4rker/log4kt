package com.zp4rker.log4kt

import org.slf4j.ILoggerFactory
import org.slf4j.Logger

/**
 * @author zp4rker
 */
class Log4KtLoggerFactory : ILoggerFactory {
    companion object {
        var debugEnabled: Boolean = false
    }

    override fun getLogger(name: String): Logger {
        return Log4KtLogger(name)
    }
}