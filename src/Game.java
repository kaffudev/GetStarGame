import java.time.Instant;
import java.util.Random;
import java.util.Scanner;

public class Game {

    private Scanner scanner;
    private Random random;
    private int round;
    private long timeStart;

    public Game(){

        scanner = new Scanner(System.in);
        random = new Random();
        round = 0;

    }

    public void startGame(){

        System.out.println("Witaj w zgadywance!");
        System.out.println("Twoim zadaniem jest odgadywanie słów");

        timeStart = System.currentTimeMillis();

        for (int i = 0; i < 5 ; i++) {

            nextRound();
        }

        System.out.println("Koniec gry!");
        System.out.println("Twoj czas to: " + (System.currentTimeMillis() - timeStart));


    }

    private void nextRound() {

        String randomWord = SentenceUtils.getWords()[
                random.nextInt(SentenceUtils.getWords().length - 1)];

        String hashWord = getHashWord(randomWord);

        System.out.println("Twój wyraz to: " + hashWord);
        System.out.println("Wpisz wyraz: ");
        String typedWord = scanner.nextLine();

        if (!typedWord.equalsIgnoreCase(randomWord)){
            System.out.println("Błąd!");
            timeStart -= 5000;

        }
    }

    private String getHashWord(String randomWord) {
        for (int i = 0; i < randomWord.length() / 2; i++) {
            char someChar = randomWord.charAt(random.nextInt(randomWord.length() - 1));
            if (someChar != '*') {
                randomWord = randomWord.replaceFirst(String.valueOf(someChar), "*");
            }
        }
        return randomWord;

    }


}
