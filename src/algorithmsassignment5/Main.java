/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmsassignment5;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hallur
 */
public class Main {

    /**
     * @param args the command line arguments
     */
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
        /* trie.put("hej");
       trie.put("hej");
       trie.put("hej");
       trie.put("hallur");
       trie.put("abcdefg");
       trie.put("'");*/
        while (true) {
            System.out.println("type a word too see how often it is mentioned in shakespeare...");

            String input = scanner.nextLine();
            if (!input.equals("exit")) {
                System.out.print(input + " is mentioned ");
                trie.getWordQuantity(input, trie);
                System.out.println(" times in the book");
            } else {
                break;
            }

        }

        //plan =
        // lav reglerne for a-z, deres indexes skal være 0-26
        // hver gang en liste laves, skal de have disse keys med tomme values til at starte med.
        // når et nyt ord sættes ind, så skal for længden af ordet sættes det antal lister ind som sub lists, og hver
        // liste skal have en value (value er antal gange et ord har henten en værdi (feks 1 gang, nu er det 2) fra et sidste bogstav
        //i et ord. Roden har null værdi (et ord med ingen bogstaver).
    }

}
