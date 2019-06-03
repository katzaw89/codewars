package DecodeTheMorseCode;

import java.util.HashMap;
import java.util.Map;

public class MorseCode {
    protected String[] tab = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ".", ",", "?", "+", "-", "=", ";", ":", " "};
    protected String[] tabCode = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----", "..---", ".--", "....-", ".....", "-....", "--...", "---..", "----.", "-----", ".-.-.-", "--..--", "..--..", ".-.-.", "-....-", "-...-", "-.-.-.", "---...", " "};
    protected Map<String, String> mapMorseCode = new HashMap<>();


    public String translateMorseCode(String code) {
        String[] codeSplit = lowerCaseCode(code).split("");
        String translate = "";
        for (int i = 0; i < codeSplit.length; i++) {
            translate = translate+newMorseMap().get(codeSplit[i])+" ";

        }return translate;
    }

//    public String translateMorseCodeToEnglish (String code){
//        String codeSplit [] = lowerCaseCode(code).split(" ");
//        String translate = "";
//        for (int i = 0; i <codeSplit.length ; i++) {
//            translate = translate+newStringFromMorseCode().get(codeSplit[i]);
//
//        }
//        return translate;
//    }

    public String lowerCaseCode (String code){
        String lowCode = code.toLowerCase();
        return lowCode;
    }

    public Map newMorseMap() {
        for (int i = 0; i < tab.length; i++) {
            mapMorseCode.put(tab[i], tabCode[i]);
        }

        return mapMorseCode;
    }

//    public Map newStringFromMorseCode() {
//        for (int i = 0; i < tab.length; i++) {
//            mapMorseCode.put(tabCode[i], tab[i]);
//        }
//
//        return mapMorseCode;
//    }

}
