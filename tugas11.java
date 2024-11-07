import java.util.Scanner; 
public class tugas11 { 
    public static void main(String[] args) { 
        Scanner rumi = new Scanner(System.in); 
 
        double toSem = 0; 
        int[][] hasil = new int[10][6]; 
 
        for (int i = 0; i < 10; i++) { 
            System.out.println("Dari responden yang ke-" + (i+1)); 
            for (int j = 0; j < 6; j++) { 
                System.out.print("Untuk pertanyaan ke-" + (j+1) + ": "); 
                hasil[i][j] = rumi.nextInt(); 
                if (hasil[i][j] > 5 && hasil[i][j] < 1) { 
                    System.out.println("Input invalid! Silahkan input ulang dengan nilai 1-5"); 
                    break; 
                } 
            } 
        } 
        for (int i = 0; i < 10; i++) { 
            double raRes = 0; 
            for (int j = 0; j < 6; j++) { 
                raRes += hasil[i][j]; 
                toSem += hasil[i][j]; 
            } System.out.println("Rata rata dari responden yang ke-" + (i+1) + " : " + raRes/6); 
        } 
        for (int j = 0; j < 6; j++) { 
            double raPer = 0; 
            for (int i = 0; i < 10; i++) { 
                raPer += hasil[i][j]; 
            } System.out.println("Rata rata dari pertanyaan yang ke-" + (j+1) + " : " + raPer/10); 
        } System.out.println("Rata rata untuk keseluruhan adalah: " + toSem/60); 
    } 
} 