package UserService;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import Users.Response;
import Users.ResponseItem;
import retrofit2.http.Query;

import java.util.List;

public interface Users {

@GET("/posts/{id}")
   Call<ResponseItem> getUserById(@Path("id") int id);

@GET("/posts")
   Call<List<ResponseItem>> getUsersByUserId(@Query("userId") int userId);

   @GET("/posts/{id}")
   Call<List<ResponseItem>> getUserAll(@Path("id") String id);;
}
