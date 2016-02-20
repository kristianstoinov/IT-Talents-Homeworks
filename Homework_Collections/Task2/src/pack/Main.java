package pack;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		String s = sc.nextLine();
		StringBuilder str = new StringBuilder();
		str.append(s.replaceAll("[ -+.^:,!?@#$%&()\"\\/\';]","").toUpperCase());
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			Integer val = hmap.get(new Character(c));
			if (val != null) {
				hmap.put(c, new Integer(val + 1));
			} else {
				hmap.put(c, 1);
			}
		}
		
	      
		 Map<Integer, String> map = sortByValues(hmap); 
	      Set set2 = map.entrySet();
	      Iterator iterator2 = set2.iterator();
	      int max = 0;
	      while(iterator2.hasNext()) {
	           Map.Entry me2 = (Map.Entry)iterator2.next();
	           System.out.print(me2.getKey() + ": ");
	           System.out.print(me2.getValue());
	          // if((int) me2.getValue() == max){
	        	   System.out.print(" ");
	        	   for(int i = 1; i<= (int) me2.getValue(); i++){
	        	   System.out.print("#");
	        	   }
	        	   
	        	   System.out.println();
	        //   }
	      }
	    }
	
	private static HashMap sortByValues(HashMap map) { 
	       List list = new LinkedList(map.entrySet());
	       Collections.sort(list, new Comparator() {
	            public int compare(Object o1, Object o2) {
	               return (-((Comparable) ((Map.Entry) (o1)).getValue())
	                  .compareTo(((Map.Entry) (o2)).getValue()));
	            }
	       });
     
	       HashMap sortedHashMap = new LinkedHashMap();
	       for (Iterator it = list.iterator(); it.hasNext();) {
	              Map.Entry entry = (Map.Entry) it.next();
	              sortedHashMap.put(entry.getKey(), entry.getValue());
	       } 
	       return sortedHashMap;
	  }
	}

