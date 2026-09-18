public class InputDetector {

    public static boolean isMorse(String text) {

        for (int i = 0; i < text.length(); i++) {

            char c = text.charAt(i);

            if (c != '.' && c != '-' && c != ' ' && c != '/') {
                return false;
            }
        }

        return true;
    }
}