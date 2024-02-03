public class constructeroops {
    public static void main(String args[]){
        Student s1 = new Student("Vaibhav");
        Student s2 = new Student();
        Student s3 = new Student(72);
        s1.roll = 72;
        s1.marks[0] = 90;
        s1.marks[1] = 80;
        s1.marks[2] = 100;
        for(int i=0;i<3;i++){
            System.out.println(s1.marks[i]);
        }
        Student s4 = new Student(s1); //copy
        // Student s4 = new Student("vaibhav" , 72)  This give us error because there are no constructer for name and rollno.
        System.out.println(s1.name);
        System.out.println(s3.name);
        System.out.println(s2.roll);
        System.out.println(s3.roll);
        System.out.println(s4.roll);
        System.out.println(s4.name);
        s1.marks[0] = 100; //this will change marks in s4 if it is shalow constructor 
        for(int i=0;i<3;i++){    // if constructor is Deep then it will not change
            System.out.println(s4.marks[i]);
        }
    }
    
}
class Student{
    String name;
    int roll;
    int marks[];

    Student(){
        marks = new int[3];
        System.out.println("Constructer 1 is called"); // Type :- Non-parameterized
    }
    Student(String name){       // It creates a constructer
        marks = new int[3];
        System.out.println("Constructer 2 is called");//Type:-Parameterized  
        this.name = name;                                   //This is called constructer overloading
    }
    // Student(Student s1){   // Shallow copy constructor
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0;i<3;i++){
            this.marks[i] = s1.marks[i];
        }
    }
    Student(int roll){
        marks = new int[3];
        System.out.println("Constructer 3 is called");           
        this.roll = roll;
    }
}
