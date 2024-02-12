package gr.aueb.cf.sock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class DateTimeCli {

    public static void main(String[] args) throws UnknownHostException {

        StringBuilder sb = new StringBuilder();
        InetAddress servAddress = InetAddress.getByName("time.nist.gov");
        int servPort = 13;

        try (Socket socket = new Socket(servAddress, servPort);) {
            BufferedReader bf = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String line = "";
            while ((line = bf.readLine()) != null) {
                sb.append(line).append("\n");
            }

            System.out.println("DateTime server says: " + sb);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
