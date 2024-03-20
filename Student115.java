public class Student115 {

    String name="shilpa";
    int age=19;
    String month;
    int date;
    int year;

    public Student115(int date, String month, int year) {
        this.date=date;
        this.month=month;
        this.year=year;
    }

    public void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }

    public void read(){
        System.out.print("Date of birth of the Student is ");
        System.out.print(date +"/" + month+"/"+year);
    }

    public static void main(String[] args){
        Student115 s = new Student115(16, "August", 2004);
        s.display();
        s.read();
    }
}
