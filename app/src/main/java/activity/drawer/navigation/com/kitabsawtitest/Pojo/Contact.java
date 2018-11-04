package activity.drawer.navigation.com.kitabsawtitest.Pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;

public class Contact extends RealmObject {

    @SerializedName("Linkedin")
    @Expose
    private String linkedin;
    @SerializedName("gmail")
    @Expose
    private String gmail;
    @SerializedName("phone number")
    @Expose
    private String phoneNumber;

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
