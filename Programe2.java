import java.util.Scanner;
public class Programe2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range");
        int n = sc.nextInt();
        for(int i=0;i<=n-1;i++){
            if(i%2==0){
                System.out.println(" *");
            }else{
                for(int j =0;j<=i-1;j++){
                    System.out.print(" *");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
