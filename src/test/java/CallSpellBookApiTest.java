import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CallSpellBookApiTest {
    CallSpellBookApi target = new CallSpellBookApi();
    String fireball = "fireball";

    @Test
    void getSpellFromApi() throws Exception{
        assertEquals("Fireball", target.getSpellFromApi(fireball).get("name"));
//        assertEquals("[\"A bright streak flashes from your pointing finger to a point you choose within range and then blossoms with a low roar into an explosion of flame. Each creature in a 20-foot-radius sphere centered on that point must make a dexterity saving throw. A target takes 8d6 fire damage on a failed save, or half as much damage on a successful one.\",\"The fire spreads around corners. It ignites flammable objects in the area that aren't being worn or carried.\"]", target.getSpellFromApi(fireball).get("desc"));
//        assertEquals("Fireball", target.getSpellFromApi(fireball).get(""));
//        assertEquals("Fireball", target.getSpellFromApi(fireball).get(""));
//        assertEquals("Fireball", target.getSpellFromApi(fireball).get(""));
//        assertEquals("Fireball", target.getSpellFromApi(fireball).get(""));
//        assertEquals("Fireball", target.getSpellFromApi(fireball).get(""));
//        assertEquals("Fireball", target.getSpellFromApi(fireball).get(""));
//        assertEquals("Fireball", target.getSpellFromApi(fireball).get(""));
    }
}