/**
  Test MazeSolver class.

  Requires command line arguments:
  o  the name of a file containing a maze.
  o  the rank and file where an explorer is starting

  For example,
      java UserOfMaze mazes/4cell_treasureWest.txt -1 -1  # no explorer
 */
public class UserOfMazeSolver {
    
    private static Displayer displayer;
    
    public static void main(String[] commandLine)
       throws java.io.FileNotFoundException {
        System.out.println();

        Maze maze = new Maze( commandLine[0]
                            , Integer.parseInt( commandLine[1])
                            , Integer.parseInt( commandLine[2])
                            );
        System.out.println( maze + System.lineSeparator());
	MazeSolver mazeSolver = new MazeSolver(maze);
	test1(mazeSolver);
    }
    /**
       Maze with explorer on treasure;
      Run using a shell command like...
          java UserOfMazeSolver mazes/intersection_treasureNorth.txt 1 0
     */
    private static void test1(MazeSolver mazeSolver) {

	System.out.println(mazeSolver.solver() +"expecting true");
}
	
}
