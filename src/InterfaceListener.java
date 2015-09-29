import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/**
 * Created by ${SongZhiPing} on 09/30/2015.
 */
public class InterfaceListener {
    public static void main(String args[]){
        try {
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
            while(interfaces.hasMoreElements()){
                NetworkInterface ni = interfaces.nextElement();
                System.out.println(ni);
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

}
