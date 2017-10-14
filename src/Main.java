import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Agatka on 14.10.2017.
 */
public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = new String();
        System.out.println("Hello");
        System.out.println("Welcome in my first project on GitHub");
        System.out.println("Do You like the weather today? Yes or no?");

        try {
            s = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(s + '?');

        if (s.equalsIgnoreCase("yes")) {
            System.out.println("Good to hear it :)");
        }
        else if (s.equalsIgnoreCase("no")) {
            System.out.println("Oh, what a pity");
        }
        else {
            System.out.println("I kindly asked You to say Yes or No.");
            System.out.println("Let's move to next step");
        }

        System.out.println("");
        System.out.println("Now I will give You minimum speed form a data group");
        double[] speed = {1.3, 2, 0.5, 3, 0.2, 5};
        int size = speed.length;
        double min = speed[1];
        for (int i = 1; i < size; i++) {
            if (speed[i] < min) {
                min = speed[i];
            }
        }
        System.out.println("Minimum speed is " + min);

        System.out.println("");
        System.out.println("Now I will give You the first the shortest name of a data group");
        String[] names = {"agata", "ola", "ewa", "three", "four", "five", "seven", "eight", "nine"};
        int size2 = names.length;
        String longestName = names[0];
        for (int i = 1; i < size2; i++) {
            if (names[i].length() < longestName.length()) {
                longestName = names[i];
            }
        }
        System.out.println(longestName);


        System.out.println("");
        char penaltyKick = 'O';
        switch (penaltyKick) { //switch works with char, int, short, byte
            case 'O':
                System.out.println("Lets see more");
                break;
            case 'U':
                System.out.println("It's all waht I havew for You");
                break;
            case 'T':
                System.out.println("Do You want more?");
                break;
            default:
                System.out.println("Bye bye");
                break;
        }

        System.out.println("");
        System.out.println("Now I will choose for You the random number");
        double randomNumber = Math.random();
        randomNumber = randomNumber*10;
        int randomInt = (int) randomNumber;
        //System.out.println(randomNumber);
        System.out.println(randomInt);

        System.out.println("");
        System.out.println("Thank you for Your time, bye bye");

    }
}
