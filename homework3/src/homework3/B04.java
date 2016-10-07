import java.util.*; 

  class B04{ 
           int mobey; 
           
 
           void input(){ 
                Scanner s=new Scanner(System.in);              
                System.out.print("연봉을 원단위로 입력하세요"); 
                 this.money=s.nextInt(); 
             
                print(); 

 
           } 

 
        void print(){ 
             int tax;
             if(this.money<10000000)
              tax=this.money*(9.5/100);
              
              else if(this.money>=10000000&&this.money<40000000)
              tax=this.money*(19/100);
              
              else if(this.money>=40000000&&this.money<80000000)
              tax=this.money*(28/100);
              
              else tax=this.money*(37/100);
         } 
         
           public static void main(String[] args){ 

 
               new B04().input(); 

 
              } 
 } 
 
 
  
