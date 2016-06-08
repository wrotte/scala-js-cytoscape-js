package bz.otte.cytoscapejs

import scala.scalajs.js

/**
  * Created by wotte on 4/14/16.
  */
object Initialization {
  def makeConfiguration(cont : Option[js.Any] = None,
                        _style: Option[js.Any] = None,
                        _layout: Option[js.Any] = None,
                        _headless: Option[Boolean] = None): js.Object = {
    new js.Object {
      var container = cont.orNull
      var elements = js.Array(0)
      var layout = _layout.getOrElse(js.Dictionary ("name" -> "breadthfirst"))
      var style = _style.getOrElse(new js.Array)
      var headless = _headless.getOrElse(false)
    }
  }

  @js.native
  object Global extends js.GlobalScope {
    def cytoscape(configuration: js.Object) : Core = js.native
  }
}
