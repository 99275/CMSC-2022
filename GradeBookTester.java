package abc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	
	
	private GradeBook studentOne;
	private GradeBook studentTwo;
	
	
	@BeforeEach
	void setUp() throws Exception
	{
	
	//data type   name of variable =   new type of data variable
		studentOne = new GradeBook (2);
			studentOne.addScore(5);
			studentOne.addScore(7);
			
		studentTwo = new GradeBook (4);
			studentTwo.addScore(2);
			studentTwo.addScore(4);
			studentTwo.addScore(6);
			studentTwo.addScore(8);
	}

	@AfterEach
	void tearDown() throws Exception 
	{
		
		GradeBook studentOne = null;
		
		GradeBook studentTwo = null;
		
	}

	@Test
	void testAddScore() 
	{

		assertTrue(studentOne.toString().equals("5.0 7.0 "));
		assertTrue(studentTwo.toString().equals("2.0 4.0 6.0 8.0 "));
	}

	@Test
	void testSum() 
	{
		assertEquals(12, studentOne.sum(), .0001);
		assertEquals(20, studentTwo.sum(), .0001);
	}

	@Test
	void testMinimum() 
	{
		assertEquals(5, studentOne.minimum(), .001);
		assertEquals(2, studentTwo.minimum(), .001);
	}

	@Test
	void testFinalScore() 
	{
		assertEquals(7, studentOne.finalScore(), .001);
		assertEquals(18, studentTwo.finalScore(), .001);
	}

	/*
	@Test
	void testGetScoreSize()
{
		fail("Not yet implemented");
	}

	@Test
	void testToString() 
	{
		fail("Not yet implemented");
	}
*/
}
