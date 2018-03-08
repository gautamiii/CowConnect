package com.example.gautam.cowconnect;

import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Field;

/**
 * Created by Gautam on 2/17/2018.
 */

public interface ApiInterface {

    @POST("registerationF.php")
    @FormUrlEncoded
    Call<ResponseBean> saveData(@Field("name")String name,@Field("nameoftrust")String name_of_trust,@Field("address") String address_of_trust,@Field("emailid") String email_id,@Field("contactnumber") String contact_no,@Field("socialmedialinks") String social_link,@Field("activity") String activity );

}
