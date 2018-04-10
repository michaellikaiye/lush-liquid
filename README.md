# lush-liquid
## personnel
Ariel Melendez and Michael Ye
## statement of problem
Return the boolean value of the statement “there exists one path through a maze starting at a designated beginning and ending at treasure.”

Definition: A maze is a grid with barriers.

Looping disallowed: Reach any stepping stone at most once.
## recursive abstraction
When I am asked to 

  return the boolean value of the statement “there exists one path through a maze starting at a     designated beginning and ending at treasure,”
  
the recursive abstraction can

  return the boolean value of the statement “there exists one path through a maze starting at a     designated beginning one step away and ending at treasure,”
## base case
you are on treasure
## English or pseudocode description of algorithm
mazesolver (branch)

if (on wall)
    
    return 
    
if (at the treasure)

  return true
  
if (legalmove up)

  make current position wall 
  
  move
  
  if (recursive abstraction)
  
    return true
    
  erase move
  
... repeat for if legal move left, right, down

return false
## class(es) with fields and methods
## version*n* wish list
List all possible paths
