import java.util.Scanner; 
public class siakad11 { 
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  {
    int jmlMhs,jmlMKuliah; 
     
    System.out.print("Masukkan jumlah Mahasiswa : "); 
    jmlMhs = sc.nextInt(); 
    System.out.print("Masukkan jumlah mata kuliah : "); 
    jmlMKuliah = sc.nextInt(); 

    int [][] nilaiMhs = new int [jmlMhs][jmlMKuliah]; 

    for (int i = 0; i < nilaiMhs.length; i++){ 
        System.out.println("Masukkan nilai mahasiswa ke-" + (i+1)); 
        double totalPerSiswa = 0; 
        int jumlah = 0; 
        for (int j = 0; j < nilaiMhs[i].length; j++) { 
            System.out.print("Nilai mata kuliah " + (j+1) + " : "); 
            nilaiMhs[i][j] = sc.nextInt(); 
            totalPerSiswa += nilaiMhs[i][j]; 
            jumlah++;  
        } 
        System.out.println("Nilai rata-rata : " + totalPerSiswa/jumlah); 
    } 
    for(int j = 0; j < jmlMhs; j++){ 
        double totalPerMatkul = 0; 
        int pembagi = 0; 
        for (int i = 0; i < jmlMKuliah; i++){ 
            totalPerMatkul += nilaiMhs[i][j]; 
            pembagi++; 
        } 
        System.out.println("Mata kuliah " + (j+1) + " : " + totalPerMatkul/pembagi); 
    } 
} 
}
}