/**
 * Created by Валентина on 14.03.2017.
 */
public class Pair<K, V> {
     K k;
     V v;

    public Pair(K k, V v) {
        this.k = k;
        this.v = v;
    }

    public K getFirst() {
        return k;
    }

    public V getLast() {
        return v;
    }

    public void setFirst(K k) {
        this.k = k;
    }

    public void setLast(V v) {
        this.v = v;
    }
}
