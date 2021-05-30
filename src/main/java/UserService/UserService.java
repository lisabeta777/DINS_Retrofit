package UserService;

import Users.Response;
import retrofit2.Retrofit;
import Users.ResponseItem;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class UserService {

    public Users users;

    public Users getUserService() {
        if (users == null) {
            Retrofit r = new
                    Retrofit.Builder().baseUrl("https://jsonplaceholder.typicode.com/").addConverterFactory(JacksonConverterFactory.create()).build();
            users = r.create(Users.class);
        }
        return users;

    }
}
