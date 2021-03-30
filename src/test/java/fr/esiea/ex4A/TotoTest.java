package fr.esiea.ex4A;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;


class TotoTest {

    private final Toto toto = new Toto("loli", "lolito");

    @Test
    void super_test(){
        //assertEquals("loli", "loli");
        System.out.println(toto);
    }



}
