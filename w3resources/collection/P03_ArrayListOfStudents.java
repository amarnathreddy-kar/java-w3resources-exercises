package w3resources.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class P03_ArrayListOfStudents {

    public static void main(String[] args) {

        //creating user-defined class objects
        Student s1 = new Student(101, "Keethan", 4);
        Student s2 = new Student(102, "Nuthan", 3);
        Student s3 = new Student(103, "Amar", 33);

        //adding Students class objects to the list
        List<Student> student = new ArrayList<Student>();
        student.add(s1);
        student.add(s2);
        student.add(s3);


        //getting iterator
        Iterator itr = student.iterator();

        //traversing elements of ArraysList (Student Objects)
        while(itr.hasNext()){
            Student st = (Student)itr.next();
            System.out.println(st.getRollNbr()+" | "+st.getName()+" | "+st.getAge());
        }
    }
}
