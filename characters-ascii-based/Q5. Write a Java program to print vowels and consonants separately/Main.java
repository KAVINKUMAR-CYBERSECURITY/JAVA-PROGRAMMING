public class Main {
	public static void main(String[] args) {
		String alphabets = "abcdefghijklmnopqrstuvwxyz";
		System.out.print("Vowels: ");
		for(char ch : alphabets.toCharArray()) {
			if("aeiou".indexOf(ch) != -1) {
				System.out.print(ch + " ");
			}
		}
		System.out.println();
		System.out.print("Consonants: ");
		for(char ch : alphabets.toCharArray()) {
			if("aeiou".indexOf(ch) == -1) {
				System.out.print(ch + " ");
			}
		}

	}
}
