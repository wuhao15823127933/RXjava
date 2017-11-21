package http;

import bean.CodeMode;
import bean.HomeModel;
import bean.Login;
import io.reactivex.Observable;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;
import retrofit2.http.Streaming;
import retrofit2.http.Url;

/**
 * Created by Hao on 2017/11/1.
 * API接口(网络请求的接口都在这里)
 */

public interface  APIFunction {
    //登录
    @GET("/api/v1/user/login")
    Observable<Login> login(@Query("phone") String phome,@Query("sms_code") String code);
    //获取验证码
    @GET("/api/v1/sms/send")
    Observable<CodeMode> Code(@Query("phone") String phome, @Query("type") String type);
    //首页用户列表
    @GET("/api/v1/user/list")
    Observable<HomeModel> HomeList(@Query("lat") String lat, @Query("lng") String lng, @Query("order_by") String order_by, @Query("page") int page, @Query("per_page") int per_page);

    //上传文件
    @POST("/api/v1/user/upload_avatar")
    @Multipart
    Observable<HomeModel> uploadFile(@Part("file\"; filename=\"avatar.png\"") RequestBody file);

    //搜索用户
    @GET("/api/v1/user/search_list")
    Observable<HomeModel> Search_list(@Query("search_value") String search_value, @Query("per_page") String per_page, @Query("search_type") String search_type);



}
