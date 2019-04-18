package application.common

import application.domain.service.ProposalService
import application.resources.repository.ProposalRepository
import application.web.resource.ProposalController
import org.koin.dsl.module

val proposalModule = module {
    single { ProposalService(get()) }
    single { ProposalRepository() }
    single { ProposalController(get()) }
}
