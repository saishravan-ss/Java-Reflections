public class Sorter{
	Strategy strategy;

	Sorter()
	{
		strategy = null;
	}

	int[] Sort(int arr[] , Strategy strategy)
	{
		return strategy.sortstrategy(arr);

	}

	int[] Sort(int arr[])
	{
		return strategy.sortstrategy(arr);
	}

	void setStrategy(Strategy strategy)
	{
		this.strategy = strategy;

	}

	public static void main(String[] args)
	{
		Sorter sorter = new Sorter();
		int temp[] = {10,9,8,7,6,5,4,3,2,1};

		int outBubble[] = sorter.Sort(temp,new Bubblesort());

		System.out.print("Bubblesort : [");

		for(int i =0 ; i < outBubble.length ; i++ )
		{
			System.out.print(outBubble[i]+ " ");
		}
		System.out.print("] \n");
		System.out.print("\n");

		int outmerge[] = sorter.Sort(temp,new Merge());
		
		System.out.print("Mergesort : [");

		 for(int i =0 ; i < outmerge.length ; i++ )
		{
	 	System.out.print(outmerge[i]+ " ");
		 }
		 System.out.println("]");
		 System.out.print("\n");
		
		
		int outinsertion[] = sorter.Sort(temp,new InsertionSort());
		
		System.out.print("Insertion Sort : [");
		for(int i = 0; i<outinsertion.length ; i++)
		{
		System.out.print(outinsertion[i]+ " ");
		}
		System.out.println("]");
		System.out.println("\n");
		
	}
}
