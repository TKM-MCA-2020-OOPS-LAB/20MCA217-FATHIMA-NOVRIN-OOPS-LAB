
package myproject;
class bubles{
	
	void sort(int array[])
	{
		 int n = array.length;
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++)
	                if (array[j] > array[j+1])
	                {
	                  
	                    int temp = array[j];
	                    array[j] = array[j+1];
	                    array[j+1] = temp;
	                }
	}
	void printarray(int array[])
	{
		int n = array.length;
        for (int i=0; i<n; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
	}
}

public class Bublesort {
	public static void main(String args[])
	{
		bubles b=new bubles();
		int array[]= {54,67,23,56,96,12};
		b.sort(array);
		System.out.println("sorted array:");
		b.printarray(array);
		
		}

}
