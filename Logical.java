

class Logical{
    public static void main(String[] args) {
        
        int marks=60;

        boolean d= marks<75 && marks>=50;
        System.out.println(d);
        // T T=T
        // T F=F

        boolean d2= marks<75 ||  marks>=150;
        System.out.println(d);
        // T T=T
        // T F=T
        // F F=F

        System.out.println(!d2);
    }
}