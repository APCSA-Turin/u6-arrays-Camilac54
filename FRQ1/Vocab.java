public class Vocab {
    /* The controlled vocabulary for a Vocab object.
     */
    private String[] theVocab;
    
    public Vocab(String[] vocab) {
      theVocab = vocab;
    }
    
    /* Searches for a string in theVocab. Returns true if its String 
       parameter str is an exact match to an element in theVocab and
       returns false otherwise.
     */
    public boolean findWord(String str) {
        for (String word : theVocab) {
          if (word.equals(str)) {
            return true;
          }
        }
        return false;
      }
          
    /* Counts how many strings in wordArray are not found in theVocab,
      as described in part (a).
  
  
      PRECONDITION: wordArray contains no duplicates
     */
    public int countNotInVocab(String[] wordArray) {
        int num = 0;
        for (String word : wordArray){
            if (!findWord(word)) {
                num ++;
            }
        }
        return num;
    }    
    
    /* Returns an array containing strings from wordArray not found in
      theVocab, as described in part (b).
  
  
      PRECONDITION: wordArray contains no duplicates
     */
    public String[] notInVocab(String[] wordArray) {
        int size = countNotInVocab(wordArray);
        String [] notIn = new String[size];
        
        int idx = 0;
        for (String word : wordArray) {
            if (!findWord(word)) {
                 notIn[idx] = word;
                 idx ++;

            }
    }	
    return notIn;
    }
    
    
    public String[] getTheVocab() {
        return theVocab;
    }
}  