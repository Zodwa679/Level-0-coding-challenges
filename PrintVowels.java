public class PrintVowels {
    public static void main(String[] args) {
		findVowels("umuzi");
	}
	
    public static String uniqueCharacters(String test){
		String word = test.toLowerCase();
		String currenString = "";
         for (int i = 0; i < word.length(); i++){
            if (currenString.indexOf(word.charAt(i)) == - 1){
               currenString += word.charAt(i);
         }
      }
    return currenString;
   }

public static void findVowels(String string){
	String input = uniqueCharacters(string);
	String prefix = "";
	String outPut = "";	
	System.out.print("Vowels: ");
	for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o'|| input.charAt(i) == 'u') {
				outPut = prefix + input.charAt(i);
				prefix = ", ";
				System.out.print(outPut);
			}	
		}
}
}			