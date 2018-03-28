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
Definition: A "decision made" is every time the algorithm reaches a fork and must go one way or the other.
## base case
The treasure is on the straight segment following a decision made or the decision to follow the last branch of the last branch of all preceding forks yelds no treasure.
## English or pseudocode description of algorithm
mazesolver (branch)
if (the current branch ends in a dead end)
  return
if (the treasure is on the current branch)
  return true
if (last branch of the last branch of all preceding forks has been reached)
  return false
current decision = first branch of the fork following branch (now the current fork)
while current decision <= the number of branches at the current fork
  mazesolver(current decision)
  current decision = the next branch of the current fork
## class(es) with fields and methods
## version*n* wish list
List all possible paths