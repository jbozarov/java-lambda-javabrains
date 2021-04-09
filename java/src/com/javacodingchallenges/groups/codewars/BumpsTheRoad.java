package com.javacodingchallenges.groups.codewars;

import java.util.ArrayList;
import java.util.List;


public class BumpsTheRoad {
    public static void main(String[] args) {
        System.out.println(bumps("_nnnnnnn_n__n______nn__nn_nnn"));
        System.out.println(bumps("______n___n_"));
    }

    public static String bumps(final String road) {
        char[] characterList = road.toCharArray();
        List<Character> characters =new ArrayList<>(characterList.length);
        for (char c : characterList) {
            characters.add(c);
        }
        return characters.stream().filter(v -> v == 'n').count() >= 15 ? "Car Dead" : "Woohoo!";
    }
}
