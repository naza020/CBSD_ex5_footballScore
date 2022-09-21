/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballscore;

import java.util.EventObject;

/**
 *
 * @author theki
 */
public class ScoreEvent extends EventObject {

    private String score;

    public ScoreEvent(Object o, String val) {
        super(o);
        score = val;
    }

    public String getScore() {
        return score;
    }
}
