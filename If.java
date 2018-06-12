import javax.lang.model.util.ElementScanner6;

class If{

    public static void main(String[] args) {
        

        int marks=60;

        if(marks>75)
        {
          System.out.println("First");  
        }
        else{
            System.out.println("Second");  
        }



        marks=39;

        if(marks>75)
        {
          System.out.println("First");  
        }
        else if(marks<75 && marks >=60){
            System.out.println("Second");  
        }
        else if(marks<60 && marks >=40){
            System.out.println("Third");  
        }
        else if(marks<40){
            System.out.println("Failed");              
        }



        int n=11;

        if(n%2==0)
        System.out.println("Even");
        else
            System.out.println("Odd");   
            
            
    }
}