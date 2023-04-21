import java.util.ArrayList;

public interface CalculateCart {


    public static int cart(int a, int b, int c, int d) {
        int sum = a+b+c+d;
        if(sum<10000) {
            return sum;
        }
        int disc = (sum/100)*10;
        System.out.println("Total amount : "+sum);
        System.out.println("Discount applied : "+disc);
        return (sum-disc);
    
    }
    public static int multCart(int ...a) {
        int sum = 0;
        for(int i: a) {
            sum += i;
        }
        if(sum<10000) {
            return sum;
        }

        int disc = (sum/100)*10;
        int[] arr = {4,3,4,5};
        System.out.println("Total amount : "+sum);
        System.out.println("Discount applied : "+disc);
        return (sum-disc);
    }
    public static void main(String[] args) {
        System.out.println("Remaining amount : " + cart(300, 300, 400, 450));
        
        
        int calcDisc = multCart(546, 6546, 564,4564 );
        System.out.println("Remaining amount : " + calcDisc);

    }
}
