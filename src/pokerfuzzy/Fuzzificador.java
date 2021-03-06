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

    public static double rateFlop(int[][] m) {
        double f = 0;
        if (findSeqFlush(m, 5) != 0) {
            f = 1;
        } else if (findQuadra(m, 5) != 0) {
            f = 0.99;
        } else if (findFullHouse(m, 5)[0] != 0) {
            f = 0.98;
        } else if (findFlush(m, 5)) {
            f = 0.95;
        } else if (findSeq(m, 5) != 0) {
            f = 0.9;
        } else if (findTrips(m, 5) != 0) {
            f = 0.8;
        } else if (findTwoPair(m, 5)[0] != 0) {
            f = 0.74;
        } else if (findPair(m, 5) != 0) {
            switch (findPair(m, 5)) {
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
            if (m[0][0] < m[0][1]) {
                int Temp;
                Temp = m[0][0];
                m[0][0] = m[0][1];
                m[0][1] = Temp;

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

    public static double rateTurn(int[][] m) {
        double f = 0;
        if (findSeqFlush(m, 6) != 0) {
            f = 1;
        } else if (findQuadra(m, 6) != 0) {
            f = 0.99;
        } else if (findFullHouse(m, 6)[0] != 0) {
            f = 0.98;
        } else if (findFlush(m, 6)) {
            f = 0.95;
        } else if (findSeq(m, 6) != 0) {
            f = 0.9;
        } else if (findTrips(m, 6) != 0) {
            f = 0.8;
        } else if (findTwoPair(m, 6)[0] != 0) {
            f = 0.72;
        } else if (findPair(m, 6) != 0) {
            switch (findPair(m, 6)) {
                case 1:
                    f = 0.72;
                    break;
                case 2:
                    f = 0.5;
                    break;
                case 3:
                    f = 0.52;
                    break;
                case 4:
                    f = 0.53;
                    break;
                case 5:
                    f = 0.55;
                    break;
                case 6:
                    f = 0.57;
                    break;
                case 7:
                    f = 0.6;
                    break;
                case 8:
                    f = 0.62;
                    break;
                case 9:
                    f = 0.64;
                    break;
                case 10:
                    f = 0.65;
                    break;
                case 11:
                    f = 0.69;
                    break;
                case 12:
                    f = 0.7;
                    break;
                case 13:
                    f = 0.72;
                    break;
            }

        } else /*kicker*/ {
            if (m[0][0] < m[0][1]) {
                int Temp;
                Temp = m[0][0];
                m[0][0] = m[0][1];
                m[0][1] = Temp;

            }
            switch (m[0][0]) {
                case 1:
                    f = 0.42;
                    break;
                case 2:
                    f = 0.22;
                    break;
                case 3:
                    f = 0.3;
                    break;
                case 4:
                    f = 0.32;
                    break;
                case 5:
                    f = 0.32;
                    break;
                case 6:
                    f = 0.34;
                    break;
                case 7:
                    f = 0.35;
                    break;
                case 8:
                    f = 0.37;
                    break;
                case 9:
                    f = 0.38;
                    break;
                case 10:
                    f = 0.39;
                    break;
                case 11:
                    f = 0.4;
                    break;
                case 12:
                    f = 0.4;
                    break;
                case 13:
                    f = 0.4;
                    break;
            }
        }

        if (findFlushDraw(m, 2)) {
            if (f < 0.75 && f >= 0.55) {
                f += 0.05;
            } else if (f < 0.5) {
                f = 0.5;
            }

        }
        return f;
    }

    public static double rateRiver(int[][] m) {
        double f = 0;
        if (findSeqFlush(m, 7) != 0) {
            f = 1;
        } else if (findQuadra(m, 7) != 0) {
            f = 0.99;
        } else if (findFullHouse(m, 7)[0] != 0) {
            f = 0.98;
        } else if (findFlush(m, 7)) {
            f = 0.95;
        } else if (findSeq(m, 7) != 0) {
            f = 0.9;
        } else if (findTrips(m, 7) != 0) {
            f = 0.8;
        } else if (findTwoPair(m, 7)[0] != 0) {
            f = 0.72;
        } else if (findPair(m, 7) != 0) {
            switch (findPair(m, 7)) {
                case 1:
                    f = 0.7;
                    break;
                case 2:
                    f = 0.45;
                    break;
                case 3:
                    f = 0.5;
                    break;
                case 4:
                    f = 0.52;
                    break;
                case 5:
                    f = 0.55;
                    break;
                case 6:
                    f = 0.57;
                    break;
                case 7:
                    f = 0.6;
                    break;
                case 8:
                    f = 0.61;
                    break;
                case 9:
                    f = 0.61;
                    break;
                case 10:
                    f = 0.63;
                    break;
                case 11:
                    f = 0.65;
                    break;
                case 12:
                    f = 0.66;
                    break;
                case 13:
                    f = 0.67;
                    break;
            }

        } else /*kicker*/ {
            if (m[0][0] < m[0][1]) {
                int Temp;
                Temp = m[0][0];
                m[0][0] = m[0][1];
                m[0][1] = Temp;

            }
            switch (m[0][0]) {
                case 1:
                    f = 0.4;
                    break;
                case 2:
                    f = 0.3;
                    break;
                case 3:
                    f = 0.3;
                    break;
                case 4:
                    f = 0.3;
                    break;
                case 5:
                    f = 0.3;
                    break;
                case 6:
                    f = 0.3;
                    break;
                case 7:
                    f = 0.3;
                    break;
                case 8:
                    f = 0.3;
                    break;
                case 9:
                    f = 0.3;
                    break;
                case 10:
                    f = 0.33;
                    break;
                case 11:
                    f = 0.35;
                    break;
                case 12:
                    f = 0.37;
                    break;
                case 13:
                    f = 0.38;
                    break;
            }
        }

        return f;
    }

    public static double rateWin(int[][] m, int P) {
        double f = 0;
        if (findSeqFlush(m, 7) != 0) {
            f = 1;
            Propriedades.PMaoFinal[P] = 1;
        } else if (findQuadra(m, 7) != 0) {
            f = 0.99;
            Propriedades.PMaoFinal[P] = 2;
        } else if (findFullHouse(m, 7)[0] != 0) {
            f = 0.98;
            Propriedades.PMaoFinal[P] = 3;
        } else if (findFlush(m, 7)) {
            f = 0.95;
            Propriedades.PMaoFinal[P] = 4;
        } else if (findSeq(m, 7) != 0) {
            f = 0.9;
            Propriedades.PMaoFinal[P] = 5;
        } else if (findTrips(m, 7) != 0) {
            f = 0.8;
            Propriedades.PMaoFinal[P] = 6;
        } else if (findTwoPair(m, 7)[0] != 0) {
            f = 0.74;
            Propriedades.PMaoFinal[P] = 7;
        } else if (findPair(m, 7) != 0) {
            switch (findPair(m, 7)) {
                case 1:
                    f = 0.74;
                    Propriedades.PMaoFinal[P] = 8;
                    break;
                case 2:
                    f = 0.5;
                    Propriedades.PMaoFinal[P] = 20;
                    break;
                case 3:
                    f = 0.53;
                    Propriedades.PMaoFinal[P] = 19;
                    break;
                case 4:
                    f = 0.58;
                    Propriedades.PMaoFinal[P] = 18;
                    break;
                case 5:
                    f = 0.6;
                    Propriedades.PMaoFinal[P] = 17;
                    break;
                case 6:
                    f = 0.62;
                    Propriedades.PMaoFinal[P] = 16;
                    break;
                case 7:
                    f = 0.64;
                    Propriedades.PMaoFinal[P] = 15;
                    break;
                case 8:
                    f = 0.65;
                    Propriedades.PMaoFinal[P] = 14;
                    break;
                case 9:
                    f = 0.66;
                    Propriedades.PMaoFinal[P] = 13;
                    break;
                case 10:
                    f = 0.67;
                    Propriedades.PMaoFinal[P] = 12;
                    break;
                case 11:
                    f = 0.7;
                    Propriedades.PMaoFinal[P] = 11;
                    break;
                case 12:
                    f = 0.72;
                    Propriedades.PMaoFinal[P] = 10;
                    break;
                case 13:
                    f = 0.73;
                    Propriedades.PMaoFinal[P] = 9;
                    break;
            }

        } else /*kicker*/ {
            if (m[0][0] < m[0][1]) {
                int Temp;
                Temp = m[0][0];
                m[0][0] = m[0][1];
                m[0][1] = Temp;
            }
            switch (m[0][0]) {
                case 1:
                    f = 0.45;
                    Propriedades.PMaoFinal[P] = 21;
                    break;
                case 2:
                    f = 0.3;
                    Propriedades.PMaoFinal[P] = 33;
                    break;
                case 3:
                    f = 0.3;
                    Propriedades.PMaoFinal[P] = 32;
                    break;
                case 4:
                    f = 0.35;
                    Propriedades.PMaoFinal[P] = 31;
                    break;
                case 5:
                    f = 0.36;
                    Propriedades.PMaoFinal[P] = 30;
                    break;
                case 6:
                    f = 0.38;
                    Propriedades.PMaoFinal[P] = 29;
                    break;
                case 7:
                    f = 0.4;
                    Propriedades.PMaoFinal[P] = 28;
                    break;
                case 8:
                    f = 0.41;
                    Propriedades.PMaoFinal[P] = 27;
                    break;
                case 9:
                    f = 0.41;
                    Propriedades.PMaoFinal[P] = 26;
                    break;
                case 10:
                    f = 0.43;
                    Propriedades.PMaoFinal[P] = 25;
                    break;
                case 11:
                    f = 0.42;
                    Propriedades.PMaoFinal[P] = 24;
                    break;
                case 12:
                    f = 0.43;
                    Propriedades.PMaoFinal[P] = 23;
                    break;

                case 13:
                    f = 0.44;
                    Propriedades.PMaoFinal[P] = 22;
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

    private static int findPair(int[][] m, int size) {
        int temp, pair = 0;

        for (int i = 0; i < size; i++) {
            temp = m[0][i];
            for (int j = i + 1; j < size; j++) {
                if (temp == m[0][j]) {
                    pair = temp;
                }
            }

        }
        if (pair != 0) {
            System.out.println("PAR de " + pair);
        }
        return pair;
    }

    private static int findTrips(int[][] m, int size) {
        int trinca = 0;
        int[] cards = new int[14];
        for (int i = 0; i < 14; i++) {
            cards[i] = 0;
        }

        for (int i = 0; i < size; i++) {
            cards[m[0][i]]++;
        }

        for (int i = 0; i < 14; i++) {
            if (cards[i] == 3) {
                trinca = i;
            }
        }

        return trinca;
    }

    private static int[] findTwoPair(int[][] m, int size) {
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
        } else {
            System.out.println("dois pares, de " + pair[0] + " e de " + pair[1]);
        }
        return pair;
    }

    private static boolean findFlush(int[][] m, int size) {
        boolean isFlush = false;
        int[] suit = {0, 0, 0, 0};
        for (int i = 0; i < size; i++) {
            suit[m[1][i]]++;
        }
        for (int i = 0; i < 4; i++) {
            if (suit[i] >= 5) {
                System.out.println("FLUSH!");
                isFlush = true;
            }
        }
        return isFlush;
    }

    private static boolean findFlushDraw(int[][] m, int size) {
        boolean isFlushDraw = false;
        int[] suit = {0, 0, 0, 0};
        for (int i = 0; i < size; i++) {
            suit[m[1][i]]++;
        }
        for (int i = 0; i < 4; i++) {
            if (suit[i] == 4) {
                System.out.println("Uma carta para o FLUSH!");
                isFlushDraw = true;
            }
        }
        return isFlushDraw;
    }

    private static int findSeq(int[][] m, int size) {
        int[] seq = new int[size];
        int cont = 0, maiorV = 0, maiorC = 0;
        for (int i = 0; i < size; i++) {
            seq[i] = m[0][i];
        }
        Arrays.sort(seq);
        for (int i = 0; i < size - 1; i++) {
            //System.out.println(seq[i] + "  " + seq[i + 1]);
            if ((seq[i] + 1) == seq[i + 1]) {
                cont++;
                if (cont >= maiorC) {
                    maiorC = cont;
                    maiorV = seq[i + 1];
                    //System.out.println(maiorV);
                    if (maiorV == 13 && seq[0] == 1 && cont == 3) {
                        maiorV = 1;
                        maiorC++;
                    }
                }
            } else {
                cont = 0;
            }
        }

        if (maiorC >= 4) {
            System.out.println("Sequência até " + maiorV);
            return maiorV;
        } else {
            return 0;
        }

    }

    private static int findQuadra(int[][] m, int size) {
        int cont = 0, temp;
        for (int i = 0; i < size; i++) {
            temp = m[0][i];
            for (int j = i + 1; j < size; j++) {
                if (temp == m[0][j]) {
                    cont++;
                }
            }
            if (cont == 4) {
                System.out.println("QUADRA de " + temp);
                return temp;
            } else {
                cont = 0;
            }

        }
        return 0;
    }

    // primeiro trinca e depois par
    private static int[] findFullHouse(int[][] m, int size) {
        int[] fullHouse = {0, 0};
        int temp, cont = 0, trinca = findTrips(m, size);
        if (trinca != 0) {
            fullHouse[0] = trinca;
            for (int i = 0; i < size; i++) {
                temp = m[0][i];
                for (int j = i + 1; j < size; j++) {
                    if (temp == m[0][j]) {
                        cont++;
                        if (cont == 1 && temp != trinca) {
                            fullHouse[1] = temp;
                        }

                    }
                    cont = 0;
                }
            }

        }
        //System.out.println(fullHouse[0]+"  "+fullHouse[1]);
        if (fullHouse[1] == 0) {
            fullHouse[0] = 0;
        } else {
            System.out.println(" FULL HOUSE! Trinca de " + fullHouse[1] + " e par de " + fullHouse[0]);

        }

        return fullHouse;
    }

    private static int findSeqFlush(int[][] m, int size) {
        int[] seq = new int[size];
        int cont = 0, maiorV = 0, maiorC = 0;
        for (int i = 0; i < size; i++) {
            seq[i] = m[0][i];
        }
        Arrays.sort(seq);
        for (int i = 0; i < size - 1; i++) {
            //System.out.println(seq[i] + "  " + seq[i + 1]);
            if ((seq[i] + 1) == seq[i + 1]) {
                cont++;
                if (cont >= maiorC) {
                    maiorC = cont;
                    maiorV = seq[i + 1];
                    //System.out.println(maiorV);
                    if (maiorV == 13 && seq[0] == 1 && cont == 3) {
                        maiorV = 1;
                        maiorC++;
                    }
                }
            } else {
                cont = 0;
            }
        }

        if (maiorC >= 4) {
            int[] suit = {0, 0, 0, 0};
            for (int i = 0; i < size; i++) {
                if (m[0][i] > maiorV - 5 && m[0][1] <= maiorV) {
                    suit[m[1][i]]++;
                }
            }
            for (int i = 0; i < 4; i++) {
                if (suit[i] >= 5) {
                    System.out.println("ROYAL FLUSH!");
                    return maiorV;
                }
            }
        }
        return 0;
    }

    private static int[] findKicker(int[][] m, int size){
        Arrays.sort(m[0]);
        int[] seq = new int[5];
        for(int i =0; i<5;i++)
            seq[i] = m[0][(size-1)-i];
        return seq;
    }
}
