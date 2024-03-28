public class Mahasiswa <A, B> {
    A name;
    A alamat;
    B phone;

    public Mahasiswa(A name, A alamat, B phone) {
        this.name = name;
        this.alamat = alamat;
        this.phone = phone;
    }
    
    public void getInfo() {
        System.out.println("Nama: " + name);
        System.out.println("ALamat: " + alamat);
        System.out.println("Number Telepon: " + phone);
    }
}
