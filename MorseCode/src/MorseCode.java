import java.util.Scanner;   

public class MorseCode {

     static String [][] MorseCode = 
     {{"A","·-"},
     {"B","-···"},
     {"C","-·-·"},
     {"D","-··"},
     {"E","· "},
     {"F","··-·"},
     {"G","--·"},
     {"H","····"},
     {"I","··"},
     {"J","·---"},
     {"K","-·-"},
     {"L","·-··"},
     {"M","--"},
     {"N","-·"},
     {"O","---"},
     {"P","·--·"},
     {"Q","--·-"},
     {"R","·-·"},
     {"S","···"},
     {"T","-"},
     {"U","··-"},
     {"V","···-"},
     {"W","·--"},
     {"X","-··-"},
     {"Y","-·--"},
     {"Z","--··"}};

    // Translates input character in range A-Z and returns corresponding Morse Code string.
    // input :: character c
    // output :: String 
    static String Translate(char c) {
        for (int i = 0; i< 26; i++) {
            if (c == MorseCode[i][0].charAt(0)) {
                return(MorseCode[i][1]);
            }
        }

        return("Character not in the list");
    }

    public static void main(String[] args) throws Exception {

        // Keep reading input till user enter "/"
        while (true) {
            System.out.print("Enter character to translate to Morse code. Enter \"/\" to exit: ");
            Scanner sc = new Scanner(System.in);   
            char c = sc.next().charAt(0);
            if (c == '/') {
                break;
            }
            String outstr = Translate(Character.toUpperCase(c));
            System.out.println(outstr);
        }
    }
}
