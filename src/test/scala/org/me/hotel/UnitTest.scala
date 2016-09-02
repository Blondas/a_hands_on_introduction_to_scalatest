package org.me.hotel

import org.scalatest.{FlatSpec, Matchers}

class UnitTest(component: String) extends FlatSpec with Matchers{
  behavior of component
}
