package simpleCharacterArrayBasedPalindromeTester;


/**
 * PalindromeTester - see task
 * 
* @author   (Caroline Renschler und Laurin Kamischke)
* @version  (240521)
 *
 */
public class PalindromeTester {
    
    /**
     * Die Methode isPalindrome prueft ob ein Palindrom vorliegt.
     * 
     * @param word      das zu ueberpruefende Wort.
     *
     * @return boolean  das zu ueberpruefende Wort ist ein Palindrom.
     */
	
	public boolean isPalindrome(char[] word) {
		
		boolean palindromeCheck = true;
		final int wordLength = word.length - 1;
		int negativeCheckAt = wordLength;
		int checkAt = 0;
		
		while (checkAt <= wordLength / 2 && palindromeCheck == true) {
			if (word[checkAt] != word[negativeCheckAt] 
					&& (word[checkAt] - 32) != word[negativeCheckAt]  
					&& (word[checkAt] + 32) != word[negativeCheckAt]) {
				palindromeCheck = false;
			}
			else {
				checkAt++;
				negativeCheckAt--;
			}	
		}
 
		return palindromeCheck;
		
	}
	
}//class
