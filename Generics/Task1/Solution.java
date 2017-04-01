/**
 * Created by DmytroBartoshchuk on 14.03.2017.
 */
public class Solution {
    public static void main(String[] args){

        Pair<String, Integer> pg = new Pair<String, Integer>("Dmytro", 3);

        System.out.println(pg.getFirst() + " " + pg.getLast());

        String name = pg.getFirst();

        int m = pg.getLast();

        pg.setFirst(name + " Bartoshchuk");
        pg.setLast(m+1);

        System.out.println(pg.getFirst() + " " + pg.getLast());
    }
}
