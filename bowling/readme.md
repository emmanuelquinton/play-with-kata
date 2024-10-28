> description: https://codingdojo.org/kata/Bowling/

## process

* create acceptance test
    * create game result calculator class with method calculate to be agnostic of the code
    * this class will be refactorize at the end 
* add code 
  * Game
  * Adding frame to Game
  * Frame class
    * first trie roll in constructor
      * create constructor with Integer argument
      * add getFirstRollValue that return int
      * refactorize creating RollValue object using DDD rull
    * add second roll
    * sum of frame