public class ObjectArray {
    public static void main(String[] args) {
        Student[] arr=new Student[3];//declaring and creating of array of type-"Student", it has memory to store 3 objects of class Student
        //initialising the objects and hence array
        arr[0]=new Student("A",1);
        arr[1]=new Student("B",2);
        arr[2]=new Student("C",3);
        for(Student std: arr){
            System.out.println(std.name+" "+std.age);
        }
    }
}
class Student{
    String name;
    int age;
    Student(String str, int x){
        this.name=str;
        this.age=x;
    }
}
