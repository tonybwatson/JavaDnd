import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CallSpellBookApiTest {
    CallSpellBookApi target = new CallSpellBookApi();
    String fireball = "fireball";

    @Test
    void getSpellFromApi() throws Exception{
        assertEquals(fireball, target.getSpellFromApi("fireball"));
    }
}