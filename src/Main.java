import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main{

        public static void main(String[]args){

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String host= "";

        try{
            System.out.println("what is this");
            host=reader.readLine();

        InetAddress address=InetAddress.getByName(host);

        System.out.println(address.isReachable(5000) ? "Ok" : "false");

        }catch(UnknownHostException e){
        System.err.println(" Invalid host name: " +host);

        } catch(IOException e){
        System.err.println(e.getMessage());

        }
        }
}