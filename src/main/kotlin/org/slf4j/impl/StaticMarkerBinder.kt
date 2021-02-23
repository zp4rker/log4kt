package org.slf4j.impl

import org.slf4j.IMarkerFactory
import org.slf4j.helpers.BasicMarkerFactory
import org.slf4j.spi.MarkerFactoryBinder

/**
 * @author zp4rker
 */
class StaticMarkerBinder : MarkerFactoryBinder {
    companion object {
        @JvmField val SINGLETON = StaticMarkerBinder()
    }

    override fun getMarkerFactory(): IMarkerFactory = BasicMarkerFactory()

    override fun getMarkerFactoryClassStr(): String = BasicMarkerFactory::class.java.name
}