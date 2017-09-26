import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner scnr = new Scanner(System.in);

        int numCats = 0;
        int numFish = 0;
        int numMeals = 0;

        System.out.println("How many cats are in your yard?");
            numCats = scnr.nextInt();

        System.out.println("How many fish do you have in your fridge?");
            numFish = scnr.nextInt();

        numMeals = numFish / numCats;

        System.out.println("Each cat can have " + numMeals + " fish.");

    }


}
