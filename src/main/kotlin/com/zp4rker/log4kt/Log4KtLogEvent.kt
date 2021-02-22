package com.zp4rker.log4kt

import org.slf4j.event.Level

/**
 * @author zp4rker
 */
data class Log4KtLogEvent(val logger: Log4KtLogger, val level: Level, val msg: String?, val t: Throwable?, val args: Array<Any?>)
