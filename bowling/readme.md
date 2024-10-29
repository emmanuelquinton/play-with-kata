> description: https://codingdojo.org/kata/Bowling/

## process

* create acceptance test
    * create GameAcceptanceTest
      * Call result method
      * 
    * this class will be refactored at the end 
* add code 
  * Game
  * Adding frames to Game
  * Frame class
    * first trie roll in constructor
      * create constructor with Integer argument
      * add getFirstRollValue that return int
      * refactor creating RollValue object using DDD rules
    * Add second roll value
      * add method and variable in Frame class
    * Update acceptance test adding case 9-
    * Add sum method in frame
  * Update result method in Game and Execute acceptance test
  * Apply Calisthenic rule 'Classes that encompass Collection'
  * Manage spare case
    * Define Frame is spare