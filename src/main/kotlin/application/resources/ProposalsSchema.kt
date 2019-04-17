package application.resources

import application.domain.Proposal
import kotlinx.nosql.string

object ProposalsSchema : kotlinx.nosql.mongodb.DocumentSchema<Proposal>("proposals", Proposal::class) {
    val productId = string("productId")
    val fields =  string("fields")
}
