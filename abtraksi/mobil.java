package abtraksi;

public class mobil extends Kendaraan {
    public mobil(final  String warna){
        super(warna);
    }
    @Override
    void bergerak(){
        System.out.println("Mobil bergerak");
    }

}