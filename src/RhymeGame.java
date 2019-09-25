import java.util.Scanner;

public class RhymeGame {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String animal;

        animal = getAnimal(in);

        if (rhymingAnimal(animal)){
            System.out.println("this animal rhymes with cat!");
        }
        else{
            System.out.println("This animal doesn't rhyme!");
        }

        in.close();



    }//end main

    private static boolean rhymingAnimal(String animal){

        return animal.matches("[a-zA-Z]{1,2}(at|AT)");

    }//end rhymingAnimal

    private static String getAnimal(Scanner in){

        System.out.print("Please enter the name of the animal: ");
        return in.next();

    }//end getAnimal

}//end class
