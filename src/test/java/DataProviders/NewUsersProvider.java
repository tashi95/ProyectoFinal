package DataProviders;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import org.testng.annotations.DataProvider;
import pojo.RegisterData;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class NewUsersProvider
{
    @DataProvider(name="getnewUsersDataFromJson")
    private Object[][] getnewUsersDataFromJson() throws FileNotFoundException {
        JsonElement jsonData = new JsonParser().parse(new FileReader("src/test/resources/data/users.json"));
        JsonElement dataset = jsonData.getAsJsonObject().get("dataset");

        List<RegisterData> testData = new Gson().fromJson(dataset, new TypeToken<List<RegisterData>>() {}.getType());

        Object[][] returnValue = new Object[testData.size()][1];
        int index = 0;
        for(Object [] each: returnValue) {
            each[0] = testData.get(index++);
        }
        return returnValue;
    }
}
