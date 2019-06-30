package com.thoughtworks.tdd;

public class FizzBuzz {
	
    public String fizzBuzz(int i){
    	if(isMultiple(i, 3) && isMultiple(i, 5) && isMultiple(i, 7)){
    		return "FizzBuzzWhizz";
    	}
    	if(isMultiple(i, 3) && isMultiple(i, 5)){
    		return "FizzBuzz";
    	}
    	if(isMultiple(i, 5) && isMultiple(i, 7)){
    		return "BuzzWhizz";
    	}
    	if(isMultiple(i, 3) && isMultiple(i, 7)){
    		return "FizzWhizz";
    	}
    	if(isMultiple(i, 3)){
    		return "Fizz";
    	}
    	if(isMultiple(i, 5)){
    		return "Buzz";
    	}
    	if(isMultiple(i, 7)){
    		return "Whizz";
    	}
    	return "";
    }
    
    public boolean isMultiple(int i, int base){
    	return i % base == 0;
    }
    
//    public String isMultipleThreeStr(Boolean isMultipleThree){
//    	return isMultipleThree ? "Fizz" : "";
//    }
//    
//    public String isMultipleFiveStr(Boolean isMultipleFive){
//    	return isMultipleFive ? "Buzz" : "";
//    }
//    
//    public String isMultipleSevenStr(Boolean isMultipleSeven){
//    	return isMultipleSeven ? "Whizz" : "";
//    }
}
