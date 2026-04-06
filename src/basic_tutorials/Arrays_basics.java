package basic_tutorials;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Arrays_basics {
    public static void main(String[] args) {
        //ArrayList<Integer> list= new ArrayList<>();
        Scanner in=new Scanner(System.in);
        int [] arr1= new int[5];
        for(int i=0;i< arr1.length;i++){
            arr1[i]=in.nextInt();
        }
        for (int j : arr1) {
            System.out.print(j + " ");
        }
        System.out.println();
        for(int num: arr1){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr1));

    }
}
