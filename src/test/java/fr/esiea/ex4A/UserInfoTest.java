package fr.esiea.ex4A;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class UserInfoTest {

    private final UserInfo userInfo = new UserInfo("FR", "loli", "Homme", "lolito");

    @Test
    void super_test(){
        System.out.println(userInfo);
    }


}
