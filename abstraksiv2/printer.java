package abstraksiv2;

public class printer implements cetak {
    @Override
    public void print(){
        System.out.println("Mencetak...");

    }
    @Override
    public void sccan(){
        System.out.println("memindai....");

    }
}