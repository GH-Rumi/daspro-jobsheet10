import java.util.Scanner;

public class BioskopWithScanner11 {
    public static void main(String[] args) {
        String[][] penonton = new String[4][2];
        Scanner sc = new Scanner(System.in);
        String nama, next;
        int baris, kolom, menu;

        System.out.println("Menu 1: Input data penonton");
        System.out.println("Menu 2: Tampilkan daftar penonton");
        System.out.println("Menu 3: Exit");

        while (true) {
            System.out.print("Masukkan nomor pilihan menu: ");
            menu = sc.nextInt();
            if (menu == 1) {
                while (true) {
                sc.nextLine();
                System.out.print("Masukkan nama: ");            
                nama = sc.nextLine();        
                System.out.print("Masukkan baris: ");            
                baris = sc.nextInt();      
                System.out.print("Masukkan kolom: ");           
                kolom = sc.nextInt();
                sc.nextLine();
                if (penonton[baris-1][kolom-1] != null) {
                    System.out.println("Kursi ke-" + kolom + " dari baris ke-" + baris + " sudah ditempati, silahkan pilih ulang!");
                } else {
                    penonton[baris-1][kolom-1] = nama;
                    break;
                }
                break;
                } continue;
            } else if (menu == 2) {
                for (int i = 0; i < penonton.length; i++) {
                    for (int s = 0; s < penonton[i].length; s++) {
                        if (penonton[i][s] != null) {
                            System.out.println("Penonton dari baris ke-" + (i+1) + " kursi ke-" + (s+1) + " adalah " + penonton[i][s]);
                        } else {
                            System.out.println("Penonton dari baris ke-" + (i+1) + " kursi ke-" + (s+1) + " adalah ***");
                        }
                    }
                } continue;
            } else if (menu == 3) {             
                System.out.println("Program selesai, terimakasih");
                break;
            } else {
                System.out.println("Input invalid!");
                break;
            }
        }           
    }
}
