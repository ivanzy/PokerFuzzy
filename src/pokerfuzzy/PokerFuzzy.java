/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokerfuzzy;

/**
 *
 * @author ivan
 */
public class PokerFuzzy {
    public static void main(String[] args) {
        PokerFuzzyGenerator poker = new PokerFuzzyGenerator(0.535, 179, 0, 0, 0, 0);
        poker.doFuzzyCompleto();
        //System.out.println(poker.getAcaoString());
    }

}
