import indigo.shared.time.Seconds
package object ld48 {
  implicit def autoSome[A](a: A): Option[A] = Some(a)
  implicit def timeToDouble(t: Seconds)     = t.toDouble
  implicit def eitherDirectionLeft(
      left: "left"
  ): Left["left", Nothing] = Left(left)
  implicit def eitherDirectionRight(
      right: "right"
  ): Right[Nothing, "right"] = Right(right)
}
