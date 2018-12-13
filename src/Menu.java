import java.util.Scanner;

public class Menu {
    public static void mainscreen(){
        System.out.println("Menu:");
        System.out.println("1. Get list of planes to the destination place.");
        System.out.println("2. Get list of planes at the day in a week.");
        System.out.println("3. Get list of planes at the day in a week, time of which bigger than pointed.");
        Scanner s= new Scanner(System.in);
        char x = s.next().charAt(0);
        switch (x){
            case '1':{
                Logic.destination();
                break;
            }
            case '2':{
                Logic.planesToday();
                break;
            }
            case '3':{
                Logic.planesLater();
                break;
            }
            default: System.out.println("Wrong character.");
        }
    }
}
