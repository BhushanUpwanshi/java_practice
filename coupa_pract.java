-------------------
Coupa Practice que

1]
  For a given array of size N, the productivity of a pair(i,j) is defined as A[i]A[j].
You have to find the number of such productive pairs whose values are greater than or equal to K and the sum of the productive pairs.

// #include <stdio.h>
// void productivePairs(int N, int A[], int K) {
// int value--404;
// int sum--405;

  
// printf("%d %d", value, sum);
// }

// int main(void) {
// int N,1,K;
// scanf("%d", &N);
// scanf("%d", &K);
// int A[N];
// for(i=1;i<=N;i++){
// scanf("%d",&A[1]);
// }
// productivePairs (N,A,K);
// return 0;
// }

  public class Main
{
    public static void productivePairs(int N, int arr[], int K) {
        int value=0;
        int sum=0;
        for(int i=0;i<N-1;i++){
            for(int j=i+1;j<N;j++){
                if(arr[i]*arr[j] >= K){
                value++;
                sum+=arr[i]*arr[j];
            }
            }
        }
        System.out.println("value : "+ value+" sum : "+sum);
    }
	public static void main(String[] args) {
		int[] arr={5,4,3,2,1};
		productivePairs(arr.length,arr,6);
	}
}

----------------------------
2]
Larger Part:
An array of size N is given, consisting of integers 1 and 0.
Every continuous sequence of 1s forms a single object and 0s break the part.
The area of the object is decided by the total number of continuous 1s present in it.

public class Main
{
    public static int largerPart(int N,int[] arr){
    int area =0;
    int maxarea = 0;
        for(int i:arr){
            if(i==0){
                if(area>maxarea)
                    maxarea=area;
                area=0;
            }
            area+=i;
        }
        if(area>maxarea)
                    maxarea=area;
        return maxarea;
    }
	public static void main(String[] args) {
		int arr[] = {1,1,0,1,1,1,0,1};
        System.out.println(largerPart(arr.length,arr));
	}
}

-----------------------------------
3]
code to find maximum no of subarrays having smallest number occurrence only once


public class Main
{
    public static int getTotalSubArr(int[] arr){
        int min=arr[0];
		
		for(int i : arr){
		  //  if(min>i)
		  //      min=i;
		  min=Math.min(min,i);
		}
		int subarrCount=0;
		for(int i=0;i<arr.length;i++){
		    int count=0;
		    for(int j=i;j<arr.length;j++){
		        if(arr[j]==min)
		            count++;
		        if(count ==1)
		            subarrCount++;
		        if(count>1)
		            break;
		    }
		}
		return subarrCount;
    }
	public static void main(String[] args) {
		int[] arr={1,2,1,4,1};
		
		
		System.out.println(getTotalSubArr(arr));
	}
}

-------------------------
