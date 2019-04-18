package application.domain.service

import application.domain.Proposal
import application.resources.repository.ProposalRepository
import org.koin.core.KoinComponent

class ProposalService(private val repository: ProposalRepository) {
    fun getAll(): List<Proposal> = repository.getAll()
    fun save(proposal: Proposal) = repository.save(proposal)
}
