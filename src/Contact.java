import java.util.ArrayList;

public class Contact {
    public String nama;
    public String nomor;
    private int loop;
    private ArrayList<String> contact;

    public Contact(String nama, String nomor)
    {
        this.nama = nama;
        this.nomor = nomor;
        this.contact = new ArrayList<>();
        contact.add(nama);
        contact.add(nomor);
        this.loop = contact.size();
    }

    public void tambahContact(String nama, String nomor)
    {
        this.nama = nama;
        this.nomor = nomor;
        contact.add(nama);
        contact.add(nomor);
        this.loop = contact.size();
    }

    String getNama()
    {
        return this.nama;
    }

    String getNomor()
    {
        return this.nomor;
    }

    // Menampilkan semua list kontak
    public void displayContacts() {
        for (int i = 0; i < loop; i+=2) {
            System.out.println("Nama : " + contact.get(i));
            System.out.println("No : " + contact.get(i+1));
        }
    }


    // Mencari kontak dengan nama
    public void showContactByName(String nama){
        for (int i = 0; i < loop; i+=2) {
            if(nama==contact.get(i)){
                System.out.println("Nama : " + contact.get(i));
                System.out.println("Nomor : " + contact.get(i+1));
            }
        }
    }

    // Mencari kontak dengan nomor
    public void showContactByNoHP(String no){
        for (int i = 0; i < loop; i+=2) {
            if(no==contact.get(i+1)){
                System.out.println("Nama : " + contact.get(i));
                System.out.println("Nomor : " + contact.get(i+1));
            }
        }
    }
}
