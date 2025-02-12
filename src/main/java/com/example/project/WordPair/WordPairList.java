package com.example.project.WordPair;

import java.util.ArrayList;

public class WordPairList {
    private ArrayList<WordPair> allPairs;

    public WordPairList(String[] words) {
        allPairs = new ArrayList<WordPair>();
        int j = words.length - 1;
        for(int i = 0; i < words.length - 1; i ++){
            int k = i + 1;
            while(k <= j){
                allPairs.add(new WordPair(words[i], words[k]));
                k ++;
            }
        }
    }

    // The method below was added for testing;
    // it was not part of the original FRQ
    public ArrayList<WordPair> getAllPairs() {
        return allPairs;
    }

    public int numMatches(){
        int matches = 0;
        for(WordPair pair : allPairs){
           if(pair.getFirst().equals(pair.getSecond())){  
              matches ++;
           }
        }
        return matches;
     }     

    // The method below was added for testing;
    // it was not part of the original FRQ
    public String toString() {
        return allPairs.toString();
    }
}
