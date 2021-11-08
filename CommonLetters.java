public class CommonLetters {
        public static void main(String[] args) {
           findCommonChars("House", "computers");    
        }
public static void findCommonChars(String string1, String string2){
    String stringOne = string1.toLowerCase();
    String stringTwo = string2.toLowerCase();
    StringBuilder commonLetter = new StringBuilder();
    String prefix = "";


    for(int i = 0; i < stringTwo.length(); i++){
        String charString1 = Character.toString(stringTwo.charAt(i));
        for(int j = 0; j < stringOne.length(); j++){
            String charString2 = Character.toString(stringOne.charAt(j));
            if(charString1.equals(charString2)){
                 commonLetter.append(prefix).append(" ").append(charString1);
                 prefix = ",";
            };
        }
    }
    System.out.print("Common letters:");
    
    System.out.print(commonLetter);
}
}

    
    
    
