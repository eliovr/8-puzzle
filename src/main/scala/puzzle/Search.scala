package puzzle


object Search {
  /**
  * Depth first search.
  * @param startPuzzle the initial puzzle state from which the search begins.
  * @return a tuple where the first elements states whether a solution was
  *   found (true) or not (false), and the second element is a list of all
  *   puzzle states that were tried. If a solution was found, the head of
  *   this list should be the final state.
  */
  def depthFirst(startPuzzle: Puzzle): (Boolean, List[Puzzle]) = ???

  /**
  * Breadth first search. param and return same as depthFirst.
  */
  def breadthFirst(p: Puzzle): (Boolean, List[Puzzle]) = ???

  /**
  * Heuristic solution to the search. param and return same as depthFirst.
  */
  def heuristic(p: Puzzle): (Boolean, List[Puzzle]) = ???

}
