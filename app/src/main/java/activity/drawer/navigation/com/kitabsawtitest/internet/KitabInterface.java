package activity.drawer.navigation.com.kitabsawtitest.internet;

import activity.drawer.navigation.com.kitabsawtitest.Pojo.KitabSawti;
import retrofit2.Call;
import retrofit2.http.GET;

public interface KitabInterface {

    @GET("v2/5bded9cb31000059009e3f8e")
    Call<KitabSawti> getIntroduction();

    @GET("v2/5bded9cb31000059009e3f8e")
    Call<KitabSawti> getEducation();

    @GET("v2/5bded9cb31000059009e3f8e")
    Call<KitabSawti> getWork();

    @GET("v2/5bded9cb31000059009e3f8e")
    Call<KitabSawti> getSkills();

    @GET("v2/5bded9cb31000059009e3f8e")
    Call<KitabSawti> getContact();


}
