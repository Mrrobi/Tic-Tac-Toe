
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HumanToPcHard extends javax.swing.JFrame {

    String T1, T2, T3, T4, T5, T6, T7, T8, T9, winText;
    boolean player = true;
    boolean winner = false;
    String lastMove;
    Thread one = new Thread(new Runnable() {
        @Override
        public void run() {
            while (true) {
                //System.out.println("one running");
                if (winner) {
                    System.out.println("Winner Find PC");
                    if (winText.matches("O")) {
                        two.stop();
                        three.stop();
                        four.stop();
                        five.stop();
                        TA1.setEnabled(true);
                        TA1.setText("Computer's wins!!!");
                        jPanel1.setVisible(false);
                        one.stop();

                    } else {
                        two.stop();
                        three.stop();
                        four.stop();
                        five.stop();
                        TA1.setEnabled(true);
                        TA1.setText("Human wins!!!");
                        jPanel1.setVisible(false);
                        one.stop();
                    }
                }
                try {
                    Thread.sleep(50);
                } catch (InterruptedException ex) {
                    Logger.getLogger(HumanToHuman.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    });
    Thread two = new Thread(new Runnable() {
        @Override
        public void run() {
            while (true) {
                //System.out.println("two running");

                if (T1 == T2 && T2 == T3 && T1 != null) {
                    winner = true;
                    winText = T1;
                    System.out.println("W");
                    two.stop();
                    break;
                } else if (T1 == T4 && T4 == T7 && T1 != null) {
                    winner = true;
                    winText = T1;
                    System.out.println("W");
                    two.stop();
                    break;
                } else if (T1 == T5 && T5 == T9 && T1 != null) {
                    winner = true;
                    winText = T1;
                    System.out.println("W");
                    two.stop();
                    break;
                } else if (T2 == T5 && T5 == T8 && T2 != null) {
                    winner = true;
                    winText = T2;
                    System.out.println("w");
                    two.stop();
                    break;
                } else if (T4 == T5 && T5 == T6 && T4 != null) {
                    winner = true;
                    winText = T4;
                    System.out.println("W");
                    two.stop();
                    break;
                } else if (T7 == T8 && T8 == T9 && T7 != null) {
                    winner = true;
                    winText = T7;
                    System.out.println("W");
                    two.stop();
                    break;
                } else if (T3 == T5 && T5 == T7 && T3 != null) {
                    winner = true;
                    winText = T3;
                    System.out.println("W");
                    two.stop();
                    break;
                } else if (T3 == T6 && T6 == T9 && T3 != null) {
                    winner = true;
                    winText = T3;
                    System.out.println("W");
                    two.stop();
                    break;
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(HumanToPcEasy.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }
    });
    Thread three = new Thread(new Runnable() {
        @Override
        public void run() {
            while (true) {
                //System.out.println("i am here");
                if (!player) {
                    //System.out.println("i am here");
                    if (T1 == null) {
                        B1.setEnabled(false);
                    }
                    if (T2 == null) {
                        B2.setEnabled(false);
                    }
                    if (T3 == null) {
                        B3.setEnabled(false);
                    }
                    if (T4 == null) {
                        B4.setEnabled(false);
                    }
                    if (T5 == null) {
                        B5.setEnabled(false);
                    }
                    if (T6 == null) {
                        B6.setEnabled(false);
                    }
                    if (T7 == null) {
                        B7.setEnabled(false);
                    }
                    if (T8 == null) {
                        B8.setEnabled(false);
                    }
                    if (T9 == null) {
                        B9.setEnabled(false);
                    }
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(HumanToPcEasy.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    });
    Thread four = new Thread(new Runnable() {
        String[] str = new String[]{"T1", "T2", "T3", "T4", "T5", "T6", "T7", "T8", "T9"};

        @Override
        public void run() {
            while (true) {

                if (!player) {
                    System.out.println("I am here");
                    if (lastMove.equalsIgnoreCase("T1")) {
                        if (T1 == T2 && T1 != null && T3 == null) {
                            B3.setText("O");
                            T3 = "O";
                            player = true;
                            TA1.setText("Human's Turn");
                        } else if (T1 == T5 && T1 != null && T9 == null) {
                            B9.setText("O");
                            T9 = "O";
                            player = true;
                            TA1.setText("Human's Turn");
                        } else if (T1 == T4 && T1 != null && T7 == null) {
                            B7.setText("O");
                            T7 = "O";
                            player = true;
                            TA1.setText("Human's Turn");
                        } else {
                            Random r = new Random();
                            int n = 0;
                            n = r.nextInt(3) + 1;
                            System.out.println(n);
                            switch (n) {
                                case 1:
                                    if (T2 == null) {
                                        B2.setText("O");
                                        T2 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                        break;
                                    }
                                case 2:
                                    if (T5 == null) {
                                        B5.setText("O");
                                        T5 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                        break;
                                    }
                                case 3:
                                    if (T4 == null) {
                                        B4.setText("O");
                                        T4 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                        break;
                                    }
                                default:
                                    if (T3 == null) {
                                        B3.setText("O");
                                        T3 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                    } else if (T6 == null) {
                                        B6.setText("O");
                                        T6 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                    } else if (T7 == null) {
                                        B7.setText("O");
                                        T7 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                    } else if (T8 == null) {
                                        B8.setText("O");
                                        T8 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                    } else if (T9 == null) {
                                        B9.setText("O");
                                        T9 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                    }
                            }
                        }
                    } else if (lastMove.equalsIgnoreCase("T2")) {
                        if (T2 == T1 && T3 == null) {
                            B3.setText("O");
                            T3 = "O";
                            player = true;
                            TA1.setText("Human's Turn");
                        } else if (T2 == T3 && T1 == null) {
                            B1.setText("O");
                            T1 = "O";
                            player = true;
                            TA1.setText("Human's Turn");
                        } else if (T2 == T5 && T8 == null) {
                            B8.setText("O");
                            T8 = "O";
                            player = true;
                            TA1.setText("Human's Turn");
                        } else {
                            Random r = new Random();
                            int n = 0;
                            n = r.nextInt(3) + 1;
                            System.out.println(n);
                            switch (n) {
                                case 1:
                                    if (T1 == null) {
                                        B1.setText("O");
                                        T1 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                        break;
                                    }
                                case 2:
                                    if (T3 == null) {
                                        B3.setText("O");
                                        T3 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                        break;
                                    }
                                case 3:
                                    if (T5 == null) {
                                        B5.setText("O");
                                        T5 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                        break;
                                    }
                                default:
                                    if (T4 == null) {
                                        B4.setText("O");
                                        T4 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                    } else if (T6 == null) {
                                        B6.setText("O");
                                        T6 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                    } else if (T7 == null) {
                                        B7.setText("O");
                                        T7 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                    } else if (T8 == null) {
                                        B8.setText("O");
                                        T8 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                    } else if (T9 == null) {
                                        B9.setText("O");
                                        T9 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                    }
                            }
                        }
                    } else if (lastMove.equalsIgnoreCase("T3")) {
                        if (T3 == T6 && T9 == null) {
                            B9.setText("O");
                            T9 = "O";
                            player = true;
                            TA1.setText("Human's Turn");
                        } else if (T2 == T3 && T1 == null) {
                            B1.setText("O");
                            T1 = "O";
                            player = true;
                            TA1.setText("Human's Turn");
                        } else if (T3 == T5 && T7 == null) {
                            B7.setText("O");
                            T7 = "O";
                            player = true;
                            TA1.setText("Human's Turn");
                        } else {
                            Random r = new Random();
                            int n = 0;
                            n = r.nextInt(3) + 1;
                            System.out.println(n);
                            switch (n) {
                                case 1:
                                    if (T2 == null) {
                                        B2.setText("O");
                                        T2 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                        break;
                                    }
                                case 2:
                                    if (T6 == null) {
                                        B6.setText("O");
                                        T6 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                        break;
                                    }
                                case 3:
                                    if (T5 == null) {
                                        B5.setText("O");
                                        T5 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                        break;
                                    }
                                default:
                                    if (T1 == null) {
                                        B1.setText("O");
                                        T1 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                    } else if (T4 == null) {
                                        B4.setText("O");
                                        T4 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                    } else if (T7 == null) {
                                        B7.setText("O");
                                        T7 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                    } else if (T8 == null) {
                                        B8.setText("O");
                                        T8 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                    } else if (T9 == null) {
                                        B9.setText("O");
                                        T9 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                    }
                            }
                        }
                    } else if (lastMove.equalsIgnoreCase("T4")) {
                        if (T4 == T1 && T7 == null) {
                            B7.setText("O");
                            T7 = "O";
                            player = true;
                            TA1.setText("Human's Turn");
                        } else if (T4 == T7 && T1 == null) {
                            B1.setText("O");
                            T1 = "O";
                            player = true;
                            TA1.setText("Human's Turn");
                        } else if (T4 == T5 && T6 == null) {
                            B6.setText("O");
                            T6 = "O";
                            player = true;
                            TA1.setText("Human's Turn");
                        } else {
                            Random r = new Random();
                            int n = 0;
                            n = r.nextInt(3) + 1;
                            System.out.println(n);
                            switch (n) {
                                case 1:
                                    if (T1 == null) {
                                        B1.setText("O");
                                        T1 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                        break;
                                    }
                                case 2:
                                    if (T5 == null) {
                                        B5.setText("O");
                                        T5 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                        break;
                                    }
                                case 3:
                                    if (T7 == null) {
                                        B7.setText("O");
                                        T7 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                        break;
                                    }
                                default:
                                    if (T3 == null) {
                                        B3.setText("O");
                                        T3 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                    } else if (T6 == null) {
                                        B6.setText("O");
                                        T6 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                    } else if (T2 == null) {
                                        B2.setText("O");
                                        T2 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                    } else if (T8 == null) {
                                        B8.setText("O");
                                        T8 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                    } else if (T9 == null) {
                                        B9.setText("O");
                                        T9 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                    }
                            }
                        }
                    } else if (lastMove.equalsIgnoreCase("T6")) {
                        if (T6 == T3 && T9 == null) {
                            B9.setText("O");
                            T9 = "O";
                            player = true;
                            TA1.setText("Human's Turn");
                        } else if (T6 == T9 && T3 == null) {
                            B3.setText("O");
                            T3 = "O";
                            player = true;
                            TA1.setText("Human's Turn");
                        } else if (T6 == T5 && T4 == null) {
                            B4.setText("O");
                            T4 = "O";
                            player = true;
                            TA1.setText("Human's Turn");
                        } else {
                            Random r = new Random();
                            int n = 0;
                            n = r.nextInt(3) + 1;
                            System.out.println(n);
                            switch (n) {
                                case 1:
                                    if (T3 == null) {
                                        B3.setText("O");
                                        T3 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                        break;
                                    }
                                case 2:
                                    if (T5 == null) {
                                        B5.setText("O");
                                        T5 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                        break;
                                    }
                                case 3:
                                    if (T9 == null) {
                                        B9.setText("O");
                                        T9 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                        break;
                                    }
                                default:
                                    if (T2 == null) {
                                        B2.setText("O");
                                        T2 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                    } else if (T1 == null) {
                                        B1.setText("O");
                                        T1 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                    } else if (T7 == null) {
                                        B7.setText("O");
                                        T7 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                    } else if (T8 == null) {
                                        B8.setText("O");
                                        T8 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                    } else if (T4 == null) {
                                        B4.setText("O");
                                        T4 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                    }
                            }
                        }
                    } else if (lastMove.equalsIgnoreCase("T7")) {
                        if (T7 == T4 && T1 == null) {
                            B1.setText("O");
                            T1 = "O";
                            player = true;
                            TA1.setText("Human's Turn");
                        } else if (T7 == T8 && T9 == null) {
                            B9.setText("O");
                            T9 = "O";
                            player = true;
                            TA1.setText("Human's Turn");
                        } else if (T7 == T5 && T3 == null) {
                            B3.setText("O");
                            T3 = "O";
                            player = true;
                            TA1.setText("Human's Turn");
                        } else {
                            Random r = new Random();
                            int n = 0;
                            n = r.nextInt(3) + 1;
                            System.out.println(n);
                            switch (n) {
                                case 1:
                                    if (T4 == null) {
                                        B4.setText("O");
                                        T4 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                        break;
                                    }
                                case 2:
                                    if (T5 == null) {
                                        B5.setText("O");
                                        T5 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                        break;
                                    }
                                case 3:
                                    if (T8 == null) {
                                        B8.setText("O");
                                        T8 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                        break;
                                    }
                                default:
                                    if (T3 == null) {
                                        B3.setText("O");
                                        T3 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                    } else if (T6 == null) {
                                        B6.setText("O");
                                        T6 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                    } else if (T1 == null) {
                                        B1.setText("O");
                                        T1 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                    } else if (T2 == null) {
                                        B2.setText("O");
                                        T2 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                    } else if (T9 == null) {
                                        B9.setText("O");
                                        T9 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                    }
                            }
                        }
                    } else if (lastMove.equalsIgnoreCase("T8")) {
                        if (T8 == T9 && T7 == null) {
                            B7.setText("O");
                            T7 = "O";
                            player = true;
                            TA1.setText("Human's Turn");
                        } else if (T7 == T8 && T9 == null) {
                            B9.setText("O");
                            T9 = "O";
                            player = true;
                            TA1.setText("Human's Turn");
                        } else if (T8 == T5 && T2 == null) {
                            B2.setText("O");
                            T2 = "O";
                            player = true;
                            TA1.setText("Human's Turn");
                        } else {
                            Random r = new Random();
                            int n = 0;
                            n = r.nextInt(3) + 1;
                            System.out.println(n);
                            switch (n) {
                                case 1:
                                    if (T7 == null) {
                                        B7.setText("O");
                                        T7 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                        break;
                                    }
                                case 2:
                                    if (T5 == null) {
                                        B5.setText("O");
                                        T5 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                        break;
                                    }
                                case 3:
                                    if (T9 == null) {
                                        B9.setText("O");
                                        T9 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                        break;
                                    }
                                default:
                                    if (T1 == null) {
                                        B1.setText("O");
                                        T1 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                    } else if (T6 == null) {
                                        B6.setText("O");
                                        T6 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                    } else if (T2 == null) {
                                        B2.setText("O");
                                        T2 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                    } else if (T3 == null) {
                                        B3.setText("O");
                                        T3 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                    } else if (T4 == null) {
                                        B4.setText("O");
                                        T4 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                    }
                            }
                        }
                    } else if (lastMove.equalsIgnoreCase("T9")) {
                        if (T8 == T9 && T7 == null) {
                            B7.setText("O");
                            T7 = "O";
                            player = true;
                            TA1.setText("Human's Turn");
                        } else if (T9 == T6 && T3 == null) {
                            B3.setText("O");
                            T3 = "O";
                            player = true;
                            TA1.setText("Human's Turn");
                        } else if (T9 == T5 && T1 == null) {
                            B1.setText("O");
                            T1 = "O";
                            player = true;
                            TA1.setText("Human's Turn");
                        } else {
                            Random r = new Random();
                            int n = 0;
                            n = r.nextInt(3) + 1;
                            System.out.println(n);
                            switch (n) {
                                case 1:
                                    if (T6 == null) {
                                        B6.setText("O");
                                        T6 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                        break;
                                    }
                                case 2:
                                    if (T5 == null) {
                                        B5.setText("O");
                                        T5 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                        break;
                                    }
                                case 3:
                                    if (T8 == null) {
                                        B8.setText("O");
                                        T8 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                        break;
                                    }
                                default:
                                    if (T3 == null) {
                                        B3.setText("O");
                                        T3 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                    } else if (T2 == null) {
                                        B2.setText("O");
                                        T2 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                    } else if (T7 == null) {
                                        B7.setText("O");
                                        T7 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                    } else if (T1 == null) {
                                        B1.setText("O");
                                        T1 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                    } else if (T4 == null) {
                                        B4.setText("O");
                                        T4 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                    }
                            }
                        }
                    } else if (lastMove.equalsIgnoreCase("T5")) {
                        System.out.println("in B5");
                        if (T5 == T1 && T9 == null) {
                            B9.setText("O");
                            T9 = "O";
                            player = true;
                            TA1.setText("Human's Turn");
                        } else if (T5 == T2 && T8 == null) {
                            B8.setText("O");
                            T8 = "O";
                            player = true;
                            TA1.setText("Human's Turn");
                        } else if (T4 == T5 && T6 == null) {
                            B6.setText("O");
                            T6 = "O";
                            player = true;
                            TA1.setText("Human's Turn");
                        } else if (T5 == T3 && T7 == null) {
                            B7.setText("O");
                            T7 = "O";
                            player = true;
                            TA1.setText("Human's Turn");
                        } else if (T5 == T6 && T4 == null) {
                            B4.setText("O");
                            T4 = "O";
                            player = true;
                            TA1.setText("Human's Turn");
                        } else if (T5 == T7 && T3 == null) {
                            B3.setText("O");
                            T3 = "O";
                            player = true;
                            TA1.setText("Human's Turn");
                        } else if (T5 == T8 && T2 == null) {
                            B2.setText("O");
                            T2 = "O";
                            player = true;
                            TA1.setText("Human's Turn");
                        } else if (T5 == T9 && T1 == null) {
                            B1.setText("O");
                            T1 = "O";
                            player = true;
                            TA1.setText("Human's Turn");
                        } else {
                            Random r = new Random();
                            int n = 0;
                            n = r.nextInt(8) + 1;
                            System.out.println(n);
                            switch (n) {
                                case 1:
                                    if (T1 == null) {
                                        B1.setText("O");
                                        T1 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                        break;
                                    }

                                case 2:
                                    if (T2 == null) {
                                        B2.setText("O");
                                        T2 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                        break;
                                    }
                                case 3:
                                    if (T3 == null) {
                                        B3.setText("O");
                                        T3 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                        break;
                                    }
                                case 4:
                                    if (T4 == null) {
                                        B4.setText("O");
                                        T4 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                        break;
                                    }
                                case 5:
                                    if (T6 == null) {
                                        B6.setText("O");
                                        T6 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                        break;
                                    }
                                case 6:
                                    if (T7 == null) {
                                        B7.setText("O");
                                        T7 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                        break;
                                    }
                                case 7:
                                    if (T8 == null) {
                                        B8.setText("O");
                                        T8 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                        break;
                                    }
                                case 8:
                                    if (T9 == null) {
                                        B9.setText("O");
                                        T9 = "O";
                                        player = true;
                                        TA1.setText("Human's Turn");
                                        break;
                                    }

                            }
                        }
                    }
                    
                }
                try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(HumanToPcEasy.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
        }
    });
    Thread five = new Thread(new Runnable() {
        @Override
        public void run() {
            while (true) {
                if (player) {

                    B1.setEnabled(true);

                    B2.setEnabled(true);

                    B3.setEnabled(true);

                    B4.setEnabled(true);

                    B5.setEnabled(true);

                    B6.setEnabled(true);

                    B7.setEnabled(true);

                    B8.setEnabled(true);

                    B9.setEnabled(true);
                }
                if (T1 != null && T2 != null && T3 != null && T4 != null && T5 != null && T6 != null && T7 != null && T8 != null && T9 != null && !winner) {
                    jPanel1.setVisible(false);
                    TA1.setEnabled(true);
                    TA1.setText("Match Draw!!!");
                    one.stop();
                    two.stop();
                    three.stop();
                    four.stop();
                    five.stop();

                }
                try {
                    Thread.sleep(100);

                } catch (InterruptedException ex) {
                    Logger.getLogger(HumanToPcEasy.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    });

    public HumanToPcHard() {
        initComponents();
        setLocationRelativeTo(null);
        TA1.setText("Human Turn");
        one.start();
        two.start();
        three.start();
        four.start();
        five.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        B1 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        B1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        B4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        B6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        B7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        B8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        B9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jScrollPane1.setEnabled(false);
        jScrollPane1.setFocusable(false);

        TA1.setEditable(false);
        TA1.setColumns(20);
        TA1.setRows(5);
        TA1.setEnabled(false);
        jScrollPane1.setViewportView(TA1);

        jLabel1.setText("< Back");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        // TODO add your handling code here:
        if (player && T2 == null) {
            B2.setText("X");
            T2 = "X";
            lastMove = "T2";
            player = false;
            TA1.setText("Computer's Turn");
        }
    }//GEN-LAST:event_B2ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        // TODO add your handling code here:
        if (player && T9 == null) {
            B9.setText("X");
            T9 = "X";
            lastMove = "T9";
            player = false;
            TA1.setText("Computer's Turn");
        }
    }//GEN-LAST:event_B9ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        // TODO add your handling code here:
        if (player && T1 == null) {
            B1.setText("X");
            T1 = "X";
            lastMove = "T1";
            player = false;
            TA1.setText("Computer's Turn");
        }
    }//GEN-LAST:event_B1ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        // TODO add your handling code here:
        if (player && T3 == null) {
            B3.setText("X");
            T3 = "X";
            lastMove = "T3";
            player = false;
            TA1.setText("Computer's Turn");
        }
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        // TODO add your handling code here:
        if (player && T4 == null) {
            B4.setText("X");
            T4 = "X";
            lastMove = "T4";
            player = false;
            TA1.setText("Computer's Turn");
        }
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        // TODO add your handling code here:
        if (player && T5 == null) {
            B5.setText("X");
            T5 = "X";
            lastMove = "T5";
            player = false;
            TA1.setText("Computer's Turn");
        }
    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        // TODO add your handling code here:
        if (player && T6 == null) {
            B6.setText("X");
            T6 = "X";
            lastMove = "T6";
            player = false;
            TA1.setText("Computer's Turn");
        }
    }//GEN-LAST:event_B6ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        // TODO add your handling code here:
        if (player && T7 == null) {
            B7.setText("X");
            T7 = "X";
            lastMove = "T7";
            player = false;
            TA1.setText("Computer's Turn");
        }
    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        // TODO add your handling code here:
        if (player && T8 == null) {
            B8.setText("X");
            T8 = "X";
            lastMove = "T8";
            player = false;
            TA1.setText("Computer's Turn");
        }
    }//GEN-LAST:event_B8ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        Welcome w = new Welcome();
        w.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HumanToHuman.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HumanToHuman.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HumanToHuman.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HumanToHuman.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HumanToPcHard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JTextArea TA1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
