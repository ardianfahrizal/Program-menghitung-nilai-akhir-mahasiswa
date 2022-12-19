public class matakuliah extends uad{
    public matakuliah(String matkul){
        super(matkul);
    }
    @Override
    public void isiData(){
        System.out.println("Mata Kuliah : "+matkul);
    }
}