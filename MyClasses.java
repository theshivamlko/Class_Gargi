 

class MyClasses{


    // MyClasses.main();


    static{
        System.out.println("STATIC");
    }

    public static void main(String[] args) {
        
        System.out.println("MAIN");
        Cars cars1=new Cars();

        Cars cars2=new Cars();

        Cars cars3=new Cars("RED");


        System.out.println(cars1.maxSpeed+" "+cars2.maxSpeed);
        
        System.out.println(cars1.color+" "+cars2.color+" "+cars3.color);

        cars1.color="BLACK";
        System.out.println(cars1.color+" "+cars2.color);

        cars2.seats=6;
        System.out.println(cars1.seats+" "+cars2.seats);


        System.out.println(cars1+" "+cars2);
        cars1.printColor();
        cars2.printColor();

        System.out.println(Cars.companyName);

        System.out.println(cars1.companyName+" "+cars2.companyName);
        Cars.companyName="BMW";
        System.out.println(cars1.companyName+" "+cars2.companyName);


         
    }

}