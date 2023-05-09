package io.github.maxneutrino.springstrategy.service;

import io.github.maxneutrino.springstrategy.exception.UnsupportedCurseException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class DarkArtsMapWizardTest {

    @Autowired
    private DarkArtsMapWizard wizard;

    @Test
    public void castCurseCrucio() {
        assertEquals("Attack with Crucio!", wizard.castCurse("cruciatusCurseStrategy"));
    }

    @Test
    public void castCurseImperio() {
        assertEquals("Attack with Imperio!", wizard.castCurse("imperiusCurseStrategy"));
    }

    @Test
    public void castCurseAvadaKedavra() {
        assertEquals("Attack with Avada Kedavra!", wizard.castCurse("killingCurseStrategy"));
    }

    @Test
    public void castCurseExpelliarmus() {
        assertThrows(UnsupportedCurseException.class, () -> wizard.castCurse("Crucio"));
    }
}