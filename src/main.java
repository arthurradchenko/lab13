public class main {
    public static void main(String[] args) {
        System.out.println("Lab #3 OOP");
        try {
            Logic.readFromFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
        boolean f = false;
        while(!f) {
            Menu.mainscreen();
        }
    }
}
