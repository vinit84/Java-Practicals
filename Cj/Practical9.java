package practical.pkg9;
import java.util.ArrayList;
import java.util.List;
public class Practical9 {
    public static void main(String[] args) {
        List arrayList1 = new ArrayList();
        List arrayList2 = new ArrayList();
        arrayList1.add(5);
        arrayList1.add(4);
        arrayList2.add(3);
        arrayList2.add(2);
        arrayList1.addAll(1,arrayList2);
        System.out.println("arrayList1 = " + arrayList1);
        System.out.println("arrayList2 = " + arrayList2);
        System.out.println("arrayList1.get(2) = " + arrayList1.get(2));
        arrayList1.set(2,10);
        System.out.println("arrayList1.set(2,10) = " + arrayList1);
        arrayList1.remove(2);
        System.out.println("arrayList1.remove(2) = " + arrayList1);
        System.out.println("arrayList1.indexOf(3) = " + arrayList1.indexOf(3));
        System.out.println("arrayList1.size() = " + arrayList1.size());
        arrayList1.clear();
        System.out.println("arrayList.clear()" + arrayList1);
    }    
}
