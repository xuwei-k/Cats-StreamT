package cats.data

import scalaprops._
import scalaz._
import scalaz.std.anyVal._
import scalaz.std.option._
import scalaz.std.tuple._

object StreamTTest extends Scalaprops {

  type StreamTIList[A] = cats.data.StreamingT[IList, A]

  override def param = super.param.copy(maxSize = 2, rand = Rand.standard(1))

  val laws = scalazlaws.monad.all[StreamTIList]

}
