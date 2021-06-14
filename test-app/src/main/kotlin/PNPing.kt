import com.pubnub.api.PubNub
import java.util.UUID

class PNPing(private val pubnub: PubNub) {
    private val channel = UUID.randomUUID().toString()

    fun ping() {
        pubnub.publish(channel = channel, message = "ping").sync()
    }
}