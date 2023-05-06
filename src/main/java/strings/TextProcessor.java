package strings;

public class TextProcessor {
    public static void main(String[] args) {
        //countWords("I love JavaScript");
        //reverseString("Hello World");
        addSpace("HeyWorld!It'sMe");
    }

    public static void countWords(String value) {
        var words = value.split( " ");

        String message = String.format("Your text contains %d words", words.length);
        System.out.println(message);

        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void reverseString(String value) {
        for (int i = value.length() - 1; i >= 0; i--) {
            System.out.print(value.charAt(i));
        }
    }

    public static void addSpace(String value) {
        var modifiedValue = new StringBuilder(value);

        for (int i = 0; i < modifiedValue.length(); i++) {
            if (i != 0 && Character.isUpperCase(modifiedValue.charAt(i))) {
                modifiedValue.insert(i, " ");
                i++;
            }
        }

        System.out.println(modifiedValue);
    }
}
