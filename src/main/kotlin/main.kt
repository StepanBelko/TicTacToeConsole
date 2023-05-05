package main.kotlin

fun main() {
    val game = TicTacToeGame()
    var currentPlayer = "X"

    while (true) {
        game.printBoard()

        println("Player $currentPlayer's turn")
        print("Enter row number: ")
        val row = readLine()?.toIntOrNull()
        print("Enter column number: ")
        val col = readLine()?.toIntOrNull()

        if (row == null || col == null) {
            println("Invalid input, please try again")
            continue
        }

        if (!game.makeMove(row, col, currentPlayer)) {
            println("Invalid move, please try again")
            continue
        }

        val winner = game.checkWinner()
        if (winner != null) {
            game.printBoard()
            println("Player $winner wins!")
            break
        }

        currentPlayer = if (currentPlayer == "X") "O" else "X"
    }
}
