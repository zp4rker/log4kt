package org.slf4j.impl

import com.zp4rker.log4kt.Log4KtMDCAdapter
import org.slf4j.spi.MDCAdapter

/**
 * @author zp4rker
 */
class StaticMDCBinder {
    companion object {
        @JvmField val SINGLETON = StaticMDCBinder()
    }

    fun getMDCA(): MDCAdapter = Log4KtMDCAdapter()

    fun getMDCAdapterClassStr(): String = Log4KtMDCAdapter::class.java.name
}