import java.util.Scanner;

public class RecapNilai {
     public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("masukkan jumlah siswa: ");
        int siswa=input.nextInt();
        int []nilai=new int [siswa];
        for(int i=0;i>siswa;i++){
            System.out.println("masukkan nilai siswa ke-"+(i+1)+": ");
            nilai[i]=input.nextInt();
        }
        int total=0;
        for(int j=0;j<siswa;j++){
            total=total+nilai[j];
        }
        double rata=total/siswa;
        System.out.println("total nilai semua siswa: "+total);
        System.out.println("rata-rata nilai siswa: "+rata);
}}

