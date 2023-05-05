import main.kotlin.TicTacToeGame
import org.junit.jupiter.api.Test
import kotlin.test.*

class TicTacToeGameTest {

    @Test
    fun testPrintBoard() {
        val game = TicTacToeGame()
        game.printBoard()
        // Expected output:
        // - - -
        // - - -
        // - - -
    }

    @Test
    fun testMakeMove() {
        val game = TicTacToeGame()
        assertTrue(game.makeMove(0, 0, "X"))
        assertFalse(game.makeMove(0, 0, "O"))
        assertFalse(game.makeMove(-1, 0, "X"))
        assertFalse(game.makeMove(0, 3, "O"))
    }

    @Test
    fun testCheckWinner() {
        var game = TicTacToeGame()

        // Test rows
        game.makeMove(0, 0, "X")
        game.makeMove(0, 1, "X")
        game.makeMove(0, 2, "X")
        assertEquals("X", game.checkWinner())

        // Test columns
        game = TicTacToeGame()
        game.makeMove(0, 0, "O")
        game.makeMove(1, 0, "O")
        game.makeMove(2, 0, "O")
        assertEquals("O", game.checkWinner())

        // Test diagonals
        game = TicTacToeGame()
        game.makeMove(0, 0, "X")
        game.makeMove(1, 1, "X")
        game.makeMove(2, 2, "X")
        assertEquals("X", game.checkWinner())

        game = TicTacToeGame()
        game.makeMove(0, 2, "O")
        game.makeMove(1, 1, "O")
        game.makeMove(2, 0, "O")
        assertEquals("O", game.checkWinner())

        // Test tie
        game = TicTacToeGame()
        game.makeMove(0, 0, "X")
        game.makeMove(0, 1, "O")
        game.makeMove(0, 2, "X")
        game.makeMove(1, 0, "O")
        game.makeMove(1, 1, "X")
        game.makeMove(1, 2, "O")
        game.makeMove(2, 0, "O")
        game.makeMove(2, 1, "X")
        game.makeMove(2, 2, "O")
        assertEquals(null, game.checkWinner())
    }
}