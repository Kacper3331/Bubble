import static org.junit.Assert.*;

import org.junit.Test;


public class BumbleeTest {

	
	Bumblee bumblee = new Bumblee();
	

	
	@Test
	public void twoNumbers(){
		int [] table = new int[2];
		table[0] = 2;
		table[1] = 1;
		
		int [] result = new int[2];
		result[0] = 1;
		result[1] = 2;
		
		assertArrayEquals(result, bumblee.sortNumbers(table));
		
	}
	
	@Test
	public void threeNumbers(){
		int [] table = new int[3];
		table[0] = 3;
		table[1] = 1;
		table[2] = 2;
		
		int [] result = new int[3];
		result[0] = 1;
		result[1] = 2;
		result[2] = 3;
		
		assertArrayEquals(result, bumblee.sortNumbers(table));
	}
	
	@Test
	public void threeNumbersWithTwosameNumbers(){
		int [] table = new int[3];
		table[0] = 3;
		table[1] = 1;
		table[2] = 1;
		
		int [] result = new int[3];
		result[0] = 1;
		result[1] = 1;
		result[2] = 3;
		
		assertArrayEquals(result, bumblee.sortNumbers(table));
	}
	
	@Test
	public void threeNumbersWithRandomValues(){
		
	}
	
	

}
