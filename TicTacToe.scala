import com.atomicscala.AtomicTest._
class Cell {
  var entry = ' '
  def set(e:Char):String = {
    if(entry==' ' && (e=='X' || e=='O')) {
      entry = e
      "successful move"
    } else
      "invalid move"
  }
}

class Grid {
  val cells = Vector(
    Vector(new Cell, new Cell, new Cell),
    Vector(new Cell, new Cell, new Cell),
    Vector(new Cell, new Cell, new Cell)
  )
  def play(e:Char, x:Int, y:Int):String = {
    val status = {
      if(x < 0 || x > 2 || y < 0 || y > 2)
        "invalid move"
      else
        cells(x)(y).set(e)
    }
    showBoard()
    status
  }
  def showBoard():Unit = {
    for(row <- cells) {
      for(cell <- row) {
        print(cell.entry + " ")
      }
      println
    }
  }
  def checkFor3(row:Vector[Cell]):Boolean = {
    var countX = 0
    var countO = 0
    for(c <- row) {
      if(c.entry == 'X') {
        countX = countX + 1
      }
      else if(c.entry == 'O') {
        countO = countO + 1
      }
    }
    if(countX == 3) true
        else if(countO == 3) true
    else false
  }
  def checkWinner():Boolean = {
    for(row <- cells) {
      if(checkFor3(row)) return true
    }
    // transpose (to check columns)
    for(row <- cells.transpose) {
      if(checkFor3(row)) return true
    }
    // check diagonal
    val diag1 = Vector(cells(0)(0), cells(1)(1), cells(2)(2))
    if(checkFor3(diag1)) return true
    val diag2 = Vector(cells(0)(2), cells(1)(1), cells(2)(0))
    if(checkFor3(diag2)) return true
    false 
  }
}

val grid = new Grid
// grid.play('X', 0, 0) is "successful move"
// grid.play('O', 0, 1) is "successful move"
// grid.play('X', 0, 2) is "successful move"
// grid.play('O', 2, 1) is "successful move"
// grid.play('X', 2, 0) is "successful move"
// grid.play('O', 1, 1) is "successful move"
// grid.checkWinner is true

//draw
grid.play('X', 0, 0) is "successful move"
grid.play('O', 2, 2) is "successful move"
grid.play('X', 2, 0) is "successful move"
grid.play('O', 1, 0) is "successful move"
grid.play('X', 1, 1) is "successful move"
grid.play('O', 0, 2) is "successful move"
grid.play('X', 1, 2) is "successful move"
grid.play('O', 2, 1) is "successful move"
grid.play('X', 0, 1) is "successful move"
grid.checkWinner is false