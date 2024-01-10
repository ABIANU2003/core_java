package patterns;

public class PrintPattern3 {
	public static void numberpattern(int n)
	{
		//outer loop for num row ...but rows
		//count equals to num of column
		for(int i= n; i>0 ;i--) {
			//inner loop
			for(int j=1; j<=i;j++) {
				// j value equals to numbers
				System.out.print( j + " ");
				
				
			}
		System.out.println();
		}
	}
	

	public static void main(String[] args) {
		
		int n=6;
		numberpattern(n);
		

	}

}

