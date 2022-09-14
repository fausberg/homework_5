import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Task_1();
//        Task_2();
//        Task_3();
//        Task_4();
//        Task_5();
//        Task_6();
//        Task_7();
//        Taskl_1();
//        Taskl_2();
//        Taskl_3();
//        Taskl_4();
        Taskl_5();
//        Taskl_6();
    }

    public static void Task_1() {
        Random random = new Random();
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int g = 0; g < arr[i].length; g++) {
                arr[i][g] = random.nextInt(10);
                System.out.print(arr[i][g] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int k = arr.length - 1;
        int[][] arr_1 = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int g = 0; g < arr[i].length; g++) {
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

    public static void Task_2() {
        Random random = new Random();
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int g = 0; g < arr[i].length; g++) {
                arr[i][g] = random.nextInt(10);
                System.out.print(arr[i][g] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int[][] arr_1 = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            int k = arr[0].length - 1;
            for (int g = 0; g < arr[i].length; g++) {
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

    public static void Task_3() {
        Random random = new Random();
        int[][] arr = new int[4][4];
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
        for (int i = 0; i < arr.length; i++) {
            for (int g = 0; g < arr[i].length; g++) {
                sum += arr[i][g];
            }
            if (sum > max) {
                max = sum;
            }
            sum = 0;
        }

        System.out.println(max);
    }

    public static void Task_4() {
        Random random = new Random();
        int[][] arr = new int[4][4];
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
        for (int i = 0; i < arr.length; i++) {
            for (int g = 0; g < arr[i].length; g++) {
                sum += arr[g][i];
            }
            if (sum > max) {
                max = sum;
            }
            sum = 0;
        }

        System.out.println(max);
    }

    public static void Task_5() {
        Random random = new Random();
        int[][] arr = new int[4][8];
        for (int i = 0; i < arr.length; i++) {
            for (int g = 0; g < arr[i].length; g++) {
                arr[i][g] = random.nextInt(10);
                System.out.print(arr[i][g] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int g = 0; g < arr[i].length; g++) {
                if (arr[i][g] % 2 == 0) {
                    sum += arr[i][g];
                    System.out.print(arr[i][g] + " ");
                }
            }
        }
        System.out.println();
        System.out.println(sum);
    }

    public static void Task_6() {
        Random random = new Random();
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int g = 0; g < arr[i].length; g++) {
                arr[i][g] = random.nextInt(10);
                System.out.print(arr[i][g] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int sum = 0;
        int dig_i = 0;
        int dig_g = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int g = 0; g < arr[i].length; g++) {
                if (i == dig_i && g == dig_g) {
                    if (arr[i][g] % 2 == 0) {
                        sum += arr[i][g];
                    }
                    dig_i++;
                    dig_g++;
                }
            }
        }
        System.out.println();
        System.out.println(sum);
    }

    public static void Task_7() {
        Random random = new Random();
        int[][] arr = new int[7][4];
        for (int i = 0; i < arr.length; i++) {
            for (int g = 0; g < arr[i].length; g++) {
                arr[i][g] = random.nextInt(10);
                System.out.print(arr[i][g] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int p_i = 0;
        int p_g = 0;
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int g = 0; g < arr[i].length; g++) {
                if (max < arr[i][g]) {
                    max = arr[i][g];
                    p_i = i;
                    p_g = g;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int g = 0; g < arr[i].length; g++) {
                if (max == arr[i][g]) {
                    p_i = i;
                    p_g = g;
                    System.out.println(max + " " + p_i + " " + p_g);
                }
            }
        }
    }

    public static void Taskl_1() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int[][][] arr = new int[3][3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int g = 0; g < arr[i].length; g++) {
                for (int j = 0; j < arr[i][g].length; j++) {
                    arr[i][g][j] = random.nextInt(10);
                    System.out.print(arr[i][g][j] + " ");
                }
                System.out.println();
            }
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int g = 0; g < arr[i].length; g++) {
                for (int j = 0; j < arr[i][g].length; j++) {
                    arr[i][g][j] += n;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int g = 0; g < arr[i].length; g++) {
                for (int j = 0; j < arr[i][g].length; j++) {
                    System.out.print(arr[i][g][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void Taskl_2() {
        String[][] arr = new String[8][8];
        boolean p_i = true;
        boolean p_g;
        int p = 0;
        for (int i = 0; i < arr.length; i++) {
            if (p_i) {
                p_g = true;
                p_i = false;
            } else {
                p_g = false;
                p_i = true;
            }
            for (int g = 0; g < arr[i].length; g++) {
                if (p_g) {
                    arr[i][g] = "W";
                    p_g = false;
                } else {
                    arr[i][g] = "B";
                    p_g = true;
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

    public static void Taskl_3() {
        Random random = new Random();
        int[][] arr = new int[3][3];
        int[][] arr_1 = new int[3][3];
        int[][] arr_2 = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int g = 0; g < arr[i].length; g++) {
                arr[i][g] = random.nextInt(10);
                System.out.print(arr[i][g] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int k = 0;
        for (int i = 0; i < arr_1.length; i++) {
            for (int g = 0; g < arr_1[i].length; g++) {
                arr_1[i][g] = k;
                k++;
                System.out.print(arr_1[i][g] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int p_i = 0;
        int p_g = 0;
        int p = 0;
        while (p_i < arr_2.length) {
            for (int i = 0; i < arr_2.length; i++) {
                for (int g = 0; g < arr_2[i].length; g++) {
                    arr_2[p_i][p_g] += arr[p][g] * arr_1[g][i];
                }
                p_g++;
                if (p_g == arr_2[i].length) {
                    p_g = 0;
                }
            }
            p_i++;
            p++;
        }
        for (int i = 0; i < arr_2.length; i++) {
            for (int g = 0; g < arr_2[i].length; g++) {
                System.out.print(arr_2[i][g] + " ");
            }
            System.out.println();
        }
    }

    public static void Taskl_4() {
        Random random = new Random();
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int g = 0; g < arr[i].length; g++) {
                arr[i][g] = random.nextInt(10);
                System.out.print(arr[i][g] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int g = 0; g < arr[i].length; g++) {
                sum += arr[i][g];
            }
        }
        System.out.println(sum);
    }

    public static void Taskl_5() {
        Random random = new Random();
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int g = 0; g < arr[i].length; g++) {
                arr[i][g] = random.nextInt(10);
                System.out.print(arr[i][g] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int dig_i = 0;
        int dig_g = 0;
        int dig_i1 = 0;
        int dig_g1 = arr[0].length - 1;
        for (int i = 0; i < arr.length; i++) {
            for (int g = 0; g < arr[i].length; g++) {
                boolean a = false;
                if (i == dig_i && g == dig_g) {
                    dig_i++;
                    dig_g++;
                    a = true;
                }
                if(i == dig_i1 && g == dig_g1){
                    dig_i1++;
                    dig_g1--;
                    a = true;
                }
                if (!a) {
                    arr[i][g] = 0;
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


    public static void Taskl_6() {
        Random random = new Random();
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int g = 0; g < arr[i].length; g++) {
                arr[i][g] = random.nextInt(10);
                System.out.print(arr[i][g] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int g = 0; g < arr[i].length; g++) {
                Arrays.sort(arr[i]);
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