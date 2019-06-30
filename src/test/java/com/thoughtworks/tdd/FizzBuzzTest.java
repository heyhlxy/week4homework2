package com.thoughtworks.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	
	FizzBuzz fb;
	
	@Before
	public void setip(){
		fb = new FizzBuzz();
	}
	
    @Test
    public void should_return_fizz_when_num_is_multiple_three(){
    	String isMultipleThreeStr = fb.fizzBuzz(3);
    	
    	assertEquals(isMultipleThreeStr, "Fizz");
    }
    
    @Test
    public void should_return_fizz_when_num_is_multiple_five(){
    	String isMultipleFiveStr = fb.fizzBuzz(5);
    	
    	assertEquals(isMultipleFiveStr, "Buzz");
    }
    
    @Test
    public void should_return_fizz_when_num_is_multiple_seven(){
    	String isMultipleSevenStr = fb.fizzBuzz(7);
    	
    	assertEquals(isMultipleSevenStr, "Whizz");
    }
    
    @Test
    public void should_return_fizz_when_num_is_multiple_three_and_five(){
    	String isMultipleThreeAndFiveStr = fb.fizzBuzz(15);
    	
    	assertEquals(isMultipleThreeAndFiveStr, "FizzBuzz");
    }
    
    @Test
    public void should_return_fizz_when_num_is_multiple_three_and_seven(){
    	String isMultipleThreeAndSevenStr = fb.fizzBuzz(21);
    	
    	assertEquals(isMultipleThreeAndSevenStr, "FizzWhizz");
    }
    
    @Test
    public void should_return_fizz_when_num_is_multiple_five_and_seven(){
    	String isMultipleFiveAndSevenStr = fb.fizzBuzz(35);
    	
    	assertEquals(isMultipleFiveAndSevenStr, "BuzzWhizz");
    }
    
    @Test
    public void should_return_fizz_when_num_is_multiple_three_and_five_and_seven(){
    	String isMultipleThreeAndFiveAndSevenStr = fb.fizzBuzz(105);
    	
    	assertEquals(isMultipleThreeAndFiveAndSevenStr, "FizzBuzzWhizz");
    }
}
