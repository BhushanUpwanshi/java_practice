// Write a function to find out duplicate words in a given string?
// String string = "Big black bug bit a big black dog on his big black nose";

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String str="Big black bug bit a big black dog on his big black nose";
		Map <String,Integer> strMap=new HashMap<>();
		String[] sarr= str.toLowerCase().split(" ");
		
		for(String s : sarr){
		    System.out.println(s);
		    if(strMap.containsKey(s))
		        strMap.put(s,strMap.get(s)+1);
		    else
		        strMap.put(s,1);
		}
		for(Map.Entry<String,Integer> entry : strMap.entrySet()){
		    if(entry.getValue() > 1)
		        System.out.println(entry.getKey()+" - "+entry.getValue());
		}
	}
}
