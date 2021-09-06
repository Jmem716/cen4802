
public class Fibonacci {

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
	
	public static int sum(int k) {
	    if (k > 0) {
	      return k + sum(k - 1);
	    } else {
	      return 0;
	    }
	 }

}
