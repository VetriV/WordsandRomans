package test.com.jpm;

import junit.framework.TestCase;
import main.com.jpm.ArabictoRoman;
import main.com.jpm.ArabictoWords;
import main.com.jpm.UserInput;

public class WordsandRomanTest extends TestCase {
	UserInput ui = new UserInput();
	ArabictoWords aw = new ArabictoWords();
	ArabictoRoman ar = new ArabictoRoman();	
	
	//Test to convert Numbers to Words
	public void testNumbersToWords() {
   //Less than 10		
	assertEquals("Six",aw.convertToWords(6));
	//Less than 20	
	assertEquals("Seventeen",aw.convertToWords(17));
	//Less than 500
	assertEquals("Two Hundred and Thirty Four", aw.convertToWords(234));
	//Less than 1000
	assertEquals("Five Hundred and Eighty Six", aw.convertToWords(586));
	//Less than 3000
	assertEquals("Two Thousand", aw.convertToWords(2000));
	//Less than 3000
	assertEquals("Three Thousand Seventy Five", aw.convertToWords(3075));
  }
	
	//Test to convert Numbers to Roman
	public void testNumbersToRomans() {
   //Less than 10		
    assertEquals("VI",ar.convertToRoman(6));
	//Less than 500
	assertEquals("CCXXXIV", ar.convertToRoman(234));
	//Less than 1000
	assertEquals("DLXXXVI", ar.convertToRoman(586));
	//Less than 3000
	assertEquals("MM", ar.convertToRoman(2000));
	//Less than 3000
	assertEquals("MMMLXXV", ar.convertToRoman(3075));
		
	}

}
