import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * Created by ${SongZhiPing} on 07/21/2015.
 */
public class ParallelSort {
    public static void main(String args[]) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 1000000; i++) {
            double d = Math.random() * 1000;
            list.add(d + "");
            long start = System.nanoTime();//????????????
            int count =
                    (int) ((Stream) list.stream().parallel()).sorted().count();
            long end = System.nanoTime();//????????????
            long ms = TimeUnit.NANOSECONDS.toMillis(end - start);//???????????
            System.out.println(ms + " ms");
        }
    }
}
