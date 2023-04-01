class Merge implements Strategy 
{
	int[] merge_sort(int arr1[],int arr2[])
	{
		int arr1left = 0;
		int arr1right = arr1.length;
		int arr2left = 0;
		int arr2right = arr2.length;
		int length = arr1.length + arr2.length;
		int np[] = new int[length] ;
		int k=0;
		while(arr1left < arr1right && arr2left < arr2right)
		{
			if(arr1[arr1left] < arr2[arr2left]){
				np[k++] = arr1[arr1left++];
			}
			else{
				np[k++] = arr2[arr2left++];
			}
		}

		if(arr1left==arr1right)
		{
			while(arr2left<arr2right)
			{
				np[k++]=arr2[arr2left++];
			}
		}
		else if(arr2left==arr2right)
		{
			while(arr1left<arr1right)
			{
				np[k++]=arr1[arr1left++];
			}
		}
		return np;
	}

	int[] FunSplit(int arr[],int start,int end)
	{
		int mid;
		int np[] = new int[end+1];
		if(start==end)
		{
			int arr1[]={arr[start]};
			return arr1;
		}
		if(start < end)
		{
			mid=(start+end)/2;
			int arr1[]=FunSplit(arr,start,mid);
			int arr2[]=FunSplit(arr,mid+1,end);
			np= merge_sort(arr1,arr2);
		}
		return np;
	}
	
	int[] Sort(int arr[])
	{
		return FunSplit(arr,0,arr.length-1);
	}

	void display(int arr[])
	{
		int i;
		for (i=0; i<arr.length; i++ ) 
		{
			System.out.println(arr[i]);	
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Merge merge_sort=new Merge();
		int arr[]={10,9,8,7,6,5,4,3,2,1};
		merge_sort.display(merge_sort.Sort(arr));
	}

}
