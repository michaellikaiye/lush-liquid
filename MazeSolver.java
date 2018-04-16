/**
   Has-A Maze with the current position of the explorer.
   Uses Maze representation to evaluate whether or not the explorer can reach 
   the treasure.
   Records number of moves through integer stepCounter.
   */
public class MazeSolver {
    Maze current;

    public MazeSolver(Maze input) {
	current = new Maze(input);
    }
    private final static int[] DIRECTIONS = {
	Maze.EAST,
	Maze.NORTH,
	Maze.WEST,
	Maze.SOUTH
    };
    
    public boolean solver () {
	if (current.explorerIsOnA() == Maze.WALL)
	    return false;
	if (current.explorerIsOnA() == Maze.TREASURE)
	    return true;
	for(int direction:DIRECTIONS) {
	    Maze snapShot = new Maze(current);
	    current.dropA(Maze.WALL);
	    current.go(direction);
	    
	    System.out.println(current);
	    if (solver())
		return true;
	    else
		current = new Maze(snapShot);
	    System.out.println(current);
	}

	return false;
    }
}
//enum
