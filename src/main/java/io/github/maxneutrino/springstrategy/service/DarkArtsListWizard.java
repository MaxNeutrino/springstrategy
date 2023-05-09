package io.github.maxneutrino.springstrategy.service;

import io.github.maxneutrino.springstrategy.exception.UnsupportedCurseException;
import io.github.maxneutrino.springstrategy.strategy.CurseStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DarkArtsListWizard implements Wizard {

    private final List<CurseStrategy> curses;

    public DarkArtsListWizard(List<CurseStrategy> curses) {
        this.curses = curses;
    }

    @Override
    public String castCurse(String name) {
        return curses.stream()
                .filter(s -> name.equals(s.curseName()))
                .findFirst()
                .orElseThrow(UnsupportedCurseException::new)
                .useCurse();
    }
}
