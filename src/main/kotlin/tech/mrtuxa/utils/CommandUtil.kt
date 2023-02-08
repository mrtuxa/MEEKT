package tech.mrtuxa.utils

import net.dv8tion.jda.api.entities.Guild
import net.dv8tion.jda.api.interactions.commands.build.Commands
import net.dv8tion.jda.api.requests.restaction.CommandListUpdateAction

class CommandUtil {
    class Application {
        fun register(command: String, description: String, guild: Guild) {
            guild.updateCommands().addCommands(
                Commands.slash(command, description)
            ).queue()
        }

        fun create(name: String, description: String, guild: Guild): CommandListUpdateAction {
            return guild.updateCommands().addCommands(Commands.slash(name, description))
        }
    }
}

