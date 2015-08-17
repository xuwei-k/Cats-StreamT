package cats.data

import scalaprops._
import scalaz._
import scalaz.std.anyVal._
import scalaz.std.option._
import scalaz.std.tuple._

object StreamTTest extends Scalaprops {

  type StreamTIList[A] = cats.data.StreamT[IList, A]

  val laws = scalazlaws.monad.all[StreamTIList].andThenParam(Param.maxSize(2))

}
