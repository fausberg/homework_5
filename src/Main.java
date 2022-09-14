import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        Task_1();
        Task_2();
    }

    public static void Task_1() {
        int[][] arr = {{1, 2, 3, 4, 5,}, {1, 2, 3, 4, 5, 6}};
        for (int i = 0; i < arr.length; i++) {
            for (int g = 0; g < arr[i].length; g++) {
                System.out.print(arr[i][g] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int[][] arr_1 = {{0,0,0,0,0,0},{0,0,0,0,0}};
        for(int i = 0; i < arr.length; i++){
            for (int g = 0; g < arr[i].length;g++){
                if(i == 0) {
                    arr_1[1][g] = arr[i][g];
                }else{
                    arr_1[0][g] = arr[i][g];
                }
            }
        }
        for (int i = 0; i < arr_1.length; i++) {
            for (int g = 0; g < arr_1[i].length; g++) {
                System.out.print(arr_1[i][g] + " ");
            }
            System.out.println();
        }

    }

    public static void Task_2(){
        int[][] arr = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5, 6}};
        for (int i = 0; i < arr.length; i++) {
            for (int g = 0; g < arr[i].length; g++) {
                System.out.print(arr[i][g] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int pum = 0;
        for(int i = 0; i < arr.length; i++){
            for (int g = 0; g < arr[i].length;g++){
                if(g == 0) {
                    pum = arr[0][0];
                    arr[0][0] = arr[i][arr[i].length - 1];
                    arr[i][arr[i].length - 1] =pum;
                    break;
                }
            }
        }
        pum = 0;
        for(int i = 1; i < arr.length; i++){
            for (int g = 0; g < arr[i].length;g++){
                if(g == 0){
                    pum = arr[1][0];
                    arr[1][0] = arr[1][arr[i].length - 1];
                    arr[1][arr[i].length - 1] = pum;
                    break;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int g = 0; g < arr[i].length; g++) {
                System.out.print(arr[i][g] + " ");
            }
            System.out.println();
        }
    }
}