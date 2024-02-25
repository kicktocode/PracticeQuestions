package com.example.conceptTryOut.ComparatorComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample implements Comparator<Player> {
    public static void main(String[] args) {
        List<Player>list=new ArrayList<>();
        list.add(new Player("Billy",10,"Basketball"));
        list.add(new Player("milly",12,"football"));
        list.add(new Player("cilly",14,"cricket"));
        list.add(new Player("xilly",16,"Baseball"));

        System.out.println("list before sorting");
        for (Player player:list) {
            System.out.println(player);
        }
        System.out.println("----------------");
        System.out.println("list after sorting game Wise");


        Collections.sort(list,Comparator.comparing(Player::getGame));
        for(Player player:list)
        {
            System.out.println(player);
        }
        System.out.println("----------------");



    }


    @Override
    public int compare(Player o1, Player o2) {
        return 0;
    }
}
class Player{
     String name;
    int age;
    String game;

    public Player(String name, int age, String game) {
        this.name = name;
        this.age = age;
        this.game = game;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", game='" + game + '\'' +
                '}';
    }
}