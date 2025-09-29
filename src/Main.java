import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numb of elements in the array: ");
        int n = in.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        int num = arr[0];
        int k = 0;
        for (int i = 0; i < n; i++){
            if (k == 0){
               num = arr[i];
               k++;
            }
            else {
                if (arr[i] == num){
                    k++;
                }
                else{
                    k--;
                }
            }
        }
       System.out.println(num);

    }
}