import models.RequestModel.UserModel;
import models.ResponseModel.UserResponseModel;
import org.testng.Assert;
import org.testng.annotations.Test;
import steps.BaseTest;

public class ApiUserTests extends BaseTest {

    @Test()
    public void getUserList()
    {
        API_STEPS.getUserList();
    }
    @Test()
    public void postCreateUser()
    {
        UserModel jo = new UserModel("morpheus","leader");
        UserResponseModel pa = API_STEPS.postCreateUser(jo);

        Assert.assertEquals(pa.getName(), "morpheus");
        Assert.assertEquals(pa.getJob(), "leader");
    }
}
