import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissor {
    public static int rps(char you, char comp){
        //function returns 1 if user wins, -1 if user looses and 0 if it becomes draw
        
        //Condition  for draw
        if(you==comp){
            return 0;
        }

        //Non draw conditions
        if(you=='r' && comp=='p'){
            return -1;
        }
        else if(you=='p' && comp=='r'){
            return 1;
        }
        if(you== 'p' && comp=='s'){
            return -1;
        }
        else if(you=='s' && comp=='p'){
            return 1;
        }
        if(you=='s' && comp=='r'){
            return -1;
        }
        else if(you=='r' && comp=='s'){
            return 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char user, comp = ' ';
        Random rand = new Random();
        int g_rand = rand.nextInt(3)+1;
        if(g_rand==1){
            comp = 'r';
        }
        else if(g_rand==2){
            comp = 'p';
        }
        else if(g_rand==3){
            comp = 's';
        }
        //System.out.println(comp);
        System.out.println("Enter 'r' for Rock or 'p' for Paper or 's' for Scissor");
        System.out.print("Your Turn: ");
        user = sc.next().charAt(0);
        int result = rps(user, comp);
        if(result==0){
            System.out.println("Game Draw!");
        }
        else if(result==1){
            System.out.println("You Win!");
        }
        else{
            System.out.println("You Lose!");
        }
        System.out.println("You chose: "+user+" & Computer chose: "+comp);
    }
}
