import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        Task_1();
//        Task_2();
//        Task_3();
        Task_4();
    }

    public static void Task_1() {
        Random random = new Random();
        int[][] arr = new int [3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int g = 0; g < arr[i].length; g++) {
                arr[i][g] = random.nextInt(10);
                System.out.print(arr[i][g] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int k = arr.length-1;
        int[][] arr_1 = new int[3][3];
        for(int i = 0; i < arr.length; i++){
            for (int g = 0; g < arr[i].length;g++){
                arr_1[k][g] = arr[i][g];
            }
            k--;
        }
        for (int i = 0; i < arr_1.length; i++) {
            for (int g = 0; g < arr_1[i].length; g++) {
                System.out.print(arr_1[i][g] + " ");
            }
            System.out.println();
        }

    }

    public static void Task_2(){
        Random random = new Random();
        int[][] arr = new int [4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int g = 0; g < arr[i].length; g++) {
                arr[i][g] = random.nextInt(10);
                System.out.print(arr[i][g] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int[][] arr_1 = new int[4][4];
        for(int i = 0; i < arr.length; i++){
            int k = arr[0].length-1;
            for (int g = 0; g < arr[i].length;g++){
                arr_1[i][k] = arr[i][g];
                k--;
            }
        }
        for (int i = 0; i < arr_1.length; i++) {
            for (int g = 0; g < arr_1[i].length; g++) {
                System.out.print(arr_1[i][g] + " ");
            }
            System.out.println();
        }
    }

    public static void Task_3(){
        Random random = new Random();
        int[][] arr = new int [4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int g = 0; g < arr[i].length; g++) {
                arr[i][g] = random.nextInt(10);
                System.out.print(arr[i][g] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int sum = 0;
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            for(int g = 0; g < arr[i].length; g++){
                sum +=arr[i][g];
            }
            if(sum > max){
                max = sum;
            }
            sum = 0;
        }

        System.out.println(max);
    }

    public static void Task_4(){
        Random random = new Random();
        int[][] arr = new int [4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int g = 0; g < arr[i].length; g++) {
                arr[i][g] = random.nextInt(10);
                System.out.print(arr[i][g] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int sum = 0;
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            for(int g = 0; g < arr[i].length; g++){
                sum +=arr[g][i];
            }
            if(sum > max){
                max = sum;
            }
            sum = 0;
        }

        System.out.println(max);
    }
}