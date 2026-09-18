public class MorseEncoder {

    public static String encode(String text) {

        text = text.toUpperCase();

        String result = "";

        for (int i = 0; i < text.length(); i++) {

            char letter = text.charAt(i);

            if (letter == ' ') {
                result += "/ ";
            }
            else if (letter >= 'A' && letter <= 'Z') {

                int index = letter - 'A';

                result += MorseTable.MORSE[index] + " ";
            }
        }

        return result;
    }
}