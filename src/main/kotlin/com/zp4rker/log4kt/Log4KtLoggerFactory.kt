package com.zp4rker.log4kt

import org.slf4j.ILoggerFactory
import org.slf4j.Logger

/**
 * @author zp4rker
 */
class Log4KtLoggerFactory : ILoggerFactory {
    override fun getLogger(name: String): Logger {
        return Log4KtLogger(name)
    }
}