/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofuzzy;

import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.FunctionBlock;
import net.sourceforge.jFuzzyLogic.rule.Variable;
import net.sourceforge.jFuzzyLogic.rule.Rule;
import net.sourceforge.jFuzzyLogic.rule.RuleBlock;
import net.sourceforge.jFuzzyLogic.rule.RuleExpression;
import net.sourceforge.jFuzzyLogic.rule.RuleTerm;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;
import java.util.HashMap;
import java.util.List;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author ivan
 */
public class PokerFuzzyGenerator {

    private double forca_mao;
    private int fichas;
    private int aposta;
    private int posicao;
    private int acao_oponente;
    private int estagio;
    private String fileName = "fcl/poker.fcl";
    private FIS fis = null;
    FunctionBlock functionBlock = null;

    public PokerFuzzyGenerator(double forca_mao, int fichas, int aposta, int estagio, int posicao, int acao_oponente) {
        this.forca_mao = forca_mao;
        this.fichas = fichas;
        this.aposta = aposta;
        this.estagio = estagio;
        this.posicao = posicao;
        this.acao_oponente = acao_oponente;
    }

    public void loadVar() {
        fis = FIS.load(fileName, true);
        if (fis == null) { // Error while loading
            System.err.println("Can't load file: '" + fileName + "'");
            return;
        }
        functionBlock = fis.getFunctionBlock(null);
        // Set inputs
        functionBlock.setVariable("forca_mao", forca_mao);
        functionBlock.setVariable("fichas", fichas);
        functionBlock.setVariable("aposta", aposta);
        functionBlock.setVariable("estagio", estagio);
        functionBlock.setVariable("posicao", posicao);
        functionBlock.setVariable("acao_oponente", acao_oponente);
        functionBlock.setVariable("pote", 0);

    }

    public void doFuzzyCompleto() {
        int i = 0;
        loadVar();
        JFuzzyChart.get().chart(functionBlock);


        // Evaluate 
        fis.evaluate();
        /* ===============================================
        * FASE DE FUZZIFICACAO
        * Mostrar o valor das funcoes de pertinencia
        * das variaveis linguisticas de entrada
        * ===============================================
         */

         /* ===============================================
        * METODOS DE AGREGACAO
        * Aplicar os operadores fuzzy AND (t-norma) 
        * OR (t-conorma) nos antecedentes das regras
        * Assim, encontra-se o valor dos antecedentes
        * das regras
        * ===============================================
         */
        HashMap<String, RuleBlock> todasRegras = new HashMap<String, RuleBlock>();
        todasRegras = functionBlock.getRuleBlocks();

        //Pegar o Bloco de Regras que esta no arquivo FLC
        RuleBlock blocoDeRegras = todasRegras.get("No1");

        //Pegar as regras do Bloco de Regras
        List<Rule> regras;
        regras = blocoDeRegras.getRules();

        System.out.println("------------------------------------");
        System.out.println("CALCULO DOS ANTECEDENTES DAS REGRAS");
        System.out.println("------------------------------------");
        //Para cada regra mostar seu antecedente e o valor deste antecedente,
        //usando os metodos de agregacao MIN e MAX
        for (Rule umaRegra : regras) {
            i++;
            RuleExpression regraExpressao = umaRegra.getAntecedents();
            System.out.println("- Antecedente da Regra " + i + ": " + regraExpressao.toString());
            //O metodo getDegreeOfSupport() retorna o valor do antecedente da regra,
            //apos a aplicacao dos operadores OR, AND
            System.out.println("  Valor do Antecedente da Regra " + i + ": " + umaRegra.getDegreeOfSupport());
        }

        // Show each rule (and degree of support)
        //System.out.println("Regras e seus respectivos graus de ativação");
        //for( Rule r : fis.getFunctionBlock("gorjeta").getFuzzyRuleBlock("No1").getRules() )
        //   System.out.println(r);
        /* ===============================================
 * FIM DA APLICACAO DOS METODOS DE AGREGACAO
 * ===============================================
         */
 /* ===============================================
 * METODOS DE ATIVACAO
 * Definir como os antecedentes de uma regra 
 * modificam os consequentes.
 * Como o metodo de inferecia de Mamdani esta 
 * sendo utilizado neste programa, entao o metodo
 * de ativacao sera MIN
 * ===============================================
         */
        System.out.println("------------------------------------");
        System.out.println("RESULTADO METODO DE ATIVACAO");
        System.out.println("------------------------------------");

        i = 0;
        for (Rule umaRegra : regras) {
            i++;
            RuleTerm termo = umaRegra.getConsequents().element();
            System.out.println("- Consequente da Regra " + i + ": " + termo.toString());
        }

        /* ===============================================
 * FIM DOS METODOS DE ATIVACAO
 * ==============================================
         */
 /* ===============================================
 * METODO DE ACUMULACAO
 * Os conjuntos fuzzy que representam as saidas
 * das regras sao combinados em um unico conjunto
 * fuzzy
 * ===============================================
         */
        System.out.println("--------------------------");
        System.out.println("FASE DE ACUMULACAO");
        System.out.println("--------------------------");
        System.out.println("Veja grafico com os consequentes combinados pelo metodo MAX");
        // Show the accumulation method�s result: combining of
        //the consequentes
        Variable gorjeta = functionBlock.getVariable("acao");
        JFuzzyChart.get().chart(gorjeta, gorjeta.getDefuzzifier(), true);
        /* ===============================================
 * FIM DO METODO DE ACUMULACAO
 * ===============================================
         */

 /* ===============================================
 * METODO DE DEFUZZIFICACAO
 * ===============================================
         */
        System.out.println("--------------------------");
        System.out.println("FASE DE DEFUZZIFICACAO");
        System.out.println("--------------------------");
        System.out.println("AÇÃO (numérica): " + fis.getVariable("acao").getValue());
        double vec[] = new double[4];
        vec[0] = functionBlock.getVariable("acao").getMembership("fold");
        vec[1] = functionBlock.getVariable("acao").getMembership("call");
        vec[2] = functionBlock.getVariable("acao").getMembership("raise");
        vec[3] = functionBlock.getVariable("acao").getMembership("allin");
        System.out.println("A pertinência da AÇÃO para cada funcão de pertinência é: ");
        System.out.println("fold: " + vec[0]);
        System.out.println("call/check: " + vec[1]);
        System.out.println("raise: " + vec[2]);
        System.out.println("all in: " + vec[3]);
        System.out.println("Portanto, a ação do jogador é " + getAcao(vec));

        /* ===============================================
 * FIM DO METODO DE DEFUZZIFICACAO
 * ===============================================
         */
    }

    public double getAcaoNum() {
        loadVar();
        fis.evaluate();
        return fis.getVariable("acao").getValue();
    }

    public int getAcaoInt() {
        loadVar();
        fis.evaluate();
        double vec[] = new double[4];
        vec[0] = functionBlock.getVariable("acao").getMembership("fold");
        vec[1] = functionBlock.getVariable("acao").getMembership("call");
        vec[2] = functionBlock.getVariable("acao").getMembership("raise");
        vec[3] = functionBlock.getVariable("acao").getMembership("allin");
        return(getAcao(vec));
    }

    public double getForca_mao() {
        return forca_mao;
    }

    public int getFichas() {
        return fichas;
    }

    public int getAposta() {
        return aposta;
    }

    public int getPosicao() {
        return posicao;
    }

    public int getAcao_oponente() {
        return acao_oponente;
    }

    public int getEstagio() {
        return estagio;
    }
    public void setForca_mao(double forca_mao) {
        this.forca_mao = forca_mao;
    }

    public void setFichas(int fichas) {
        this.fichas = fichas;
    }

    public void setAposta(int aposta) {
        this.aposta = aposta;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public void setAcao_oponente(int acao_oponente) {
        this.acao_oponente = acao_oponente;
    }

    public void setEstagio(int estagio) {
        this.estagio = estagio;
    }

    private int getAcao(double[] vec) {
        double max = vec[0];
        int ind = 0;
        int acao = 0;
        for (int i = 0; i < vec.length; i++) {
            if (vec[i] > max) {
                max = vec[i];
                ind = i;
            }
        }
        switch (ind) {
            case 0:
                acao = 0;
                break;
            case 1:
                acao = 1;
                break;
            case 2:
                acao = 2;
                break;
            case 3:
                acao = 3;
                break;
            default:
                acao = 4;
        }
        return acao;
    }

}
