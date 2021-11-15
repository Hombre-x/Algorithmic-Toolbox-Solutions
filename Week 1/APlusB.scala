import scala.io.StdIn.readLine

object APlusB
{
  def sum(a: Int, b: Int): Int = a + b

  def main(args: Array[String]): Unit =
  {
    val inputNum: Vector[Int] = readLine().split(" ").map(n => n.toInt).toVector

    println(sum(inputNum(0), inputNum(1)))
    
  }
}