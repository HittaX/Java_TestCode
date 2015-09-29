import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapDemo {

    public HashMap <Integer,String> cache = new HashMap<Integer,String>();

    public static void main(String[] args) throws IOException {
	// write your code here
        HashMapDemo hashMapDemo = new HashMapDemo();
        ObjectOutputStream s1 = new ObjectOutputStream(System.out);

        hashMapDemo.cache.put(1,"NewYork");
        hashMapDemo.cache.put(2,"Tokyo");
        hashMapDemo.cache.put(3,"Beijing");

        s1.writeObject(hashMapDemo.cache);

    }
}
