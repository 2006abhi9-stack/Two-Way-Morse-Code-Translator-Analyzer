public class MorseDecoder {

    public static String decode(String morse) {

        String result = "";

        String[] letters = morse.trim().split("\\s+");

        for (int i = 0; i < letters.length; i++) {

            if (letters[i].equals("/")) {
                result += " ";
            }
            else {

                for (int j = 0; j < MorseTable.MORSE.length; j++) {

                    if (letters[i].equals(MorseTable.MORSE[j])) {

                        result += (char)('A' + j);

                        break;
                    }
                }
            }
        }

        return result;
    }
}