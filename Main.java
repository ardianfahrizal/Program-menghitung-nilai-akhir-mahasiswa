public class Main {
    public static void main(String[] args) {
        uad si = new uad();
        mahasiswa mhs = new mahasiswa(2100018410, "Ardian Muhammad Fahrizal");
        matakuliah mat = new matakuliah("Pemrograman Berorientasi Objek");
        nilai ni = new nilai(85, 90);
        ni.hitungNilai();
        si.isiData();
        si = mhs;
        si.isiData();
        si = mat;
        si.isiData();
        si = ni;
        si.isiData();
    }
}