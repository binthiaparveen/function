import java.util.Scanner
fun main(args: Array<String>) {
    fibonacci()
}
fun fibonacci() {
    var sc = Scanner(System.`in`)
    println("Enter Fibonacci number range : ")
    var lastNum = sc.nextInt()
    var firstNum = 0
    var secondNum = 1
    for (fibo in 1..lastNum) {
        println(firstNum)
        var next = firstNum + secondNum
        firstNum = secondNum
        secondNum = next
    }
}