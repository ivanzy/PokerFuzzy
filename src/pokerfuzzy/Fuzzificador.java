/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofuzzy;

import java.util.Arrays;

/**
 *
 * @author ivan
 */
public class Fuzzificador {

    public static double getForcaMaoPreFlop(int[][] m) {
        double f = 0;
        boolean sameSuit = false;
        //check pair
        if (m[0][0] == m[0][1]) {
            return ratePairPreFlop(m[0][0]);
        }

        //check same suit
        if (m[1][0] == m[1][1]) {
            sameSuit = true;
        }

        //A?
        if (m[0][0] == 1 || m[0][1] == 1) {
            if (m[0][1] == 1) {
                int temp = m[0][0];
                m[0][0] = m[0][1];
                m[0][1] = temp;
            }

            switch (m[0][1]) {
                case 2:
                    if (sameSuit) {
                        f = 0.51;
                    } else {
                        f = 0.56;
                    }
                    break;
                case 3:
                    if (sameSuit) {
                        f = 0.58;
                    } else {
                        f = 0.57;
                    }
                    break;
                case 4:
                    if (sameSuit) {
                        f = 0.61;
                    } else {
                        f = 0.59;
                    }
                    break;
                case 5:
                    if (sameSuit) {
                        f = 0.62;
                    } else {
                        f = 0.6;
                    }
                    break;
                case 6:
                    if (sameSuit) {
                        f = 0.62;
                    } else {
                        f = 0.6;
                    }
                    break;
                case 7:
                    if (sameSuit) {
                        f = 0.65;
                    } else {
                        f = 0.62;
                    }
                    break;
                case 8:
                    if (sameSuit) {
                        f = 0.66;
                    } else {
                        f = 0.64;
                    }
                    break;
                case 9:
                    if (sameSuit) {
                        f = 0.68;
                    } else {
                        f = 0.67;
                    }
                    break;
                case 10:
                    if (sameSuit) {
                        f = 0.68;
                    } else {
                        f = 0.65;
                    }
                    break;

                case 11:
                    if (sameSuit) {
                        f = 0.7;
                    } else {
                        f = 0.67;
                    }
                    break;
                case 12:
                    if (sameSuit) {
                        f = 0.7;
                    } else {
                        f = 0.67;
                    }
                    break;
                case 13:
                    if (sameSuit) {
                        f = 0.82;
                    } else {
                        f = 0.69;
                    }
                    break;
                default:
                    break;
            }
            return f;
        }

        //order card 
        if (m[0][0] < m[0][1]) {
            // swap value
            int temp = m[0][0];
            m[0][0] = m[0][1];
            m[0][1] = temp;
            // swap suit
            temp = m[1][0];
            m[1][0] = m[1][1];
            m[1][1] = temp;

        }
        //K?
        if (m[0][0] == 13) {
            switch (m[0][1]) {
                case 2:
                    if (sameSuit) {
                        f = 0.5;
                    } else {
                        f = 0.47;
                    }
                    break;
                case 3:
                    if (sameSuit) {
                        f = 0.54;
                    } else {
                        f = 0.48;
                    }
                    break;
                case 4:
                    if (sameSuit) {
                        f = 0.55;
                    } else {
                        f = 0.52;
                    }
                    break;
                case 5:
                    if (sameSuit) {
                        f = 0.57;
                    } else {
                        f = 0.53;
                    }
                    break;
                case 6:
                    if (sameSuit) {
                        f = 0.58;
                    } else {
                        f = 0.54;
                    }
                    break;
                case 7:
                    if (sameSuit) {
                        f = 0.60;
                    } else {
                        f = 0.56;
                    }
                    break;
                case 8:
                    if (sameSuit) {
                        f = 0.60;
                    } else {
                        f = 0.57;
                    }
                    break;
                case 9:
                    if (sameSuit) {
                        f = 0.62;
                    } else {
                        f = 0.61;
                    }
                    break;
                case 10:
                    if (sameSuit) {
                        f = 0.64;
                    } else {
                        f = 0.61;
                    }
                    break;

                case 11:
                    if (sameSuit) {
                        f = 0.64;
                    } else {
                        f = 0.63;
                    }
                    break;
                case 12:
                    if (sameSuit) {
                        f = 0.66;
                    } else {
                        f = 0.63;
                    }
                    break;
                default:
                    break;
            }
            return f;
        }

        //Q?
        if (m[0][0] == 12) {
            switch (m[0][1]) {
                case 2:
                    if (sameSuit) {
                        f = 0.47;
                    } else {
                        f = 0.45;
                    }
                    break;
                case 3:
                    if (sameSuit) {
                        f = 0.48;
                    } else {
                        f = 0.46;
                    }
                    break;
                case 4:
                    if (sameSuit) {
                        f = 0.5;
                    } else {
                        f = 0.48;
                    }
                    break;
                case 5:
                    if (sameSuit) {
                        f = 0.53;
                    } else {
                        f = 0.5;
                    }
                    break;
                case 6:
                    if (sameSuit) {
                        f = 0.54;
                    } else {
                        f = 0.5;
                    }
                    break;
                case 7:
                    if (sameSuit) {
                        f = 0.54;
                    } else {
                        f = 0.5;
                    }
                    break;
                case 8:
                    if (sameSuit) {
                        f = 0.56;
                    } else {
                        f = 0.52;
                    }
                    break;
                case 9:
                    if (sameSuit) {
                        f = 0.59;
                    } else {
                        f = 0.58;
                    }
                    break;
                case 10:
                    if (sameSuit) {
                        f = 0.64;
                    } else {
                        f = 0.59;
                    }
                    break;

                case 11:
                    if (sameSuit) {
                        f = 0.65;
                    } else {
                        f = 0.6;
                    }
                    break;
                default:
                    break;
            }
            return f;
        }

        //Q?
        if (m[0][0] == 12) {
            switch (m[0][1]) {
                case 2:
                    if (sameSuit) {
                        f = 0.47;
                    } else {
                        f = 0.45;
                    }
                    break;
                case 3:
                    if (sameSuit) {
                        f = 0.48;
                    } else {
                        f = 0.46;
                    }
                    break;
                case 4:
                    if (sameSuit) {
                        f = 0.5;
                    } else {
                        f = 0.48;
                    }
                    break;
                case 5:
                    if (sameSuit) {
                        f = 0.53;
                    } else {
                        f = 0.5;
                    }
                    break;
                case 6:
                    if (sameSuit) {
                        f = 0.54;
                    } else {
                        f = 0.5;
                    }
                    break;
                case 7:
                    if (sameSuit) {
                        f = 0.54;
                    } else {
                        f = 0.5;
                    }
                    break;
                case 8:
                    if (sameSuit) {
                        f = 0.56;
                    } else {
                        f = 0.52;
                    }
                    break;
                case 9:
                    if (sameSuit) {
                        f = 0.59;
                    } else {
                        f = 0.58;
                    }
                    break;
                case 10:
                    if (sameSuit) {
                        f = 0.64;
                    } else {
                        f = 0.59;
                    }
                    break;

                case 11:
                    if (sameSuit) {
                        f = 0.65;
                    } else {
                        f = 0.6;
                    }
                    break;
                default:
                    break;
            }
            return f;
        }

        //J?
        if (m[0][0] == 11) {
            switch (m[0][1]) {
                case 2:
                    if (sameSuit) {
                        f = 0.45;
                    } else {
                        f = 0.42;
                    }
                    break;
                case 3:
                    if (sameSuit) {
                        f = 0.46;
                    } else {
                        f = 0.43;
                    }
                    break;
                case 4:
                    if (sameSuit) {
                        f = 0.48;
                    } else {
                        f = 0.46;
                    }
                    break;
                case 5:
                    if (sameSuit) {
                        f = 0.49;
                    } else {
                        f = 0.47;
                    }
                    break;
                case 6:
                    if (sameSuit) {
                        f = 0.5;
                    } else {
                        f = 0.48;
                    }
                    break;
                case 7:
                    if (sameSuit) {
                        f = 0.51;
                    } else {
                        f = 0.49;
                    }
                    break;
                case 8:
                    if (sameSuit) {
                        f = 0.53;
                    } else {
                        f = 0.5;
                    }
                    break;
                case 9:
                    if (sameSuit) {
                        f = 0.55;
                    } else {
                        f = 0.53;
                    }
                    break;
                case 10:
                    if (sameSuit) {
                        f = 0.57;
                    } else {
                        f = 0.55;
                    }
                    break;

                default:
                    break;
            }
            return f;
        }

        //T?
        if (m[0][0] == 10) {
            switch (m[0][1]) {
                case 2:
                    if (sameSuit) {
                        f = 0.42;
                    } else {
                        f = 0.40;
                    }
                    break;
                case 3:
                    if (sameSuit) {
                        f = 0.44;
                    } else {
                        f = 0.41;
                    }
                    break;
                case 4:
                    if (sameSuit) {
                        f = 0.46;
                    } else {
                        f = 0.43;
                    }
                    break;
                case 5:
                    if (sameSuit) {
                        f = 0.47;
                    } else {
                        f = 0.44;
                    }
                    break;
                case 6:
                    if (sameSuit) {
                        f = 0.48;
                    } else {
                        f = 0.44;
                    }
                    break;
                case 7:
                    if (sameSuit) {
                        f = 0.51;
                    } else {
                        f = 0.46;
                    }
                    break;
                case 8:
                    if (sameSuit) {
                        f = 0.52;
                    } else {
                        f = 0.49;
                    }
                    break;
                case 9:
                    if (sameSuit) {
                        f = 0.54;
                    } else {
                        f = 0.52;
                    }
                    break;
                default:
                    break;
            }
            return f;
        }

        //9?
        if (m[0][0] == 9) {
            switch (m[0][1]) {
                case 2:
                    if (sameSuit) {
                        f = 0.4;
                    } else {
                        f = 0.38;
                    }
                    break;
                case 3:
                    if (sameSuit) {
                        f = 0.42;
                    } else {
                        f = 0.39;
                    }
                    break;
                case 4:
                    if (sameSuit) {
                        f = 0.43;
                    } else {
                        f = 0.4;
                    }
                    break;
                case 5:
                    if (sameSuit) {
                        f = 0.46;
                    } else {
                        f = 0.42;
                    }
                    break;
                case 6:
                    if (sameSuit) {
                        f = 0.47;
                    } else {
                        f = 0.45;
                    }
                    break;
                case 7:
                    if (sameSuit) {
                        f = 0.49;
                    } else {
                        f = 0.47;
                    }
                    break;
                case 8:
                    if (sameSuit) {
                        f = 0.51;
                    } else {
                        f = 0.48;
                    }
                    break;
                default:
                    break;
            }
            return f;
        }

        //8?
        if (m[0][0] == 8) {
            switch (m[0][1]) {
                case 2:
                    if (sameSuit) {
                        f = 0.39;
                    } else {
                        f = 0.36;
                    }
                    break;
                case 3:
                    if (sameSuit) {
                        f = 0.4;
                    } else {
                        f = 0.36;
                    }
                    break;
                case 4:
                    if (sameSuit) {
                        f = 0.42;
                    } else {
                        f = 0.38;
                    }
                    break;
                case 5:
                    if (sameSuit) {
                        f = 0.44;
                    } else {
                        f = 0.4;
                    }
                    break;
                case 6:
                    if (sameSuit) {
                        f = 0.45;
                    } else {
                        f = 0.41;
                    }
                    break;
                case 7:
                    if (sameSuit) {
                        f = 0.47;
                    } else {
                        f = 0.43;
                    }
                    break;
                default:
                    break;
            }
            return f;
        }

        //7?
        if (m[0][0] == 7) {
            switch (m[0][1]) {
                case 2:
                    if (sameSuit) {
                        f = 0.37;
                    } else {
                        f = 0.32;
                    }
                    break;
                case 3:
                    if (sameSuit) {
                        f = 0.39;
                    } else {
                        f = 0.34;
                    }
                    break;
                case 4:
                    if (sameSuit) {
                        f = 0.41;
                    } else {
                        f = 0.36;
                    }
                    break;
                case 5:
                    if (sameSuit) {
                        f = 0.42;
                    } else {
                        f = 0.38;
                    }
                    break;
                case 6:
                    if (sameSuit) {
                        f = 0.43;
                    } else {
                        f = 0.40;
                    }
                    break;
                default:
                    break;
            }
            return f;
        }

        //6?
        if (m[0][0] == 6) {
            switch (m[0][1]) {
                case 2:
                    if (sameSuit) {
                        f = 0.37;
                    } else {
                        f = 0.31;
                    }
                    break;
                case 3:
                    if (sameSuit) {
                        f = 0.39;
                    } else {
                        f = 0.33;
                    }
                    break;
                case 4:
                    if (sameSuit) {
                        f = 0.40;
                    } else {
                        f = 0.35;
                    }
                    break;
                case 5:
                    if (sameSuit) {
                        f = 0.41;
                    } else {
                        f = 0.37;
                    }
                    break;
                default:
                    break;
            }
            return f;
        }

        //5?
        if (m[0][0] == 5) {
            switch (m[0][1]) {
                case 2:
                    if (sameSuit) {
                        f = 0.37;
                    } else {
                        f = 0.31;
                    }
                    break;
                case 3:
                    if (sameSuit) {
                        f = 0.39;
                    } else {
                        f = 0.33;
                    }
                    break;
                case 4:
                    if (sameSuit) {
                        f = 0.40;
                    } else {
                        f = 0.35;
                    }
                    break;
                default:
                    break;
            }
            return f;
        }

        //4?
        if (m[0][0] == 4) {
            switch (m[0][1]) {
                case 2:
                    if (sameSuit) {
                        f = 0.35;
                    } else {
                        f = 0.30;
                    }
                    break;
                case 3:
                    if (sameSuit) {
                        f = 0.37;
                    } else {
                        f = 0.32;
                    }
                    break;
                default:
                    break;
            }
            return f;
        }

        //3?
        if (m[0][0] == 3) {
            switch (m[0][1]) {
                case 2:
                    if (sameSuit) {
                        f = 0.35;
                    } else {
                        f = 0.3;
                    }
                    break;
                default:
                    break;
            }
            return f;
        }

        return f;
    }

    private static double ratePairPreFlop(int p) {
        double f = 0;
        switch (p) {
            case 1:
                f = 1;
                break;
            case 2:
                f = 0.53;
                break;
            case 3:
                f = 0.54;
                break;
            case 4:
                f = 0.55;
                break;
            case 5:
                f = 0.58;
                break;
            case 6:
                f = 0.62;
                break;
            case 7:
                f = 0.65;
                break;
            case 8:
                f = 0.69;
                break;
            case 9:
                f = 0.77;
                break;
            case 10:
                f = 0.81;
                break;
            case 11:
                f = 0.85;
                break;
            case 12:
                f = 0.90;
                break;
            case 13:
                f = 0.95;
                break;
        }
        return f;
    }

    public double rateFlop(int[][] m) {
        double f = 0;
        if (findSeqFlush(m, 2) != 0) {
            f = 1;
        } else if (findQuadra(m, 2) != 0) {
            f = 0.99;
        } else if (findFullHouse(m, 2)[0] != 0) {
            f = 0.98;
        } else if (findFlush(m, 2)) {
            f = 0.95;
        } else if (findSeq(m, 2) != 0) {
            f = 0.9;
        } else if (findTrips(m, 2) != 0) {
            f = 0.8;
        } else if (findTwoPair(m, 2)[0] != 0) {
            f = 0.74;
        } else if (findPair(m, 2) != 0) {
            switch (findPair(m, 2)) {
                case 1:
                    f = 0.74;
                    break;
                case 2:
                    f = 0.5;
                    break;
                case 3:
                    f = 0.53;
                    break;
                case 4:
                    f = 0.58;
                    break;
                case 5:
                    f = 0.6;
                    break;
                case 6:
                    f = 0.62;
                    break;
                case 7:
                    f = 0.64;
                    break;
                case 8:
                    f = 0.65;
                    break;
                case 9:
                    f = 0.66;
                    break;
                case 10:
                    f = 0.67;
                    break;
                case 11:
                    f = 0.7;
                    break;
                case 12:
                    f = 0.72;
                    break;
                case 13:
                    f = 0.73;
                    break;
            }

        } else /*kicker*/ {
            if(m[0][0] < m[0][1]){
                
            }
            switch (m[0][0]) {
                case 1:
                    f = 0.45;
                    break;
                case 2:
                    f = 0.3;
                    break;
                case 3:
                    f = 0.3;
                    break;
                case 4:
                    f = 0.35;
                    break;
                case 5:
                    f = 0.36;
                    break;
                case 6:
                    f = 0.38;
                    break;
                case 7:
                    f = 0.4;
                    break;
                case 8:
                    f = 0.41;
                    break;
                case 9:
                    f = 0.41;
                    break;
                case 10:
                    f = 0.43;
                    break;
                case 11:
                    f = 0.42;
                    break;
                case 12:
                    f = 0.43;
                    break;
                    
                case 13:
                    f = 0.44;
                    break;
            }
        }

        if (findFlushDraw(m, 2)) {
            if (f < 0.75 && f >= 0.55) {
                f += 0.2;
            } else if (f < 0.55) {
                f = 0.62;
            }

        }
        return f;
    }

    private int findPair(int[][] m, int size) {
        int temp, pair = 0;

        for (int i = 0; i < size; i++) {
            temp = m[0][i];
            for (int j = i + 1; j < size; j++) {
                if (temp == m[0][j]) {
                    pair = temp;
                }
            }

        }
        return pair;
    }

    private int findTrips(int[][] m, int size) {
        int temp, cont = 0;

        for (int i = 0; i < size; i++) {
            temp = m[0][i];
            for (int j = i + 1; j < size; j++) {
                if (temp == m[0][j]) {
                    cont++;
                    if (cont == 2) {
                        return temp;
                    }
                }
                cont = 0;
            }
        }
        return 0;
    }

    private int[] findTwoPair(int[][] m, int size) {
        int temp;
        int[] pair = {0, 0};

        for (int i = 0; i < size; i++) {
            temp = m[0][i];
            for (int j = i + 1; j < size; j++) {
                if (temp == m[0][j]) {
                    if (pair[0] != 0) {
                        pair[1] = temp;
                        return pair;
                    }
                    pair[0] = temp;
                }
            }

        }
        if (pair[0] == 0 || pair[1] == 0) {
            pair[0] = 0;
            pair[1] = 0;
        }
        return pair;
    }

    private boolean findFlush(int[][] m, int size) {
        boolean isFlush = false;
        int[] suit = {0, 0, 0, 0};
        for (int i = 0; i < size; i++) {
            suit[m[1][i]]++;
        }
        for (int i = 0; i < size; i++) {
            if (suit[i] >= 5) {
                isFlush = true;
            }
        }
        return isFlush;
    }

    private boolean findFlushDraw(int[][] m, int size) {
        boolean isFlushDraw = false;
        int[] suit = {0, 0, 0, 0};
        for (int i = 0; i < size; i++) {
            suit[m[1][i]]++;
        }
        for (int i = 0; i < size; i++) {
            if (suit[i] == 5) {
                isFlushDraw = true;
            }
        }
        return isFlushDraw;
    }

    private int findSeq(int[][] m, int size) {
        int[] seq = new int[size];
        int cont = 0, maiorV = 0, maiorC = 0;
        for (int i = 0; i < size; i++) {
            seq[i] = m[0][i];
        }
        Arrays.sort(seq);
        for (int i = 1; i < size; i++) {
            if (seq[i - 1] + 1 == seq[i]) {
                cont++;
                if (cont >= maiorC) {
                    maiorC = cont;
                    maiorV = seq[i];
                }
            } else {
                cont = 0;
            }
        }
        if (maiorC >= 5) {
            return maiorV;
        } else {
            return 0;
        }

    }

    private int findQuadra(int[][] m, int size) {
        int cont = 0, temp;
        for (int i = 0; i < size; i++) {
            temp = m[0][i];
            for (int j = i + 1; j < size; j++) {
                if (temp == m[0][j]) {
                    cont++;
                }
            }
            if (cont == 4) {
                return temp;
            } else {
                cont = 0;
            }

        }
        return 0;
    }

    // primeiro trinca e depois par
    private int[] findFullHouse(int[][] m, int size) {
        int[] fullHouse = {0, 0};
        int temp, cont = 0, trinca = findTrips(m, size);
        if (trinca != 0) {
            fullHouse[0] = trinca;
            for (int i = 0; i < size; i++) {
                temp = m[0][i];
                for (int j = i + 1; j < size; j++) {
                    if (temp == m[0][j]) {
                        cont++;
                        if (cont == 2 && temp != trinca) {
                            fullHouse[1] = temp;
                        }

                    }
                    cont = 0;
                }
            }

        }
        if (fullHouse[1] == 0) {
            fullHouse[0] = 0;
        }
        return fullHouse;
    }

    private int findSeqFlush(int[][] m, int size) {
        int[] seq = new int[size];
        int cont = 0, maiorV = 0, maiorC = 0;
        for (int i = 0; i < size; i++) {
            seq[i] = m[0][i];
        }
        Arrays.sort(seq);
        for (int i = 1; i < size; i++) {
            if (seq[i - 1] + 1 == seq[i]) {
                cont++;
                if (cont >= maiorC) {
                    maiorC = cont;
                    maiorV = seq[i];
                }
            } else {
                cont = 0;
            }
        }
        int[] suit = new int[4];
        for (int i = 0; i < size; i++) {
            if (m[0][i] > maiorV - 5 && m[0][1] <= maiorV) {
                suit[m[1][i]]++;
            }
        }
        for (int i = 0; i < size; i++) {
            if (suit[i] >= 5) {
                return maiorV;
            }
        }
        return 0;
    }

}
