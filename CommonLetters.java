public class CommonLetters {
        public static void main(String[] args) {
           findCommonChars("House", "Computers");    
        }
public static void findCommonChars(String string1, String string2){
    String stringOne = string1.toLowerCase();
    String stringTwo = string2.toLowerCase();
    String commonLetter = "";

    for(int i = 0; i < stringTwo.length(); i++){
        String charString1 = Character.toString(stringTwo.charAt(i));
        for(int j = 0; j < stringOne.length(); j++){
            String charString2 = Character.toString(stringOne.charAt(j));
            if(charString1.equals(charString2)){
                 commonLetter += charString1;
            };
        }
    }
    System.out.print("Common letters:");
    String currenString = "";
    String prefix = "";
     for (int i = 0; i < commonLetter.length(); i++){
        if (currenString.indexOf(commonLetter.charAt(i)) == - 1){
           currenString +=  prefix + " " + commonLetter.charAt(i);
           prefix = ",";
     }
  }
 System.out.print(currenString);
}
}

    
    
    
