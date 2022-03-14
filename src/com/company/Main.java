package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// ir4 part c
public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<dominoes>boneyard = new ArrayList<>();
        // q11
        Scanner input = new Scanner(System.in);
        System.out.println("player 1 name");
        String name = input.next();
        Player player1 =new Player(name,boneyard);
        System.out.println("player 2 name");
        name = input.next();
        Player player2 =new Player(name,boneyard);

        //q12
        boneyard = CreateDominoes();
        PrintDominoes(boneyard);
        player1.setTiles(CreateHand(boneyard));
        boneyard = removeTiles(boneyard,player1.getTiles());
        player2.setTiles(CreateHand(boneyard));
        boneyard = removeTiles(boneyard,player2.getTiles());
        PrintDominoes(boneyard);
        System.out.println(player1.getName());
        PrintDominoes(player1.getTiles());
        System.out.println(player2.getName());
        PrintDominoes(player2.getTiles());

    }
// q12
    public static ArrayList<dominoes> CreateDominoes() {
        ArrayList<dominoes> dominoSet = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < i+1; j++) {
                dominoes tile = new dominoes(i,j);
                dominoSet.add(tile);

            }

        }
        return dominoSet;
    }
    public static void PrintDominoes(ArrayList<dominoes> tileSet){
        for (int i = 0; i < tileSet.size(); i++) {
            System.out.println(tileSet.get(i).getSide1()+":"+tileSet.get(i).getSide2());
        }
    }
    //q13
    public static ArrayList<dominoes> CreateHand(ArrayList<dominoes>dominoSet){
        Random random = new Random();
        ArrayList<dominoes>playerSet = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            int randomNum = random.nextInt(dominoSet.size());
            playerSet.add(dominoSet.get(randomNum));
            dominoSet.remove(randomNum);
        }
        return(playerSet);

    }
    public static ArrayList<dominoes> removeTiles(ArrayList<dominoes>boneYard,ArrayList<dominoes>playerHand){
        for (int i = 0; i < boneYard.size(); i++) {
            for (int j = 0; j < playerHand.size(); j++) {

                if (boneYard.get(i) == playerHand.get(j)) {
                    boneYard.remove(i);
                }
            }
        }
        return boneYard;
    }
}
