public class HRD {
    String Name;
    int age;
    int salary;
    String sex;

    public HRD(String Name, int age, int salary, String sex) {
        this.Name = Name;
        this.age = age;
        this.salary = salary;
        this.sex = sex;
    }

    public HRD() {
    }

    public void printHRD() {
        System.out.printf("Name=%s, age=%d, salary=%d, sex=%s\n" , Name , age , salary , sex);
    }
}