/**
   Has-A Maze with the current position of the explorer.
   Uses Maze representation to evaluate whether or not the explorer can reach 
   the treasure.
   Records number of moves through integer stepCounter.
   */
public class MazeSolver {
    Maze maze;
    public boolean Solver () {
	int currank = maze.explorerposition.rank;
	int curfile = maze.explorerposition.file;
	return(maze.maze[currank][curfile] == 0);
    }
}
