enemy soldier
--------------------------------------
import java.util.*;
public class Main
{
    public static int[] rearrangeSoldiers(int[] soldier, int[] enemy) {
       Arrays.sort(soldier);
       int[] res=new int[enemy.length];
       boolean[] used=new boolean[soldier.length];
       Arrays.fill(res,-1);
       
       for(int i=0;i<enemy.length;i++){
           boolean found=false;
           
           for(int j=0;j<soldier.length;j++){
               if(!used[j] && soldier[j]>enemy[i]){
                   res[i]=soldier[j];
                   used[j]=true;
                   found=true;
                   break;
               }
           }
           
           if(!found)
            return null;
       }
       return res;
    }
	public static void main(String[] args) {
		int[] soldier = {8, 1, 5, 7, 3, 9};
        int[] enemy = {2, 4, 6, 5, 7};

        int[] rearrangedSoldiers = rearrangeSoldiers(soldier, enemy);

        if (rearrangedSoldiers != null) {
            System.out.println("Rearranged Soldiers: " + Arrays.toString(rearrangedSoldiers));
        } else {
            System.out.println("Not all enemies can be defeated.");
        }
	}
}
