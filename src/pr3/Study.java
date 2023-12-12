package pr3;

public class Study {
    private String course;

    public Study(String course){
        this.course=course;
    }

    public String printCourse() {
        return this.course;
    }

    @Override
    public String toString() {
        return "Study{" +
                "course='" + course + '\'' +
                '}';
    }
}


