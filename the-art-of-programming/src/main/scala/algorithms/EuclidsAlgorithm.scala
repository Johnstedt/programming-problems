package algorithms

import java.util.Scanner

object EuclidsAlgorithm {
  def main(args: Array[String]): Unit = {
    val scanner = new Scanner(System.in)
    var m = scanner.nextInt()
    var n = scanner.nextInt()
    var r = m % n

    while (r != 0) {
      m = n
      n = r
      r = m % n
    }
    println(n)
  }
}
