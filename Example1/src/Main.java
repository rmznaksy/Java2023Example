import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    //    Product product1 = new Product("PC","Notebook",12000);
    //    System.out.println(product1.getName() + " " + product1.getDesc() + " " + product1.getPrice());
    //    CreditManager creditManager = new CreditManager();
    //    creditManager.add();
    //    creditManager.calculate();
    //    MortgageManager mortgageManager = new MortgageManager();
    //    mortgageManager.add();
    //    mortgageManager.calculate();
    //    VehicleManager vehicleManager = new VehicleManager();
    //    vehicleManager.add();
    //    vehicleManager.calculate();

    /*    CreditManager[] credits = new CreditManager[2];
        credits[0]= new MortgageManager();
        credits[0].add();
        credits[0].calculate();
        credits[1]= new VehicleManager();
        credits[1].add();
        credits[1].calculate(); */

        ArrayList<CreditManager> credits = new ArrayList<CreditManager>();
        credits.add(new MortgageManager());
        credits.add(new VehicleManager());

        for (CreditManager credit:credits) {
            credit.calculate();
        }

    }
}