package assignmentThree;

public class Arr {
	public static void main(String[] args) {
		int arr[] = new int[10];
		int size=8;
		for(int i=0;i<size;i++)
		{
			arr[i]=i+1;
		}
		int pos=2;
		int data=9;
		for(int i=(size-1);i>=(pos-1);i--)
		{
			arr[i+1]=arr[i];
		}
		size++;
		arr[pos-1]=data;
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
}
