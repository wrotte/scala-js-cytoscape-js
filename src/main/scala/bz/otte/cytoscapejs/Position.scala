package bz.otte.cytoscapejs

import scala.scalajs.js

/**
  * Created by wotte on 4/15/16.
  */
@js.native
trait Position extends js.Object{
  val x: Double
  val y: Double
}

object Position {
  def apply(_x: Double, _y: Double) = new js.Object() {
       val y: Double = _y
       val x: Double = _x
    }.asInstanceOf[Position]
  }


