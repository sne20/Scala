// Collections in Scala Programming
object DataStructures{
  def main(args: Array[String]): Unit = {
    // List : Immutable, Homogeneous Collection of Data
    val fruits: List[String] = List("apple", "oranges", "watermelon",
    "grapes", "guava")
    println("First Element: " + fruits.head)
    println("Last Element: " + fruits.last)

    val List1 = List("Hadoop", "Spark", "Flume", true, 10000, 3.14)
    println(List1)
    println(fruits.getClass)

    // Empty List Declaration
    val emptyList: List[Nothing] = List()

    // List Declaration
    val List2 = 10::20::30::40::Nil

    // Create a List Buffer of type Mutable
    import scala.collection.mutable.ListBuffer
    var cities = new ListBuffer[String]()
    cities += "Thiruvananthapuram"
    cities += ("Kochi", "Mumbai", "Delhi")
    cities -= "Mumbai"
    println(cities)
    cities.toList // Typecasting in Scala is done by toDataType()

    // Array Data Type : Array is mutable, fixed size collection
    // Array is Homogenous Collection
    val arrData = Array("apple", "oranges", "watermelon",
      "grapes", "guava")

    // Prints element by element output in new line
    // arrData.foreach(println)

    println(arrData.mkString(","))
    arrData(0) = "banana"
    println(arrData.mkString(","))

    //Declare an Empty Array
    val arr_1 = new Array[String](10)
    val arr_2 = Array.ofDim[Int](2,2)
    arr_2(0)(0) = 234
    arr_2(0)(1) = 135
    arr_2(1)(0) = 911
    arr_2(1)(1) = 102

    // Update in 2D Array
    arr_2(0)(1) = 34

    // Print the array
    val flattenArr: Array[Int] = arr_2.flatten
    println(flattenArr.mkString(", "))

    // Set Collection: Immutable Collection
    // HashSet - Mutable Collection of sets
    val set_1: Set[String] = Set()

    val  set_2 = Set("apple", "oranges", "watermelon", "grapes", "guava")

    import scala.collection.mutable.Set
    val  mutableSet = Set("apple","oranges","watermelon","grapes","gauva")
    mutableSet += "blueberry"
    mutableSet -= "apple"

    // Tuple Declaration - Immutable Collection
    // In scala tuple is fixed size, can hold multiple data type
    val Tuple_1 = (10, 20, 30, 40, 50, 60, 70, 80)
    // Tuple_1._1 = "String" Update will provide error.
    println(Tuple_1._2) // Accessing individual value.(2nd Element)

    // Map in Scala is collection of key-value pairs where
    // each key is unique, It is similar to Dictionary in Python

    //import scala.collection.immutable.Map
    var MapVar:Map[String, Int] = Map()
    //var MapVar1 = Map("UST1001" -> "Sandeep", "UST1002" -> "Midhun", "UST1003" -> "Vinesh")
    //println(MapVar1.contains("UST1003"))
    // Access value using key
   // println(MapVar1.get("UST1003"))
    // print all keys
    //println(MapVar1.keys)
    // print all values
    //println(MapVar1.values)

    // Declare mutable Map Data types
    import scala.collection.mutable.Map
    val  mutable_Var =  Map("UST1001" -> "Sandeep", "UST1002" -> "Midhun", "UST1003" -> "Vinesh")
    // Update exixting key
    mutable_Var("UST1001") = "Rohit"
    // Insert a new key-value value pair
    mutable_Var += ("UST1004" -> "Siva")

    // Iterators in Scala Programming
    // An iterator in scala represent a sequence of elements
    // that allows you to traverse through a collection sequence
    val myList = List(20, 30, 40, 50, 60, 70, 80, 90)
    val iter = myList.iterator
    // Method of iterator to check if there is more elements
    // (.hasNext()), .next() - to retrieve next Value,
    // .remove() to remove elements from mutable iterators
    println(iter.next())
    println(iter.next())

    // lazy initialization using Scala
    lazy val donuts: Int = 100
    println(donuts * 5)
    // lazy can't be used with var
    // lazy var donuts_1: Int = 20
  }
}
