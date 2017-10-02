package algocoba1;

public class AlgoCoba1 {
    public static void main(String[] args) {
        
        ArrayLinearList x = new ArrayLinearList(8);
        //ArrayLinearList d = new ArrayLinearList(8);
        Object[] f = new Object[20];
        //pengecekan panjang array
        System.out.println("ukuran awal x\t\t\t"+x.element.length);
        //pengecekan apakah array kosong
        System.out.println("apakah x kosong?\t\t"+x.isEmpty());
        //menambahkan beberapa data kedalam array
        x.add(0, "a");
        x.add(1, "b");
        x.add(2, "c");
        x.add(3, "d");
        x.add(4, "e");
        x.add(5, 1);
        x.add(6, 2);
        x.add(7, 3);
        //menampikan isi array
        System.out.println("isi awal\t\t\t"+x.toString());
        //pengecekan array yang terisi
        System.out.println("array yang terisi\t\t"+x.size());
        //pengecekan array di index 3
        System.out.println("isi array di index 3\t\t"+x.get(3));
        //pengecekan array yang berisi huruf b
        System.out.println("no index dari huruf b\t\t"+x.indexOf("b"));
        //menghapus array di index 2
        x.remove(2);
        System.out.println("isi stlh index 2 d hapus\t"+x.toString());
        System.out.println("isi index 2 stlh d hapus\t"+x.get(2));
        //menambahkan data ke array di index 2
        x.add(2, "f");
        System.out.println("isi index 2 stlh d tambah\t"+x.get(2));
        System.out.println("isi stlh index 2 d tambah F\t"+x.toString());
        x.add(8, 6);
        x.add(9, 8);
        x.add(10, 7);
        //clone array tapi masih belum sesuai harapan
        System.out.println("Setelah di clone ke Object F\t"+x.clone(f));
        System.out.println(x.size);
        System.out.println("isi stlh d tambah 3 array baru\t"+x.toString());
        //remove range array
        x.removeRange(0, 2);
        System.out.println("isi stlh d remove range\t\t"+x.toString());
        System.out.println("jumlah array sebelum di potong\t"+x.element.length);
        //memotong panjang array sesuai dengan array yang terisi
        x.trimToSize();
        System.out.println("jumlah array Setelah di potong\t"+x.element.length);
        //menentukan panajang array
        x.setSize(4);
        System.out.println("isi array stlh d setSize 4\t"+x.toString());
        //menghapus semua isi array
        x.clear();
        System.out.println("isi array setelah d clear\t"+x.toString());
    }
}
