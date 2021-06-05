// 브루트포스 / 2798. 블랙잭
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] arr = new int[N];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        int sum = 0;
        search : for(int i = 0; i < N-2 ; i ++)
                {
                    for(int j = i+1; j < N-1; j++)
                    {
                        for(int k = j+1; k < N; k++)
                        {
                            int temp = arr[i]+arr[j]+arr[k];
                            if (temp == M) {
                                sum = temp;
                                break search;
                            }
                            else if ((Math.abs(M-sum) > Math.abs(M-temp)) && temp < M) {
                                sum = temp;
                            } 
                        }
                    }
                }
            
        System.out.println(sum);
        
        
        
        sc.close();
        
    }
}
