package application.web

import application.common.proposalModule
import application.web.resource.ProposalResource
import io.javalin.Javalin
import io.javalin.apibuilder.ApiBuilder.crud
import io.javalin.apibuilder.ApiBuilder.get
import org.koin.core.context.startKoin

object JavalinServer {
    fun start() {
        startKoin {
            printLogger()
            modules(proposalModule)
        }

        val app = Javalin.create().start(7000)
        app.routes {

            get("/") {
                it.result("malandro ieie")
            }

            crud("proposals/:proposal-id", ProposalResource())
        }
    }
}
