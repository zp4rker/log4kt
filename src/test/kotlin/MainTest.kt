import com.zp4rker.log4kt.Log4KtEventListener
import com.zp4rker.log4kt.Log4KtLogEvent
import com.zp4rker.log4kt.Log4KtPrepareLogEvent
import org.junit.Test
import org.slf4j.LoggerFactory
import org.slf4j.event.Level
import java.lang.IllegalStateException

/**
 * @author zp4rker
 */
class MainTest {
    @Test fun test1() {
        val logger = LoggerFactory.getLogger("test")
        assert(logger != null)

        Log4KtEventListener.on<Log4KtLogEvent> {
            logger.debug("a log was printed")
        }

        logger.error("something went wrong!", IllegalStateException("something isn't right"))
    }

    @Test fun test2() {
        val logger = LoggerFactory.getLogger("test2")
        assert(logger != null)

        Log4KtEventListener.on<Log4KtPrepareLogEvent> {
            println("preparing a ${level.name} log")
            if (level == Level.DEBUG) println("cancelling log").apply { isCancelled = true }
        }

        logger.info("hi!")
        logger.debug("secret hi ;)")
        logger.warn("oh no, be careful!")
        logger.error("oh no, you did bad")
        logger.trace("this should not work")
    }

    @Test fun test3() {
        val logger = LoggerFactory.getLogger("test3")
        assert(logger != null)

        Log4KtEventListener.on<Log4KtLogEvent> {
            logger.debug("a log was printed")
        }

        logger.info("hi")
        logger.info("")
        logger.warn("chocolate is yummy")
    }
}
