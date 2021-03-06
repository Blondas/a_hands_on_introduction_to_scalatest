package org.me.hotel

case class Room(number: Int, guest: Option[Guest] = None){ room =>

  def isAvailable(): Boolean = guest.isEmpty

  def checkin(guest: Guest): Room = {
    require(room.guest.isEmpty, "Room occupied")
    Room(number, Some(guest))
  }

  def checkout(): Room = {
    require(guest.isDefined, "Room is already available")
    Room(number, None)
  }

}