package bz.otte.cytoscapejs

import scala.scalajs.js

/**
  * Created by wotte on 4/16/16.
  */
@js.native
trait Style extends js.Object {
  def resetToDefault() : Style = js.native

  def selector(string: String) : Style = js.native

  def style(string: String) : Style = js.native

  def style(sty: js.Object) : Style = js.native

  def update() : Unit = js.native
}
