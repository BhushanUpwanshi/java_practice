// Write a function to find out duplicate words in a given string?
// String string = "Big black bug bit a big black dog on his big black nose";

public class Main
{
	public static void main(String[] args) {
		String str="Big black bug bit a big black dog on his big black nose";
		String[] sarr=str.toLowerCase().split(" ");
		
		Map<String,Integer> smap=new HashMap<>();
		
		for(String s: sarr){
		    if(smap.containsKey(s))
		        smap.put(s,smap.get(s)+1);
		    else
		        smap.put(s,1);
		}
		
		for(Map.Entry<String,Integer> entry : smap.entrySet()){
		    if(entry.getValue()>1)
		        System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
}
