```kotlin
package tech.mrtuxa.settings

import net.dv8tion.jda.api.JDA
import net.dv8tion.jda.api.entities.Guild

class GuildSettings {
    fun guildID(jda: JDA): Guild? {
        return jda.getGuildById(1068193036191924265)
    }
}
```