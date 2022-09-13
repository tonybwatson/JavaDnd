import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;

import java.net.URLEncoder;

public class SpellBook {
    public static void main(String[] args) throws Exception {
        getSpellFromApi("fireball");
    }

    public static void getSpellFromApi(String spellName) throws Exception {
        String host = "https://www.dnd5eapi.co/api/spells/";
        String charset = "UTF-8";
//        spellName = "fireball";
//        String query = String.format("s=%s", URLEncoder.encode(s,charset));

        HttpResponse<JsonNode> response = Unirest.get(host + spellName ).asJson();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonParser jp = new JsonParser();
        JsonElement je = jp.parse(response.getBody().toString());
        String prettyJsonString = gson.toJson(je);
        System.out.println(prettyJsonString);

        System.out.println(response.getStatus());

        System.out.println(response.getHeaders().get("Content-Type"));
    }
}
