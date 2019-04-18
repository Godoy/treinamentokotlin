package application.web

import application.web.resource.ProposalController
import io.javalin.Javalin
import io.javalin.apibuilder.ApiBuilder.crud
import io.javalin.apibuilder.ApiBuilder.get
import org.koin.core.KoinComponent
import org.koin.core.inject

object JavalinServer: KoinComponent {
    private val proposalController: ProposalController by inject()

    fun start() {
        val app = Javalin.create().start(7000)

        app.routes {
            get("/") {
                it.result("malandro ieie")
            }

            crud("proposals/:proposal-id", proposalController)
        }
    }
}
