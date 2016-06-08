import scala.scalajs.js
import js.annotation._
import js.|

package bz.otte.qtip2 {
//  package QTip2 {
    import org.scalajs.dom.Event

    @js.native
    trait Content extends js.Object {
      var title: QTip2.Title | js.Any = js.native
      var text: QTip2.Text = js.native
      var attr: String = js.native
      var button: String | JQuery | Boolean = js.native
    }

    @js.native
    trait PositionAdjust extends js.Object {
      var x: Double = js.native
      var y: Double = js.native
      var mouse: Boolean = js.native
      var resize: Boolean = js.native
      var scroll: Boolean = js.native
      var method: String = js.native
    }

    @js.native
    trait Position extends js.Object {
      var my: String | Boolean = js.native
      var at: String | Boolean = js.native
      var target: QTip2.Target | Boolean = js.native
      var container: JQuery | Boolean = js.native
      var viewport: JQuery | Boolean = js.native
      var effect: Boolean | js.Function3[Api, js.Any, js.Any, Unit] = js.native
      var adjust: PositionAdjust = js.native
    }

    @js.native
    trait Show extends js.Object {
      var target: JQuery | Boolean = js.native
      var event: String | Boolean = js.native
      var delay: Double = js.native
      var solo: JQuery | String | Boolean = js.native
      var ready: Boolean = js.native
      var effect: Boolean | js.Function1[js.Any, Unit] = js.native
      var modal: Boolean | Modal = js.native
    }

    @js.native
    trait Modal extends js.Object {
      var on: Boolean = js.native
      var blur: Boolean = js.native
      var escape: Boolean = js.native
      var stealfocus: Boolean = js.native
      var effect: Boolean | js.Function1[js.Any, Unit] = js.native
    }

    @js.native
    trait Hide extends js.Object {
      var target: JQuery | Boolean = js.native
      var event: String | Boolean = js.native
      var delay: Double = js.native
      var inactive: Double | Boolean = js.native
      var fixed: Boolean = js.native
      var leave: String | Boolean = js.native
      var distance: Double | Boolean = js.native
      var effect: Boolean | js.Function1[js.Any, Unit] = js.native
    }

    @js.native
    trait Style extends js.Object {
      var classes: String | Boolean = js.native
      var `def`: Boolean = js.native
      var widget: Boolean = js.native
      var width: String | Double | Boolean = js.native
      var height: String | Double | Boolean = js.native
      var tip: String | Boolean | Tip = js.native
    }

    @js.native
    trait Tip extends js.Object {
      var corner: String | Boolean = js.native
      var mimic: String | Boolean = js.native
      var border: Double | Boolean = js.native
      var width: Double = js.native
      var height: Double = js.native
      var offset: Double = js.native
    }

    @js.native
    trait Events extends js.Object {
      var render: QTip2.EventApiFunc = js.native
      var show: QTip2.EventApiFunc = js.native
      var hide: QTip2.EventApiFunc = js.native
      var toggle: QTip2.EventApiFunc = js.native
      var visible: QTip2.EventApiFunc = js.native
      var hidden: QTip2.EventApiFunc = js.native
      var move: QTip2.EventApiFunc = js.native
      var focus: QTip2.EventApiFunc = js.native
      var blur: QTip2.EventApiFunc = js.native
    }

    @js.native
    trait QTipOptions extends js.Object {
      var id: String | Boolean = js.native
      var prerender: Boolean = js.native
      var overwrite: Boolean = js.native
      var suppress: Boolean = js.native
      var metadata: js.Any = js.native
      var content: QTip2.Text | Content = js.native
      var position: String | Position = js.native
      var style: String | Style = js.native
      var show: String | Boolean | JQuery | Show = js.native
      var hide: String | JQuery | Hide = js.native
      var events: Events = js.native
    }

    @js.native
    trait Api extends js.Object {
      def get(propertyName: String): js.Dynamic = js.native
      def set(properties: QTipOptions): Api = js.native
      def set(propertyName: String, value: js.Any): Api = js.native
      def toggle(state: Boolean = ???, event: Event = ???): Api = js.native
      def show(event: Event = ???): Api = js.native
      def hide(event: Event = ???): Api = js.native
      def disable(state: Boolean = ???): Api = js.native
      def enable(): Api = js.native
      def reposition(event: Event = ???, effect: Boolean = ???): Api = js.native
      def focus(event: Event = ???): Api = js.native
      def blur(event: Event = ???): Api = js.native
      def destroy(immediate: Boolean = ???): Api = js.native
    }

    @JSName("QTip2")
    @js.native
    object QTip2 extends js.Object {
      type EventApiFunc = js.Function2[Event, Api, Unit]
      type Title = String | JQuery | EventApiFunc | Boolean// | JQueryGenericPromise[js.Any]
      type Text = String | JQuery | EventApiFunc | Boolean// | JQueryGenericPromise[js.Any]
      type Target = JQuery | js.Array[Double] | String
    }
//  }

  @js.native
  trait JQuery extends js.Object {
    def qtip(options: QTipOptions): JQuery = js.native
    def qtip(methodName: String, p1: js.Any, p2: js.Any, p3: js.Any): js.Dynamic = js.native
  }
}
