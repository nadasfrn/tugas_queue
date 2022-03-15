import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class tugasqueue {
    public static void main(String[] args) throws Exception {

        Queue<String> pelanggan = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        boolean lanjut = true;
        int pil;
        String y, nama; 

        while(lanjut) {
            System.out.println("\n=================================");
            System.out.println("      MENU ANTRIAN PELANGGAN     ");
            System.out.println("=================================");
            System.out.println("1. EnQueue Data Pelanggan");
            System.out.println("2. DeQueue Data Pelanggan");
            System.out.println("3. Tampil Data Queue Pelanggan");
            System.out.println("4. Cek kekosongan Data Queue");
            System.out.println("5. Antrian Pelanggan Paling Depan");
            System.out.println("=================================\n");
                
            System.out.print("Inputkan pilihan menu (1-7) -> ");
            pil = input.nextInt();

            switch(pil) {
                case 1:
                System.out.print("\nInputkan Nama Pelanggan: ");
                nama=input.next();
                pelanggan.add(nama);
                System.out.println("Antrian :  "+pelanggan);
                System.out.println("");
                break;

                case 2:
                System.out.println("\nPelanggan yang sudah keluar: "+pelanggan.poll());
                System.out.println("");
                break;

                case 3:
                System.out.println("\nData Antrian Pelanggan : "+pelanggan);
                System.out.println("");
                break;

                case 4:
                boolean cek_array = pelanggan.isEmpty();
                if(cek_array) {
                    System.out.println("\n-> Data antrian pelanggan masih kosong");
                }
                else {
                    System.out.println("-> Data antrian pelanggan sudah terisi");
                    System.out.println("   Data antrian pelanggan : " +pelanggan);
                    System.out.println("");
                }
                break;

                case 5:
                System.out.println("Pelanggan yang akan dilayani selanjutnya : "+pelanggan.peek());
                System.out.println("");
                break;

                default:
                System.out.println(":::Maaf, inputan salah! Silahkan input angka yang benar (1-5):::");
            }
            System.out.print("Apakah Anda ingin melanjutkan [y/n]? -> ");
            y = input.next();
            lanjut = y.equalsIgnoreCase("y");
        }
        System.out.println("\n==<Terima kasih telah berkunjung>==\n");
    }
}