/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmsassignment5;

import java.util.HashMap;

/**
 *
 * @author hallur
 */
public class Logic {

    //public HashMap<Character, Trie> root = new HashMap<>(26);
    public Trie root = new Trie();

    public void insertWord(String word) {
        //letter cannot be < 0 and > 26
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (indexOf(letter) < 0 || indexOf(letter) > 26) {
                System.out.println("this word contains illegal characters. You can only do a-z and apostrof");
                return;
            }
        }
        HashMap<Character, Trie> subList = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            try {
                char letter = word.charAt(i);
                if (i == 0) {
                    Trie trie = new Trie();
                    trie.setTrieList(new HashMap<Character, Trie>());
                    root.getTrieList().put(letter, trie);
                    subList = root.getTrieList().get(letter).getTrieList();
                } else if (i != word.length()) {
                    subList.put(letter, new Trie());
                    subList = subList.get(letter).getTrieList();
                }
                if (i == word.length()) {
                    subList.put(letter, new Trie());
                    subList.get(letter).setValue(1);
                }
            } catch (Exception e) {
                System.out.println("error: " + e.getMessage());
            }
        }
        
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

}
