import java.util.*;  

 class New {
 public static void main(String args[]){
System.out.println("Hello World");
Scanner in = new Scanner(System.in);  
          System.out.print("Enter your name: ");  
  try{
          String name = in.nextLine();  
          System.out.println("Name is: " + name); 
  }catch(Exception e){
    System.out.println(e);
  }
      in.close();     
     
 }
}

