import java.util.Arrays;
import java.util.Scanner;

public class UKLsulit3 {
     public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("masukkan jumlah angka dalam array");
        int jumlah = input.nextInt();

        int [] angka = new int [jumlah];
        boolean[] sudahDihitung = new boolean[jumlah];


        for(int i=0; i< jumlah; i++){ 

            System.out.println("angka ke-" + (i + 1) + ": ");
            angka [i]= input.nextInt();
            
        }
        
        System.out.println("Array: " + Arrays.toString(angka)); 

        for (int i = 0; i< jumlah; i++){
            if (!sudahDihitung[i]) { 
                int hitung = 1;
                for (int j = i + 1; j < jumlah; j++) {
                    if (angka[i] == angka[j]) {
                        hitung++;
                        sudahDihitung[j] = true; 
                    }
        }
        System.out.println(angka[i] + " muncul " + hitung + " kali");

        
}
}
}

}
