package io.github.maxneutrino.springstrategy.strategy;

import org.springframework.stereotype.Component;

@Component
public class ImperiusCurseStrategy implements CurseStrategy {

    @Override
    public String useCurse() {
        return "Attack with Imperio!";
    }

    @Override
    public String curseName() {
        return "Imperio";
    }
}
