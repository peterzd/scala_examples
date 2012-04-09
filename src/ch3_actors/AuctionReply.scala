package ch3_actors
import java.util.Date
import scala.actors.Actor

/**
 * Replies from the service to the clients 
 */
abstract class AuctionReply 

case class Status(asked : Int , expire : Date) extends AuctionReply
case object BestOffer extends AuctionReply
case class BeatenOffer(maxBid : Int) extends AuctionReply
case class AuctionConcluded(seller : Actor , client : Actor) extends AuctionReply

case object AuctionFailed extends AuctionReply
case object AuctionOver extends AuctionReply
