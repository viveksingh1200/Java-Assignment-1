public class factorial {
    public static void main(String[] args) {
        int a=7;
        int fact=1;
        for(int i=1;i<=a;i++){
            fact=fact*i;
        }
        System.out.println("factorial of "+a+" is "+fact);
    }
}
