package main.kotlin


class TicTacToeGame {
    private val board = Array(3)

    {
        arrayOfNulls<String> (3)
    }

    init {
        for (i in 0..2){
            for (j in 0..2){
                board[i][j] = "-"
            }
        }
    }

    fun printBoard() {
        for (i in 0..2){
            for (j in 0..2){
                print("${board[i][j]} ")
            }
            println()
        }
    }

    fun makeMove(row:Int, col:Int, player:String):

            Boolean {
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false
        }
        if (board[row][col] != "-") {
            return false
        }
        board[row][col] = player
        return true
    }

    fun checkWinner():String?

    {
        for (i in 0..2){
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != "-") {
                return board[i][0]
            }
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != "-") {
                return board[0][i]
            }
        }
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != "-") {
            return board[0][0]
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != "-") {
            return board[0][2]
        }
        return null
    }
}
