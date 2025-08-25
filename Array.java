import java.util.*;
public class Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n[] = new int[5];
        System.out.println("Enter five elements of the array:");
        for(int i=0;i<n.length;i++){
            n[i]= sc.nextInt();

        }
        System.out.println("The arrray elements are the following:");
        for(int i=0;i<n.length;i++){
            System.out.println(n[i]);
        }

    }

}
