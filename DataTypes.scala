//'object' is a singleton instance that is lately initialized
//when it is first accessed. It is similar to class but only one
//instance will be created automatically.
object DataTypes {
  // main is entry point to any Scala Application
  // Unit defines the return type of 'main' indicating that it returns nothing
  def main(args: Array[String]): Unit = {
    // Integer Data type
    val intNum: Int = 20
    val longNum: Long = 1234567890L
    val shortNum: Short = 32765
    val byteNum: Byte = 127

    // Floating Datatypes
    val  FloatingNum: Float = 3.14f
    val doubleNum: Double = 3.41245634567

    // String Datatypes
    val  stringVar: String = "Hello Scala"

    // Character Datatypes
    val charvar: Char = 'A'

    // Unit Data type
    val unitValue: Unit = ()

    // Printing values
    println(s"Integer: $intNum")
    print(s"$charvar")
    println()
    println(s"Short value = $shortNum")

    // Mutable Data types
    // Boolean - true, false
    var boolVar: Boolean = true
    println("Boolean" + boolVar)
    var intVar: Int = 1234
    println("Integer Variable:" + intVar)

    // Update Item assignment in mutable variable
    intVar = intVar + 1000
    println("Updated Value: " + intVar)
  }
}