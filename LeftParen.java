//**************************************************************************************************************
// CLASS: LeftParen
//
//
// CSE205 Object Oriented Programming and Data Structures, Fall and 2021
// Project Number: project 4
//
// AUTHOR: Nicholas Rabine, nrabine, nrabine@asu.edu
// AUTHOR2: Grant Kelsay, gkelsay, gkelsay@asu.edu
//*********************************************************************************************

/**
 * Represents a left parenthesis in the expression.
 */
public class LeftParen extends Parenthesis {

    public LeftParen() {
    }

    /**
     * Returns the normal precedence level of LeftParen which is highest at 5.
     */
    @Override
    public int precedence() {
        return 5;
    }

    /**
     * Returns the precedence level of LeftParen when on it is on the operator stack, it is lowest at 0.
     */
    @Override
    public int stackPrecedence() {
        return 0;
    }

}