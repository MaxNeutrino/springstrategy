package io.github.maxneutrino.springstrategy.service;

import io.github.maxneutrino.springstrategy.exception.UnsupportedCurseException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class DarkArtsWizardTest {

    @Autowired
    private DarkArtsWizard wizard;

    @Test
    public void castCurseCrucio() {
        assertEquals("Attack with Crucio!", wizard.castCurse("Crucio"));
    }

    @Test
    public void castCurseImperio() {
        assertEquals("Attack with Imperio!", wizard.castCurse("Imperio"));
    }

    @Test
    public void castCurseAvadaKedavra() {
        assertEquals("Attack with Avada Kedavra!", wizard.castCurse("Avada Kedavra"));
    }

    @Test
    public void castCurseExpelliarmus() {
        assertThrows(UnsupportedCurseException.class, () -> wizard.castCurse("Abrakadabra"));
    }
}