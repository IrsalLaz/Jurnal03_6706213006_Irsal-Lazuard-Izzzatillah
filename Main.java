import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nip, nama, kelas;
        int pilihan, subPilihan;
        SinglyLinkedList<Pegawai> linkedList = new SinglyLinkedList<>();
        
        //data default untuk test
        linkedList.insertAtFront(new Pegawai("14515118", "Yulis", "Design"));
        linkedList.insertAtBack(new Pegawai("14568845", "Ardi", "IT"));


        String yesOrNo = "";
        boolean looping = true;

        while (looping) {
        //Operasi yang bisa dijalankan berupa Input, hapus, dan cetak data
        System.out.println("Pilih menu: \n1. Input data\n2. Hapus data\n3. Tampilkan data");
        pilihan = in.nextInt();
        if(pilihan == 1){
            System.out.println("Masukan NIP, Nama, dan divisi");
            nip = in.next();
            nama = in.next();
            kelas = in.next();
            
            Pegawai masukan =(new Pegawai(nip, nama, kelas));
            System.out.println("1. Didepan\n2. Belakang");
            subPilihan = in.nextInt();
            if(subPilihan == 1){
                linkedList.insertAtFront(masukan);
            }
            else if(subPilihan == 2){
                linkedList.insertAtBack(masukan);
            }
        
        }else if(pilihan == 2){
            System.out.println("1. Didepan\n2. Belakang");
            subPilihan = in.nextInt();
            if(subPilihan == 1){
                linkedList.removeFromFront();
            }
            else if(subPilihan == 2){
                linkedList.removeFromBack();
            }
        }
        else if(pilihan == 3){
            linkedList.print();
        }
        
        else {
            System.out.println("pilihan tidak tepat");
        }

            System.out.println("Apakah mau lanjut?\n(y/n)");
            yesOrNo = in.next();
            if (yesOrNo.equalsIgnoreCase("y")) {
                looping = true;                
            }
            else{
                looping = false;
            }
        }
    }
    
}
