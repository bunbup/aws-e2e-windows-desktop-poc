import com.pubnub.api.PNConfiguration
import com.pubnub.api.PubNub
import org.junit.Test

class PNPingTest {
    @Test
    fun pingTest() {
        val pnConfiguration = PNConfiguration().apply {
            publishKey = "demo-36"
            subscribeKey = "demo-36"
        }

        val pnPingUnderTest = PNPing(PubNub(pnConfiguration))
        pnPingUnderTest.ping()
    }
}