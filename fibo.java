public class fibo{ 
     public static void main(String[] args) {
        System.out.println(fiborev(2));
        System.out.println(fiborev(7));
        System.out.println(fiborev(13));
        System.out.println(fiborev(40));
     }

    private static int fiborev(int n) {
        if (n<=2) {
            return 1;
        }
        else{
            return fiborev(n-1)+fiborev(n-2);
        }
    }   
}
