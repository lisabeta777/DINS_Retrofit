import UserService.UserService;
import UserService.Users;
import org.junit.jupiter.api.Test;
import Users.ResponseItem;

import java.io.IOException;
import java.util.List;

public class AutoTest {

    @Test
    public void getTest_Users() throws IOException {
        Users user = new UserService().getUserService();
        ResponseItem result = user.getUserById(1).execute().body();
        System.out.println(result);
    }

    @Test
    public void getTest_UsersId() throws IOException {
        Users user = new UserService().getUserService();
        List<ResponseItem> result = user.getUsersByUserId(1).execute().body();
        System.out.println(result);
    }

    @Test
    public void getTest_All() throws IOException {
        Users user = new UserService().getUserService();
        List<ResponseItem> result = user.getUserAll("").execute().body();
        System.out.println(result);
    }
}
