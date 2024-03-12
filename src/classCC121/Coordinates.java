package classCC121;
import java.util.Scanner;
public class Coordinates {
    public static void main(String[] args){
        int gridsize = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter X-coordinates: ");
        int x = scanner.nextInt();
        System.out.println("Enter Y-coordinates: ");
        int y = scanner.nextInt();


        for(int i = 0; i< gridsize; i++){
            for(int j = 0; i< gridsize; j++){
                System.out.println("#");

            }
        }


    }
}
