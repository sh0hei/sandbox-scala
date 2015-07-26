package ex.basic

/**
 * Created by sh0hei on 15/07/26.
 */
object Literal extends App {

  val num1 = 123
  val num2 = 123.4
  val ch   = 'A'
  val str  = "ABC"
  val bol  = true
  val lst1 = 1::2::3::Nil
  val lst2 = List(1, 2, 3)

  val func1 = (x: Int) => x * x
  val func2 = (x: Int, y: Int) => (x + y) / 2.0
  val func3 = (x: Int, y: String, z: Int) => x + y + z

  def test1(): Unit = {
    println("\n== test Types & Values of Literals ===\n")
    val fmt = "%-4s value: %-15s type: %s\n"

    printf(fmt, "num1", num1, ex.bucket.Util.typeName(num1))
    printf(fmt, "num2", num2, ex.bucket.Util.typeName(num2))
    printf(fmt, "ch", ch, ex.bucket.Util.typeName(ch))
    printf(fmt, "str", str, ex.bucket.Util.typeName(str))
    printf(fmt, "bol", bol, ex.bucket.Util.typeName(bol))
    printf(fmt, "lst1", lst1, ex.bucket.Util.typeName(lst1))
    printf(fmt, "lst2", lst2, ex.bucket.Util.typeName(lst2))
    printf(fmt, "func1", func1, ex.bucket.Util.typeName(func1))
    printf(fmt, "func2", func2, ex.bucket.Util.typeName(func2))
    printf(fmt, "func3", func3, ex.bucket.Util.typeName(func3))
  }

  def test2(): Unit = {
    println("\n=== test2 test Types & Values of call defined expressions ===\n")
    val fmt2 = "%-14s value: %-5s type: %s\n"
    printf(fmt2, "func1(2)", func1(2), ex.bucket.Util.typeName(func1(2)))
    printf(fmt2, "func2(2, 5)", func2(2, 5), ex.bucket.Util.typeName(func2(2, 5)))
    printf(fmt2, "func3(2, \";\", 5)", func3(2, ";", 5), ex.bucket.Util.typeName(func3(2, ";", 5)))
  }
  test1()
  test2()
}
