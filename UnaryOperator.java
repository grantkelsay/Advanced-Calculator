//**************************************************************************************************************
// CLASS: UnaryOperator
//
// CSE205 Object Oriented Programming and Data Structures, Fall and 2021
// Project Number: project 4
//
// AUTHOR: Nicholas Rabine, nrabine, nrabine@asu.edu
// AUTHOR2: Grant Kelsay, gkelsay, gkelsay@asu.edu
//*********************************************************************************************

/**
 * UnaryOperator is the superclass of all unary operators.
 */
public abstract class UnaryOperator extends Operator {

    public UnaryOperator() {
    }
    
    /**
     * Called to evaluate the operator.
     */
    public abstract Operand evaluate(Operand pOperand);

    /**
     * Returns false since all subclasses of UnaryOperator are unary operators.
     */
    @Override
    public boolean isBinaryOperator() {
        return false;
    }

}
