# lush-liquid
## personnel
Ariel Melendez and Michael Ye
## statement of problem
Return the boolean value of the statement “there exists one path through a maze starting at a designated beginning and ending at treasure.”

Definition: A maze is a grid with barriers.

Looping disallowed: Reach any stepping stone at most once.
## recursive abstraction
When I am asked to 

  return the boolean value of the statement “there exists one path through a maze starting at a     designated beginning and ending at treasure,” starting with a potential solution with k           decisions made
  
the recursive abstraction can

  return a potential solution with k + 1 decisions made
  
Definition: A "decision made" is every 1 step, orthogonal
## base case
the last possible path has been taken || you are on treasure
## English or pseudocode description of algorithm
mazesolver (branch)

if (next step has no more stepping stone to go to)

  return
  
if (at the treasure)

  return true
check current position??? 


  
current decision = next step

while current decision <= number of possible steps

  mazesolver(current decision)
  
  current decision = the next branch of the current fork
  
  (last branch of the last branch of all preceding forks has been reached)
    return false
## class(es) with fields and methods
## version*n* wish list
List all possible paths
