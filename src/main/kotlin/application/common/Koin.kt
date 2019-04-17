package application.common

import application.domain.service.ProposalService
import application.resources.repository.ProposalRepository
import org.koin.dsl.module
import org.koin.core.context.startKoin

val proposalModule = module {
    single { ProposalService() }
    single { ProposalRepository() }
}
