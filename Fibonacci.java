
public class Fibonacci {

    /**
     * Gets the the first main entry and calls the sum function based on the int provided. 
     * It then prints out the returned final number from sum().
     */
	public static void main(String[] args) {
		String s1;
		int num = 10;
		
		switch (num) {
		case 1:
			s1 = "st";
			break;
		case 2:
			s1 = "nd";
			break;
		case 3:
			s1 = "rd";
			break;
		default:
			s1 = "th";
		}
		int result = sum(num);
	    System.out.printf("The "+num+"%s term of the Fibonacci sequence is "+result+".\n",s1);

	} 
	
    /**
     * Receives an int as an argument which it uses to then add up using recursive function calling use.
     * 
     * @return The nth term of the Fibonacci sequence when 0 is reached
     */
	public static int sum(int k) {
	    if (k > 0) {
	      return k + sum(k - 1);
	    } else {
	      return 0;
	    }
	 }

}
