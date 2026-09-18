import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter word or Morse code: ");

        String text = input.nextLine().trim();

        if (text.isEmpty()) {

            System.out.println("Error: Input cannot be empty.");

        }
        else if (InputDetector.isMorse(text)) {

            if (Validator.isValidMorse(text)) {

                String result = MorseDecoder.decode(text);

                System.out.println("Decoded: " + result);

                Analyzer.analyzeMorse(text);

            }
            else {

                System.out.println("Error: Invalid Morse code.");
            }

        }
        else {

            if (Validator.isValidText(text)) {

                String result = MorseEncoder.encode(text);

                System.out.println("Encoded: " + result);

                Analyzer.analyzeText(text);

            }
            else {

                System.out.println(
                    "Error: Only letters A-Z and spaces are supported."
                );
            }
        }

        input.close();
    }
}