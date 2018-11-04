package activity.drawer.navigation.com.kitabsawtitest;

public class Subject {


    public static final int SUBJECT_TYPE = 1;
    public int subjectImages;
    public String subjects;
    public int types;


    public Subject(int subjectImages, String subjects, int types) {

        this.subjectImages = subjectImages;
        this.subjects = subjects;
        this.types = types;

    }

    public int getSubjectImages() {
        return subjectImages;
    }

    public void setSubjectImages(int subjectImages) {
        this.subjectImages = subjectImages;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }


}
