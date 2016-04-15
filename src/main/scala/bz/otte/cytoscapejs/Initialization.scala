package bz.otte.cytoscapejs

import scala.scalajs.js

/**
  * Created by wotte on 4/14/16.
  */
object Initialization {
  def makeConfiguration(cont : js.Any): js.Object = {
    new js.Object {
      var container = cont
      var elements = js.Array(0)
      var layout = new js.Object {
        var name = "preset"
      }
      var style = new js.Array(0)
    }
  }

  @js.native
  object Global extends js.GlobalScope {
    def cytoscape(configuration: js.Object) : Core = js.native
  }
}
