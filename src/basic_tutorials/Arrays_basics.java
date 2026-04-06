package basic_tutorials;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Arrays_basics {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
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
        for(int i=0;i<5;i++){
            list.add(in.nextInt());
        }
        for(int i=0;i<5;i++){
            System.out.print(list.get(i));
        }
        ArrayList<ArrayList<Integer>> lists=new ArrayList<>();
        for(int i=0;i<3;i++){
            lists.add(new ArrayList<>());
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                lists.get(i).add(in.nextInt());
            }
        }
        for (ArrayList<Integer> row : lists) {
            System.out.println(row);
        }
    }
}
