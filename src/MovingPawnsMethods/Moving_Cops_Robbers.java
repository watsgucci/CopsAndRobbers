package MovingPawnsMethods;

import java.util.Random;
import java.util.Scanner;
//added comment to try to push
public class Moving_Cops_Robbers {
    public static void main(String[] args) {

        System.out.println("\n" +
                "░█████╗░░█████╗░██████╗░░██████╗        ░█████╗░███╗░░██╗██████╗░\n" +
                "██╔══██╗██╔══██╗██╔══██╗██╔════╝        ██╔══██╗████╗░██║██╔══██╗\n" +
                "██║░░╚═╝██║░░██║██████╔╝╚█████╗░        ███████║██╔██╗██║██║░░██║\n" +
                "██║░░██╗██║░░██║██╔═══╝░░╚═══██╗        ██╔══██║██║╚████║██║░░██║\n" +
                "╚█████╔╝╚█████╔╝██║░░░░░██████╔╝        ██║░░██║██║░╚███║██████╔╝\n" +
                "░╚════╝░░╚════╝░╚═╝░░░░░╚═════╝░        ╚═╝░░╚═╝╚═╝░░╚══╝╚═════╝░\n" +
                "\n" +
                "██████╗░░█████╗░██████╗░██████╗░███████╗██████╗░░██████╗\n" +
                "██╔══██╗██╔══██╗██╔══██╗██╔══██╗██╔════╝██╔══██╗██╔════╝\n" +
                "██████╔╝██║░░██║██████╦╝██████╦╝█████╗░░██████╔╝╚█████╗░\n" +
                "██╔══██╗██║░░██║██╔══██╗██╔══██╗██╔══╝░░██╔══██╗░╚═══██╗\n" +
                "██║░░██║╚█████╔╝██████╦╝██████╦╝███████╗██║░░██║██████╔╝\n" +
                "╚═╝░░╚═╝░╚════╝░╚═════╝░╚═════╝░╚══════╝╚═╝░░╚═╝╚═════╝░");
// welcome to Cops and Robbers!
        System.out.println("\n\n\t\t\tWᴇʟᴄᴏᴍᴇ ᴛᴏ Cᴏᴘs ᴀɴᴅ Rᴏʙʙᴇʀs!");

        //You are the Robber! Try to make it to the bank before the cops do!
        System.out.println("\uD83C\uDDFE\u200B\u200B\u200B\u200B\u200B\uD83C\uDDF4\u200B\u200B\u200B\u200B\u200B\uD83C\uDDFA\u200B\u200B\u200B\u200B\u200B \uD83C\uDDE6\u200B\u200B\u200B\u200B\u200B\uD83C\uDDF7\u200B\u200B\u200B\u200B\u200B\uD83C\uDDEA\u200B\u200B\u200B\u200B\u200B \uD83C\uDDF9\u200B\u200B\u200B\u200B\u200B\uD83C\uDDED\u200B\u200B\u200B\u200B\u200B\uD83C\uDDEA\u200B\u200B\u200B\u200B\u200B \uD83C\uDDF7\u200B\u200B\u200B\u200B\u200B\uD83C\uDDF4\u200B\u200B\u200B\u200B\u200B\uD83C\uDDE7\u200B\u200B\u200B\u200B\u200B\uD83C\uDDE7\u200B\u200B\u200B\u200B\u200B\uD83C\uDDEA\u200B\u200B\u200B\u200B\u200B\uD83C\uDDF7\u200B\u200B\u200B\u200B\u200B! \uD83C\uDDF9\u200B\u200B\u200B\u200B\u200B\uD83C\uDDF7\u200B\u200B\u200B\u200B\u200B\uD83C\uDDFE\u200B\u200B\u200B\u200B\u200B \uD83C\uDDF9\u200B\u200B\u200B\u200B\u200B\uD83C\uDDF4\u200B\u200B\u200B\u200B\u200B \uD83C\uDDF2\u200B\u200B\u200B\u200B\u200B\uD83C\uDDE6\u200B\u200B\u200B\u200B\u200B\uD83C\uDDF0\u200B\u200B\u200B\u200B\u200B\uD83C\uDDEA\u200B\u200B\u200B\u200B\u200B \uD83C\uDDEE\u200B\u200B\u200B\u200B\u200B\uD83C\uDDF9\u200B\u200B\u200B\u200B\u200B \uD83C\uDDF9\u200B\u200B\u200B\u200B\u200B\uD83C\uDDF4\u200B\u200B\u200B\u200B\u200B \uD83C\uDDF9\u200B\u200B\u200B\u200B\u200B\uD83C\uDDED\u200B\u200B\u200B\u200B\u200B\uD83C\uDDEA\u200B\u200B\u200B\u200B\u200B \uD83C\uDDE7\u200B\u200B\u200B\u200B\u200B\uD83C\uDDE6\u200B\u200B\u200B\u200B\u200B\uD83C\uDDF3\u200B\u200B\u200B\u200B\u200B\uD83C\uDDF0\u200B\u200B\u200B\u200B\u200B \uD83C\uDDE7\u200B\u200B\u200B\u200B\u200B\uD83C\uDDEA\u200B\u200B\u200B\u200B\u200B\uD83C\uDDEB\u200B\u200B\u200B\u200B\u200B\uD83C\uDDF4\u200B\u200B\u200B\u200B\u200B\uD83C\uDDF7\u200B\u200B\u200B\u200B\u200B\uD83C\uDDEA\u200B\u200B\u200B\u200B\u200B \uD83C\uDDF9\u200B\u200B\u200B\u200B\u200B\uD83C\uDDED\u200B\u200B\u200B\u200B\u200B\uD83C\uDDEA\u200B\u200B\u200B\u200B\u200B \uD83C\uDDE8\u200B\u200B\u200B\u200B\u200B\uD83C\uDDF4\u200B\u200B\u200B\u200B\u200B\uD83C\uDDF5\u200B\u200B\u200B\u200B\u200B\uD83C\uDDF8\u200B\u200B\u200B\u200B\u200B \uD83C\uDDE9\u200B\u200B\u200B\u200B\u200B\uD83C\uDDF4\u200B\u200B\u200B\u200B\u200B!");

        //Just follow the instructions below and I hope you have fun!
        System.out.println(" \uD835\uDC09\uD835\uDC2E\uD835\uDC2C\uD835\uDC2D \uD835\uDC1F\uD835\uDC28\uD835\uDC25\uD835\uDC25\uD835\uDC28\uD835\uDC30 \uD835\uDC2D\uD835\uDC21\uD835\uDC1E \uD835\uDC22\uD835\uDC27\uD835\uDC2C\uD835\uDC2D\uD835\uDC2B\uD835\uDC2E\uD835\uDC1C\uD835\uDC2D\uD835\uDC22\uD835\uDC28\uD835\uDC27\uD835\uDC2C \uD835\uDC1B\uD835\uDC1E\uD835\uDC25\uD835\uDC28\uD835\uDC30 \uD835\uDC1A\uD835\uDC27\uD835\uDC1D \uD835\uDC08 \uD835\uDC21\uD835\uDC28\uD835\uDC29\uD835\uDC1E \uD835\uDC32\uD835\uDC28\uD835\uDC2E \uD835\uDC21\uD835\uDC1A\uD835\uDC2F\uD835\uDC1E \uD835\uDC1F\uD835\uDC2E\uD835\uDC27");

        System.out.println();
        System.out.println();
        System.out.println();
        movingRobber();
    }


    public static void movingRobber() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int steps = 0;
        while (steps <= 40) {

            System.out.println("\uD835\uDE4B\uD835\uDE61\uD835\uDE5A\uD835\uDE56\uD835\uDE68\uD835\uDE5A \uD835\uDE65\uD835\uDE67\uD835\uDE5A\uD835\uDE68\uD835\uDE68 \uD835\uDE40\uD835\uDE49\uD835\uDE4F\uD835\uDE40\uD835\uDE4D \uD835\uDE69\uD835\uDE64 \uD835\uDE67\uD835\uDE64\uD835\uDE61\uD835\uDE61 \uD835\uDE6E\uD835\uDE64\uD835\uDE6A\uD835\uDE67 \uD835\uDE59\uD835\uDE5E\uD835\uDE58\uD835\uDE5A:");

            String answer = sc.nextLine();
            if (answer.equals("")) {
                int rand_Dice1 = rand.nextInt(4);
                System.out.println("You have rolled a: " + rand_Dice1);
                if (rand_Dice1 == 0) {
                    System.out.println("You have rolled a 0, you cannot move!");
                    continue;
                }
                steps += rand_Dice1;
                System.out.println(steps);


            }


        }
        System.out.println("\n" +
                "▒█░░▒█ ▒█▀▀▀█ ▒█░▒█ 　 ▒█░░▒█ ▀█▀ ▒█▄░▒█ █ \n" +
                "▒█▄▄▄█ ▒█░░▒█ ▒█░▒█ 　 ▒█▒█▒█ ▒█░ ▒█▒█▒█ ▀ \n" +
                "░░▒█░░ ▒█▄▄▄█ ░▀▄▄▀ 　 ▒█▄▀▄█ ▄█▄ ▒█░░▀█ ▄");
        sc.close();

    }


}



