package pratik;

public class ArrayinElemenlariniToplama {
    public static void main(String[] args) {
        // Verilen MD Arrayin tum elemenlarinin toplamini bul bakem

        int arr[][]={{3,1,7,9,6}, {6,10,2}};

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                toplam+=arr[i][j];
            }
        }
        System.out.println(toplam);
    }
}
