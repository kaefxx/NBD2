object z4 {
  def function(number: Int, operation: Int => Int): Int = {
    var i = 0
    var result = number
    for (i <- 1 to 3){
      result = operation(result)
    }
   result
  }

  def increase(number: Int): Int = {
    number +1
  }

  def main(args: Array[String]): Unit = {
    println(function(1, increase))
  }
}
