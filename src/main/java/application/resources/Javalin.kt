package application.resources

import application.web.resource.ProposalResource
import io.javalin.Javalin
import io.javalin.apibuilder.ApiBuilder.crud
import io.javalin.apibuilder.ApiBuilder.get

fun startJavalin() {

    val app = Javalin.create().start(7000)
    app.routes {

        get("/") {
            it.result("malandro ieie")
        }

        crud("proposals/:proposal-id", ProposalResource())
    }
}