
package tugas.pengganti;
import java.util.Scanner;
/**
 *
 * @author ASUS X550IU
 */
public class TugasPengganti {

   
    public static void main(String[] args) {
        Fungsi ojk = new Fungsi();
        Mahasiswa data;
        Scanner sc = new Scanner (System.in);
        int input;
        int in =0;
        int jml;
        do{
            do{
                System.out.println("=========Menu==========");
                System.out.println("1.Masukan data");
                System.out.println("2.Menampilkan data");
                System.out.println("3.Mencari data");
                System.out.println("4.Keluar");
                System.out.print("Masukan pilihan Anda : ");  
                System.out.println("=========Zada Azmi==========");
                input = sc.nextInt();
               
                if(input<=0){
                    System.out.print("Harap pilih menu 1-4");
                }
                else if(input>4){
                    System.out.print("Harap pilih menu 1-4");
                }               
            }while(input>6);
           
            System.out.print("================Zada Azmi================\n\n");
           
            switch(input){
                case 1: do{
                            System.out.print("Jumlah data mahasiswa yang dimasukan [1-100] : ");
                            jml = sc.nextInt();
                            ojk.setINDEX(jml);
                            if(jml>100){
                                System.out.print("\nJumlah data mahasiswa yang dimasukan \nmelebihi kapasitas yang ditentukan\n\n");
                            }
                        }while(jml>100);
                        for(int i = 0; i<jml; i++){
                          
                            data = new Mahasiswa();
                            System.out.println("Data mahasiswa ke- "+(i+1));
                            System.out.print("NIM : ");
                            String nim = sc.next();
                            data.setNim(nim);
                            System.out.print("Nama : ");
                            String nam = sc.next();
                            data.setNama(nam);
                            System.out.print("IPK : ");
                            double ip = sc.nextDouble();
                            data.setIpk(ip);
                            System.out.print("\n");
                            ojk.set(i, data);    
                        }
                        break;
                   
                case 2: System.out.println("=================================");
                        System.out.println("Tampilkan data");
                        System.out.println("1.Semua");
                        System.out.println("2.Sebagian");
                        System.out.println("3.Salah satu");
                        System.out.println("Pilihan Anda : ");
                        System.out.print("\n===================================\n");
                        int pil = sc.nextInt();
                        int ind = ojk.getINDEX();
                        switch(pil){
                            case 1: for(int i = 0; i<ind; i++){
                                        System.out.print("\n===================================\n");
                                        System.out.print("Data mahasiswa"+(i+1)+"\n");
                                        ojk.get(i);
                                    }
                                    break;
                               
                            case 2: System.out.print("data index dari : ");
                                    int idx = sc.nextInt();
                                    System.out.print("sampai index ke : ");
                                    System.out.print("\n===================================\n");
                                    int kidx = sc.nextInt();
                                    
                                    if(idx<kidx){
                                        for(int k=idx; k<=kidx; k++){
                                            System.out.print("Data mahasiswa"+(k+1)+"\n");
                                            ojk.get(k);
                                        }
                                    }

                                    else if(idx>kidx){
                                        for(int z=kidx; z<idx; z++){
                                            System.out.print("Data mahasiswa"+(z+1)+"\n");
                                            ojk.get(z);
                                        }
                                    }

                                    else if(idx==kidx){
                                        System.out.print("Data Mahasiswa"+(kidx+1)+"\n");
                                        ojk.get(kidx);
                                    }

                                    break;
                            case 3: System.out.print("\n===================================\n");
                                    System.out.print("Masukan index yang ingin ditampilkan : ");
                                    int sbg = sc.nextInt();
                                    System.out.print("\n===================================\n");
                                    System.out.print("Data mahasiswa"+(sbg+1)+"\n");
                                    ojk.get(sbg);
                                    break;
                        }

                        break;
                case 3: System.out.println("=================================");
                        System.out.println("Mencari data :");
                        System.out.println("1.Berdasarkan NIM");
                        System.out.println("2.Berdasarkan Nama");
                        System.out.println("3.Berdasarkan IPK");;
                        System.out.print("Pilih Salah satu : ");
                        System.out.print("\n=================Zada Azmi==================\n");
                        int car = sc.nextInt();

                        switch(car){
                            case 1: System.out.print("Masukan NIM mahasiswa yang dicari : ");
                                    String inputNim = sc.next();   
                                    System.out.print("\n===================================\n");
                                    ojk.SearchNim(inputNim);                                    
                                    break;
                               
                            case 2: System.out.print("Masukan NIM mahasiswa yang dicari : ");
                                    String inputNama = sc.next();  
                                    System.out.print("\n===================================\n");
                                    ojk.SearchNama(inputNama);
                                    break;
                            case 3: System.out.print("Masukan IPK mahasiswa yang dicari : ");
                                    String inputIpk = sc.next();     
                                    System.out.print("\n===================================\n");
                                    ojk.SearchIpk(inputIpk);
                                    break;
                        }
                        break;   
                case 4: System.out.println("Terima Kasih");
                        System.exit(0);
                        break;
            }
        }while(in==0);
    }
       
}