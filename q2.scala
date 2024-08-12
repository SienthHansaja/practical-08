import scala.io.StdIn.readInt
object division {

  def main(args: Array[String]): Unit = {
    println("Enter a number: ")
    val num: Int = readInt()

    val categorize: Int => String = {
      case num if num % 3 == 0 && num % 5 == 0 =>
        "Multiple of Both Three and Five"
      case num if num % 3 == 0 => "Multiple of Three"
      case num if num % 5 == 0 => "Multiple of Five"
      case _                   => "Not a Multiple of Three or Five"
    }

    println(categorize(num))

  }

}
