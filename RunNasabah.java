import java.util.ArrayList;

public class RunNasabah {
    public static void main(String[] args) {
        ArrayList<Nasabah> nasabah = new ArrayList<>();

        nasabah.add(new Nasabah("Azalia", "Sakila"));
        nasabah.add(new Nasabah("Aura", "Aulia"));
        nasabah.add(new Nasabah("Lara", "Juliana"));

        nasabah.get(0).setAccount(new Account(200000));
        nasabah.get(1).setAccount(new Account(300000));
        nasabah.get(2).setAccount(new Account(100000));

        for (int i = 0; i < nasabah.size(); i++) {
            System.out.println("Pemilik " + (i + 1));
            System.out.println("Nama Depan : " + nasabah.get(i).getFirstname());
            System.out.println("Nama Belakang  : " + nasabah.get(i).getLastname());
            System.out.println("Saldo   : Rp " + nasabah.get(i).getAccount().getBalance());
            System.out.println();
        }
    }
}