import java.util.*;

 class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }

}

class StudentSort implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int c;
        // cannot resolve this getCgpa method because double
        // class in file _23JavaInstanceofKeyword.java
        c = Double.compare(o2.getCgpa(),(o1.getCgpa()));
        if (c == 0)
            c = o1.getFname().compareTo(o2.getFname());
        if (c == 0)
            c = o2.getId()-(o1.getId());
        return c;
    }


}

public class _34JavaSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        List<Student> studentList = new ArrayList<>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        Collections.sort(studentList, new StudentSort());
        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}