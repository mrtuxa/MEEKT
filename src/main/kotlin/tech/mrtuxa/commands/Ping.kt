package tech.mrtuxa.commands

import net.dv8tion.jda.api.events.GenericEvent
import net.dv8tion.jda.api.interactions.commands.SlashCommandInteraction
import tech.mrtuxa.interfaces.EventInterface
import tech.mrtuxa.settings.GuildSettings
import tech.mrtuxa.utils.CommandUtil

class Ping : EventInterface.SlashCommand {
    override fun register(event: GenericEvent) {
        GuildSettings().guildID(event.jda)?.let { CommandUtil.Application().create("Ping", "Replies with ping", it) }
    }

    override fun handle(event: SlashCommandInteraction) {
        TODO("Not yet implemented")
    }
}