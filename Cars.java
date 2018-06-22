
class Cars {

    int wheel = 4;
    int maxSpeed = 300;
    String color = "WHITE";
    int seats = 4;
    private boolean musicPlayer = true;

    static String companyName = "Maruti";

    public Cars() {

    }

    public Cars(String color) {
        this.color = color;
    }

    public void changeGear() {

    }

    public void reverse() {

    }

    public void printColor() {
        System.out.println(color + " OF " + this);
    }
}