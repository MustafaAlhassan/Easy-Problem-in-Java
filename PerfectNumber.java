/*find perfect number between to number*/
public static void perfect(int a, int b){
    System.out.println("Composite number between " + a + " and " + b);
    for (int i = a; i <= b; i++) {
        if(isPerfect(i))
            System.out.print(i + " ");
    }
}
private static boolean isPerfect(int n){
    if(n<=1){
        return false;
    }else{
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if(n%i==0)
                sum += i;
        }
        return sum == n;
    }
}
