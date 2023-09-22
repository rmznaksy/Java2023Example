public class Main {
    public static void main(String[] args) {
        int[] sayilar= new int[]{1,2,3,4,5,6,7,8,9,0};
        System.out.println(fonk(sayilar,5));
    }
    public static boolean fonk(int[] array, int x) {
        Boolean var = false;
        for (int number : array) {
            if (x == number) {
                var = true;
                break;
            }
        }
        return var;
    }
}