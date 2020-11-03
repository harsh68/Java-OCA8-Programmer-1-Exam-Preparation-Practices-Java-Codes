/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enum;

/**
 *
 * @author Harsh
 */
public enum Months {
    JAN(1), FEB(2), MAR(3), APR(4), MAY(5), JUN(6), JUL(7), AUG(8), SEP(9), OCT(10), NOV(11), DEC(12);


    int monthOrdinal = 0;

    Months(int ord) {
        this.monthOrdinal = ord;
    }

    public static Months byOrdinal2ndWay(int ord) {
        return Months.values()[ord-1]; // less safe Months.values()[index]
    }

    public static Months byOrdinal(int ord) {
        for (Months m : Months.values()) {
            if (m.monthOrdinal == ord) {
                return m;
            }
        }
        return null;
    }
 //   public static Months[] MONTHS_INDEXED = new Months[] { null, JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC };

}