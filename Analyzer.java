public class Analyzer {

    public static void analyzeText(String text) {

        int letters = 0;
        int words = 0;

        for (int i = 0; i < text.length(); i++) {

            char c = text.charAt(i);

            if (c != ' ') {
                letters++;
            }
        }

        if (!text.trim().isEmpty()) {
            words = text.trim().split("\\s+").length;
        }

        System.out.println("Letters: " + letters);
        System.out.println("Words: " + words);
    }


    public static void analyzeMorse(String morse) {

        int dots = 0;
        int dashes = 0;

        for (int i = 0; i < morse.length(); i++) {

            char c = morse.charAt(i);

            if (c == '.') {
                dots++;
            }
            else if (c == '-') {
                dashes++;
            }
        }

        System.out.println("Dots: " + dots);
        System.out.println("Dashes: " + dashes);
    }
}