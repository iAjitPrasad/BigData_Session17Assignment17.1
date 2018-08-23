object appPartialFunc {
  def squareFun(x: Int): Unit = {
    println("Square of added number is  = " + x * x)
  }

  def pfAdd(x: Int,y: Int, z:Int)= x + y + z
  val sumVal = pfAdd(5, _:Int, _:Int)

  def partialFunc(a: Int, b: Int): Unit = {
    println("Addition all the three numbers we get = " + sumVal(a, b))
    squareFun(sumVal(a, b))
  }

  def main(args:Array[String]): Unit = {
    println("Enter the value of the numbers: ")
    var a:Int = scala.io.StdIn.readLine().toInt
    var b:Int = scala.io.StdIn.readLine().toInt
    partialFunc(a, b)
  }
}