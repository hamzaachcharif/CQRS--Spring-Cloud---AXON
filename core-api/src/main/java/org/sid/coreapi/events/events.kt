package org.sid.coreapi.events

import org.axonframework.modelling.command.TargetAggregateIdentifier
import org.sid.coreapi.commands.BaseCommand

abstract class BaseEvent<T>(
        @TargetAggregateIdentifier
        open val id:T
)
data class CustomerCreatedEvent(
      override  val id:String,
        val name:String,
        val email:String,

): BaseEvent<String>(id)

data class CustomerUpdateEvent(
      override  val id:String,
        val name:String,
        val email:String,

):BaseEvent<String>(id)