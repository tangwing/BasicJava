/**
 * 
 */
package polytech.java.math;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author shang
 *
 */
public class MesMathsTest {

	//private MesMaths mm = null;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		//mm = new MesMaths();
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link polytech.java.math.MesMaths#factorielle(int)}.
	 */
	@Test
	public void testFactorielle() {
		assertEquals(6, MesMaths.factorielle(3));
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link polytech.java.math.MesMaths#puissance(int, int)}.
	 */
	@Test
	public void testPuissance() {
		assertEquals(8, MesMaths.puissance(2,3));
//		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link polytech.java.math.MesMaths#puissanceDe10(int)}.
	 */
	@Test
	public void testPuissanceDe10() {
		assertEquals("This is a msg",100, MesMaths.puissanceDe10(3));
		//fail("Not yet implemented");
	}

}
