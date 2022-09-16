import com.google.gson.*;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import org.json.JSONObject;

public class CallSpellBookApi {
    public static void main(String[] args) throws Exception {
//        getSpellFromApi("fireball");
    }

    public static String updateSpellToSearch() {
        String spellToSearch = "";
        return spellToSearch;
    }

    public static JSONObject getSpellFromApi(String spellName) throws Exception {
        String host = "https://www.dnd5eapi.co/api/spells/";
        String charset = "UTF-8";
//        String query = String.format("s=%s", URLEncoder.encode(s,charset));

        HttpResponse<JsonNode> response = Unirest.get(host + spellName).asJson();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonParser jsonParser = new JsonParser();
        JsonElement jsonElement = jsonParser.parse(response.getBody().toString());
        String spellJsonString = gson.toJson(jsonElement);
//        System.out.println(spellJsonString);
//        System.out.println(response.getStatus());
//        System.out.println(response.getHeaders().get("Content-Type"));
        System.out.println(response.getBody().getObject());
        return response.getBody().getObject();
    }
}
