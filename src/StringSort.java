import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by ${SongZhiPing} on 07/21/2015.
 */
public class StringSort {
    public static void main(String[] args){
        List<String> names
                = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names, (a, b) -> b.compareTo(a));
        System.out.println(names);
    }
}
