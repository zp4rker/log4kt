package com.zp4rker.log4kt

import org.slf4j.event.Level

/**
 * @author zp4rker
 */
data class Log4KtLogEvent(val output: String?, override var isCancelled: Boolean = false) : Log4KtEvent
