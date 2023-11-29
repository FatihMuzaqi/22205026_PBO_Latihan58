
package oop;
class Bilangan {

    protected int x;
    protected int y;
    
    public Bilangan(){
       this.x = 3;
       this.y = 4;
    }
    
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}

class JumlahBilangan extends Bilangan {
    
    public void tampilHasilJumlah(){
        System.out.println("Hasil Penjumlahan = " + (getX() + getY()));
    }
}

class SelisihBilangan extends Bilangan{
    
    public void tampilSelisih(){
        System.out.println("Hasil Selisih " + getX()+ " - " + getY() + " = " + (getX() - getY()));
    }
}

public class Latihan58_TambahKurang {
    
    public static void main(String[] args) {
        //Membuat objek JumlahBilangan
        JumlahBilangan jm = new JumlahBilangan();
        jm.tampilHasilJumlah();
        
        //Membuat objek Selisih Bilangan
        SelisihBilangan sb = new SelisihBilangan();
        sb.tampilSelisih();
    }
}
