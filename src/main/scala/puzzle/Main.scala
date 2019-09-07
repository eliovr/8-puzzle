package puzzle

object Main extends App {
  val startPuzzle = EightPuzzle.generate()

  println("Initial state:")
  startPuzzle.printBoard()
  println("Searching solution...")
  val (solved, states) = Search.breadthFirst(startPuzzle)
  println("Solved: " + solved)
  println("Last checked state:")
  states.head.printBoard()
  if (solved) {
    println("Path to solution")
    states.head.printTrace()
  }
}
