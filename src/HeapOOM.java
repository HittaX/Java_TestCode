import java.util.ArrayList;
import java.util.List;

/**
 * Created by ${SongZhiPing} on 07/22/2015.
 */
public class HeapOOM {

    static class OOMObject{

    }

    public static void  main(String[] args){
        List<OOMObject> list = new ArrayList<OOMObject>();

        while (true){
            list.add(new OOMObject());
        }
    }


}
