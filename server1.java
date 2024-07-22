import java.net.*;
import java.io.*;

class server1 {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(7777);
        System.out.println("Server is waiting for client...");

        Socket s = ss.accept();
        System.out.println("Client connected!");

        FileInputStream fin = new FileInputStream("send.txt");
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        int r;
        while ((r = fin.read()) != -1) {
            dout.write(r);
        }

        fin.close();
        dout.close();
        s.close();
        ss.close();
        System.out.println("Data sent to client successfully!");
    }
}
