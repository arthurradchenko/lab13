import java.sql.Time;
import java.util.Arrays;

public class Plane {
    public static Plane[] base;

    static {
        base = new Plane[200];
    }

    private String destination;
    private int tripNum;
    private String type;
    private int time;
    private String[] day;
    private int planeNum;

    public Plane() {
    }

    public Plane(String destination, int tripNum, String type, int time, String[] day, int planeNum) {
        this.destination = destination;
        this.tripNum = tripNum;
        this.type = type;
        this.time = time;
        this.day = day;
        this.planeNum = planeNum;
    }

    public int getPlaneNum() {
        return planeNum;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTripNum() {
        return tripNum;
    }

    public void setTripNum(int tripNum) {
        this.tripNum = tripNum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String[] getDay() {
        return day;
    }

    public void setDay(String[] day) {
        this.day = day;
    }

    public void setPlaneNum(int planeNum) {
        this.planeNum = planeNum;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "destination='" + destination + '\'' +
                ", tripNum=" + tripNum +
                ", type='" + type + '\'' +
                ", time=" + time +
                ", day=" + Arrays.toString(day) +
                ", planeNum=" + planeNum +
                '}';
    }
}
