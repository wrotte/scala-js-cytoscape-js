package bz.otte.cytoscapejs

import scala.scalajs.js

/**
  * Created by wotte on 4/15/16.
  */
@js.native
trait Element extends js.Object

object Element {
  def apply(_group: String,
              _data: js.Object,
              _position: Position,
              _selected: Boolean = false,
              _selectable: Boolean = true,
              _locked: Boolean = false,
              _grabbable: Boolean = true,
              _classes: String = ""): Element = {
    new js.Object {
      val group = _group
      val data = _data
      val scratch = new js.Object {}
      val position = _position
      val selected = _selected
      val selectable = _selectable
      val locked = _locked
      val grabbable = _grabbable
      val classes = _classes
    }.asInstanceOf[Element]
  }

  def node(name : String,
           position: Position,
           selected: Boolean = false,
           selectable: Boolean = true,
           locked: Boolean = false,
           grabbable: Boolean = true,
           classes: String = "") = Element(_group = "nodes",
    _data = new js.Object {
      val id = name
    },
    _position = position,
    _selected = selected,
    _selectable = selectable,
    _locked = locked,
    _grabbable = grabbable,
    _classes = classes)

  def edge(name : String,
           _source: String,
           _target: String,
           position: Position,
           selected: Boolean = false,
           selectable: Boolean = true,
           locked: Boolean = false,
           grabbable: Boolean = true,
           classes: String = "") = Element(_group = "edges",
    _data = new js.Object {
      val id = name
      val source = _source
      val target = _target
    },
    _position = position,
    _selected = selected,
    _selectable = selectable,
    _locked = locked,
    _grabbable = grabbable,
    _classes = classes)
}