package org.example.fifthlab;


import javafx.scene.text.Text;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class CalculatorController {
    public Text screen;
    String line = "";
    public void buttonOne() {
        line += "1";
        screen.setText(line);
    }
    public void buttonTwo() {
        line += "2";
        screen.setText(line);
    }
    public void buttonThree() {
        line += "3";
        screen.setText(line);
    }
    public void buttonFour() {
        line += "4";
        screen.setText(line);
    }
    public void buttonFive() {
        line += "5";
        screen.setText(line);
    }
    public void buttonSix() {
        line += "6";
        screen.setText(line);
    }
    public void buttonSeven() {
        line += "7";
        screen.setText(line);
    }
    public void buttonEight() {
        line += "8";
        screen.setText(line);
    }
    public void buttonNine() {
        line += "9";
        screen.setText(line);
    }
    public void buttonMinus() {
        line += "-";
        screen.setText(line);
    }
    public void buttonNull() {
        line += "0";
        screen.setText(line);
    }
    public void buttonDot() {
        line += ".";
        screen.setText(line);
    }
    public void buttonPlus() {
        line += "+";
        screen.setText(line);
    }
    public void buttonMultiply() {
        line += "*";
        screen.setText(line);
    }
    public void buttonDel() {
        line += "/";
        screen.setText(line);
    }


    public void buttonOk() throws ScriptException {
        double res = eval(line);
        String result = "" + res;
        screen.setText(result);
    }

    public void buttonClear() {
        line = "";
        screen.setText(line);
    }

    //ниже украденный парсер:
    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;
            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }
            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }
            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }
            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }
            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }
            double parseFactor() {
                if (eat('+')) return +parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus
                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    if (!eat(')')) throw new RuntimeException("Missing ')'");
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    if (eat('(')) {
                        x = parseExpression();
                        if (!eat(')')) throw new RuntimeException("Missing ')' after argument to " + func);
                    } else {
                        x = parseFactor();
                    }
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }
                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation
                return x;
            }
        }.parse();
    }
}
