public class Oopsclassobj{
    public static void main(String args[]){
        Pen p1 = new Pen(); // creted a pen object called p1
        p1.setcolor("Blue");
        System.out.println(p1.color);
        p1.settip(5);
        System.out.println(p1.tip);
        p1.color = "Black";
        System.out.println(p1.color);
        p1.tip = 8;
        System.out.println(p1.tip);

        Car c1 = new Car();     // new keyword create a space in memory to store properties in memory
        c1.setname("Alto 800");
        System.out.println(c1.name);
        c1.telltype("Hatchback");
        System.out.println(c1.type);
        Car c2 = new Car(); 
        c2.setname("Brezza");
        System.out.println(c2.name);
        c2.telltype("Crossover");
        System.out.println(c2.type);
        c1.setname("Alto");
        System.out.println(c1.name);
        System.out.println(c1.type);
        System.out.println(c2.name);
    }
}
class Pen{
    int tip;
    String color;
    void setcolor(String newcolor){
        color = newcolor;
    }
    void settip(int newtip){
        tip = newtip;
    }
}
class Car{
    String name;
    String type;
    void setname(String newname){
        name = newname;
    }
    void telltype(String newtype){
        type = newtype;
    }
}
