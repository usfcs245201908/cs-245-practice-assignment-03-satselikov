
public class BinaryIterativeSearch implements Practice03Search {

	@Override
	public String searchName() {
		// TODO Auto-generated method stub
		return("The BinaryIterativeSearch");
	}

	@Override
	public int search(int[] arr, int target) {
		// TODO Auto-generated method stub
		int l = 0;
		int h = arr.length-1; 
		
		while(l<=h)
		{
			int m = (l+h)/2;
			if(arr[m]==target)
			{
				return m;
			}
			if(target>arr[m])
			{
				l = m +1;
			}
			else
			{
				h = m-1;
			}
		}
		
		return -1;
	}

}
