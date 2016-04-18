package bz.otte.cytoscapejs

import scala.scalajs.js

/**
  * Created by wotte on 4/16/16.
  */
@js.native
trait Event extends js.Object{
  val cy : Core = js.native
  val cyTarget : js.Object = js.native
  val `type`: String = js.native
  val namespace: String = js.native
  val data: js.Object = js.native
  val timeStamp: Long = js.native
}
