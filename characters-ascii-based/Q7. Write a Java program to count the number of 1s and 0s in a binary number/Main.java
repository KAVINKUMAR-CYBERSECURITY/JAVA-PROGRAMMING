public class Main {
	public static void main(String[] args) {
		String binary = "1011010010";
		int count1 = 0, count0 = 0;
		for(int i = 0; i < binary.length(); i++) {
			char ch = binary.charAt(i);
			if(ch == '1') {
				count1++;
			} else if(ch == '0') {
				count0++;
			}
		}
		System.out.println("Number of 1s: " + count1);
		System.out.println("Number of 0s: " + count0);
	}
}
