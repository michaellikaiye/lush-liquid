# lush-liquid
## personnel
Ariel Melendez and Michael Ye
## statement of problem
Return the boolean value of the statement “there exists one path through a maze starting at a designated beginning and ending at treasure.”

Definition: A maze is a grid with barriers.

Looping disallowed: Reach any stepping stone at most once.
## recursive abstraction
When I am asked to 

  return the boolean value of the statement “there exists one path through a maze starting at a designated beginning and ending at treasure,”
  
the recursive abstraction can

  return the boolean value of the statement “there exists one path through a maze starting at a     designated beginning one step in a direction (North, East, South, West) from the previous beginning and ending at treasure.”
## base case
You are on treasure
## English or pseudocode description of algorithm
mazesolver (branch)

if (on wall)
    
    return false
    
if (at the treasure)

    return true
  
for each direction

  make snapshot

  drop wall on previous location

  move 1 step
  
  if recursive abstraction
  
      return true
  
  else undo step
  
return false
## class(es) with fields and methods
## version*n* wish list
List all possible paths

Base algorithm on junctions rather than steps
## known bugs
Failed to account for explorer starting outside the maze
## v1
Use displayer class
