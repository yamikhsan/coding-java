import app.App;

public class Main{

    public static void main(String[] args) {
        Application app = new Application();
        System.out.println(app.getName());
        // System.out.println(app.getAge());
    }
}

class Application extends App{

    public String getName(){
        return name;
    }
    
    // public int getAge(){
    //     return age;
    // }

}