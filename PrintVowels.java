
public class PrintVowels {
    public static void main(String[] args) {
		findVowels("umuzi");
	}

public static void findVowels(String str){
	String input = str.toLowerCase();
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o'
					|| input.charAt(i) == 'u') {
				System.out.print(" " + input.charAt(i));
			}
	}
}
}

