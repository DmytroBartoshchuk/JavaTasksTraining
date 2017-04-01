/**
 * Created by DmytroBartoshchuk on 19.03.2017.
 */
public class Main {
    public static void main(String[] args) {

        MyWater myWater = new MyWater(2,3,5);

        myWater.addLarge(5);
        myWater.addMedium(3);
        myWater.addSmall(2);
        System.out.println("Now I have " + myWater.getJoinCapacity()+" liters of water");
        System.out.println("large bottles: "+myWater.getCountLarge()+"\n"
                            +"medium bottles: "+myWater.getCountMedium()+"\n"
                            +"small bottles: "+myWater.getCountSmall());
    }
}
