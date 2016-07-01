package bz.otte.cytoscapejs

import scala.scalajs.js

/**
  * Created by wotte on 4/15/16.
  */
@js.native
trait ElementObject extends js.Object {
  val group : String = js.native
  val data : js.Dictionary[Object] = js.native
  val scratch : js.Dictionary[Object] = js.native
  val position : Position = js.native
  val selected : Boolean = js.native
  val selectable : Boolean = js.native
  val locked : Boolean = js.native
  val grabbable : Boolean = js.native
  var classes : String = js.native
}

@js.native
trait Element extends js.Object {
  def scratch() : js.Object = js.native
  def scratch(namespace: String) : js.Object = js.native
  def scratch(namespace: String, value : js.Object) : Unit = js.native
  def removeScratch(): Unit = js.native
  def id(): String = js.native
  def json(): ElementObject = js.native
  def group(): String = js.native
  def isNode() : Boolean = js.native
  def isEdge() : Boolean = js.native
  def isLoop() : Boolean = js.native
  def isSimple(): Boolean = js.native
  def data() : js.Object = js.native
  def data(key : String) : js.Object = js.native
  def data(key: String, value: String) : Unit = js.native
  def data(key: String, value: js.Any) : Unit = js.native
  def data(dict : js.Dictionary[js.Object]) : Unit = js.native
  def addClass(string: String) : Unit = js.native
  def removeClass(string: String) : Unit = js.native
  def toggleClass(string: String, toggle: Boolean) : Unit = js.native
  def classes(string: String = "") : Unit = js.native
  def flashClass(string: String, duration: Long = 0) : Unit = js.native
  def hasClass(string: String) : Boolean = js.native
  def layout(options: js.Object) : Unit = js.native
  def style(style : js.Object) : Unit = js.native
}

object ElementObject {
  def apply(_group: String,
              _data: js.Dictionary[Object],
              _position: Position = Position(0, 0),
              _selected: Boolean = false,
              _selectable: Boolean = true,
              _locked: Boolean = false,
              _grabbable: Boolean = true,
              _classes: String = ""): ElementObject = {
    new js.Object {
      val group = _group
      val data = _data
      val scratch = js.Dictionary()
      val position = _position
      val selected = _selected
      val selectable = _selectable
      val locked = _locked
      val grabbable = _grabbable
      val classes = _classes
    }.asInstanceOf[ElementObject]
  }

  def node(name : String,
           position: Position = Position(0, 0),
           selected: Boolean = false,
           selectable: Boolean = true,
           locked: Boolean = false,
           grabbable: Boolean = true,
           classes: String = "") = ElementObject(_group = "nodes",
    _data = js.Dictionary("id" -> name),
    _position = position,
    _selected = selected,
    _selectable = selectable,
    _locked = locked,
    _grabbable = grabbable,
    _classes = classes)

  def edge(name : String,
           _source: String,
           _target: String,
           position: Position = Position(0, 0),
           selected: Boolean = false,
           selectable: Boolean = true,
           locked: Boolean = false,
           grabbable: Boolean = true,
           classes: String = "") = ElementObject(_group = "edges",
    _data = js.Dictionary("id" -> name, "source" -> _source, "target" -> _target),
    _position = position,
    _selected = selected,
    _selectable = selectable,
    _locked = locked,
    _grabbable = grabbable,
    _classes = classes)
}