package io.github.maxneutrino.springstrategy.strategy;

import org.springframework.stereotype.Component;

@Component
public class KillingCurseStrategy implements CurseStrategy {

    @Override
    public String useCurse() {
        return "Attack with Avada Kedavra!";
    }

    @Override
    public String curseName() {
        return "Avada Kedavra";
    }
}
