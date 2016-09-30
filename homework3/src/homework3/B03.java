package homework3;

import java.util.*;
class B03{

             int month,day;
             int day_count;

             void input(){
                 Scanner s=new Scanner(System.in);
                 System.out.print("월을 입력하시오");
                 this.month=s.nextInt();

                  System.out.print("일을 입력하시오");
                  this.day=s.nextInt();

                  if(this.month>12)
                  System.out.print("잘못입력하셨습니다");

                  else if(this.day>31)
                  System.out.print("잘못입력하셨습니다");

                else print();

           }

           void print(){

                  for(int i=1;i<this.month;i++){
                          if(i==2)
                          this.day_count+=28;
                          
                          else if(i==4)
                          this.day_count+=30;
                        
                          else if(i==6)
                          this.day_count+=30;
                         
                          else if(i==9)
                          this.day_count+=30;
                        
                          else if(i==11)
                          this.day_count+=30;

                         else this.day_count+=31;

                  }

                  this.day_count+=this.day;

                 System.out.print("이 날짜는 1년중"+this.day_count+"번쨰 날에 해당됩니다");

           }


           public static void main(String[] args){

           new B03().input();

           }

}
