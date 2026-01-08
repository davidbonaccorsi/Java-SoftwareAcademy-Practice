package Chapter34.e3;

import java.util.Locale;

public class SentenceBuilder {
    public static void main(String[] args){

        String[] words = {"java", "is", "awesome"};
        System.out.println(buildSentence(words));


        String[] words2 = {"hello", "world"};
        System.out.println(buildSentence(words2));

        String[] words3 = {"JAVA"};
        System.out.println(buildSentence(words3));


    }

    public static String buildSentence(String[] words){
        if (words == null || words.length == 0) {
            return "Invalid input";
        }

        StringBuilder sentence = new StringBuilder();
        for (String word : words) {
            if (word != null || !word.isEmpty()) {
                word = (word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase());
                sentence.append(" " + word);
            }
        }
        return sentence.toString();
    }
}
