import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by ${SongZhiPing} on 09/29/2015.
 */
public class IPAddress {

    public static void main(String[] args){
        try {
            InetAddress taobao = InetAddress.getByName("www.taobao.com");
            InetAddress addresses = InetAddress.getByName("www.taobao.com");

            System.out.println(addresses.getHostName());
            System.out.println(addresses.getHostAddress());
            if(addresses.equals(taobao))
                System.out.println("C");

        }
        catch (UnknownHostException ex){
            System.out.println("Error");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
