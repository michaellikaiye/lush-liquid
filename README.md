# lush-liquid
## personnel
Ariel Melendez and Michael Ye
## statement of problem
Return the boolean value of the statement “there exists one path through a maze starting at a designated beginning and ending at treasure.”

Definition: A maze is a grid with barriers.

Looping disallowed: Reach any stepping stone at most once.
## recursive abstraction
When I am asked to 

  return the boolean value of the statement “there exists one path through a maze starting at a     designated beginning and ending at treasure,” starting with a explorer at location x,y in the maze
  
the recursive abstraction can

  return a potential solution with explorer at 1 step in a different direction
  
Definition: A "direction" is orthogonal by 1 in array
## base case
you are on treasure
## English or pseudocode description of algorithm
mazesolver (branch)

if (at the treasure)
  return true
  
if (legalmove up)
  make current position wall //prevents looping???
  move
  if (recursive abstraction)
      return true;
  earse move
  
... repeat for if legal move left, right, down

(all can moves taken)
return false
## class(es) with fields and methods
## version*n* wish list
List all possible paths
