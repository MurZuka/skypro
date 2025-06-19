import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int arr[] = new int[3];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        float arrFloat[] = { 1.57f, 7.654f, 9.986f };

        int myArr[] = { 43, 922, 0, 3 };

        System.out.println("Задача 2");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            if (i != arr.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }

        for (int i = 0; i < arrFloat.length; i++) {
            System.out.print(arrFloat[i]);

            if (i != arrFloat.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }

        for (int i = 0; i < myArr.length; i++) {
            System.out.print(myArr[i]);

            if (i != myArr.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }

        System.out.println("Задача 3");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);

            if (i != 0) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }

        for (int i = arrFloat.length - 1; i >= 0; i--) {
            System.out.print(arrFloat[i]);

            if (i != 0) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }

        for (int i = myArr.length - 1; i >= 0; i--) {
            System.out.print(myArr[i]);

            if (i != 0) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }

        System.out.println("Задача 4");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = arr[i] + 1;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}