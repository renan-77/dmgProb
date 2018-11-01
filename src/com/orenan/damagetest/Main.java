package com.orenan.damagetest;
import java.util.Random;
public class Main {

    public static void main(String[] args) {

// AQUARIUS MONSTER ATTRIBUTES
        Monster aquarius = new Monster();
        aquarius.hp = 15;
        aquarius.atkDmg = 7;

// THOR HERO ATTRIBUTES
        Hero thor = new Hero();
        int probDmg[] = {4,8,4,8,4,4,4,8,4,4};
        int arrayIndex = new Random().nextInt(9);
        thor.hp = 15;
        thor.AtkDmg = probDmg[arrayIndex];


        while (aquarius.hp > 0) {

            if(thor.hp > 0) {
                aquarius.hp = aquarius.hp - thor.AtkDmg;

                System.out.println("YOU have Attacked AQUARIUS with: " + thor.AtkDmg + " points of damage and his life is now: " +
                        aquarius.hp);
            }
            if(aquarius.hp < 0){

                System.out.println("AQUARIUS life: " + aquarius.hp);

                System.out.println("YOU HAVE KILLED AQUARIUS");

                break;
            }

            thor.hp = thor.hp - aquarius.atkDmg;

            if (thor.hp <= 0) {

                System.out.println("AQUARIUS have Attacked you with: " + aquarius.atkDmg + " points of damage and your life is now: "
                        + thor.hp);

                System.out.println("AQUARIUS HAVE KILLED YOU");
                break;

            } else {
                System.out.println("AQUARIUS have Attacked you with: " + aquarius.atkDmg + " points of damage and your life is now: "
                        + thor.hp);
            }
        }


    }
}