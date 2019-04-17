package application.web.resource

import application.domain.Proposal
import application.domain.service.ProposalService
import io.javalin.Context
import io.javalin.apibuilder.CrudHandler
import org.koin.core.KoinComponent
import org.koin.core.inject

class ProposalController: KoinComponent, CrudHandler { //TODO common interface to implement koin framework

    private val proposalService by inject<ProposalService>()

    override fun getAll(ctx: Context) {
        ctx.json(proposalService.getAll())
    }

    override fun create(ctx: Context) {
        proposalService.save(ctx.body<Proposal>())
    }

    override fun getOne(ctx: Context, resourceId: String) {
        //todo still not implemented
    }

    override fun delete(ctx: Context, resourceId: String) {
        //todo still not implemented
    }

    override fun update(ctx: Context, resourceId: String) {
        //todo still not implemented
    }
}
