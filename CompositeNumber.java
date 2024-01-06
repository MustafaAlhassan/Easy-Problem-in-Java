/*find Composite Number Between two Numbers*/
public static void composite(int a, int b){
    System.out.println("Composite number between " + a + " and " + b);
    for (int i = a; i <= b; i++) {
        if(isComposite(i))
            System.out.print(i + " ");
    }
}
private static boolean isComposite(int n){
    if(n<=1){
        return false;
    }else{
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0)
                return true;
        }
        return false;
    }
}
