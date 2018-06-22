
class Emp_Manager extends Employee{


    public Emp_Manager(){
        System.out.println("Manager");
    }

    public Emp_Manager(String name){
        System.out.println("Manager "+name);
    }
    
    public static void main(String[] args) {
        
        double salary=60000;

        Emp_Manager emp_Manager=new Emp_Manager();
        emp_Manager.calcTax(salary);
        emp_Manager.hadLunch();
 
    }
}