
package algocoba1;

public class coba {

    public static void main(String[] args) {
        ArrayLinearList x = new ArrayLinearList();
        x.add(0, 0);
        x.add(1, 1);
        x.add(2, 2);
        x.add(3, 3);
        x.add(4, 4);
        System.out.println(x.size);
        x.setSize(2);
        System.out.println(x.size);
        System.out.println(x.toString());
        System.out.println(x.element.length);
//        x.clear();
        System.out.println(x.toString());
        x.trimToSize();
        System.out.println(x.toString());
        System.out.println(x.element.length);
        System.out.println(x.element2.length);
    }
}