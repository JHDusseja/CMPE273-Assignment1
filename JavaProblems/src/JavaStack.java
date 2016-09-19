import java.util.*;

public class JavaStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userInput;	
		Scanner s = new Scanner(System.in);

		System.out.println("Enter an expression to check for parenthesis:");
		userInput = s.nextLine();
		s.close();
		
		boolean flag = checkEx(userInput);
		
		if(flag)
			System.out.println("Valid Expression");
		else
			System.out.println("Invalid Expression");
		
		
	}
	
	public static boolean checkEx(String in){
		Stack<Character> mystack = new Stack<Character>();
		boolean flag = true;
		char c;
		
		for(int i=0;i<in.length();i++){
			if(in.charAt(i) == '(')
				mystack.push('(');
			else if(in.charAt(i) == ')'){
				if(mystack.isEmpty()){
					flag = false;
					break;
				}
				else
					c = mystack.pop();
			}
		}
		
		if(flag && mystack.isEmpty())
			return true;
		else
			return false;
	}
}
