package nopbaitap.tuan4.buoi8;

public class Employee extends Person {
    
    double salary = 11000000;


    @Override
    public String toString() {
        String str = "";
        str = "name " + this.name;
        str += "birthday " +this.birthday;
        str += "Salary " + this.salary;

        return str;
    }
}
