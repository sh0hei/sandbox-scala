package ex.basic

/**
 * Created by sh0hei on 15/07/27.
 */
object MethodAndFunction extends App {

  // method
  def bmiMethod(t: Double, w: Double) = {
    val t1 = t * 0.01
    w / (t1 * t1)
  }

  // function object
  def bmiFunction = (t: Double, w: Double) => {
    val t1 = t * 0.01
    w / (t1 * t1)
  }

  def test(): Unit = {
    val m = bmiMethod(165, 60)
    val f = bmiFunction(165, 60)
    println("BMI (Method) = " + m)
    println("BMI (Function) = " + f)
  }

  test()
}