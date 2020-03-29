import java.util.ArrayList;
import java.util.List;

public class CalculateNalog {

    List<Double> nalogs (double input){
        List<Double> list = new ArrayList<>();
        double fszn34 = input*0.34;
        double fszn1 = input*0.01;
        double belgosstrah06 = input*0.6/100;
        double podohodNalog13 = input*13/100;
        double profsojuz1 = input*1/100;
        double onHand = input - fszn1 - fszn34 - belgosstrah06 - podohodNalog13 - profsojuz1;
        list.add(input);
        list.add(fszn34);
        list.add(fszn1);
        list.add(belgosstrah06);
        list.add(podohodNalog13);
        list.add(profsojuz1);
        list.add(onHand);
        return list;
    }
}
