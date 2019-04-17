package application.resources.repository

import application.domain.Proposal
import application.resources.ProposalsSchema
import kotlinx.nosql.mongodb.MongoDB
import org.koin.core.KoinComponent


class ProposalRepository: KoinComponent {

    //TODO configuracao do nome do bando deve estar em arquivo externo
    //TODO pendente de utilizar framework exposed
    private val db by lazy { MongoDB(database = "treinamento", schemas = arrayOf(ProposalsSchema)) }

    //TODO mudar para consultar da base mongo
    fun getAll(): List<Proposal> = listOf(
                Proposal(productId = "rg", fields = mapOf("rgFrente" to "673456", "rgVerso" to "673456")),
            Proposal(productId = "cnh", fields = mapOf("cnhFrente" to "malandro ieie1"))
    )

    //todo: Fazer implementacao com framework exposed
    fun save(proposal: Proposal) {
        db.withSession { ProposalsSchema.insert(proposal) }
    }
}
