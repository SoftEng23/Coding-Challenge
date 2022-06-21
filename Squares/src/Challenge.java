
public class Challenge {

    public static void main(String[] args) {
    	System.out.println(squared(3,9));
        System.out.println(squared(17,24));
        System.out.println(squared(1, 1000000000));
    }

    public static int squared(int a , int b){
        double Upper = Math.floor(Math.sqrt(b));
        double Lower = Math.floor(Math.sqrt(a));
        return  (int)(Upper-Lower);
    }
} 