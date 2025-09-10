package Week03Marchel.Raikonnen.id.ac.umn;

import java.util.Arrays;
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        String userName;
        int menuNumber;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan Nama Anda : ");
        userName = scanner.nextLine();

        System.out.println("------------------------------------------------------------------");
        System.out.print("String Anda : " + userName);


        System.out.print("\n1. charAt\n");
        System.out.print("2. length\n ");
        System.out.print("3. substrings(n) \n");
        System.out.print("4. substrings(m,n) \n");
        System.out.print("5. contains \n");
        System.out.print("6. concat \n");
        System.out.print("7. replace \n");
        System.out.print("8. split \n");
        System.out.print("9. lowercase \n");
        System.out.print("10. uppercase \n");

        System.out.print("Pilih Menu : ");
        menuNumber = scanner.nextInt();
        scanner.nextLine();
        switch(menuNumber){
            case 1:
                int userInput;
                char userOutput;
                System.out.println("-----charAt-----\n");
                System.out.println("Nama : " + userName);
                System.out.print("Input : ");
                userInput = scanner.nextInt();
                userOutput = userName.charAt(userInput);
                System.out.println("\nHasil : " + userOutput);
                break;

            case 2:
                int userOutput1;
                System.out.println("-----length-----\n");
                System.out.print("Nama : \n" + userName);
                userOutput1 = userName.length();
                System.out.println("\nHasil : " + userOutput1);
                break;

            case 3:
                int userInput2;
                String userOutput2;
                System.out.println("-----substrings(n)-----\n");
                System.out.print("Nama : \n" + userName);
                System.out.print("\nInput : ");
                userInput2 = scanner.nextInt();
                userOutput2 = userName.substring(userInput2);
                System.out.println("\nHasil : " + userOutput2);
                break;

            case 4:
                int userInputX, userInputY;
                String userOutput3;
                System.out.println("-----substrings(m,n)-----\n");
                System.out.print("Nama : \n" + userName);

                System.out.print("\nInput mulai : ");
                userInputX = scanner.nextInt();

                System.out.print("\nInput akhir : ");
                userInputY = scanner.nextInt();

                userOutput3 = userName.substring(userInputX,userInputY);
                System.out.println("\nHasil : " + userOutput3);
                break;

            case 5:
                String userInput4;
                boolean userOutput4;
                System.out.println("-----contain-----\n");
                System.out.print("Nama : \n" + userName);

                System.out.print("\nInput : ");
                userInput4 = scanner.nextLine();
                scanner.nextLine();

                userOutput4 = userName.contains(userInput4);
                System.out.println("\nHasil : " + userOutput4);
                break;

            case 6:
                String userInput5;
                String userOutput5;
                System.out.println("-----concat-----\n");
                System.out.print("Nama : \n" + userName);

                System.out.print("\nInput : ");
                userInput5 = scanner.nextLine();

                userOutput5 = userName.concat(userInput5);
                System.out.println("\nHasil : " + userOutput5);
                break;

            case 7:
                String userInputX6, userInputY6;
                String userOutput6;
                System.out.println("-----replace-----\n");
                System.out.print("Nama : \n" + userName);

                System.out.print("\nInput kata yang diganti : ");
                userInputX6 = scanner.nextLine();

                System.out.print("\nInput kata pengganti : ");
                userInputY6 = scanner.nextLine();

                userOutput6 = userName.replace(userInputX6, userInputY6 );
                System.out.println("\nHasil : " + userOutput6);
                break;

            case 8:
                String userInput7;
                System.out.println("-----concat-----\n");
                System.out.print("Nama : \n" + userName);

                System.out.print("\nInput : ");
                userInput7 = scanner.nextLine();

                String[] userOutput7 = userName.split(userInput7);
                System.out.println(Arrays.toString(userOutput7));
                scanner.nextLine();
                break;

            case 9:
                String userOutput8;
                System.out.println("-----lowercase-----\n");
                System.out.print("Nama : \n" + userName);

                userOutput8 = userName.toLowerCase();
                System.out.println("\nHasil : " + userOutput8);
                break;

            case 10:
                String userOutput9;
                System.out.println("-----uppercase-----\n");
                System.out.print("Nama : \n" + userName);

                userOutput9 = userName.toUpperCase();
                System.out.println("\nHasil : " + userOutput9);
                break;
        }

    }
}
