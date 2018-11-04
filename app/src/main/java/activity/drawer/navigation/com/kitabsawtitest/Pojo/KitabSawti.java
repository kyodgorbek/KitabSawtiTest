package activity.drawer.navigation.com.kitabsawtitest.Pojo;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmList;
import io.realm.RealmObject;


public class KitabSawti extends RealmObject {

    @SerializedName("Introduction")
    @Expose
    private RealmList<Introduction> introduction = null;
    @SerializedName("Education")
    @Expose
    private RealmList<Education> education = null;
    @SerializedName("Work")
    @Expose
    private RealmList<Work> work = null;
    @SerializedName("Skills")
    @Expose
    private RealmList<Skill> skills = null;
    @SerializedName("Contact")
    @Expose
    private RealmList<Contact> contact = null;

    public RealmList<Introduction> getIntroduction() {
        return introduction;
    }

    public void setIntroduction(RealmList<Introduction> introduction) {
        this.introduction = introduction;
    }

    public RealmList<Education> getEducation() {
        return education;
    }

    public void setEducation(RealmList<Education> education) {
        this.education = education;
    }

    public RealmList<Work> getWork() {
        return (RealmList<Work>) work;
    }

    public void setWork(RealmList<Work> work) {
        this.work = work;
    }

    public RealmList<Skill> getSkills() {
        return (RealmList<Skill>) skills;
    }

    public void setSkills(RealmList<Skill> skills) {
        this.skills = skills;
    }

    public RealmList<Contact> getContact() {
        return (RealmList<Contact>) contact;
    }

    public void setContact(RealmList<Contact> contact) {
        this.contact = contact;
    }

}
