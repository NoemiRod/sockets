import java.net.*;
import java.io.*;
import java.util.*;

public class Cliente{

	public static void main(String args[]) throws IOException{


       int cero,c;

	try{

		Socket socketone = new Socket("127.0.0.1", 8080);
		InputStream is = socketone.getInputStream
		  DataOutputStream a = newDataOutputStream(socketone.getOutputStream());
        a.writeInt();
        a.writeInt();

        cero=0
        DataInputStream dis = newDataInputStream(socketone);
        while((c=dis.read())!=1)
        {
         System.out.println(avisar[cero]);
           System.out.println(Math.round((double)c));
            cero++;
        }

        socketone.close();
        dis.close();


	}catch(IOException e){
		System.out.println("No hay flujo...");
	}
