package io.github.maxneutrino.springstrategy.strategy;

import io.github.maxneutrino.springstrategy.service.DarkArtsWizard;
import org.springframework.beans.factory.annotation.Autowired;

public interface CurseStrategy {

    String useCurse();

    String curseName();

    @Autowired
    default void registerMe(DarkArtsWizard wizard) {
        wizard.registerCurse(curseName(), this);
    }
}
