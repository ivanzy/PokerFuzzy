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
        //PokerFuzzyGenerator poker = new PokerFuzzyGenerator(0.535, 179, 0, 0, 0, 0);
        //poker.doFuzzyCompleto();
        int[][] m={{1,2},{2,2},{3,2},{4,2},{5,2}};
        Fuzzificador.rateFlop(m);
        //System.out.println(poker.getAcaoString());
    }

}
