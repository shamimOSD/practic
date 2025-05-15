package ch3;

/*Class Scanner also provides a similar method—next—that reads individual words.
When the user presses Enter after typing input, method next reads characters until it encoun-
ters a white-space character (such as a space, tab or newline), then returns a String containing*/

import java.util.Scanner;

public class Read {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter some text: ");
        String word = scanner.next();

        System.out.println("You entered the word: " + word);

    }
}
