> description: https://codingdojo.org/kata/Bowling/

## process

* create acceptance test
    * create GameAcceptenceTest
      * Call result method
      * 
    * this class will be refactorize at the end 
* add code 
  * Game
  * Adding frames to Game
  * Frame class
    * first trie roll in constructor
      * create constructor with Integer argument
      * add getFirstRollValue that return int
      * refactorize creating RollValue object using DDD rules
    * Add second roll value
      * add method and variable in Frame class
    * Update acceptance test adding case 9-
    * Add sum method in frame
  * Update result method in Game and Execute acceptance test
  * Apply Calisthenic rule 'Classes that encompass Collection'