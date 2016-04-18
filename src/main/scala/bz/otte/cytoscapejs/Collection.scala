package bz.otte.cytoscapejs

import scala.scalajs.js

/**
  * Created by wotte on 4/15/16.
  */
@js.native
class Collection extends js.Object with Element {
  val length : Int = js.native

  def size() : Int = js.native

  def empty() : Boolean = js.native

  def nonmpty() : Boolean = js.native

  def each(callback : js.Function2[Int, Element, _]) : Unit = js.native

  def forEach(callback : js.Function3[Int, Element, Collection, _]) : Unit = js.native

  def eq(index: Int) : Element = js.native

  def first() : Element = js.native

  def last() : Element = js.native
}
