// Get :- Use to return value
// Set :- Use to set value
// this :- It is a keyword refer to current object
// getset both also work for private access modifier
public class Getset {
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setcolor("Red");
        p1.settip(2);
        System.out.println(p1.getcolor());
        System.out.println(p1.gettip());
    }
}
class Pen{
    private String color;
    private int tip;
    void setcolor(String color){
        this.color = color;
    }
    void settip(int tip){
        this.tip = tip;
    }
    String getcolor(){
        return this.color;
    }
    int gettip(){
        return this.tip;
    }
}
