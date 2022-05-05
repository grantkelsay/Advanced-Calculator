//**************************************************************************************************************
// CLASS: Operator
//
//
// CSE205 Object Oriented Programming and Data Structures, Fall and 2021
// Project Number: project 4
//
// AUTHOR: Nicholas Rabine, nrabine, nrabine@asu.edu
// AUTHOR2: Grant Kelsay, gkelsay, gkelsay@asu.edu
//*********************************************************************************************

/**
 * Operator is the superclass of all binary and unary operators.
 */
public abstract class Operator extends Token{
   public Operator() {}
  
   public abstract boolean isBinaryOperator();
  
   public abstract int precedence();
  
   public abstract int stackPrecedence();
}
