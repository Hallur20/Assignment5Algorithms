package algorithmsassignment5;

import java.util.Arrays;
import jdk.nashorn.internal.ir.TryNode;

public class Trie {

    private char letter;
    private int index;
    private Trie[] trieList = null;
    private int value;
    private String fullWord;

    public Trie() {
    }

    public Trie(Trie[] trieList, int value) {
        this.trieList = trieList;
        this.value = value;
    }

    public String getFullWord() {
        return fullWord;
    }

    public void setFullWord(String fullWord) {
        this.fullWord = fullWord;
    }

    public Trie[] getTrieList() {
        return trieList;
    }

    public void setTrieList(Trie[] trieList) {
        this.trieList = trieList;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    static boolean canWeSaveWord = true;
    static char[] lettersUsed = null;
    static int currLettersUsedIndex = 0;

    public void put(String word) {
        if (lettersUsed == null && canWeSaveWord == true) {
            lettersUsed = new char[word.length()];
            canWeSaveWord = false;
        }
        if (word.isEmpty()) {
            value++;
            setFullWord(String.copyValueOf(lettersUsed));
            currLettersUsedIndex = 0;
            lettersUsed = null;
            canWeSaveWord = true;
            return;
        }

        char letter = word.charAt(0);
        lettersUsed[currLettersUsedIndex] = letter;
        currLettersUsedIndex++;
        setLetter(letter);
        int index = indexOf(letter);
        setIndex(index);
        if (trieList == null) {
            trieList = new Trie[27];
        }
        if (trieList[index] == null) {
            trieList[index] = new Trie();
        }
        trieList[index].put(word.substring(1));
    }

    public int indexOf(char letter) {
        if ('z' >= letter && letter >= 'a') {
            return (Integer) (letter - 'a');
        }
        switch (letter) {
            case '\'':
                return 26;
        }
        return -1;
    }

    public void getWordQuantity(String word, Trie trie) {

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            int index = indexOf(letter);
            if (trie.getTrieList()[index] == null) {
                System.out.println("the world"+" "+"'"+word+"'"+" " + "does not exist");
                return;
            }
            trie = trie.getTrieList()[index];
        }
        System.out.println(word + " " + "is mentioned" + " " + trie.getValue() + " " + "times");
    }

    @Override
    public String toString() {
        return "Trie{" + "letter=" + letter + ", index=" + index + ", trieList=" + Arrays.toString(trieList) + ", value=" + value + ", fullWord=" + fullWord + '}';
    }
}
