/*
 * This class calculates the activation function.
 */

class calculateActivationFunction 
{
	//This method calculates the derivative of the input function.
	public double calculateActivation(double y)
	{
		double gprime;
		gprime = y * (1-y);

		return gprime;
	}
}
