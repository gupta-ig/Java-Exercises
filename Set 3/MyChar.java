import java.util.Scanner;

public class MyChar {

    // Method to determine if a character is a vowel
    public boolean isVowel(char ch) {
    
        // Use a switch statement to check for each vowel, both lowercase and uppercase
        switch (ch) {
        
            // Complete the switch statement
            case 'a':
            case 'e':
            case 'i':
            case 'u':
            case 'o':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        MyChar obj = new MyChar();
        if(obj.isVowel(ch)) { 
            System.out.println("Character is vowel");
        }
        else { 
            System.out.println("Character is consonant");
        }
    }
}