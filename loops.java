import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        System.out.println("Enter number till you want to print table:");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Table of "+ i +"is:\n");
           for(int j=1;j<=10;j++){
               int mul=i*j;
               System.out.println(i+" x "+j+" = "+mul);
           }
           System.out.println("\n");
        }
    }
}