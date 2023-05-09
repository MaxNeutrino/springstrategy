package io.github.maxneutrino.springstrategy.service;

import io.github.maxneutrino.springstrategy.exception.UnsupportedCurseException;
import io.github.maxneutrino.springstrategy.strategy.CurseStrategy;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class DarkArtsMapWizard implements Wizard {

    private final Map<String, CurseStrategy> curses;

    public DarkArtsMapWizard(Map<String, CurseStrategy> curses) {
        this.curses = curses;
    }

    @Override
    public String castCurse(String name) {
        CurseStrategy curse = curses.get(name);
        if (curse == null) {
            throw new UnsupportedCurseException();
        }
        return curse.useCurse();
    }
}
