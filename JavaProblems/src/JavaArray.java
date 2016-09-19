import java.util.*;

public class JavaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int l;
		int[] myarray;
		int requestedno;
		int index = -1;
		
		System.out.println("Enter Length: ");
		l = Integer.parseInt(s.nextLine());
		myarray = new int[l];
		
		System.out.println("Enter Numbers: ");
		for(int i=0;i<l;i++)
			myarray[i] = Integer.parseInt(s.nextLine());
		
		System.out.println("Enter the number to search: ");
		requestedno = Integer.parseInt(s.nextLine());
		
		index = search(myarray, requestedno);
		
		if(index != -1)
			System.out.println("Number found at " + (index + 1) + " Position.");
		else
			System.out.println("Number not found");
	}
	
	public static int search(int[] array, int element){
		int index = -1;
		for(int i=0;i<array.length;i++){
			if(array[i] == element){
				index = i;
				break;
			}
		}
		return index;
	}

}
