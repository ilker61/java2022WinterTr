package day22_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_Split {

    public static void main(String[] args) {
        String str= "Java gun gectikce guzellesiyor";


        String arr[]=str.replace(" ", "").split("");
        System.out.println(Arrays.toString(arr));

    }
}
