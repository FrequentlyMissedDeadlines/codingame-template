package codingame.strategy;

import java.util.List;

import codingame.actions.Action;
import codingame.models.GameState;

public interface Strategy {
    List<Action> play(GameState state);
}
