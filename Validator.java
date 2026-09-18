public class Validator {

    public static boolean isValidText(String text) {

        if (text.isEmpty()) {
            return false;
        }

        for (int i = 0; i < text.length(); i++) {

            char c = Character.toUpperCase(text.charAt(i));

            if (c != ' ' && (c < 'A' || c > 'Z')) {
                return false;
            }
        }

        return true;
    }


    public static boolean isValidMorse(String morse) {

        if (morse.isEmpty()) {
            return false;
        }

        String[] letters = morse.trim().split("\\s+");

        for (int i = 0; i < letters.length; i++) {

            if (letters[i].equals("/")) {
                continue;
            }

            boolean found = false;

            for (int j = 0; j < MorseTable.MORSE.length; j++) {

                if (letters[i].equals(MorseTable.MORSE[j])) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }

        return true;
    }
}