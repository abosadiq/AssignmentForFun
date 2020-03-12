package Strings;

public class BasicStrings {

    public String flipConcat(String string1, String string2) {
       return string1.concat(string2);
    }

    public char getChar(String string, int index) {

     return string.charAt(index);
    }

    public String iCantSee(String string) {
        return String.format("%1$"+ string.length()+ " ", string);
    }

    public String loudAndClear(String string) {
        return string.toUpperCase();
    }

    public String reverseCase(String string) {
        String  mySring= "";
     for(int i =0; i< string.length(); i++){

         if(Character.isUpperCase(string.charAt(i))){
             Character.isLowerCase(string.charAt(i));
             mySring = mySring + string.charAt(i);
         }else {
             Character.isUpperCase(string.charAt(i));
             mySring = mySring + string.charAt(i);
         }
     }
     return mySring;

    }

    public String oneAtATime(String string1, String string2) {
      StringBuilder res = new StringBuilder();
      for (int i =0; i< string1.length() ||i< string2.length(); i++){
          if( i < string1.length()){
              res.append(string1.charAt(i));
          }
          if( i < string2.length()){
              res.append(string2.charAt(i));
          }
      }
        return res.toString();
    }

}
