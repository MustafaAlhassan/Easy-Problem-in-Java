/*find prime between to numbers*/
public static void prime(int a, int b){
    System.out.println("Prime number between " + a + " and " + b);
    for (int i = a; i <= b; i++) {
        if(isPrime(i))
            System.out.print(i + " ");
    }
}
private static boolean isPrime(int n){
    if(n<=1){
        return false;
    }else{
        for (int i = 2; i <= n/2; i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
