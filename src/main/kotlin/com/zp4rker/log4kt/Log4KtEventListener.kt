package com.zp4rker.log4kt

/**
 * @author zp4rker
 */
object Log4KtEventListener {
    val handlers = mutableMapOf<(Log4KtEvent) -> Unit, Any>()

    inline fun <reified T : Log4KtEvent> on(noinline handler: (T) -> Unit) {
        handlers[handler as (Log4KtEvent) -> Unit] = T::class.java
    }

    fun pushEvent(event: Log4KtEvent) {
        handlers.forEach { h, e ->
            if (e is Class<*> && e.isAssignableFrom(e)) {
                if (event::class.java == e) {
                    h(event)
                }
            }
        }
    }
}