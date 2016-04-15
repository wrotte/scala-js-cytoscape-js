package bz.otte.cytoscapejs

import scala.scalajs.js

/**
  * Created by wotte on 4/14/16.
  */
@js.native
trait Graph extends js.Object {
  def add(element: js.Object) : Unit = js.native

  def add(elements: scala.collection.mutable.Seq[js.Object]) : Unit = js.native
}
