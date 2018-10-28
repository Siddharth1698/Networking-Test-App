package ml.siddharthm.networkingtestapp;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface Api {

 @GET("/posts")
    Call<ResponseBody> getPosts();

 @GET("/users")
    Call<ResponseBody> getUsers();

 @POST("/users")
    Call<ResponseBody> postUser(@Body RequestBody requestBody);

 @GET("/posts")
    Call<ResponseBody> getPostByUserId(@Query("userId") int userId);
}
