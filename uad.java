public class uad {
    int nim;
    String nama;
    String matkul;
    double uts;
    double uas;
    public uad(){}

    public uad(int nim, String nama){
        this.nim = nim;
        this.nama = nama;
    }
    public uad(String matkul){
        this.matkul = matkul;

    }
    public uad(double uts, double uas){
        this.uts = uts;
        this.uas = uas;
    }
    public void isiData(){
        System.out.println("Sistem Akademik");
        System.out.println("----------------------------");
    }
}
