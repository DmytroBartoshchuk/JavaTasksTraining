/**
 * Created by DmytroBartoshchuk on 19.03.2017.
 */
public class MyWater {

    private int countLarge, countMedium, countSmall;

    public static double capasityLarge = 2.0;
    public static double capasityMedium = 1.0;
    public static double capasitySmall = 0.5;

    public MyWater(int countLarge, int countMedium, int countSmall) {
        this.countLarge = countLarge;
        this.countMedium = countMedium;
        this.countSmall = countSmall;
    }

    public double getJoinCapacity(){
        double joinCapasity=0;
        joinCapasity = (double)getCountLarge()*getCapasityLarge() +
                        (double)getCountMedium()*getCapasityMedium() +
                        (double)getCountSmall()*getCapasitySmall();
        return joinCapasity;
    }

    public static double getCapasityLarge() {
        return capasityLarge;
    }

    public static double getCapasityMedium() {
        return capasityMedium;
    }

    public static double getCapasitySmall() {
        return capasitySmall;
    }

    void addLarge(int bottles){
        countLarge += bottles;
    }
    void addMedium(int bottles){
        countMedium += bottles;
    }
    void addSmall(int bottles){
        countSmall += bottles;
    }

    public int getCountLarge() {
        return countLarge;
    }

    public int getCountMedium() {
        return countMedium;
    }

    public int getCountSmall() {
        return countSmall;
    }
}
