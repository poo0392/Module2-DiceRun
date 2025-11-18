fun main(){

    println("-------Dice Run Game-------")

    println("Player 1, Please enter your full name:")
    val playerOne: String = readLine().toString()
    println("Hello $playerOne, Welcome to Dice Run Game!")

    Thread.sleep (1000)

    println("Player 2, Please enter your full name:")
    val playerTwo: String =  readLine().toString()
    println("Hello $playerTwo, Welcome to Dice Run Game!")

    //rolling the dice using function
  //  throwDice(playerOne)
    //Thread.sleep (1000)
    //throwDice(playerTwo)

    //rolling the dice using lambda  expression
    diceGame(playerOne)
    Thread.sleep (1000)
    diceGame(playerTwo)


}
val diceGame:(String) -> Unit = { user ->
    println("$user Press Enter to roll dice")
    readLine()

    println("Dice is rolling......")
    val diceResult = (1..6).random()

    Thread.sleep (1000)
    println("$user you rolled $diceResult")
}
fun throwDice(user:String){
    println("$user Press Enter to roll dice")
    readLine()

    println("Dice is rolling......")
    val diceResult = (1..6).random()

    Thread.sleep (1000)
    println("$user you rolled $diceResult")

}