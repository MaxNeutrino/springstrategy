package io.github.maxneutrino.springstrategy.service;

import io.github.maxneutrino.springstrategy.exception.UnsupportedCurseException;
import io.github.maxneutrino.springstrategy.strategy.CurseStrategy;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DarkArtsWizard implements Wizard {

    private final Map<String, CurseStrategy> curses = new HashMap<>();

    @Override
    public String castCurse(String name) {
        CurseStrategy curse = curses.get(name);
        if (curse == null) {
            throw new UnsupportedCurseException();
        }
        return curse.useCurse();
    }

    @Override
    public void registerCurse(String curseName, CurseStrategy curse) {
        curses.put(curseName, curse);
    }
}
