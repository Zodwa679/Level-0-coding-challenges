public class CommonLetters {
        public static void main(String[] args) {
           findCommonChars("HoUse", "computers");    
        }
public static void findCommonChars(String string1, String string2){
    String stringOne = string1.toLowerCase();
    String stringTwo = string2.toLowerCase();
    StringBuilder commonLetter = new StringBuilder();

    for(int i = 0; i < stringTwo.length(); i++){
        String charString1 = Character.toString(stringTwo.charAt(i));
        for(int j = 0; j < stringOne.length(); j++){
            String charString2 = Character.toString(stringOne.charAt(j));
            if(charString1.equals(charString2)){
                 commonLetter.append(charString1).append(',');
            }
        }
    }
    System.out.print("common characters:" + " ");
    System.out.println(commonLetter);
}
}

    
    
    
