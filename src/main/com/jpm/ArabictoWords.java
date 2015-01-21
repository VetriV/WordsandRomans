package main.com.jpm;

public class ArabictoWords {

	/*
	* Array used for converting tens into equivalent words.
	* say 60 = “Sixty”. Identified by corresponding position.
	*/
	final String[] tensArray = {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};

	/*
	* Array used for converting numbers below twenty into equivalent words.
	* say: 5 = “Five”. 
	*/
	final String[] belowTwentyArray = {"Zero","One","Two","Three","Four", "Five","Six","Seven","Eight","Nine","Ten",
	"Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};

	/*
	* Convert the numbers into words.
	* Supported values are between 0 – 3999.
	*/
	public String convertToWords(final Integer i) {

	if( i < 0)   
		return "Negative numbers not supported.";
	if( i < 20) 
		return belowTwentyArray[i];
	if( i < 100) 
		return tensArray[i/10] + ((i % 10 > 0)? " " + convertToWords(i % 10):" ");
	if( i < 1000)
		return belowTwentyArray[i/100] + " Hundred" + ((i % 100 > 0)?" and " + convertToWords(i % 100):" ");
	//This covers the case of > 3999 and above too..Since we restricted user input < 3999 ,handling < 3999 is not needed here
	if( i <= 3999) 
		return convertToWords(i / 1000) + " Thousand" + ((i % 1000 > 0)? " " + convertToWords(i % 1000):"") ;
	 
	return("Please check your input numeral");

    }
}
