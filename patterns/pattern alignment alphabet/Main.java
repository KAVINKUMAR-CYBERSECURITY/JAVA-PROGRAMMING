public class Main {
	public static void main(String[] args) {
		int n = 4;
		char ch = 'A';
		for (int i = 1; i <= n; i++) {
			for (int space = 1; space <= n - i; space++) {
				System.out.print("  ");
			}
			if (i == 1) {
				System.out.print(" " + ch);
				ch++;
			} else {
				System.out.print(" 1 " + ch);
				ch++;

				for (int num = 1; num <= i - 2; num++) {
					System.out.print(" 3 " + ch);
					ch++;
				}
				System.out.print(" 1");
			}
			System.out.println();
		}
	}
}