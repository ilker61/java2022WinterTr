package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C01_MDArrays {
    public static void main(String[] args) {

        int arr[][]={{3,2,7}, {6,10,2}};

        // 7 yi bastiralim

        System.out.println(arr[0][2]); // 7
        System.out.println(arr[0][2]); // 10

        // ilk arrayin tum elemanlarini yazdir

        System.out.println(Arrays.toString(arr[0])); // [3,2,7]

        // MD Arrayda tumunu yazdirmak istersek

        System.out.println(Arrays.deepToString(arr)); // [[3, 2, 7], [6, 10, 2]]

    }
}
