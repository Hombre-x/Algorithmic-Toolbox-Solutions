import scala.io.StdIn._
import scala.math.BigInt

object MaxProduct
{
  def removeFromVec[A](aVector: Vector[A], number: A): Vector[A] =
  {
    def tailRemove(myVector: Vector[A], front: Vector[A]): Vector[A] =
    {
      if (myVector.isEmpty) front
      else if (myVector.head == number) front ++ myVector.tail
      else tailRemove(myVector.tail, front :+ myVector.head)
    }

    tailRemove(aVector, Vector())
  }

  def getMaxProduct(numbers: Vector[BigInt]) =
  {
    val maxNumber1 = numbers.max
    val reducenNumbers = removeFromVec(numbers, maxNumber1)
    val maxNumber2 = reducenNumbers.max

    maxNumber1 * maxNumber2
  }

  def main(args: Array[String]): Unit =
  {
    val n: Int = readInt()
    val numbers: Vector[BigInt] = readLine().split(" ").map(n => BigInt(n)).toVector

    println(getMaxProduct(numbers))
  }
}