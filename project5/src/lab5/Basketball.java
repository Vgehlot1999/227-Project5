package lab5;

public class Basketball
{
	private double diameter;
	
	private boolean inflated;
	
	public Basketball(double givenDiameter)
	{
		inflated = false;
		diameter = givenDiameter;
	}

	public boolean isDribbleable()
	{
		return inflated;
	}

	public double getDiameter()
	{
		return diameter;
	}

	public double getCircumference()
	{
		return 0;
	}

	public void inflate()
	{
		inflated = true;
	}
}