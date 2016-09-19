import java.util.*;

public class JavaGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer myIntArr[] = {2,14,7,38,56};
		Double myDoubleArr[] = {23.45,56.98,34.54,3.45,1.34};
		String myStringArr[] = {"Jack","Carnie","Anthony","Michele","Brad"};
		
		myIntArr = descSort(myIntArr);
		myDoubleArr = descSort(myDoubleArr);
		myStringArr = descSort(myStringArr);
	}
	
	public static <E extends Comparable<E>> E[] descSort(E[] arr)
	{
		for (int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if ( arr[i].compareTo(arr[j]) < 0 ){
					E temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("");
		
		for (E value : arr)
			System.out.printf( "%s ", value );

		return arr;
	}

}
