package algocoba1;

public class AlgoCoba1 {
    public static void main(String[] args) {
        
        ArrayLinearList x = new ArrayLinearList(8);
        System.out.println("ukuran awal x\t\t\t"+x.element.length);
        System.out.println("apakah x kosong?\t\t"+x.isEmpty());
        x.add(0, "a");
        x.add(1, "b");
        x.add(2, "c");
        x.add(3, "d");
        x.add(4, "e");
        x.add(5, 1);
        x.add(6, 2);
        x.add(7, 3);
        System.out.println("isi awal\t\t\t"+x.toString());
        System.out.println("array yang terisi\t\t"+x.size());
        System.out.println("isi array di index 3\t\t"+x.get(3));
        System.out.println("no index dari huruf b\t\t"+x.indexOf("b"));
        x.remove(2);
        System.out.println("isi stlh index 2 d hapus\t"+x.toString());
        System.out.println("isi index 2 stlh d hapus\t"+x.get(2));
        x.add(2, "f");
        System.out.println("isi index 2 stlh d tambah\t"+x.get(2));
        System.out.println("isi stlh index 2 d tambah F\t"+x.toString());
        x.add(8, 6);
        x.add(9, 8);
        x.add(10, 7);
        System.out.println(x.size);
        System.out.println("isi stlh d tambah 3 array baru\t"+x.toString());
        System.out.println("jumlah array sebelum di potong\t"+x.element.length);
        x.trimToSize();
        System.out.println("jumlah array Setelah di potong\t"+x.element.length);
        x.setSize(4);
        System.out.println("isi array stlh d setSize 4\t"+x.toString());
        x.clear();
        System.out.println("isi array setelah d clear\t"+x.toString());
    }
}
