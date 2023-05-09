package io.github.maxneutrino.springstrategy.service;

import io.github.maxneutrino.springstrategy.strategy.CurseStrategy;

public interface Wizard {

    String castCurse(String name);

    default void registerCurse(String curseName, CurseStrategy curse) {}
}
