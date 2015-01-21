package main.com.jpm;

import java.util.TreeMap;

public class ArabictoRoman {

     final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

     // Static Map
     static {
	        map.put(1000, "M");
	        map.put(900, "CM");
	        map.put(500, "D");
	        map.put(400, "CD");
	        map.put(100, "C");
	        map.put(90, "XC");
	        map.put(50, "L");
	        map.put(40, "XL");
	        map.put(10, "X");
	        map.put(9, "X");
	        map.put(5, "V");
	        map.put(4, "IV");
	        map.put(1, "I");

	    }

      //TreeMap comes with floorKey method and since > 3999 is restricted while entering user input - no need to worry about >3999.
	    public String convertToRoman(final Integer inputNum) {
	    	//floorKey is used to return the greatest key less than or equal to the given key,
	        int num =  map.floorKey(inputNum);
	        if ( inputNum == num ) {
	            return map.get(inputNum);
	        }
	        //using recursion
	        return map.get(num) + convertToRoman(inputNum-num);
	    }

}
