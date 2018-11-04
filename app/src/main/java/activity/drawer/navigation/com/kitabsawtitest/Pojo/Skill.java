package activity.drawer.navigation.com.kitabsawtitest.Pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;

public class Skill extends RealmObject {

    @SerializedName("Programming")
    @Expose
    private String programming;
    @SerializedName("Framework/Libraries")
    @Expose
    private String frameworkLibraries;
    @SerializedName("Android Architecture Components")
    @Expose
    private String androidArchitectureComponents;
    @SerializedName("Software Methodologies")
    @Expose
    private String softwareMethodologies;
    @SerializedName("IDE'S")
    @Expose
    private String iDES;

    public String getProgramming() {
        return programming;
    }

    public void setProgramming(String programming) {
        this.programming = programming;
    }

    public String getFrameworkLibraries() {
        return frameworkLibraries;
    }

    public void setFrameworkLibraries(String frameworkLibraries) {
        this.frameworkLibraries = frameworkLibraries;
    }

    public String getAndroidArchitectureComponents() {
        return androidArchitectureComponents;
    }

    public void setAndroidArchitectureComponents(String androidArchitectureComponents) {
        this.androidArchitectureComponents = androidArchitectureComponents;
    }

    public String getSoftwareMethodologies() {
        return softwareMethodologies;
    }

    public void setSoftwareMethodologies(String softwareMethodologies) {
        this.softwareMethodologies = softwareMethodologies;
    }

    public String getIDES() {
        return iDES;
    }

    public void setIDES(String iDES) {
        this.iDES = iDES;
    }

}
