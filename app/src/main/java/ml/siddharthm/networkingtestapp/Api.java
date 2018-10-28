package ml.siddharthm.networkingtestapp;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

 @GET("/posts")
    Call<ResponseBody> getPosts();
}
