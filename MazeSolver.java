/**
   Has-A Maze with the current position of the explorer.
   Uses Maze representation to evaluate whether or not the explorer can reach 
   the treasure.
   Records number of moves through integer stepCounter.
   */
public class MazeSolver {
    
    private Maze current;
    private static Displayer displayer;
    private int stepCounter;

    public MazeSolver(Maze input, int windowHeight) {
	current = new Maze(input);
	displayer = new Displayer(windowHeight);
    }
    
    private final static int[] DIRECTIONS = {
	Maze.EAST,
	Maze.NORTH,
	Maze.WEST,
	Maze.SOUTH
    };
    
    public boolean solver () {
	displayer.atTopOfWindow(current + "Step:" + stepCounter++);
	if (current.explorerIsOnA() == Maze.WALL)
	    return false;
	if (current.explorerIsOnA() == Maze.TREASURE)
	    return true;
	for(int direction:DIRECTIONS) {
	    Maze snapShot = new Maze(current);
	    current.dropA(Maze.WALL);
	    current.go(direction);
	    if (solver())
		return true;
	    else {
		current = new Maze(snapShot);
		displayer.atTopOfWindow(current + "Step:" + stepCounter++);
	    }
	}
	return false;
    }
}
