import java.util.*; 

  class B04{ 
           double money; 
           
 
           void input(){ 
                Scanner s=new Scanner(System.in);              
                System.out.print("연봉을 원단위로 입력하세요"); 
                 this.money=s.nextInt(); 
             
                print(); 

 
           } 

 
        void print(){ 
             double tax;
             if(this.money<10000000)
              tax=this.money*0.95;
              
              else if(this.money>=10000000&&this.money<40000000)
              tax=this.money*1.9;
              
              else if(this.money>=40000000&&this.money<80000000)
              tax=this.money*2.8;
              
              else tax=this.money*3.7;

	      System.out.print("연봉금액에 대한 소득세는"+(int)tax+"입니다");
         } 
         
           public static void main(String[] args){ 

   
			new B04().input(); 

 
              } 
 } 
 
 
  
