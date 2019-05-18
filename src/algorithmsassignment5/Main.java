package algorithmsassignment5;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<String> textFileList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        Trie trie = new Trie();
        Scanner scanner = new Scanner(System.in);
        FileReaderLogic frl = new FileReaderLogic();
        Stopwatch timer1 = new Stopwatch();
        double sum1 = 0.0;
        frl.readFile(textFileList);
        double time1 = timer1.elapsedTime();
        StdOut.printf("%e (%.2f seconds) by reading file\n", sum1, time1);
        Stopwatch timer2 = new Stopwatch();
        double sum2 = 0.0;
        for (int i = 0; i < textFileList.size(); i++) {
            trie.put(textFileList.get(i));
        }
        double time2 = timer2.elapsedTime();
        StdOut.printf("%e (%.2f seconds) by setting data into the trie\n", sum2, time2);
        while (true) {
            System.out.println("type a word too see how often it is mentioned in shakespeare...");
            String input = scanner.nextLine();
            if (!input.equals("exit")) {
                if (input.contains(" ")) {
                    System.out.println("you can only type one word at a time! please type a new word");
                    continue;
                }
                if (input.matches(".*\\d.*")) {
                    System.out.println("you can not type numbers only type words");
                    continue;
                }
                  if (input.matches(".*[^a-zA-Z']+.*")) {
                    System.out.println("you can use special-characters only &apostrophe");
                    continue;
                }
                trie.getWordQuantity(input, trie);
            } else {
                break;
            }

        }
    }

}
