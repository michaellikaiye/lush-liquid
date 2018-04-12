public class MazeSolver {
    Maze maze;
    public boolean Solver () {
	int currank = maze.explorerposition.rank;
	int curfile = maze.explorerposition.file;
	return(maze.maze[currank][curfile] == 0);
    }
}
