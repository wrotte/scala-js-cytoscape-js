package bz.otte.cytoscapejs

import io.circe.JsonObject

import scala.scalajs.js
import org.scalajs.dom

import scala.scalajs.js.annotation.{JSExport, ScalaJSDefined}

/**
  * Created by wotte on 4/14/16.
  */
object Configuration {
  def cytoscape(cont : js.Any): js.Object = {
    new js.Object {
      var container = cont
      var elements = js.Array(0)
      var layout = new js.Object {
        var name = "preset"
      }
      var style = new js.Array(0)
    }
  }

  def element(_group: String,
              _data: js.Object,
              _position: (Double, Double) = (50, 50),
              _selected: Boolean = false,
              _selectable: Boolean = true,
              _locked: Boolean = false,
              _grabbable: Boolean = true,
              _classes: String = ""): js.Object = {
    new js.Object {
      val group = _group
      val data = _data
      val scratch = new js.Object {}
      val position = new js.Object {
        val x = _position._1
        val y = _position._2
      }
      val selected = _selected
      val selectable = _selectable
      val locked = _locked
      val grabbable = _grabbable
      val classes = _classes
    }
  }

  def node(name : String,
           position: (Double, Double) = (50, 50),
           selected: Boolean = false,
           selectable: Boolean = true,
           locked: Boolean = false,
           grabbable: Boolean = true,
           classes: String = ""): js.Object = element(_group = "nodes",
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
           position: (Double, Double) = (50, 50),
           selected: Boolean = false,
           selectable: Boolean = true,
           locked: Boolean = false,
           grabbable: Boolean = true,
           classes: String = ""): js.Object = element(_group = "edges",
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
