public class Bubblesort implements Strategy{
	public int[] sortstrategy(int a[])
	{
		int right = a.length;
		for(int i = 0 ; i < right ; i++){
			for(int j = i ; j < right ; j++){
				if(a[i] > a[j]){
					int swap = a[i];
					a[i]=a[j];
					a[j] = swap;
				}
			}
		}

		return a;
	}
}
