package by.Arsen;

import java.util.ArrayList;
import java.util.Random;

public class Main {
      private static ArrayList<mobile> mobiles=new ArrayList<mobile>();
	  private static Random r=new Random();
	  
	public static void main(String[] args) {
	   for(int i=0;i<300;i++){
		   mobiles.add(new mobile(r.nextInt(9999999),"’осе мать твою"));
	   }
	   for(mobile m: mobiles){
		   System.out.println(m.getNumber()+" "+m.getName());
	   }
	}
}
