package lab5;

import balloon4.Balloon;

import org.junit.Test;

import static org.junit.Assert.*;

//balloon: works fine
//balloon 1: blow method doesn't work
//balloon 2: blow can still be used after pop; pop isn't correct
//balloon 3: blow cannot be called twice even if the new radius is within the max bound
//balloon 4: isPopped method comes out as true when balloon is just deflated
public class BalloonTests 
{
	@Test
	public void testInitialRadius()
	{
		Balloon b = new Balloon(5);
		assertEquals(0, b.getRadius());
	}
	
	@Test
	public void testIfPopped()
	{
		Balloon b = new Balloon(5);
		assertEquals(false, b.isPopped());
	}
	
	@Test
	public void testBlow()
	{
		Balloon b = new Balloon(10);
		b.blow(5);
		assertEquals(5, b.getRadius());
	}
	
	@Test
	public void testPop()
	{
		Balloon b = new Balloon(5);
		b.pop();
		assertEquals(true, b.isPopped());
	}
	
	@Test
	public void testPopBlow()
	{
		Balloon b = new Balloon(10);
		b.pop();
		b.blow(5);
		assertEquals(0, b.getRadius());
	}
	
	@Test
	public void testBeyondMax()
	{
		Balloon b = new Balloon(10);
		b.blow(12);
		assertEquals(true, b.isPopped());
	}
	
	@Test 
	public void testDeflate()
	{
		Balloon b = new Balloon(10);
		b.deflate();
		assertEquals(0, b.getRadius());
	}
	
	@Test
	public void testPopBlowIsPopped()
	{
		Balloon b = new Balloon(5);
		b.pop();
		b.blow(5);
		assertEquals(true, b.isPopped());
	}
	
	@Test
	public void testNegative()
	{
		Balloon b = new Balloon(5);
		b.blow(-5);
		assertEquals(0, b.getRadius());
	}
	
	@Test
	public void testBlowTwice()
	{
		Balloon b = new Balloon(5);
		b.blow(2);
		b.blow(3);
		assertEquals(5, b.getRadius());
	}
	
	@Test
	public void testDeflateStart()
	{
		Balloon b = new Balloon(5);
		b.deflate();
		b.blow(5);
		assertEquals(5, b.getRadius());
	}
	
	@Test
	public void testDeflatePopped()
	{
		Balloon b = new Balloon(5);
		b.deflate();
		assertEquals(false, b.isPopped());
	}
	
}
