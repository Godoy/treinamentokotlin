package application.domain.service

import application.domain.Proposal
import application.resources.repository.ProposalRepository
import org.koin.core.KoinComponent
import org.koin.core.inject

class ProposalService: KoinComponent {

    private val repository by inject<ProposalRepository>()

    fun getAll(): List<Proposal> = repository.getAll()

    fun save(proposal: Proposal) = repository.save(proposal)
}