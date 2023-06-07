public class Main {
    public static void main(String[] args) throws Exception {
        Cellphone cp = new Cellphone("Samsong", "S23");
        cp.powerOn();
        cp.powerOff();

        // fungsi tidak bisa karena hp mati
        cp.volumeUp();
        cp.sisaPulsa();

        // Setelah hp dihidupkan fungsi bisa digunakan
        cp.powerOn();
        cp.volumeDown();
        cp.getVolume();
        cp.setVol(10);
        cp.getVolume();

        // Top Up pulsa 
        cp.topUpPulsa(70000);
        cp.sisaPulsa();

        // Menambahkan kontak dengan Array List
        Contact contact = new Contact("DAPA", "083121234321");
        contact.tambahContact("RIAN", "085672187721");
        contact.tambahContact("MAIL", "0815128764121");
        contact.tambahContact("OPET", "0891234676311");
        contact.tambahContact("REMBO", "083233113325");
        contact.displayContacts();

        // Mencari Contact dengan Nama dan No
        contact.showContactByName("DAPA");
        contact.showContactByNoHP("0815128764121");

    }
}
