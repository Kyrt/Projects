import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Main {
   public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(4);
		list.add(3);
		list.add(6);
		list.add(-11);
		list.add(98);
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		System.out.println("===============================");
		
		Set<Double> set=new HashSet<Double>();
		
		boolean r1=set.add(23.15);
		boolean r2=set.add(23.15);
		set.add(4.55);
		set.add(57.175);
		set.add(2.75);
		
		System.out.println("r1="+r1+"  r2="+r2);
		System.out.println("===============================");
		
		for(Double doub:set){
			System.out.println(doub);
			}
		
	}
}
