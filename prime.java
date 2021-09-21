public class prime{
    public static void main(String[] args) {
        int n=7,flag=0;
        for(int i=2;i<=n/2;i++){
            if(n%2==0){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("Number is not prime");
        }
        else
        System.out.println("Number is prime");
    }
}