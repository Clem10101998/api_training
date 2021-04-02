package fr.esiea.ex4A;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class UserInfoTest {

    private final UserInfo userInfo1 = new UserInfo("FR", "loli", "Homme", "lolito");
    private final UserInfo userInfo2 = new UserInfo("FR", "bidule", "Homme", "bidulo");

    @Test
    void super_test(){
        assertNotSame(userInfo1, userInfo2);
    }
}
