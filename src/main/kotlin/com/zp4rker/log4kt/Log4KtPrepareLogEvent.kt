package com.zp4rker.log4kt

import org.slf4j.event.Level

/**
 * @author zp4rker
 */
data class Log4KtPrepareLogEvent(val logger: Log4KtLogger, var level: Level, var msg: String?, val t: Throwable?, val args: Array<out Any?>, override var isCancelled: Boolean = false) : Log4KtEvent
