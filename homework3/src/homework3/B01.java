package homework3;
import java.util.*;

class B01{
            int num1;
            int num2;
            int num3;

           void input(){
                   Scanner s=new Scanner(System.in);
                 System.out.print("첫번쨰 숫자를 입력하세요");
                 this.num1=s.nextInt();
                 System.out.print("두번쨰 숫자를 입력하세요");
                 this.num2=s.nextInt();
                 System.out.print("세번쨰 숫자를 입력하세요");
                 this.num3=s.nextInt();

                print();

           }

           void print(){
                 int max_num;
                 int min_num;

                 if(this.num1<this.num2){
                   max_num=this.num2;
                   min_num=this.num1;

                 }
                 else {
                     max_num=this.num1;
                      min_num=this.num2;
                 }

                 if(max_num<this.num3)
                       max_num=this.num3;
                 if(min_num>this.num3)
                       min_num=this.num3;


                   System.out.print("가장큰수는"+max_num+"가장작은수는"+min_num);

           }
           public static void main(String[] args){

               new B01().input();

               }
}


