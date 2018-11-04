package activity.drawer.navigation.com.kitabsawtitest.Pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;

public class Education extends RealmObject {

    public static final int INTERNET_TYPE = 0;

    public static final int UNIVERSITY_TYPE = 2;


    public int type;
    public int image;
    public String words;
    @SerializedName("duration")
    @Expose
    private String duration;
    @SerializedName("institution")
    @Expose
    private String institution;
    @SerializedName("degree")
    @Expose
    private String degree;

    public Education(String words, int image, int type) {
        this.words = words;
        this.image = image;
        this.type = type;

    }

    public Education() {

    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int type() {
        return type;
    }
}
