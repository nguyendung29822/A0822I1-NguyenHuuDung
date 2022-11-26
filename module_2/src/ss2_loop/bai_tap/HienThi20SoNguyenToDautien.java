package ss2_loop.bai_tap;

public class HienThi20SoNguyenToDautien {
    public static void main(String[] args) {
        int numbers =20;
        int count = 0;
        int N =2;
        while (count<numbers){
            int temp =1 ;
            for(int i =2;i<=Math.sqrt(N);i++){
                if(N%i==0){
                    temp =0;
                }
            }
            if(temp==1){
                System.out.println(N+"");
                count ++;
            }
            N++;
        }
    }
}
