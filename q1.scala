import scala.io.StdIn.readLine
import scala.io.StdIn.readInt

object cipher {

  def encryptFunction(text: Array[Char]): Array[Char] = {
    text.map(c => (c + 1).toChar)
  }

  def decryptFunction(text: Array[Char]): Array[Char] = {
    text.map(c => (c - 1).toChar)
  }

  def cipher(
      encrypt: Array[Char] => Array[Char],
      decrypt: Array[Char] => Array[Char],
      method: Int,
      data: Array[Char]
  ): String = {

    val result = method match {
      case 1 => encrypt(data)
      case 2 => decrypt(data)
    }
    result.mkString("")
  }

  def main(args: Array[String]): Unit = {

    println("Enter the word :")
    var cipherText = readLine()
    var textArray: Array[Char] = cipherText.toCharArray()

    println("Enter the method : 1 - Encryption | 2 - Decryption")
    val method: Int = readInt()

    var finalText = cipher(encryptFunction, decryptFunction, method, textArray)
    println(finalText.mkString(""))

  }

}
