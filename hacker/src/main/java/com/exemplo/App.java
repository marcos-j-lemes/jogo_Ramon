package com.exemplo;

import java.util.Scanner;
import java.io.IOException;

/**
 * Tstes iniciais do jogo
 *
 */
public class App 
{
    public static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Linux")) {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (IOException | InterruptedException e) {

            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }

    public static void main( String[] args ) throws InterruptedException
    {
        Scanner input = new Scanner(System.in);

        clearScreen();
        System.out.println("Enter your name: ");
        String name = input.nextLine();


        System.out.println( "Hello World, "+ name );

        for(int i = 0; i <= 100; i++){
            clearScreen();
            System.out.println(i+"%");
            if(i == 35 || i == 86){
                Thread.sleep(100);
            }else{
                Thread.sleep(50);
            }
        }

    }
}
