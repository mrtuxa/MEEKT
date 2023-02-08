package tech.mrtuxa.interfaces

import net.dv8tion.jda.api.interactions.commands.build.SlashCommandData

abstract class CommandListInterface {
    abstract fun list(commands: Array<SlashCommandData>)
}