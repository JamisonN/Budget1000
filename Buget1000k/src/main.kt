
fun main(args:Array<String>){
    val rent = 75
    var food = 10
    val charity = 10
    var sparechange = 10
    val investment = 10
    var Income :Int = readLine()!!.toInt()

    println(Income)
    Income-=rent
    println("After rent -"+Income)
    Income -= food
    println("After food - "+Income);
    Income -=charity
    println("After Charity - "+Income)
    Income -= sparechange
    println("After sparechange - "+Income)
    Income -= investment
    println("After investment - "+Income)

    //Extras
    if(Income > 0) {
        println("Calculating extras")

        while (Income > 0) {
            sparechange++
            Income--
            food++
            Income--
        }
        println("Food after Extra allocation - $food")
        println("Sparechange after Extra allocation - $sparechange")
    }




}