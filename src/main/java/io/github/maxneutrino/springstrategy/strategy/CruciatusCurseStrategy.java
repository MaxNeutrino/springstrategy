package io.github.maxneutrino.springstrategy.strategy;

import org.springframework.stereotype.Component;

@Component
public class CruciatusCurseStrategy implements CurseStrategy {

    @Override
    public String useCurse() {
        return "Attack with Crucio!";
    }

    @Override
    public String curseName() {
        return "Crucio";
    }
}
