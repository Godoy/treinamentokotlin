package application.web

import application.common.proposalModule
import org.koin.core.context.startKoin

fun main() {
    startKoin {
        printLogger()
        modules(proposalModule)
    }
    JavalinServer.start()
}
