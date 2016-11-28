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
public class Fuzzificador {

    public double getForcaMaoPreFlop(int[][] m) {
        double f = 0;
        boolean sameSuit = false;
        //check pair
        if (m[0][0] == m[0][1]) {
            return ratePairPreFlop(m[0][0]);
        }

        //check same naipe
        if (m[1][0] == m[1][1]) {
            sameSuit = true;
        }
        
        //A?
        if (m[0][0] == 1) {
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
                        f = 0.69;
                    } else {
                        f = 0.67;
                    }
                    break;

                case 11:
                    if (sameSuit) {
                        f = 0.65;
                    } else {
                        f = 0.63;
                    }
                    break;
                case 12:
                    if (sameSuit) {
                        f = 0.7;
                    } else {
                        f = 0.65;
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

    private double ratePairPreFlop(int p) {
        double f = 0;
        switch (p) {
            case 1:
                f = 1;
                break;
            case 2:
                f = 0.50;
                break;
            case 3:
                f = 0.51;
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
}
