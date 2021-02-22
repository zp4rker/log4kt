package org.slf4j.impl

import com.zp4rker.log4kt.Log4KtLoggerFactory
import org.slf4j.ILoggerFactory
import org.slf4j.spi.LoggerFactoryBinder

/**
 * @author zp4rker
 */
class StaticLoggerBinder : LoggerFactoryBinder {
    companion object {
        const val REQUESTED_API_VERSION: String = "1.6"
        private val singleton = StaticLoggerBinder()

        @JvmStatic fun getSingleton() = singleton
    }

    private val loggerFactory = Log4KtLoggerFactory()

    override fun getLoggerFactory(): ILoggerFactory {
        return loggerFactory
    }

    override fun getLoggerFactoryClassStr(): String {
        return Log4KtLoggerFactory::class.java.name
    }
}