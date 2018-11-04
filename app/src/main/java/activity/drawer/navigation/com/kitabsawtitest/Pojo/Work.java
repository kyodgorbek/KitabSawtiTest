package activity.drawer.navigation.com.kitabsawtitest.Pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;

public class Work extends RealmObject {

    @SerializedName("company")
    @Expose
    private String company;
    @SerializedName("duration")
    @Expose
    private String duration;
    @SerializedName("responsibility")
    @Expose
    private String responsibility;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(String responsibility) {
        this.responsibility = responsibility;
    }

}
