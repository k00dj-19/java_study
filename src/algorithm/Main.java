package algorithm;
// 브루트 포스 / 2231. 분해합
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Stream;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int N_length = (int)(Math.log10(N)+1); // N의 자리수
        int constructor = 0;
        if (N_length <= 1) {
            constructor = (int)(N/2);
        }
        else if (N_length > 1) {
            for (int i = N-9*N_length; i<N+1; i++){ // 최대 9*N_length 만큼 생성자에서 최대로 더할 수 있음.
                int[] digits = Stream.of(String.valueOf(i).split("")).mapToInt(Integer::parseInt).toArray();
                
                int temp = i;
                for(int digit : digits){
                    temp += digit;
                }
                if(temp == N) {
                    constructor = i; 
                    break;
                }
                else if(temp>N) break;
            }
        }
        
        System.out.println(constructor);
        sc.close();
    }
}
