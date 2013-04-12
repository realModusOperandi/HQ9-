/**
 * Created with IntelliJ IDEA.
 * User: lw322
 * Date: 2/4/13
 * Time: 2:58 PM
 * An interpreter for the HQ9+ Programming Language
 */
import java.util.Scanner;

public class Main {
    static int accumulator = 0;

    public static void main(String[] args) {
        try {
            Scanner kb = new Scanner(System.in);
            String commands = "";
            System.out.println("Welcome to the hq9+ interpreter version 0.0.0.00000002 alpha codename \"grumpycat\"!");

            while (true) {
                System.out.print("> ");
                commands = kb.nextLine().toLowerCase();

                for (int i = 0; i < commands.length(); i++) {
                    switch(commands.charAt(i)) {
                        case 'h':
                            System.out.println("Hello, world!.");
                            break;
                        case '9':
                            for (int j = 99; j > 0; j--) {
                                if (j == 1) System.out.println("1 bottle of beer on the wall, 1 bottle of beer.");
                                else System.out.println(j + " bottles of beer on the wall, " + j + " bottles of beer.");
                                if (j == 2) System.out.println("Take one down, pass it around, 1 more bottle of beer on the wall.");
                                else if (j == 1) System.out.println("Take one down, pass it around, no more bottles of beer on the wall.");
                                else System.out.println("Take one down, pass it around, " + (j-1) + " bottles of beer on the wall.");
                            }
                            break;
                        case 'q':
                            System.out.println(commands);
                            break;
                        case '+':
                            accumulator++;
                            break;
                    }
                }
            }
        }
        catch (Exception e) {

        }


    }
}
