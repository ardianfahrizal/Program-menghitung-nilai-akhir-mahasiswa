public class mahasiswa extends uad{
    public mahasiswa(int nim, String nama){
        super(nim, nama);
    }
    @Override
    public void isiData(){
        System.out.println("Nim : "+nim);
        System.out.println("Nama : "+nama);
    }
}