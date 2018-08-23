object appMatchCourse {
  def courseMatch(course:String): String = course match  {
      case "android" => "Android App Development : 14,999 INR"
      case "data science" => "Data Science : 49,999 INR"
      case "big data" => "Big Data & Spark course is : 24,999 INR"
      case "blockchain" => "Blockchain Certification : 49,999 INR"
      case _ => "Machine Learning course is being prepare and shall be made available soon."
    }

  def main(args:Array[String]): Unit = {

    println("\nCourses in Acadgild")
    println("_____________________")

    println("1. Android App Development")
    println("2. Data Science")
    println("3. Big Data Hadoop & Spark Developer")
    println("4. Blockchain Certification")
    println("5. Machine Learning with R")
    println("_____________________________________")
    println("Enter your choice: (eg. android, big data, ml,) " )

    var choice = scala.io.StdIn.readLine().toString.toLowerCase

    println("\n" + courseMatch(choice))
  }
}