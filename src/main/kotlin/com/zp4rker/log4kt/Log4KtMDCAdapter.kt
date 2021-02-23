package com.zp4rker.log4kt

import org.slf4j.spi.MDCAdapter

/**
 * @author zp4rker
 */
class Log4KtMDCAdapter : MDCAdapter {
    override fun put(key: String?, `val`: String?) {}

    override fun get(key: String?): String? {
        return null
    }

    override fun remove(key: String?) {}

    override fun clear() {}

    override fun getCopyOfContextMap(): MutableMap<String, String>? {
        return null
    }

    override fun setContextMap(contextMap: MutableMap<String, String>?) {}
}