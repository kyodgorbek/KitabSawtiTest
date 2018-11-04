package activity.drawer.navigation.com.kitabsawtitest.Pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;

public class Introduction extends RealmObject {

    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("introduction")
    @Expose
    private String introduction;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

}
