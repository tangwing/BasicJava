package polytech.java.math;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import polytech.java.math.Notes.NoteIllegalException;

public class NotesTest {

	Notes n;
	
	@BeforeClass
	public static void before()
	{
		System.out.println("Debut de la classe de test!");
	}
	
	@AfterClass
	public static  void after()
	{
		System.out.println("Fin de la classe de test!");
	}
	
	@Before
	public void setUp() throws Exception {
		n =   new Notes();
		System.out.println("I pass here!");
	}

	@After
	public void tearDown() throws Exception {
	}

	
	
	
	@Test
	public void testAddNoteNegative() {
		try {
			n.addNote(-1);
		} catch (NoteIllegalException e) {
			//e.printStackTrace();
		}
	}

	@Test(expected = NoteIllegalException.class)
	public void testAddNoteTropGrand() throws NoteIllegalException{
			n.addNote(21);
	}
	
	
	
	
	@Test
	public void testGetMoynne() {
		//fail("Not yet implemented");
	}

}
