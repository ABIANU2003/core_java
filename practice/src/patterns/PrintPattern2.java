package patterns;

public class PrintPattern2 {
	public static void numberpattern(int n)
	{
		//outer loop
		for(int i= 1; i<= n;i++) {
			//inner loop
			for(int j=1; j<=i;j++) {
				// j value equals to numbers
				System.out.print("*" + " ");
				
				
			}
		System.out.println();
		}
	}
	

	public static void main(String[] args) {
		
		int n=5;
		numberpattern(n);
		

	}

}

