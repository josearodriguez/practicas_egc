package egc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class main {

	
	@Test
	public void testResta(){
		assertEquals(2,rest.restar(2,4));
	}
	
	@Test
	public void testRestaCero(){
		assertEquals(4, rest.restar(0,4));
		assertEquals(4, rest.restar(4,0));

	}
	
	
	
}
