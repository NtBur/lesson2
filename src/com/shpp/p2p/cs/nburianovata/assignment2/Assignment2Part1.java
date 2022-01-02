package com.shpp.p2p.cs.nburianovata.assignment2;

import com.shpp.cs.a.console.TextProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Roots  of the square equations
 */

public class Assignment2Part1 extends TextProgram {
    private HashMap<String, ArrayList> nameRank;

    public void run() {

String a = "Sam 58 69 99 131 168 236 278 380 467 408 466 997";

        NameSurferEntry(a);
        toString();
        println(getName());
        ArrayList<Integer> rankDecade = new ArrayList<>();
        for(ArrayList rank: nameRank.values()){
            rankDecade = rank;
        }
        println(rankDecade);


        println(getRank(11));
       /* try {
            getEquation(readDouble("Please enter a: "),
                    readDouble("Please enter b: "),
                    readDouble("Please enter c: "));

        } catch (Exception e) {

            println("Enter a number separated by commas");
        }*/
    }
    public int getRank(int decade) {
        ArrayList<Integer> rankDecade = new ArrayList<>();
        int rankValue=0;
        for(ArrayList rank: nameRank.values()){
            rankDecade = rank;
        }
        for(int i =0; i<rankDecade.size(); i++){
            if(decade==(i+1)) rankValue = rankDecade.get(i);
        }

        return rankValue;
    }
    public void NameSurferEntry(String line) {
        nameRank = new HashMap<>();

        String[] name = line.split(" ");
        ArrayList<Integer> rank = new ArrayList<>();

        for(int i = 1; i<name.length; i++){
            rank.add(Integer.valueOf(name[i]));
        }
        nameRank.put(name[0], rank);

    }
    public String getName() {
        String rezName = "";
        for(String name: nameRank.keySet()){
            rezName = name;
        }
        return rezName;
    }
    @Override
    public String toString() {
        // You need to turn this stub into a real implementation //
        String rez ="";
        for(Map.Entry<String, ArrayList> p : nameRank.entrySet()){
            rez = p.getKey() + " - " + p.getValue();
        }
        return rez;
    }
    /**
     * Gives the roots (x)  of the square equations
     * a*(x^2) + b*x + c = 0
     *
     * @ param  double numbers separated by commas
     */
    private void getEquation(double a, double b, double c) {
        double d = b * b - 4 * a * c;

        if (d == 0) println("There is one root: " + ((-b) / (2 * a)));
        if (d < 0) println("There are no real roots");
        if (d > 0) println("There are two roots: " +
                ((-b - Math.sqrt(d)) / (2 * a)) + " and " +
                ((-b + Math.sqrt(d)) / (2 * a)));
    }
}

