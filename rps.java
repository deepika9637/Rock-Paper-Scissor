import java.util.Random;
import java.util.Scanner;

public class rps {
    //stone =1 paper =2 sesior=3
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your choice three times for stone =1 paper =2 sesior=3");
        int a = 0;
        int b = 0;
        for (int i = 0; i < 3; i++) {

        int user = sc.nextInt();
        Random rand = new Random();
        int comp = rand.nextInt(3);
        int con = (comp + 1);
        System.out.println("computer choice is:" + con);
        if (con == user) {
                System.out.println("draw");
            } else if ((user == 1 && con == 3) || (user == 3 && con == 2) || (user == 2 && con == 1)) {
                a++;
                System.out.println("your score " + a);

            } else {
                b++;
                System.out.println("comp score " + b);
            }
            if(i<2){
                System.out.println("enter your next choice");
            }
        }

        if (a>b){
            System.out.println("you won with a score of " + a);
        }
        else{
            System.out.println("Comp won with a score of " + b);
        }

    }
}
