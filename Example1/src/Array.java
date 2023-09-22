public class Array {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(fonk(sayilar, 5));
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
/*    public static void main(String[] args) {

        String[] sehirler1 = new String[]{"Ankara","İstanbul","Yozgat"};

        for (String sehir: sehirler1) {
            System.out.println(sehir);
        }
        // Referans Types: Array, Class, Abstract, İnterface
        String[] sehirler1= new String[]{"Ankara","İst","İzmir"};
        String[] sehirler2= new String[]{"Yozgat","Kayseri","Sivas"};

        sehirler1 = sehirler2;   // sehirler1 dizisinin elemanları "Yozgat","Kayseri","Sivas" oldu
                sehirler1[0]="Aksaray";
                System.out.println(sehirler2[0]);

                // Value Types: Boolean, İnteger, Double ...
                int sayi1 = 10, sayi2 = 20;
                sayi1 = sayi2;
                sayi2 = 30;
                System.out.println(sayi1);
    }
 */
