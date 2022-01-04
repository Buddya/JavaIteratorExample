import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random = new Random();
    private final Iterator<Integer> integerIterator;

    public Randoms(int min, int max) {
        integerIterator = new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return random.nextInt(max + 1 - min) + min;
            }
        };
    }

    @Override
    public Iterator<Integer> iterator() {
        return integerIterator;
    }
}