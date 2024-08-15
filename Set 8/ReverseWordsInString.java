public class ReverseWordsInString {

    public static String reverseWordsInSentence(String sentence) {

        // If the sentence is null, return "INVALID"
        if(sentence == null) {
            return "INVALID";
        }

        // If the sentence is empty, return an empty string
        if(sentence == "") {
            return "";
        }


        // Use " " as the delimiter to match space.
        String[] words = sentence.split(" ");

        StringBuilder strBuild = new StringBuilder();

        // Append the reversed word, followed by a space, to the reversed sentence.
        for(String word : words) {
            StringBuilder w = new StringBuilder(word).reverse();
            strBuild.append(w).append(" ");
        }

        return strBuild.toString().trim();
    }

    public static void main(String[] args) {
        String sentence = "These are my people";

        System.out.println(reverseWordsInSentence(sentence));
    }
}
