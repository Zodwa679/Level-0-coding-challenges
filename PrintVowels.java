
public class PrintVowels {
    public static void main(String[] args) {
		findVowels("umuzi");
	}

public static void findVowels(String str){
	String input = str.toLowerCase();

	String prefix = "";
	String current = "";
	//String previous = "";
	//List<Character> chars = new ArrayList<Character>();	
		
	for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o'|| input.charAt(i) == 'u') {
				current = prefix + input.charAt(i);
				prefix = ",";
				System.out.print(current);
				
	}
	}
	//System.out.println(previous);
}
}


