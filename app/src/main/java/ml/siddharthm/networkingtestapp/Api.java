package ml.siddharthm.networkingtestapp;

import java.util.List;
import java.util.Map;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface Api {

 @GET("/posts")
    Call<ResponseBody> getPosts();

 @GET("/users")
    Call<ResponseBody> getUsers();

 @POST("/users")
    Call<ResponseBody> postUser(@Body RequestBody requestBody);

 @GET("/posts")
    Call<ResponseBody> getPostByUserId(@Query("userId") int userId);

 @GET("/posts")
    Call<ResponseBody> getPostByUserIdAndPostId(@Query("userId") int userId,@Query("id") int postId);

 @GET("/posts")
    Call<ResponseBody> getPostById(@Query("id") List<Integer> ids);

 @GET("/posts")
    Call<ResponseBody> getPostByParams(@QueryMap Map<String,String> params);
 @GET("/posts/{id}")
    Call<ResponseBody> getPById(@Path("id") int id);
}
