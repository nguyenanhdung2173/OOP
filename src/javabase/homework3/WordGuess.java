package javabase.homework3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WordGuess {
    public static ArrayList<String> wordData = new ArrayList<String>();
    public static String serectWord;
    public static boolean[] serectWordMatches;

    public static void checkTrialWord(char ch) {
        for (int i = 0; i < serectWord.length(); i++) {
            if (serectWordMatches[i]) {
                continue;
            }
            serectWordMatches[i] = serectWord.charAt(i) == ch;
        }
    }

    public static String getTrialWordWithMatches() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < serectWord.length(); i++) {
            str.append(serectWordMatches[i] ? serectWord.charAt(i) : "_");
        }
        return str.toString();
    }

    public static void setSerectWord() {
        Random rand = new Random();
        serectWord = wordData.get(rand.nextInt(wordData.size() - 1));
    }

    public static void runGame() {
        Scanner sc = new Scanner(System.in);
        serectWordMatches = new boolean[serectWord.length()];
        int trials = 0;
        while (true) {
            System.out.println("Key in one character or your guess word:");
            String trialWord = sc.hasNext() ? sc.next() : "";
            trials++;
            if (trialWord.length() < 1) continue;
            if (trialWord.length() == 1) {
                checkTrialWord(trialWord.charAt(0));
                trialWord = getTrialWordWithMatches();
                System.out.printf("Trail %1$d: %2$s \n", trials, trialWord);
            }

            if (trialWord.equals(serectWord)) {
                System.out.printf("Trail %d: congratulation! \n", trials);
                break;
            }
        }
        System.out.printf("you got in %d trials \n", trials);
        sc.close();
    }

    public static void main(String[] args) {
        try {
            File file = new File("./src/lab3/words.txt");
            Scanner in = new Scanner(file);
            while (in.hasNext()) {
                wordData.add(in.nextLine());
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.getMessage();
        }

        setSerectWord();
        runGame();
    }
}
