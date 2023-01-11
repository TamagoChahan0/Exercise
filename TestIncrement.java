package Exercise;

public class TestIncrement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 25;// Declaration of variable and value of i
		int iInc;// Declaration of variable of iInc
		
		iInc = i++;// assign value to iInc by postfix increment
		System.out.println("for postfix increment: ");
		System.out.println("the value of i= " +i);// print out the value of i
		System.out.println("the value of iInc= " +iInc);// print out the value of iInc
		
		iInc = ++i;// assign new value to iInc by prefix increment
		System.out.println("for prefix increment: ");
		System.out.println("the value of i= " +i);// print out the value of i
		System.out.println("the value of iInc= " + iInc);// print out the value of iInc
	}
}
