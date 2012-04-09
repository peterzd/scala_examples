package ch3_actors
import scala.actors.Actor

/**
 * Messages from clients to the auction service
 */
abstract class AuctionMessage 

case class Offer(bid : Int , client : Actor) extends AuctionMessage
case class Inquire(client : Actor) extends AuctionMessage