package bz.otte.cytoscapejs

import scala.scalajs.js


/**
  * Created by wotte on 4/14/16.
  */
@js.native
class Core extends js.Object {
  // Graph
    def add(element: Element): Unit = js.native

    def add(elements: js.Array[Element]): Unit = js.native

    def remove(element: Element): Unit = js.native

    def remove(selector: String): Unit = js.native

    def collection(): Unit = js.native

    def collection(selector: String): Unit = js.native

    def collection(elements: js.Array[Element]): Unit = js.native

    def getElementById(id: String): Element = js.native

    def elements(selector: String): Unit = js.native

    def nodes(selector: String): Unit = js.native

    def edges(selector: String): Unit = js.native

    def filter(selector: String): Unit = js.native

    def filter(selector: js.Function2[Int, Element, Boolean]): Unit = js.native

    def batch(batch_fn: js.Function): Unit = js.native

    def startBatch(): Unit = js.native

    def endBatch(): Unit = js.native

    def destroy(): Unit = js.native

    def scratch(): js.Object = js.native

    def scratch(namespace: String): js.Object = js.native

    def scratch(namespace: String, value: js.Object): Unit = js.native

    def removeScratch(namespace: String): js.Object = js.native



  // Events
  def on(events: String): Unit = js.native

  def on(events: String, selector: String): Unit = js.native

  def on(events: String, selector: String, data: js.Object, handler: js.Function1[Element, Nothing]): Unit = js.native

  // TODO:  Replace with js.promise
  def promiseOn(events: String): js.Object = js.native

  def one(events: String): Unit = js.native

  def one(events: String, selector: String): Unit = js.native

  def one(events: String, selector: String, data: js.Object, handler: js.Function1[Element, Nothing]): Unit = js.native

  def off(events: String): Unit = js.native

  def off(events: String, selector: String): Unit = js.native

  def off(events: String, selector: String, handler: js.Function1[Element, Nothing]): Unit = js.native

  def trigger(events: String): Unit = js.native

  def trigger(events: String, extraParams: js.Array[js.Any]): Unit = js.native

  def initrender(): Boolean = js.native

  def onRender(handler: js.Function): Unit = js.native

  def offRender(handler: js.Function): Unit = js.native

  def ready(handler: js.Function): Unit = js.native


  // Viewport
  def center(): Unit = js.native

  def center(elements: Collection): Unit = js.native

  def fit(): Unit = js.native

  def fit(elements: Collection): Unit = js.native

  def reset(): Unit = js.native

  def pan(): Position = js.native

  def pan(position: Position): Unit = js.native

  def panBy(position: Position): Unit = js.native

  def panningEnabled(): Boolean = js.native

  def panningEnabled(flag: Boolean): Unit = js.native

  def userPanningEnabled(): Boolean = js.native

  def userPanningEnabled(flag: Boolean) : Unit = js.native

  def zoom(level: Double): Unit = js.native

  def zoom(options: js.Object {
    val level: Double
    val position: Position
    val renderedPosition: Position
    }) : Unit = js.native

  def zoomingEnabled(): Boolean = js.native

  def zoomingEnabled(flag: Boolean) : Unit = js.native

  def userZoomingEnabled(): Boolean = js.native

  def userZoomingEnabled(flag: Boolean) : Unit = js.native

  def minZoom(): Double = js.native

  def minZoom(level: Double) : Unit = js.native

  def maxZoom(): Double = js.native

  def maxZoom(level: Double) : Unit = js.native

  def viewport(zoom: Double, pan: Position): Unit = js.native

  def boxSelectionEnabled(): Boolean = js.native

  def boxSelectionEnabled(flag: Boolean) : Unit = js.native

  def width(): Int = js.native

  def height(): Int = js.native

  def extent: js.Object {
    val x1: Int
    val y1: Int
    val x2: Int
    val y2: Int
    val w: Int
    val h: Int
    } = js.native

  def autolock(): Boolean = js.native

  def autolock(flag: Boolean) : Unit = js.native

  def autoungrabify(): Boolean = js.native

  def autoungrabify(flag: Boolean) : Unit = js.native

  def autounselectify(): Boolean = js.native

  def autounselectify(flag: Boolean) : Unit = js.native

  def forceRender(): Unit = js.native

  def resize(): Unit = js.native

  def animated(): Boolean = js.native

  def animate(options: js.Object) : Unit = js.native

  def animation(options: js.Object) : js.Object = js.native

  def delay(millis: Long, func: js.Function) : Unit = js.native

  def delayAnimation(millis: Long) : js.Object = js.native

  def stop(clearQueue: Boolean, jumpToEnd: Boolean) : Unit = js.native

  def clearQueue() : Unit = js.native

  def layout(options: js.Object) : Unit = js.native

  def makeLayout(options: js.Object) : js.Object = js.native

  def style() : js.Object = js.native

  def png(options: js.Object) : String = js.native

  def jpg(options: js.Object) : String = js.native

  def json() : String = js.native

  def json(json: String) : Unit = js.native
}
