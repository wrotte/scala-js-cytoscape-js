package bz.otte.cytoscapejs

import io.circe.{Json, JsonObject}

import scala.scalajs.js

/**
  * Created by wotte on 4/14/16.
  */
@js.native
object Core extends js.GlobalScope {
  def cytoscape(configuration: js.Object) : Graph = js.native
}
