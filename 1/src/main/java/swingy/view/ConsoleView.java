package swingy.view;

import java.sql.ResultSet;
import java.sql.SQLException;

import swingy.model.Archer;
import swingy.model.Hero;
import swingy.model.Hunter;
import swingy.model.SpellCaster;

public class ConsoleView {

    //Colors
    public static String ANSI_RED  = "\u001B[31m";
    public static String ANSI_WHITE  = "\u001B[37m";
    public static String ANSI_GREEN  = "\u001B[32m";
    public static String ANSI_BLUE   = "\u001B[34m";
    public static String ANSI_YELLOW = "\u001B[33m";
    public static String ANSI_RESET = "\u001B[0m";
    public static String CLR_CLI = "\033[H\033[2J";

    public static void printToughShit(){
        System.out.print(ConsoleView.CLR_CLI);
        System.out.println("Tough Shit. Fight coward!!!");
        System.out.println("Your mom has bigger balls than you!!!");
    }

    public static void printFightOrFlight(String enemy){
        System.out.println("Looks like you ran into "+ enemy);
        System.out.println("Fight or Flight");
        System.out.println("1) Fight");
        System.out.println("2) Run");
        System.out.print(">> ");
    }

    public static void printGameOver(String enemy){
        System.out.print(ConsoleView.CLR_CLI);
        System.out.println("" +
                "      ::::::::      :::       :::   :::   ::::::::::          ::::::::  :::     ::: :::::::::: ::::::::: \n" +
                "    :+:    :+:   :+: :+:    :+:+: :+:+:  :+:                :+:    :+: :+:     :+: :+:        :+:    :+: \n" +
                "   +:+         +:+   +:+  +:+ +:+:+ +:+ +:+                +:+    +:+ +:+     +:+ +:+        +:+    +:+  \n" +
                "  :#:        +#++:++#++: +#+  +:+  +#+ +#++:++#           +#+    +:+ +#+     +:+ +#++:++#   +#++:++#:    \n" +
                " +#+   +#+# +#+     +#+ +#+       +#+ +#+                +#+    +#+  +#+   +#+  +#+        +#+    +#+    \n" +
                "#+#    #+# #+#     #+# #+#       #+# #+#                #+#    #+#   #+#+#+#   #+#        #+#    #+#     \n" +
                "########  ###     ### ###       ### ##########          ########      ###     ########## ###    ###      ");
        System.out.println(enemy + " killed you!");
    }

    public static void printWelcome (){
        System.out.println("Welcome!");
        System.out.println("Choose an option:");
        System.out.println("1) Create a hero");
        System.out.println("2) Select a previously created hero");
        System.out.println("3) Exit");
    }

    public static void printHeroClasses() {
        SpellCaster spellcaster = new SpellCaster();
        Hunter hunter = new Hunter();
        Archer archer = new Archer();

        System.out.printf("%s\n", "                 CHOOSE YOUR CLASS");
        System.out.println("|------------------------------------------------|");

        System.out.printf("|%14s", "1");
        System.out.printf("%10s", "2");
        System.out.printf("%11s", "3");
        System.out.printf("%15s", "|\n");

        System.out.printf("|%16s", "SpellCaster");
        System.out.printf("%10s", "Hunter");
        System.out.printf("%14s", "Archer");
        System.out.printf("%10s", "|\n");

        System.out.println("|                                                |");

        System.out.print("| Attack:  ");
        System.out.printf("%3d", spellcaster.getAttack());
        System.out.printf("%9d", hunter.getAttack());
        System.out.printf("%10d", archer.getAttack());
        System.out.printf("%18s", "|\n");

        System.out.print("| Defense: ");
        System.out.printf("%3d", spellcaster.getDefense());
        System.out.printf("%9d", hunter.getDefense());
        System.out.printf("%10d", archer.getDefense());
        System.out.printf("%18s", "|\n");

        System.out.print("| HP:      ");
        System.out.printf("%4d", spellcaster.getHp());
        System.out.printf("%8d", hunter.getHp());
        System.out.printf("%11d", archer.getHp());
        System.out.printf("%17s", "|\n");

        System.out.println("|------------------------------------------------|");
    }

    public static void printHeroStats(Hero hero)
    {
        System.out.println("--------------------");
        System.out.println("Name: " + hero.getName());
        System.out.println("Type: " + hero.getType());
        System.out.println("Attack: " + hero.getAttack());
        System.out.println("Defense: " + hero.getDefense());
        System.out.println("HP: " + hero.getHp());
        System.out.println("Experience: " + hero.getXp());
        System.out.println("Level: " + hero.getLvl());
        System.out.println("--------------------");
        System.out.println();
    }

    public static void printSavedHeroes(ResultSet rset) throws SQLException {
        int rowCount = 1;
        System.out.println("Load Hero: ");
        while(rset.next()) {
            System.out.print(rowCount + "|" + rset.getString("name") + "\t\t\t\t");
            if (rowCount % 10 == 0) {
                System.out.println();
            }
            ++rowCount;
        }
    }

    public static void drawMap(int dimension, String map[][])
    {
        for (int col = 0; col < dimension; col++)
        {
            for (int row = 0; row < dimension; row++)
            {
                if (map[col][row].equals("X"))
                    System.out.printf(ANSI_WHITE + "0" + ANSI_RESET + " ");
                else if (map[col][row].equals("C"))
                    System.out.printf(ANSI_WHITE + "0" + ANSI_RESET + " ");
                else if (map[col][row].equals("1"))
                    System.out.printf(ANSI_GREEN + map[col][row] + ANSI_RESET + " ");
                else if (map[col][row].equals("."))
                    System.out.printf(ANSI_BLUE + map[col][row] + ANSI_RESET + " ");
                else
                    System.out.print(ANSI_WHITE + map[col][row] + ANSI_RESET + " ");
            }
            System.out.println();
        }
    }
}