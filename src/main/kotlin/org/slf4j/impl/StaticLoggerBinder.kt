package org.slf4j.impl

import org.slf4j.ILoggerFactory
import org.slf4j.spi.LoggerFactoryBinder

/**
 * @author zp4rker
 */
class StaticLoggerBinder : LoggerFactoryBinder {
    override fun getLoggerFactory(): ILoggerFactory {
        TODO("Not yet implemented")
    }

    override fun getLoggerFactoryClassStr(): String {
        TODO("Not yet implemented")
    }
}