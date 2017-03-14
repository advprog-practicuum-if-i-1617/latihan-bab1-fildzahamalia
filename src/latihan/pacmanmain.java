/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman1;

import java.util.Scanner;

public class pacmanmain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String arah;
        int nyawa = 15;
        pacmanclass pc = new pacmanclass();
        System.out.println("===GAME PACMAN===");
        for (int i = 0; i <= 14; i++) {
            pc.displayArea();
            System.out.println("Sisa langkah dari pacman : " + nyawa--);
            System.out.print("Masukkan arah pacman (w,a,s,d, q for quit) : ");
            arah = input.nextLine();
            switch (arah) {
                case "w":
                    pc.turnUp();
                    break;
                case "a":
                    pc.turnLeft();
                    break;
                case "s":
                    pc.turnDown();
                    break;
                case "d":
                    pc.turnRight();
                    break;
                case "q":
                    System.out.println("KELUAR");
                    System.exit(0);
                default:
                    System.out.println("Masukan salah. Nyawa pacman berkurang.");
            }
            if (nyawa == 0) {
                System.out.println("Nyawa pacman habis. You lost.");
            }
        }
    }
}
