package homework3;

import java.util.*;
class B02{

             double pyung_area;

           void input(){
                 Scanner s=new Scanner(System.in);
                 System.out.print("아파트 분양 면적(제곱미터)을 입력하시오");
                 double m2_area=s.nextDouble();

                this.pyung_area=m2_area/3.305;

                print();

           }

           void print(){
                   System.out.printf("아파트 평형은 %.1f 입니다", this.pyung_area);

                  if(this.pyung_area<15)
                  System.out.print("소형 아파트입니다");

                    else if(this.pyung_area>=15&&this.pyung_area<30)
                     System.out.print("중소형 아파트입니다");


                        else if(this.pyung_area>=30&&this.pyung_area<50)
                         System.out.print("중형 아파트입니다");

                         else System.out.print("대형 아파트입니다");
           }


           public static void main(String[] args){

           new B02().input();

           }

}
