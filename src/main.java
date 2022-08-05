import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap so luong so nguyen to dau tien can in ra");
        int number= scanner.nextInt();
                int count=0;
        int N=2;
        while (count<number){
//            kiem tra xem n co phai so nguyen to khong
           boolean check=true;
            for (int i = 2; i*i <=N ; i++) {
                if(N%i==0){
                    check=false;
                    break;
            }
            }
            if (check){
                System.out.println(N);
                count++;
            }
            N++;
        }
    }
}
