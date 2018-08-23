trait Aggregate {
  def sum(x:Array[Double]): Double = {
    var sum:Double = 0
    for (i <- 0 to x.length-1) sum = sum + x(i)
    sum
  }
  def sum(w: Double, x: Double, y: Double, z: Double): Double = w + x + y +z
}
trait Average{
  def avg(sum: Double, length: Int): Double = sum/length
  def analyzeAvg(avg: Int): String = {
    var grade: String = ""
    if(avg > 85) grade = "A"
    else if(avg < 85 && avg > 65) grade = "B"
    else if(avg < 65 && avg > 40) grade = "C"
    else grade = "F"
    grade
  }
}
class Student extends Aggregate with Average {
  var marks:Array[Double] = new Array[Double] (4)
  var overallGrade = 0
  def StudentMarks(): Unit = {
    println("Student Marks")
    println("_____________")
    println("Enter the aggregate marks of the student for 4 semesters: ")
    for(y <- 0 to marks.length-1)
      marks(y) = scala.io.StdIn.readLine().toDouble
    var finalSum = sum(marks)
    var finalAvg = avg(finalSum, marks.length).toInt
    println(s"Marks = " + finalAvg)
    overallGrade = overallGrade + finalAvg
  }
  def StudentAttendance(): Unit = {
    println("\nStudent Attendance")
    println("--------------------")
    println("Enter the attendance percentage of the student for 4 semesters: ")
    var sem1a = scala.io.StdIn.readLine().toDouble
    var sem2a = scala.io.StdIn.readLine().toDouble
    var sem3a = scala.io.StdIn.readLine().toDouble
    var sem4a = scala.io.StdIn.readLine().toDouble
    var finalSum = sum(sem1a, sem2a, sem3a, sem4a)
    var finalAvg = avg(finalSum,4).toInt
    println(s"Attendance = " + finalAvg)
    overallGrade = overallGrade + finalAvg
  }
  def Grade(): Unit = println(s"Overall Grade = " + analyzeAvg(overallGrade/2))
}
object appMultipleInheritance{
  def main(args: Array[String]) {
    println("Example of Multiple Inheritance")
    println("______________________________")
    var sDetails:Student = new Student()
    sDetails.StudentMarks()
    sDetails.StudentAttendance()
    sDetails.Grade()
  }
}
