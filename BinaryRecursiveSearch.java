
public class BinaryRecursiveSearch implements Practice03Search {

	@Override
	public String searchName() {
		// TODO Auto-generated method stub
		return("The BinaryRecursiveSearch.");
	}

	@Override
	public int search(int[] arr, int target) {
		// TODO Auto-generated method stub
		return 0;
	}
	//l = low value
	//h = high value
	//m = middle
	public int search(int[]arr, int target, int l, int h)
	{
		if(l>h)
		{
			return 0;
		}
		if(l<=h)
		{
			int mid = (l+h)/2;
			
			if (arr[mid]==target)
			{
				return mid;
			}
			if(target>arr[mid])
			{
				return search(arr,target,mid+1,h);
			}
			else
			{
				return search(arr,target,l,h);
			}
		}
		return -1;
		
	}

}
