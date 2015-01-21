package main.com.jpm;

public class UserInput {
		
	public static void main(String[] args){
		
		if(args == null || args.length == 0){
			System.out.println("Input parameters are expected.Please enter"); // if parameters are not passed
		}
		else if(args.length < 2){
			System.out.println("Input parameters are not valid.Please enter two expected params - one integer and output format"); // if parameters length is less than 2 
		}
		
		try{
			Integer digit = Integer.parseInt(args[0]);
			   if(digit < 1 || digit > 3999){
				   System.out.println("Please enter Integer range 1-3999");
			   }else {
				//Check the arg for "words"   
			    if (args[1].equalsIgnoreCase("words")){
					ArabictoWords words = new ArabictoWords();
					System.out.println(words.convertToWords(digit));            
		        }else if (args[1].equalsIgnoreCase("roman")){ //Check the arg for "roman"  
		        	ArabictoRoman roman = new ArabictoRoman(); 
					System.out.println(roman.convertToRoman(digit));            
		        }else{
					System.out.println("Only two output format supported - Words or Roman");    //Check the arg for "words" or "roman"        
		        }
			   }
		 }catch(NumberFormatException nfe){
			 //You can throw the Exception - and customize the way you want
			 System.out.println("Please enter a valid integer");    
		}
			
	}
}




