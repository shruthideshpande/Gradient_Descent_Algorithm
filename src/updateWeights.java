import java.util.ArrayList;

/*
 * This class updates the weights of the perceptron.
 */

class updateWeights 
{
	
	public  double updateWeight(ArrayList<Double>weight,double gprime,ArrayList<ArrayList<Double>> input, int i,double y,double eta, double c)
	{
		int classindex = weight.size();
		int k = 0;
		
		double desiredoutput = input.get(i).get(classindex);
		double val = eta*(desiredoutput-y);
		double val1 = val*gprime;
		double val2;
		
		if(y>=0.5)
		{
			y=1;
		}
		else
		{
			y=0;
		}
		
		if(desiredoutput != y)
		{
			for(k=0;k<classindex;k++)
			{
				val2 = val1*input.get(i).get(k);
				weight.set(k, weight.get(k)+val2);
			}
		}
		
		else
		{
			k++;
			c++;
		}
		
		return c;
	}
}
