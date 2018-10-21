import io.ktor.http.ContentType
import io.ktor.http.cio.websocket.FrameType.Companion.get
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
fun main(args: ArrayList<String>) {

    embeddedServer(Netty, 8080)
    {
        routing {
           get("/")
           {
               respo
           }
        }
    }
}