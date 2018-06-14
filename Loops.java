
class Loops {
    public static void main(String[] args) {

        /*
         * int a=2; // a=a+1; System.out.println(a++); System.out.println(a);
         * 
         * System.out.println(++a); System.out.println(a);
         * 
         * int b=1; int x=b+ ++b +b + b++ + ++b; System.out.println(x);
         * 
         * // c-- --c int c=2; int y=c+ --c +c - c-- + --c + c++; System.out.println(y);
         */

        int i = 1;
        for (; i <= 20; i++) {
            System.out.println(i);
        }
        System.out.println(i + " ====");

        int i2 = 1;
        for (; i2 <= 20; ++i2) {
            System.out.println(i2);
        }
        System.out.println(i2 + " ====");

        for (i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " EVEn");
            } else
                System.out.println(i + " ODD");

        }


        // prime
        int z=19;
        int count=0;

        for(i=2;i<=z;i++){
           
            if(z%i==0){
                count++;
            }
        }

        if(count==1){
            System.out.print("Prime");
        }
        else
        System.out.print("Not prime");
        

    }
}