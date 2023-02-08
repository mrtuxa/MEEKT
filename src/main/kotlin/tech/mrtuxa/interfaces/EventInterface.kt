package tech.mrtuxa.interfaces

import net.dv8tion.jda.api.events.GenericEvent
import net.dv8tion.jda.api.interactions.commands.SlashCommandInteraction

interface EventInterface {
    interface SlashCommand {
        fun register(event: GenericEvent)
        fun handle(event: SlashCommandInteraction)
    }
}