package io.github.maxneutrino.springstrategy.service;

import io.github.maxneutrino.springstrategy.exception.UnsupportedCurseException;
import io.github.maxneutrino.springstrategy.strategy.CurseStrategy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class DarkArtsListMapWizard implements Wizard {

    private final Map<String, CurseStrategy> curses;

    public DarkArtsListMapWizard(List<CurseStrategy> curses) {
        this.curses = curses.stream()
                .collect(Collectors.toMap(CurseStrategy::curseName, Function.identity()));
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
