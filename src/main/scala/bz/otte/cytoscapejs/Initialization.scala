package bz.otte.cytoscapejs

import scala.scalajs.js

/**
  * Created by wotte on 4/14/16.
  */
object Initialization {
  def makeConfiguration(cont : js.Any,
                        _style: Option[js.Any] = None,
                        _layout: Option[js.Any] = None): js.Object = {
    new js.Object {
      var container = cont
      var elements = js.Array(0)
      var layout = _layout.getOrElse(js.Dictionary ("name" -> "breadthfirst"))
      var style = _style.getOrElse(new js.Array)
    }
  }

  @js.native
  object Global extends js.GlobalScope {
    def cytoscape(configuration: js.Object) : Core = js.native
  }
}
