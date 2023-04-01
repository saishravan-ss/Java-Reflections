public class InsertionSort implements Strategy {
	double[] Sort(double a[])
	{
		int p,i = 0,np = 0;
		for(p = 1; p<a.length;p++)
		{
			np = a[p];
			for (i = p-1; i >= 0; i--)
			{
				if(np >= a[i])
					break;
				else 
					a[i+1] = a[i];
			}
			a[i+1] = np;
		}
	}
}