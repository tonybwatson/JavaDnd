import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import org.json.JSONObject;

public class CallApi {
    public static JSONObject getJsonObjectFromApi(String objectTypeName, String objectName) throws Exception {
        String host = "https://www.dnd5eapi.co/api/";
        HttpResponse<JsonNode> response = Unirest.get(host + objectTypeName + "/" + objectName).asJson();
        return response.getBody().getObject();
    }
}
