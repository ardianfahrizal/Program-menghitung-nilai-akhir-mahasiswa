public class nilai extends uad{
    double nilaiAkhir = 0.0;
    char angka;

    public nilai(double uts, double uas){
        super(uts, uas);
    }

    public void hitungNilai(){
        nilaiAkhir = (uts+uas)/2;

        if(nilaiAkhir>80)
            angka = 'A';
        else if(nilaiAkhir>70)
            angka = 'B';
        else if(nilaiAkhir>60)
            angka = 'C';
        else
            angka = 'D';
    }
    @Override
    public void isiData(){
        System.out.println("Nilai UTS : "+uts);
        System.out.println("Nilai UAS : "+uas);
        System.out.println("Nilai Akhir : "+nilaiAkhir);
        System.out.println("Angka Predikat : "+angka);
    }
}
