package fr.esiea.ex4A;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;


class TotoTest {

    private final Toto toto = new Toto("", "");
    private final Toto titi = new Toto("Coco", "cocorico");

    @Test
    void super_test(){
        assertNotSame(toto, titi);
    }



}
