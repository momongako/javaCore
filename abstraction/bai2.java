package abstraction;

import java.util.ArrayList;
import java.util.List;
//đếm xem có bao nhiêu số thuận nghịch
public class bai2 {
    public static int DEC_10 = 10;
    public static void main(String[] args) {
        //đếm có bao nhiếu số thuận nghịch
       int count =0 ;
        for (int i = 100000; i < 1000000; i++) {
          if(isThuanNghich(i)){
            //System.out.println(i);
            count++;
          }
        }
        System.out.println("tổng các số thuận nghịch 6 chữ số : "+ count);
    }
    public static boolean isThuanNghich(int n){
        //tạo danh sách để lưu
            List<Integer> listNumber = new ArrayList<Integer>();
            //kiểm tra số thuận ngịch
            do{
              listNumber.add(n%DEC_10);
              n = n/DEC_10;
            }while(n>0);
            int size = listNumber.size();
            for (int i = 0; i <(size/2); i++) {
                if (listNumber.get(i)!=listNumber.get(size - i - 1)) {
                    return false;
                }
            }
            return true;
    }
}
