//**************************************************************************************************************
// CLASS: MultOperator
//
//
// CSE205 Object Oriented Programming and Data Structures, Fall and 2021
// Project Number: project 4
//
// AUTHOR: Nicholas Rabine, nrabine, nrabine@asu.edu
// AUTHOR2: Grant Kelsay, gkelsay, gkelsay@asu.edu
//*********************************************************************************************

/**
 * Represents the multiplication operator which is a specific type of binary operator.
 */
public class MultOperator extends BinaryOperator {

   public MultOperator() { }
  
   /*
   * Takes in two Operand args and returns a new Operand based on their product.
   */
   @Override
   public Operand evaluate(Operand pLhsOperand, Operand pRhsOperand) {
       return new Operand(pLhsOperand.getValue() * pRhsOperand.getValue());
   }
   // Sets the Mathematical precedence for multiplication.
   @Override
   public int precedence() {
       return 3;
   }
   // Sets the stack precedence for multiplication.
   @Override
   public int stackPrecedence() {
       return 3;
   }
   // Provided for debugging.
   @Override
   public String toString() {
       return " * ";
   }
}