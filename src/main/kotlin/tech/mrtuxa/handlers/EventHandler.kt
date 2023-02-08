package tech.mrtuxa.handlers

import dev.minn.jda.ktx.events.CoroutineEventListener
import net.dv8tion.jda.api.events.GenericEvent

class EventHandler : CoroutineEventListener {
    override suspend fun onEvent(event: GenericEvent) {
        val jda = event.jda
        when (event) {

        }
    }
}