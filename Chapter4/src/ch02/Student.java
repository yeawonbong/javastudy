package ch02;

public class Student implements Cloneable{
    private int studentNum;
    private String studentName;

    public Student(int studentNum, String studentName) {
        this.studentNum = studentNum;
        this.studentName = studentName;
    }

    public String toString() {
        return studentNum + "," + studentName;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Student) {
            Student std = (Student)obj; //다운캐스팅
            if (this.studentNum == std.studentNum)
                return true; // 오버라이딩을 통해 논리적으로 같은 경우를 같다고 처리해줄 수 있다.
            else
                return false;
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return studentNum;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
