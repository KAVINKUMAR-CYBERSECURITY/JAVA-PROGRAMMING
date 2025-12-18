public class Main {
	public static void main(String[] args) {
		int n = 4;
		for (int i=0; i<n;i++) {
		    char ch='A';
			for (int j= 1; j<=n; j++) {
				System.out.print(ch++ + "  ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print(ch+" ");
			}


			for(int k=i- 1; k>=1; k--) {
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	}

}