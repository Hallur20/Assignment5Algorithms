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
public class Trie {
    private HashMap<Character,Trie> trieList;
    private int value;

    public Trie() {
    }

    
    
    public Trie(HashMap<Character, Trie> trieList, int value) {
        this.trieList = trieList;
        this.value = value;
    }

    public HashMap<Character, Trie> getTrieList() {
        return trieList;
    }

    public void setTrieList(HashMap<Character, Trie> trieList) {
        this.trieList = trieList;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Trie{" + "trieList=" + trieList + ", value=" + value + '}';
    }
    
    
}
