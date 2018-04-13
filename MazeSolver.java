public class MazeSolver {
    Maze current;

    public MazeSolver(Maze input) {
	current = new Maze(input);
    }
    
    public boolean solver () {
	if (current.explorerIsOnA() == current.WALL)
	    return false;
	if (current.explorerIsOnA() == current.TREASURE)
	    return true;
	Maze snapShot = new Maze(current);
	current.go(current.NORTH);
	if (solver())
	    return true;
       	else current = new Maze(snapShot);
	current.go(current.SOUTH);
	if (solver())
	    return true;
       	else current = new Maze(snapShot);
	current.go(current.EAST);
	if (solver())
	    return true;
       	else current = new Maze(snapShot);
	current.go(current.WEST);
	if (solver())
	    return true;
	else current = new Maze(snapShot);
	return false;
    }
}
