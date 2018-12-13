import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Logic {
    public static int count=0;
    public static void readFromFile()throws Exception    {
        File file = new File("planes.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        int i = 0;
        do{
            Plane plane = new Plane();
            plane.setPlaneNum(Integer.parseInt(br.readLine()));
            plane.setDestination(br.readLine());
            plane.setTripNum(Integer.parseInt(br.readLine()));
            plane.setType(br.readLine());
            plane.setTime(Integer.parseInt(br.readLine()));
            plane.setDay(br.readLine().toLowerCase().split("\\s+"));
            Plane.base[i]= plane;
            i++;
        }while ((st = br.readLine()) != null);
        count =i;
    }
    public static void destination(){
        System.out.println("Type a place of destination: ");
        Scanner scan = new Scanner(System.in);
        String place = scan.nextLine();
        System.out.println("Results: \n");
        for(int i = 0; i<count; i++){
            if (place.equals(Plane.base[i].getDestination())){
                System.out.println(Plane.base[i]);
            }
        }
        Menu.mainscreen();
    }
    public static void planesToday(){
        System.out.println("Type a day in a week: ");
        Scanner scan = new Scanner(System.in);
        String day = scan.nextLine().toLowerCase();
        System.out.println("Results: \n");
        for(int i = 0; i<count; i++){
            if (Arrays.asList(Plane.base[i].getDay()).contains(day)){
                System.out.println(Plane.base[i]);
            }
        }
        Menu.mainscreen();
    }
    public static void planesLater(){
        System.out.println("Type a day in a week and time: \n");
        Scanner scan = new Scanner(System.in);
        String[] req = scan.nextLine().toLowerCase().split("\\s+");
        int time = Integer.parseInt(req[1]);
        String day = req[0];
        System.out.println("Results: \n");
        for(int i = 0; i<count; i++){
            if (Arrays.asList(Plane.base[i].getDay()).contains(day) && Plane.base[i].getTime()>time){
                System.out.println(Plane.base[i]);
            }
        }
        Menu.mainscreen();
    }
}
