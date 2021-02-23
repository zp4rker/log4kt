<div align="center">

# `log4kt`

![GitHub last commit](https://img.shields.io/github/last-commit/zp4rker/log4kt?style=flat)
![GitHub tag (latest by date)](https://img.shields.io/github/v/tag/zp4rker/log4kt?label=current+version&style=flat)
![GitHub](https://img.shields.io/github/license/zp4rker/log4kt?style=flat)
![Lines of code](https://img.shields.io/tokei/lines/github/zp4rker/log4kt?style=flat)
[![Discord Badge](https://discordapp.com/api/guilds/647312158832721934/widget.png)](https://zp4rker.com/discord)

A very simple SLF4J implementation written in Kotlin.

</div>

# Current features

## EventListener

A very simple logging event listener. Usage is as below:

```kotlin
Log4KtEventListener.on<Log4KtLogEvent> {
    if (it.t == null) return@on
    logger.debug("an exception was printed")
}
```

### Currently supported events

- `Log4KtLogEvent`
    - Fired after a log is printed/sent.
- `Log4KtPrepareLogEvent`
    - Fired before a log is printed/sent.
    - Level and message can be modified in this event.
    - Event is also cancellable.