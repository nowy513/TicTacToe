package com.kodilla.TicTacToe;

public class Controller extends Score {

    public static void controller() {
        if(fields[0].getState() + fields[1].getState() == -2 || fields[1].getState() + fields[2].getState() == -2 || fields[0].getState() + fields[2].getState() == -2) {
            if(fields[0].getState() == 0) {
                fields[0].setState(-1);
                remis++;
            } else if(fields[1].getState() == 0) {
                fields[1].setState(-1);
                remis++;
            } else if(fields[2].getState() == 0) {
                fields[2].setState(-1);
                remis++;
            } else {
                for(Fields button : fields) {
                    if(button.getState() == 0) {
                        button.setState(-1);
                        remis++;
                        break;
                    }
                }
            }
        } else if(fields[3].getState() + fields[4].getState() == -2 || fields[4].getState() + fields[5].getState() == -2 || fields[3].getState() + fields[5].getState() == -2) {
            if(fields[3].getState() == 0) {
                fields[3].setState(-1);
                remis++;
            } else if(fields[4].getState() == 0) {
                fields[4].setState(-1);
                remis++;
            } else if(fields[5].getState() == 0) {
                fields[5].setState(-1);
                remis++;
            } else {
                for(Fields button : fields) {
                    if(button.getState() == 0) {
                        button.setState(-1);
                        remis++;
                        break;
                    }
                }
            }
        } else if(fields[6].getState() + fields[7].getState() == -2 || fields[7].getState() + fields[8].getState() == -2 || fields[6].getState() + fields[8].getState() == -2) {
            if(fields[6].getState() == 0) {
                fields[6].setState(-1);
                remis++;
            } else if(fields[7].getState() == 0) {
                fields[7].setState(-1);
                remis++;
            } else if(fields[8].getState() == 0) {
                fields[8].setState(-1);
                remis++;
            } else {
                for(Fields button : fields) {
                    if(button.getState() == 0) {
                        button.setState(-1);
                        remis++;
                        break;
                    }
                }
            }
        } else if(fields[0].getState() + fields[3].getState() == -2 || fields[3].getState() + fields[6].getState() == -2 || fields[0].getState() + fields[6].getState() == -2) {
            if(fields[0].getState() == 0) {
                fields[0].setState(-1);
                remis++;
            } else if(fields[3].getState() == 0) {
                fields[3].setState(-1);
                remis++;
            } else if(fields[6].getState() == 0) {
                fields[6].setState(-1);
                remis++;
            } else {
                for(Fields button : fields) {
                    if(button.getState() == 0) {
                        button.setState(-1);
                        remis++;
                        break;
                    }
                }
            }
        } else if(fields[1].getState() + fields[4].getState() == -2 || fields[4].getState() + fields[7].getState() == -2 || fields[1].getState() + fields[7].getState() == -2) {
            if(fields[1].getState() == 0) {
                fields[1].setState(-1);
                remis++;
            } else if(fields[4].getState() == 0) {
                fields[4].setState(-1);
                remis++;
            } else if(fields[7].getState() == 0) {
                fields[7].setState(-1);
                remis++;
            } else {
                for(Fields button : fields) {
                    if(button.getState() == 0) {
                        button.setState(-1);
                        remis++;
                        break;
                    }
                }
            }
        } else if(fields[2].getState() + fields[5].getState() == -2 || fields[5].getState() + fields[8].getState() == -2 || fields[2].getState() + fields[8].getState() == -2) {
            if(fields[2].getState() == 0) {
                fields[2].setState(-1);
                remis++;
            } else if(fields[5].getState() == 0) {
                fields[5].setState(-1);
                remis++;
            } else if(fields[8].getState() == 0) {
                fields[8].setState(-1);
                remis++;
            } else {
                for(Fields button : fields) {
                    if(button.getState() == 0) {
                        button.setState(-1);
                        remis++;
                        break;
                    }
                }
            }
        } else if(fields[0].getState() + fields[4].getState() == -2 || fields[4].getState() + fields[8].getState() == -2 || fields[0].getState() + fields[8].getState() == -2) {
            if(fields[0].getState() == 0) {
                fields[0].setState(-1);
                remis++;
            } else if(fields[4].getState() == 0) {
                fields[4].setState(-1);
                remis++;
            } else if(fields[8].getState() == 0) {
                fields[8].setState(-1);
                remis++;
            } else {
                for(Fields button : fields) {
                    if(button.getState() == 0) {
                        button.setState(-1);
                        remis++;
                        break;
                    }
                }
            }
        } else if(fields[2].getState() + fields[4].getState() == -2 || fields[4].getState() + fields[6].getState() == -2 || fields[2].getState() + fields[6].getState() == -2) {
            if (fields[2].getState() == 0) {
                fields[2].setState(-1);
                remis++;
            } else if (fields[4].getState() == 0) {
                fields[4].setState(-1);
                remis++;
            } else if (fields[6].getState() == 0) {
                fields[6].setState(-1);
                remis++;
            } else {
                for(Fields button : fields) {
                    if(button.getState() == 0) {
                        button.setState(-1);
                        remis++;
                        break;
                    }
                }
            }
        }else if(fields[0].getState() + fields[1].getState() == 2 || fields[1].getState() + fields[2].getState() == 2 || fields[0].getState() + fields[2].getState() == 2) {
            if(fields[0].getState() == 0) {
                fields[0].setState(-1);
                remis++;
            } else if(fields[1].getState() == 0) {
                fields[1].setState(-1);
                remis++;
            } else if(fields[2].getState() == 0) {
                fields[2].setState(-1);
                remis++;
            } else {
                for(Fields button : fields) {
                    if(button.getState() == 0) {
                        button.setState(-1);
                        remis++;
                        break;
                    }
                }
            }
        } else if(fields[3].getState() + fields[4].getState() == 2 || fields[4].getState() + fields[5].getState() == 2 || fields[3].getState() + fields[5].getState() == 2) {
            if(fields[3].getState() == 0) {
                fields[3].setState(-1);
                remis++;
            } else if(fields[4].getState() == 0) {
                fields[4].setState(-1);
                remis++;
            } else if(fields[5].getState() == 0) {
                fields[5].setState(-1);
                remis++;
            } else {
                for(Fields button : fields) {
                    if(button.getState() == 0) {
                        button.setState(-1);
                        remis++;
                        break;
                    }
                }
            }
        } else if(fields[6].getState() + fields[7].getState() == 2 || fields[7].getState() + fields[8].getState() == 2 || fields[6].getState() + fields[8].getState() == 2) {
            if(fields[6].getState() == 0) {
                fields[6].setState(-1);
                remis++;
            } else if(fields[7].getState() == 0) {
                fields[7].setState(-1);
                remis++;
            } else if(fields[8].getState() == 0) {
                fields[8].setState(-1);
                remis++;
            } else {
                for(Fields button : fields) {
                    if(button.getState() == 0) {
                        button.setState(-1);
                        remis++;
                        break;
                    }
                }
            }
        } else if(fields[0].getState() + fields[3].getState() == 2 || fields[3].getState() + fields[6].getState() == 2 || fields[0].getState() + fields[6].getState() == 2) {
            if(fields[0].getState() == 0) {
                fields[0].setState(-1);
                remis++;
            } else if(fields[3].getState() == 0) {
                fields[3].setState(-1);
                remis++;
            } else if(fields[6].getState() == 0) {
                fields[6].setState(-1);
                remis++;
            } else {
                for(Fields button : fields) {
                    if(button.getState() == 0) {
                        button.setState(-1);
                        remis++;
                        break;
                    }
                }
            }
        } else if(fields[1].getState() + fields[4].getState() == 2 || fields[4].getState() + fields[7].getState() == 2 || fields[1].getState() + fields[7].getState() == 2) {
            if(fields[1].getState() == 0) {
                fields[1].setState(-1);
                remis++;
            } else if(fields[4].getState() == 0) {
                fields[4].setState(-1);
                remis++;
            } else if(fields[7].getState() == 0) {
                fields[7].setState(-1);
                remis++;
            } else {
                for(Fields button : fields) {
                    if(button.getState() == 0) {
                        button.setState(-1);
                        remis++;
                        break;
                    }
                }
            }
        } else if(fields[2].getState() + fields[5].getState() == 2 || fields[5].getState() + fields[8].getState() == 2 || fields[2].getState() + fields[8].getState() == 2) {
            if(fields[2].getState() == 0) {
                fields[2].setState(-1);
                remis++;
            } else if(fields[5].getState() == 0) {
                fields[5].setState(-1);
                remis++;
            } else if(fields[8].getState() == 0) {
                fields[8].setState(-1);
                remis++;
            } else {
                for(Fields button : fields) {
                    if(button.getState() == 0) {
                        button.setState(-1);
                        remis++;
                        break;
                    }
                }
            }
        } else if(fields[0].getState() + fields[4].getState() == 2 || fields[4].getState() + fields[8].getState() == 2 || fields[0].getState() + fields[8].getState() == 2) {
            if(fields[0].getState() == 0) {
                fields[0].setState(-1);
                remis++;
            } else if(fields[4].getState() == 0) {
                fields[4].setState(-1);
                remis++;
            } else if(fields[8].getState() == 0) {
                fields[8].setState(-1);
                remis++;
            } else {
                for(Fields button : fields) {
                    if(button.getState() == 0) {
                        button.setState(-1);
                        remis++;
                        break;
                    }
                }
            }
        } else if(fields[2].getState() + fields[4].getState() == 2 || fields[4].getState() + fields[6].getState() == 2 || fields[2].getState() + fields[6].getState() == 2) {
            if(fields[2].getState() == 0) {
                fields[2].setState(-1);
                remis++;
            } else if(fields[4].getState() == 0) {
                fields[4].setState(-1);
                remis++;
            } else if(fields[6].getState() == 0) {
                fields[6].setState(-1);
                remis++;
            } else {
                for(Fields button : fields) {
                    if(button.getState() == 0) {
                        button.setState(-1);
                        remis++;
                        break;
                    }
                }
            }
        } else {
            for(Fields button : fields) {
                if(button.getState() == 0) {
                    button.setState(-1);
                    remis++;
                    break;
                }
            }
        }
        checkScore();
    }
}
