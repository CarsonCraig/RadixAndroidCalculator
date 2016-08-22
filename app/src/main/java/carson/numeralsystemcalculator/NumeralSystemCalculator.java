package vojuln.numeralsystemcalculator;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class NumeralSystemCalculator extends AppCompatActivity {

    private static final char[] digits = {
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
            'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
    };
    public static int radix = 10;
    public static boolean basesShown = false;
    static BigDecimal resultValue = new BigDecimal(0);
    static String currentString = "";
    static String totalString = "";
    static RelativeLayout touch;

    static TextView resultText;
    static TextView enteredText;
    static TextView baseText;

    static Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonA, buttonB, buttonC, buttonD, buttonE, buttonF, buttonG, buttonH, buttonI, buttonJ,
            buttonK, buttonL, buttonM, buttonN, buttonO, buttonP, buttonQ, buttonR, buttonS, buttonT, buttonU, buttonV, buttonW, buttonX, buttonY, buttonZ,
            buttona, buttonb, buttonc, buttond, buttone, buttonf, buttong, buttonh, buttoni, buttonj,
            buttonk, buttonl, buttonm, buttonn, buttono, buttonp, buttonq, buttonr, buttons, buttont, buttonu, buttonv, buttonw, buttonx, buttony, buttonz;


    static Button buttonDivision, buttonMultiply, buttonSubtract, buttonAdd, buttonEquals, buttonDecimalPoint, buttonNegative, buttonClear, buttonDelete, buttonBase;
    static Button[] buttonArray;

    static GridLayout grid;

    static ArrayList<BigDecimal> numbers = new ArrayList<BigDecimal>();
    static ArrayList<Integer> operations = new ArrayList<Integer>();

    static Drawable drawable1, drawable2, drawable3, drawable4;

    public static void pressValueButton(char value) {
        currentString = currentString + value;
        totalString = totalString + value;
        resultValue = BigDecimal.ZERO;
    }

    public static void pressOperationButton(int operator, String value) {
        if (!resultValue.equals(BigDecimal.ZERO)) {
            numbers.add(0, resultValue);
            operations.add(0, operator);
            totalString = ConvertNumber.fromDecimal(String.valueOf(resultValue), radix, digits) + value;

            resultValue = BigDecimal.ZERO;
        }

        if (!currentString.equals("") && !currentString.equals(".") && !currentString.equals("-") && !currentString.substring(currentString.length() - 1).equals(".") && !currentString.equals("-.")) {


            numbers.add(ConvertNumber.toDecimal(currentString, radix));
            operations.add(operator);
            currentString = "";

            totalString = totalString + value;
        }
    }

    public static void changeBaseTitle() {


        switch (radix) {
            case 2:
                baseText.setText("Binary (2)");
                break;
            case 3:
                baseText.setText("Ternary (3)");
                break;
            case 4:
                baseText.setText("Quaternary (4)");
                break;
            case 5:
                baseText.setText("Quinary (5)");
                break;
            case 6:
                baseText.setText("Senary (6)");
                break;
            case 7:
                baseText.setText("Septenary (7)");
                break;
            case 8:
                baseText.setText("Octal (8)");
                break;
            case 9:
                baseText.setText("Nonary (9)");
                break;
            case 10:
                baseText.setText("Decimal (10)");
                break;
            case 11:
                baseText.setText("Undecimal (11)");
                break;
            case 12:
                baseText.setText("Duodecimal (12)");
                break;
            case 13:
                baseText.setText("Tridecimal (13)");
                break;
            case 14:
                baseText.setText("Tetradecimal (14)");
                break;
            case 15:
                baseText.setText("Pentadecimal (15)");
                break;
            case 16:
                baseText.setText("Hexadecimal (16)");
                break;
            case 17:
                baseText.setText("Septemdecimal (17)");
                break;
            case 18:
                baseText.setText("Octodecimal (18)");
                break;
            case 19:
                baseText.setText("Nonadecimal (19)");
                break;
            case 20:
                baseText.setText("Vigesimal (20)");
                break;
            case 21:
                baseText.setText("Unvigesimal (21)");
                break;
            case 22:
                baseText.setText("Duovigesimal (22)");
                break;
            case 23:
                baseText.setText("Trivigesimal (23)");
                break;
            case 24:
                baseText.setText("Tetravigesimal (24)");
                break;
            case 25:
                baseText.setText("Pentavigesimal (25)");
                break;
            case 26:
                baseText.setText("Hexavigesimal (26)");
                break;
            case 27:
                baseText.setText("Septemvigesimal (27)");
                break;
            case 28:
                baseText.setText("Octovigesimal (28)");
                break;
            case 29:
                baseText.setText("Nonavigesimal (29)");
                break;
            case 30:
                baseText.setText("Trigesimal (30)");
                break;
            case 31:
                baseText.setText("Untrigesimal (31)");
                break;
            case 32:
                baseText.setText("Duotrigesimal (32)");
                break;
            case 33:
                baseText.setText("Tritrigesimal (33)");
                break;
            case 34:
                baseText.setText("Tetratrigesimal (34)");
                break;
            case 35:
                baseText.setText("Pentatrigesimal (35)");
                break;
            case 36:
                baseText.setText("Hexatrigesimal (36)");
                break;
            case 37:
                baseText.setText("Septemtrigesimal (37)");
                break;
            case 38:
                baseText.setText("Octotrigesimal (38)");
                break;
            case 39:
                baseText.setText("Nonatrigesimal (39)");
                break;
            case 40:
                baseText.setText("Tetragesimal (40)");
                break;
            case 41:
                baseText.setText("Untetragesimal (41)");
                break;
            case 42:
                baseText.setText("Duotetragesimal (42)");
                break;
            case 43:
                baseText.setText("Tritetragesimal (43)");
                break;
            case 44:
                baseText.setText("Tetratetragesimal (44)");
                break;
            case 45:
                baseText.setText("Pentatetragesimal (45)");
                break;
            case 46:
                baseText.setText("Hexatetragesimal (46)");
                break;
            case 47:
                baseText.setText("Septemtetragesimal (47)");
                break;
            case 48:
                baseText.setText("Octotetragesimal (48)");
                break;
            case 49:
                baseText.setText("Nonatetragesimal (49)");
                break;
            case 50:
                baseText.setText("Pentagesimal (50)");
                break;
            case 51:
                baseText.setText("Unpentagesimal (51)");
                break;
            case 52:
                baseText.setText("Duopentagesimal (52)");
                break;
            case 53:
                baseText.setText("Tripentagesimal (53)");
                break;
            case 54:
                baseText.setText("Tetrapentagesimal (54)");
                break;
            case 55:
                baseText.setText("Pentapentagesimal (55)");
                break;
            case 56:
                baseText.setText("Hexapentagesimal (56)");
                break;
            case 57:
                baseText.setText("Septempentagesimal (57)");
                break;
            case 58:
                baseText.setText("Octopentagesimal (58)");
                break;
            case 59:
                baseText.setText("Nonapentagesimal (59)");
                break;
            case 60:
                baseText.setText("Hexagesimal (60)");
                break;
            case 61:
                baseText.setText("Unhexagesimal (61)");
                break;
            case 62:
                baseText.setText("Duohexagesimal (62)");
                break;
            default:
                baseText.setText("ERROR");
                break;
        }
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    public static void resetLabels() {


        resultValue = BigDecimal.ZERO;
        resultText.setText("");
        enteredText.setText("");
        currentString = "";
        totalString = "";

        touch.setBackgroundColor(Color.rgb(50, 50, 50));

        numbers = new ArrayList<BigDecimal>();
        operations = new ArrayList<Integer>();

        basesShown = !basesShown;

        changeBaseTitle();

        for (int i = 0; i < 72; i++) {
            buttonArray[i].setEnabled(true);
            buttonArray[i].setVisibility(View.VISIBLE);
        }

        for (int i = 10 + radix; i < 72; i++) {
            buttonArray[i].setEnabled(false);
            buttonArray[i].setVisibility(View.INVISIBLE);
        }

        buttonClear.setTextSize(20);
        buttonDelete.setTextSize(20);

        buttonClear.setText("CLR");
        buttonDelete.setText("DEL");
        buttonMultiply.setText("X");
        buttonDivision.setText("÷");
        buttonDecimalPoint.setText(".");
        buttonNegative.setText("(-)");
        buttonEquals.setText("=");
        buttonAdd.setText("+");
        buttonSubtract.setText("−");
        button0.setText("0");
        button1.setText("1");
        button2.setText("2");
        button3.setText("3");
        button4.setText("4");
        button5.setText("5");
        button6.setText("6");
        button7.setText("7");
        button8.setText("8");
        button9.setText("9");
        buttonA.setText("A");
        buttonB.setText("B");
        buttonC.setText("C");
        buttonD.setText("D");
        buttonE.setText("E");
        buttonF.setText("F");
        buttonG.setText("G");
        buttonH.setText("H");
        buttonI.setText("I");
        buttonJ.setText("J");
        buttonK.setText("K");
        buttonL.setText("L");
        buttonM.setText("M");
        buttonN.setText("N");
        buttonO.setText("O");
        buttonP.setText("P");
        buttonQ.setText("Q");
        buttonR.setText("R");
        buttonS.setText("S");
        buttonT.setText("T");
        buttonU.setText("U");
        buttonV.setText("V");
        buttonW.setText("W");
        buttonX.setText("X");
        buttonY.setText("Y");
        buttonZ.setText("Z");
        buttona.setText("a");
        buttonb.setText("b");
        buttonc.setText("c");
        buttond.setText("d");
        buttone.setText("e");
        buttonf.setText("f");
        buttong.setText("g");
        buttonh.setText("h");
        buttoni.setText("i");
        buttonj.setText("j");
        buttonk.setText("k");
        buttonl.setText("l");
        buttonm.setText("m");
        buttonn.setText("n");
        buttono.setText("o");
        buttonp.setText("p");
        buttonq.setText("q");
        buttonr.setText("r");
        buttons.setText("s");
        buttont.setText("t");
        buttonu.setText("u");
        buttonv.setText("v");
        buttonw.setText("w");
        buttonx.setText("x");
        buttony.setText("y");
        buttonz.setText("z");


        buttonArray[0].setBackground(drawable3);

        for (int i = 1; i < 10; i++) {
            buttonArray[i].setBackground(drawable2);
        }

        for (int i = 10; i < 72; i++) {
            buttonArray[i].setBackground(drawable1);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        touch = (RelativeLayout) findViewById(R.id.touch);

        resultText = (TextView) findViewById(R.id.result);
        enteredText = (TextView) findViewById(R.id.entered);
        baseText = (TextView) findViewById(R.id.base);


        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button0 = (Button) findViewById(R.id.button0);

        buttonA = (Button) findViewById(R.id.buttonA);
        buttonB = (Button) findViewById(R.id.buttonB);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonD = (Button) findViewById(R.id.buttonD);
        buttonE = (Button) findViewById(R.id.buttonE);
        buttonF = (Button) findViewById(R.id.buttonF);
        buttonG = (Button) findViewById(R.id.buttonG);
        buttonH = (Button) findViewById(R.id.buttonH);
        buttonI = (Button) findViewById(R.id.buttonI);
        buttonJ = (Button) findViewById(R.id.buttonJ);
        buttonK = (Button) findViewById(R.id.buttonK);
        buttonL = (Button) findViewById(R.id.buttonL);
        buttonM = (Button) findViewById(R.id.buttonM);
        buttonN = (Button) findViewById(R.id.buttonN);
        buttonO = (Button) findViewById(R.id.buttonO);
        buttonP = (Button) findViewById(R.id.buttonP);
        buttonQ = (Button) findViewById(R.id.buttonQ);
        buttonR = (Button) findViewById(R.id.buttonR);
        buttonS = (Button) findViewById(R.id.buttonS);
        buttonT = (Button) findViewById(R.id.buttonT);
        buttonU = (Button) findViewById(R.id.buttonU);
        buttonV = (Button) findViewById(R.id.buttonV);
        buttonW = (Button) findViewById(R.id.buttonW);
        buttonX = (Button) findViewById(R.id.buttonX);
        buttonY = (Button) findViewById(R.id.buttonY);
        buttonZ = (Button) findViewById(R.id.buttonZ);

        buttona = (Button) findViewById(R.id.buttona);
        buttonb = (Button) findViewById(R.id.buttonb);
        buttonc = (Button) findViewById(R.id.buttonc);
        buttond = (Button) findViewById(R.id.buttond);
        buttone = (Button) findViewById(R.id.buttone);
        buttonf = (Button) findViewById(R.id.buttonf);
        buttong = (Button) findViewById(R.id.buttong);
        buttonh = (Button) findViewById(R.id.buttonh);
        buttoni = (Button) findViewById(R.id.buttoni);
        buttonj = (Button) findViewById(R.id.buttonj);
        buttonk = (Button) findViewById(R.id.buttonk);
        buttonl = (Button) findViewById(R.id.buttonl);
        buttonm = (Button) findViewById(R.id.buttonm);
        buttonn = (Button) findViewById(R.id.buttonn);
        buttono = (Button) findViewById(R.id.buttono);
        buttonp = (Button) findViewById(R.id.buttonp);
        buttonq = (Button) findViewById(R.id.buttonq);
        buttonr = (Button) findViewById(R.id.buttonr);
        buttons = (Button) findViewById(R.id.buttons);
        buttont = (Button) findViewById(R.id.buttont);
        buttonu = (Button) findViewById(R.id.buttonu);
        buttonv = (Button) findViewById(R.id.buttonv);
        buttonw = (Button) findViewById(R.id.buttonw);
        buttonx = (Button) findViewById(R.id.buttonx);
        buttony = (Button) findViewById(R.id.buttony);
        buttonz = (Button) findViewById(R.id.buttonz);


        buttonDivision = (Button) findViewById(R.id.buttonDivision);
        buttonMultiply = (Button) findViewById(R.id.buttonMultiply);
        buttonSubtract = (Button) findViewById(R.id.buttonSubtract);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonEquals = (Button) findViewById(R.id.buttonEquals);

        buttonDecimalPoint = (Button) findViewById(R.id.buttonDecimalPoint);
        buttonNegative = (Button) findViewById(R.id.buttonNegative);
        buttonClear = (Button) findViewById(R.id.buttonClear);
        buttonDelete = (Button) findViewById(R.id.buttonDelete);

        buttonBase = (Button) findViewById(R.id.buttonBase);

        grid = (GridLayout) findViewById(R.id.grid);


        Resources res = getResources();
        Resources.Theme a = res.newTheme();
        drawable1 = res.getDrawable(R.drawable.mybutton);
        drawable2 = res.getDrawable(R.drawable.mybutton2);
        drawable3 = res.getDrawable(R.drawable.mybutton3);
        drawable4 = res.getDrawable(R.drawable.mybutton4);

        buttonArray = new Button[]{(Button) findViewById(R.id.buttonBase), (Button) findViewById(R.id.buttonClear), (Button) findViewById(R.id.buttonDelete), (Button) findViewById(R.id.buttonMultiply),
                (Button) findViewById(R.id.buttonDivision), (Button) findViewById(R.id.buttonDecimalPoint), (Button) findViewById(R.id.buttonNegative),
                (Button) findViewById(R.id.buttonEquals), (Button) findViewById(R.id.buttonAdd), (Button) findViewById(R.id.buttonSubtract),

                (Button) findViewById(R.id.button0), (Button) findViewById(R.id.button1), (Button) findViewById(R.id.button2), (Button) findViewById(R.id.button3),
                (Button) findViewById(R.id.button4), (Button) findViewById(R.id.button5), (Button) findViewById(R.id.button6),
                (Button) findViewById(R.id.button7), (Button) findViewById(R.id.button8), (Button) findViewById(R.id.button9),
                (Button) findViewById(R.id.buttonA), (Button) findViewById(R.id.buttonB),
                (Button) findViewById(R.id.buttonC), (Button) findViewById(R.id.buttonD), (Button) findViewById(R.id.buttonE),
                (Button) findViewById(R.id.buttonF), (Button) findViewById(R.id.buttonG), (Button) findViewById(R.id.buttonH),
                (Button) findViewById(R.id.buttonI), (Button) findViewById(R.id.buttonJ),
                (Button) findViewById(R.id.buttonK), (Button) findViewById(R.id.buttonL), (Button) findViewById(R.id.buttonM), (Button) findViewById(R.id.buttonN),
                (Button) findViewById(R.id.buttonO), (Button) findViewById(R.id.buttonP), (Button) findViewById(R.id.buttonQ),
                (Button) findViewById(R.id.buttonR), (Button) findViewById(R.id.buttonS), (Button) findViewById(R.id.buttonT),
                (Button) findViewById(R.id.buttonU), (Button) findViewById(R.id.buttonV),
                (Button) findViewById(R.id.buttonW), (Button) findViewById(R.id.buttonX), (Button) findViewById(R.id.buttonY),
                (Button) findViewById(R.id.buttonZ),

                (Button) findViewById(R.id.buttona), (Button) findViewById(R.id.buttonb),
                (Button) findViewById(R.id.buttonc), (Button) findViewById(R.id.buttond), (Button) findViewById(R.id.buttone),
                (Button) findViewById(R.id.buttonf), (Button) findViewById(R.id.buttong), (Button) findViewById(R.id.buttonh),
                (Button) findViewById(R.id.buttoni), (Button) findViewById(R.id.buttonj),
                (Button) findViewById(R.id.buttonk), (Button) findViewById(R.id.buttonl), (Button) findViewById(R.id.buttonm), (Button) findViewById(R.id.buttonn),
                (Button) findViewById(R.id.buttono), (Button) findViewById(R.id.buttonp), (Button) findViewById(R.id.buttonq),
                (Button) findViewById(R.id.buttonr), (Button) findViewById(R.id.buttons), (Button) findViewById(R.id.buttont),
                (Button) findViewById(R.id.buttonu), (Button) findViewById(R.id.buttonv),
                (Button) findViewById(R.id.buttonw), (Button) findViewById(R.id.buttonx), (Button) findViewById(R.id.buttony),
                (Button) findViewById(R.id.buttonz)
        };


        touch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });


        buttonBase.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {

                basesShown = !basesShown;

                if (basesShown) {
                    baseText.setText("Choose Base");

                    touch.setBackgroundColor(Color.rgb(0, 50, 0));

                    for (int i = 0; i < 62; i++) {
                        buttonArray[i].setEnabled(true);
                        buttonArray[i].setVisibility(View.VISIBLE);
                    }

                    for (int i = 62; i < 72; i++) {
                        buttonArray[i].setEnabled(false);
                        buttonArray[i].setVisibility(View.INVISIBLE);
                    }

                    buttonClear.setTextSize(30);
                    buttonDelete.setTextSize(30);

                    buttonClear.setText("2");
                    buttonDelete.setText("3");
                    buttonMultiply.setText("4");
                    buttonDivision.setText("5");
                    buttonDecimalPoint.setText("6");
                    buttonNegative.setText("7");
                    buttonEquals.setText("8");
                    buttonAdd.setText("9");
                    buttonSubtract.setText("10");
                    button0.setText("11");
                    button1.setText("12");
                    button2.setText("13");
                    button3.setText("14");
                    button4.setText("15");
                    button5.setText("16");
                    button6.setText("17");
                    button7.setText("18");
                    button8.setText("19");
                    button9.setText("20");
                    buttonA.setText("21");
                    buttonB.setText("22");
                    buttonC.setText("23");
                    buttonD.setText("24");
                    buttonE.setText("25");
                    buttonF.setText("26");
                    buttonG.setText("27");
                    buttonH.setText("28");
                    buttonI.setText("29");
                    buttonJ.setText("30");
                    buttonK.setText("31");
                    buttonL.setText("32");
                    buttonM.setText("33");
                    buttonN.setText("34");
                    buttonO.setText("35");
                    buttonP.setText("36");
                    buttonQ.setText("37");
                    buttonR.setText("38");
                    buttonS.setText("39");
                    buttonT.setText("40");
                    buttonU.setText("41");
                    buttonV.setText("42");
                    buttonW.setText("43");
                    buttonX.setText("44");
                    buttonY.setText("45");
                    buttonZ.setText("46");
                    buttona.setText("47");
                    buttonb.setText("48");
                    buttonc.setText("49");
                    buttond.setText("50");
                    buttone.setText("51");
                    buttonf.setText("52");
                    buttong.setText("53");
                    buttonh.setText("54");
                    buttoni.setText("55");
                    buttonj.setText("56");
                    buttonk.setText("57");
                    buttonl.setText("58");
                    buttonm.setText("59");
                    buttonn.setText("60");
                    buttono.setText("61");
                    buttonp.setText("62");
//                buttonq.setText("63");
//                buttonr.setText("64");
//                buttons.setText("65");
//                buttont.setText("66");
//                buttonu.setText("67");
//                buttonv.setText("68");
//                buttonw.setText("69");
//                buttonx.setText("70");
//                buttony.setText("71");
//                buttonz.setText("72");


                    for (int i = 1; i < 72; i++) {
                        buttonArray[i].setBackground(drawable4);
                    }
                    buttonArray[0].setBackground(drawable3);

                } else {
                    changeBaseTitle();

                    touch.setBackgroundColor(Color.rgb(50, 50, 50));

                    for (int i = 0; i < 72; i++) {
                        buttonArray[i].setEnabled(true);
                        buttonArray[i].setVisibility(View.VISIBLE);
                    }

                    for (int i = 10 + radix; i < 72; i++) {
                        buttonArray[i].setEnabled(false);
                        buttonArray[i].setVisibility(View.INVISIBLE);
                    }

                    buttonClear.setTextSize(20);
                    buttonDelete.setTextSize(20);

                    buttonClear.setText("CLR");
                    buttonDelete.setText("DEL");
                    buttonMultiply.setText("X");
                    buttonDivision.setText("÷");
                    buttonDecimalPoint.setText(".");
                    buttonNegative.setText("(-)");
                    buttonEquals.setText("=");
                    buttonAdd.setText("+");
                    buttonSubtract.setText("−");
                    button0.setText("0");
                    button1.setText("1");
                    button2.setText("2");
                    button3.setText("3");
                    button4.setText("4");
                    button5.setText("5");
                    button6.setText("6");
                    button7.setText("7");
                    button8.setText("8");
                    button9.setText("9");
                    buttonA.setText("A");
                    buttonB.setText("B");
                    buttonC.setText("C");
                    buttonD.setText("D");
                    buttonE.setText("E");
                    buttonF.setText("F");
                    buttonG.setText("G");
                    buttonH.setText("H");
                    buttonI.setText("I");
                    buttonJ.setText("J");
                    buttonK.setText("K");
                    buttonL.setText("L");
                    buttonM.setText("M");
                    buttonN.setText("N");
                    buttonO.setText("O");
                    buttonP.setText("P");
                    buttonQ.setText("Q");
                    buttonR.setText("R");
                    buttonS.setText("S");
                    buttonT.setText("T");
                    buttonU.setText("U");
                    buttonV.setText("V");
                    buttonW.setText("W");
                    buttonX.setText("X");
                    buttonY.setText("Y");
                    buttonZ.setText("Z");
                    buttona.setText("a");
                    buttonb.setText("b");
                    buttonc.setText("c");
                    buttond.setText("d");
                    buttone.setText("e");
                    buttonf.setText("f");
                    buttong.setText("g");
                    buttonh.setText("h");
                    buttoni.setText("i");
                    buttonj.setText("j");
                    buttonk.setText("k");
                    buttonl.setText("l");
                    buttonm.setText("m");
                    buttonn.setText("n");
                    buttono.setText("o");
                    buttonp.setText("p");
                    buttonq.setText("q");
                    buttonr.setText("r");
                    buttons.setText("s");
                    buttont.setText("t");
                    buttonu.setText("u");
                    buttonv.setText("v");
                    buttonw.setText("w");
                    buttonx.setText("x");
                    buttony.setText("y");
                    buttonz.setText("z");

                    for (int i = 1; i < 10; i++) {
                        buttonArray[i].setBackground(drawable2);
                    }

                    for (int i = 10; i < 72; i++) {
                        buttonArray[i].setBackground(drawable1);
                    }
                    buttonArray[0].setBackground(drawable3);
                }

            }
        });


        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 11;
                    resetLabels();
                } else {

                    pressValueButton('0');
                    enteredText.setText(totalString);
                    resultText.setText("");
                }
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 12;
                    resetLabels();
                } else {
                    pressValueButton('1');
                    enteredText.setText(totalString);
                    resultText.setText("");
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 13;
                    resetLabels();
                } else {
                    pressValueButton('2');
                    enteredText.setText(totalString);
                    resultText.setText("");
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 14;
                    resetLabels();
                } else {
                    pressValueButton('3');
                    enteredText.setText(totalString);
                    resultText.setText("");
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 15;
                    resetLabels();
                } else {
                    pressValueButton('4');
                    enteredText.setText(totalString);
                    resultText.setText("");
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 16;
                    resetLabels();
                } else {
                    pressValueButton('5');
                    enteredText.setText(totalString);
                    resultText.setText("");
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 17;
                    resetLabels();
                } else {
                    pressValueButton('6');
                    enteredText.setText(totalString);
                    resultText.setText("");
                }
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 18;
                    resetLabels();
                } else {
                    pressValueButton('7');
                    enteredText.setText(totalString);
                    resultText.setText("");
                }
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 19;
                    resetLabels();
                } else {
                    pressValueButton('8');
                    enteredText.setText(totalString);
                    resultText.setText("");
                }
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 20;
                    resetLabels();
                } else {
                    pressValueButton('9');
                    enteredText.setText(totalString);
                    resultText.setText("");
                }
            }
        });

        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 21;
                    resetLabels();
                } else {
                    pressValueButton('A');
                    enteredText.setText(totalString);
                    resultText.setText("");
                }
            }
        });

        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 22;
                    resetLabels();
                } else {
                    pressValueButton('B');
                    enteredText.setText(totalString);
                    resultText.setText("");
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 23;
                    resetLabels();
                } else {
                    pressValueButton('C');
                    enteredText.setText(totalString);
                    resultText.setText("");
                }
            }
        });

        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 24;
                    resetLabels();
                } else {
                    pressValueButton('D');
                    enteredText.setText(totalString);
                    resultText.setText("");
                }
            }
        });

        buttonE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 25;
                    resetLabels();
                } else {
                    pressValueButton('E');
                    enteredText.setText(totalString);
                    resultText.setText("");
                }
            }
        });

        buttonF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 26;
                    resetLabels();
                } else {
                    pressValueButton('F');
                    enteredText.setText(totalString);
                    resultText.setText("");
                }
            }
        });

        buttonG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 27;
                    resetLabels();
                } else {
                    pressValueButton('G');
                    enteredText.setText(totalString);
                    resultText.setText("");
                }
            }
        });

        buttonH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 28;
                    resetLabels();
                } else {
                    pressValueButton('H');
                    enteredText.setText(totalString);
                    resultText.setText("");
                }
            }
        });

        buttonI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 29;
                    resetLabels();
                } else {
                    pressValueButton('I');
                    enteredText.setText(totalString);
                    resultText.setText("");
                }
            }
        });


        buttonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 30;
                    resetLabels();
                } else {
                    pressValueButton('J');
                    enteredText.setText(totalString);
                    resultText.setText("");
                }
            }
        });

        buttonK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 31;
                    resetLabels();
                } else {
                    pressValueButton('K');
                    enteredText.setText(totalString);
                    resultText.setText("");
                }
            }
        });

        buttonL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 32;
                    resetLabels();
                } else {
                    pressValueButton('L');
                    enteredText.setText(totalString);
                    resultText.setText("");
                }
            }
        });

        buttonM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 33;
                    resetLabels();
                } else {
                    pressValueButton('M');
                    enteredText.setText(totalString);
                    resultText.setText("");
                }
            }
        });

        buttonN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 34;
                    resetLabels();
                } else {
                    pressValueButton('N');
                    enteredText.setText(totalString);
                    resultText.setText("");
                }
            }
        });

        buttonO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 35;
                    resetLabels();
                } else {
                    pressValueButton('O');
                    enteredText.setText(totalString);
                    resultText.setText("");
                }
            }
        });

        buttonP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 36;
                    resetLabels();
                } else {
                    pressValueButton('P');
                    enteredText.setText(totalString);
                    resultText.setText("");

                }
            }
        });

        buttonQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 37;
                    resetLabels();
                } else {
                    pressValueButton('Q');
                    enteredText.setText(totalString);
                    resultText.setText("");

                }
            }
        });

        buttonR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 38;
                    resetLabels();
                } else {
                    pressValueButton('R');
                    enteredText.setText(totalString);
                    resultText.setText("");

                }
            }
        });

        buttonS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 39;
                    resetLabels();
                } else {
                    pressValueButton('S');
                    enteredText.setText(totalString);
                    resultText.setText("");

                }
            }
        });

        buttonT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 40;
                    resetLabels();
                } else {
                    pressValueButton('T');
                    enteredText.setText(totalString);
                    resultText.setText("");

                }
            }
        });

        buttonU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 41;
                    resetLabels();
                } else {
                    pressValueButton('U');
                    enteredText.setText(totalString);
                    resultText.setText("");

                }
            }
        });

        buttonV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 42;
                    resetLabels();
                } else {
                    pressValueButton('V');
                    enteredText.setText(totalString);
                    resultText.setText("");

                }
            }
        });

        buttonW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 43;
                    resetLabels();
                } else {
                    pressValueButton('W');
                    enteredText.setText(totalString);
                    resultText.setText("");

                }
            }
        });

        buttonX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 44;
                    resetLabels();
                } else {
                    pressValueButton('X');
                    enteredText.setText(totalString);
                    resultText.setText("");

                }
            }
        });

        buttonY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 45;
                    resetLabels();
                } else {
                    pressValueButton('Y');
                    enteredText.setText(totalString);
                    resultText.setText("");

                }
            }
        });

        buttonZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 46;
                    resetLabels();
                } else {
                    pressValueButton('Z');
                    enteredText.setText(totalString);
                    resultText.setText("");

                }
            }
        });

        buttona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 47;
                    resetLabels();
                } else {
                    pressValueButton('a');
                    enteredText.setText(totalString);
                    resultText.setText("");

                }
            }
        });

        buttonb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 48;
                    resetLabels();
                } else {
                    pressValueButton('b');
                    enteredText.setText(totalString);
                    resultText.setText("");

                }
            }
        });

        buttonc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 49;
                    resetLabels();
                } else {
                    pressValueButton('c');
                    enteredText.setText(totalString);
                    resultText.setText("");

                }
            }
        });
        buttond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 50;
                    resetLabels();
                } else {
                    pressValueButton('d');
                    enteredText.setText(totalString);
                    resultText.setText("");

                }
            }
        });

        buttone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 51;
                    resetLabels();
                } else {
                    pressValueButton('e');
                    enteredText.setText(totalString);
                    resultText.setText("");

                }
            }
        });

        buttonf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 52;
                    resetLabels();
                } else {
                    pressValueButton('f');
                    enteredText.setText(totalString);
                    resultText.setText("");

                }
            }
        });

        buttong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 53;
                    resetLabels();
                } else {
                    pressValueButton('g');
                    enteredText.setText(totalString);
                    resultText.setText("");

                }
            }
        });

        buttonh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 54;
                    resetLabels();
                } else {
                    pressValueButton('h');
                    enteredText.setText(totalString);
                    resultText.setText("");

                }
            }
        });

        buttoni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 55;
                    resetLabels();
                } else {
                    pressValueButton('i');
                    enteredText.setText(totalString);
                    resultText.setText("");

                }
            }
        });

        buttonj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 56;
                    resetLabels();
                } else {
                    pressValueButton('j');
                    enteredText.setText(totalString);
                    resultText.setText("");

                }
            }
        });

        buttonk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 57;
                    resetLabels();
                } else {
                    pressValueButton('k');
                    enteredText.setText(totalString);
                    resultText.setText("");

                }
            }
        });

        buttonl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 58;
                    resetLabels();
                } else {
                    pressValueButton('l');
                    enteredText.setText(totalString);
                    resultText.setText("");

                }
            }
        });

        buttonm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 59;
                    resetLabels();
                } else {
                    pressValueButton('m');
                    enteredText.setText(totalString);
                    resultText.setText("");

                }
            }
        });

        buttonn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 60;
                    resetLabels();
                } else {
                    pressValueButton('n');
                    enteredText.setText(totalString);
                    resultText.setText("");

                }
            }
        });

        buttono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 61;
                    resetLabels();
                } else {
                    pressValueButton('o');
                    enteredText.setText(totalString);
                    resultText.setText("");

                }
            }
        });

        buttonp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 62;
                    resetLabels();
                } else {
                    pressValueButton('p');
                    enteredText.setText(totalString);
                    resultText.setText("");

                }
            }
        });

        buttonq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 63;
                    resetLabels();
                } else {
                    pressValueButton('q');
                    enteredText.setText(totalString);
                    resultText.setText("");

                }
            }
        });

        buttonr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 64;
                    resetLabels();
                } else {
                    pressValueButton('r');
                    enteredText.setText(totalString);
                    resultText.setText("");

                }
            }
        });

        buttons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 65;
                    resetLabels();
                } else {
                    pressValueButton('s');
                    enteredText.setText(totalString);
                    resultText.setText("");

                }
            }
        });

        buttont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 66;
                    resetLabels();
                } else {
                    pressValueButton('t');
                    enteredText.setText(totalString);
                    resultText.setText("");

                }
            }
        });

        buttonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 67;
                    resetLabels();
                } else {
                    pressValueButton('u');
                    enteredText.setText(totalString);
                    resultText.setText("");

                }
            }
        });

        buttonv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 68;
                    resetLabels();
                } else {
                    pressValueButton('v');
                    enteredText.setText(totalString);
                    resultText.setText("");

                }
            }
        });

        buttonw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 69;
                    resetLabels();
                } else {
                    pressValueButton('w');
                    enteredText.setText(totalString);
                    resultText.setText("");

                }
            }
        });

        buttonx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 70;
                    resetLabels();
                } else {
                    pressValueButton('x');
                    enteredText.setText(totalString);
                    resultText.setText("");

                }
            }
        });

        buttony.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 71;
                    resetLabels();
                } else {
                    pressValueButton('y');
                    enteredText.setText(totalString);
                    resultText.setText("");

                }
            }
        });

        buttonz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 72;
                    resetLabels();
                } else {
                    pressValueButton('z');
                    enteredText.setText(totalString);
                    resultText.setText("");

                }
            }
        });

        buttonDecimalPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (basesShown) {
                    radix = 6;
                    resetLabels();
                } else {
                    resultValue = BigDecimal.ZERO;

                    if (!currentString.contains(".")) {
                        currentString = currentString + ".";

                        totalString = totalString + ".";
                        enteredText.setText(totalString);
                        resultText.setText("");
                    }

                }

            }
        });

        buttonNegative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (basesShown) {
                    radix = 7;
                    resetLabels();
                } else {
                    resultValue = BigDecimal.ZERO;

                    if (currentString.equals("")) {
                        currentString = "-";
                        totalString = totalString + "-";
                        enteredText.setText(totalString);
                        resultText.setText("");
                    }
                }

            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 2;
                    resetLabels();
                } else {
                    resultValue = BigDecimal.ZERO;

                    numbers = new ArrayList<BigDecimal>();
                    operations = new ArrayList<Integer>();

                    totalString = "";
                    currentString = "";
                    resultValue = BigDecimal.ZERO;

                    enteredText.setText("");
                    resultText.setText("");
                }

            }
        });


        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 3;
                    resetLabels();
                } else {
                    if (!totalString.isEmpty()) {


                        if (!currentString.equals("")) {
                            currentString = currentString.substring(0, currentString.length() - 1);
                            totalString = totalString.substring(0, totalString.length() - 1);

                        } else if (totalString.endsWith("0") || totalString.endsWith("-")) {
                            totalString = totalString.substring(0, totalString.length() - 1);
                        } else if (totalString.endsWith(" ")) {
                            operations.remove(operations.size() - 1);
                            currentString = ConvertNumber.fromDecimal(String.valueOf(numbers.get(numbers.size() - 1)), radix, digits);
                            numbers.remove(numbers.size() - 1);
                            totalString = totalString.substring(0, totalString.length() - 3);
                        }

                        enteredText.setText(totalString);
                        resultText.setText("");

                    }

                }
            }
        });


        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 5;
                    resetLabels();
                } else {

                    pressOperationButton(1, " ÷ ");
                    resultText.setText("");
                    enteredText.setText(totalString);
                }

            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 3;
                    resetLabels();
                } else {
                    pressOperationButton(2, " x ");
                    resultText.setText("");
                    enteredText.setText(totalString);

                }
            }
        });

        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 10;
                    resetLabels();
                } else {
                    pressOperationButton(3, " − ");
                    resultText.setText("");
                    enteredText.setText(totalString);
                }

            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (basesShown) {
                    radix = 9;
                    resetLabels();
                } else {
                    pressOperationButton(4, " + ");
                    resultText.setText("");
                    enteredText.setText(totalString);
                }

            }
        });


        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (basesShown) {
                    radix = 8;
                    resetLabels();
                } else {

                    if (!currentString.equals("") && !currentString.equals(".") && !currentString.equals("-") && !currentString.substring(currentString.length() - 1).equals(".") && !currentString.equals("-.")) {


                        numbers.add(ConvertNumber.toDecimal(currentString, radix));


                        try {


                            for (int i = 0; i < operations.size(); i++) {


                                if (operations.get(i) == 1) {


                                    numbers.set(i + 1, numbers.get(i).divide(numbers.get(i + 1), 1000, RoundingMode.HALF_EVEN));
                                    numbers.remove(i);
                                    operations.remove(i);
                                    i--;
                                    continue;
                                }
                                if (operations.get(i) == 2) {
                                    numbers.set(i + 1, numbers.get(i + 1).multiply(numbers.get(i)));
                                    numbers.remove(i);
                                    operations.remove(i);
                                    i--;

                                }
                            }
                            boolean addition = true;

                            resultValue = resultValue.add(numbers.get(0));
                            for (int j = 0; j < operations.size(); j++) {

                                if (operations.get(j) == 3) {
                                    addition = false;
                                } else if (operations.get(j) == 4) {
                                    addition = true;
                                }

                                if (addition) {
                                    resultValue = resultValue.add(numbers.get(j + 1));
                                } else {
                                    resultValue = resultValue.subtract(numbers.get(j + 1));
                                }

                            }


                            numbers = new ArrayList<BigDecimal>();
                            operations = new ArrayList<Integer>();

                            totalString = "";
                            currentString = "";


                            String outputString = ConvertNumber.fromDecimal(String.valueOf(resultValue), radix, digits);

                            if (outputString.startsWith(".")) {
                                outputString = "0" + outputString;
                            }

                            if (outputString.endsWith(".")) {
                                outputString = outputString.substring(0, outputString.length() - 1);
                            }

                            resultText.setText(outputString);

                        } catch (Exception e) {
                            resultText.setText("Cannot Divide By Zero");
                            resultValue = BigDecimal.ZERO;
                            totalString = "";
                            currentString = "";
                            numbers = new ArrayList<BigDecimal>();
                            operations = new ArrayList<Integer>();
                        }

                    }
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);


        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

