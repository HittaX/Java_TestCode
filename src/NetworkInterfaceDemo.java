import java.net.NetworkInterface;
import java.net.SocketException;

/**
 * Created by songzp on 9/30/15.
 */
public class NetworkInterfaceDemo {

    public static void main(String args[]){
        try {
            NetworkInterface ni = NetworkInterface.getByName("en0");
            if(ni == null)
                System.err.println("No such interface : en0");
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

}
