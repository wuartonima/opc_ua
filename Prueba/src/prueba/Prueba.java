/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import com.sourceforge.snap7.moka7.S7;
import com.sourceforge.snap7.moka7.S7Client;
import java.util.Scanner;

/**
 *
 * @author AnjelConJ
 */
public class Prueba {
public static int x=0;
public static final S7Client Client = new S7Client();
public static final byte[] Buffer = new byte[65536];

public static void main(String[] args) {

      Client.SetConnectionType(S7.OP);
      Client.ConnectTo("192.168.0.12",0,2);
      if (Client.Connected) {
          System.out.println("Lo lograste en una madruga");

    }
   
            
    
}
}