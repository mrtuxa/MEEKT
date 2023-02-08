```kotlin
class Ping : EventInterface.SlashCommand {
    override fun register(event: GenericEvent) {
        GuildSettings().guildID(event.jda)?.let { CommandUtil.Application().create("Ping", "Replies with ping", it) }
    }

    override fun handle(event: SlashCommandInteraction) {
        TODO("Not yet implemented")
    }
}
```