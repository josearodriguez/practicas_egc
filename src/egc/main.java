package egc;

import static org.junit.Assert.*;

import org.junit.Test;

public class main {

	
	@Test
	public void testResta(){
		
		assertEquals(2,rest(2,4));
	}
	
	@Test
	public void testRestaCero(){
		assertEquals(4, rest(0,4));
		assertEquals(4, rest(4,0));

	}
	
	
	int rest(int a, int b){
		
		return 5;
	}
	
}
