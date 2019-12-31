public class App{
    public static void main(String[] args) {

        Person banana = new Person("Banana", "Male", 17);
        System.out.println(
            "name = " + banana.name + "\n" +
            "gender = " + banana.gender + "\n" +
            "age = " + banana.age
        );

        System.out.println("");

        Person aple = new Person();
        System.out.println(
            "name = " + aple.name + "\n" +
            "gender = " + aple.gender + "\n" +
            "age = " + aple.age
        );
    }
}

class Person{
    String name;
    String gender;
    int age;

    public Person(){
        this.name = "no name";
        this.gender = "no gender";
        this.age = 0;
    }
    
    public Person(String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}