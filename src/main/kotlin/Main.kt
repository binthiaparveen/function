import java.util.Scanner
fun main(args: Array<String>) {
    leapYear()
}
fun leapYear(){
    var sc = Scanner(System.`in`)
    print("Enter starting year = ")
    var startingYear = sc.nextInt()
    print("Enter ending year = ")
    var endingYear = sc.nextInt()
    println("Leap year between $startingYear - $endingYear is : ")
    for (year in startingYear .. endingYear step 2 ){
        if (year!=0){
            if (year % 4 == 0 && year % 100!=0 || year % 400 == 0){
                println("$year is a leap year.")
            }else{
                println("$year is not a leap year.")
            }
        }else{
            println("Invalid year.")
        }
    }
}
}