public class Student { 
    static int a = 10; 
    int b = 20; 
    void simpleDisplay() 
    { 
        System.out.println(a); 
        System.out.println(b); 
    } 
  
    static void staticDisplay() 
    {  
      System.out.println(a);  
    } 
    public static void main(String[] args) 
    { 
        Student obj = new Student(); 
        obj.simpleDisplay(); 
        staticDisplay(); 
    } 
}