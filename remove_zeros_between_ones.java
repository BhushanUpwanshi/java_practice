remove_zeros_between_ones
binary string :
remove zeros(0) between ones(1)

  --------------------

public class Main
{
    public static String func(String s){
        int start=0,end=0;
        String res="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                start=i;
                break;
            }
        }
        for(int i=s.length()-1;i>0;i--){
            if(s.charAt(i)=='1'){
                end=i;
                break;
            }
        }
        res+=s.substring(0,start+1);
        for(int i=start;i<end;i++){
            if(s.charAt(i)!='0'){
                res+=s.charAt(i);
            }
        }
        System.out.println(start+" "+end);
        res+=s.substring(end,s.length());
        return res;
    } 
    
	public static void main(String[] args) {
		String s="01011100101100100";
		System.out.println(func(s));
	}
}
---------------------------------------

  public class Main
{
    public static String func(String s){
        char[] ch=s.toCharArray();
        String res="";
        String res1="";
        boolean flag=false;
        
        for(int i=0, r=ch.length-1;i<=r;i++ ){
            if(!flag){
                res+=ch[i];
                if(ch[i]=='1')
                    flag=true;
            }else if(ch[i]=='1')
                res+=ch[i];
            if(ch[r]=='0'){
                res1+='0';
                r--;
            }
        }
        
        return res+res1;
    } 
    
	public static void main(String[] args) {
		String s="01011100101100100";
		System.out.println(func(s));
	}
}
--------------------------------
