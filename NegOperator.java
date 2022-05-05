//**************************************************************************************************************
// CLASS: NegOperator
//
//
// CSE205 Object Oriented Programming and Data Structures, Fall and 2021
// Project Number: project 4
//
// AUTHOR: Nicholas Rabine, nrabine, nrabine@asu.edu
// AUTHOR2: Grant Kelsay, gkelsay, gkelsay@asu.edu
//*********************************************************************************************

/**
 * Represents the negation operator which is a specific type of unary operator.
 */
public class NegOperator extends UnaryOperator {
  
   /*
   * <ctor> Initializes a NegOperator in memory with null value.
   */
   public NegOperator() { };

   /*
   * Takes in an Operand (Number) argument and returns that number with a negative sign.
   */
   @Override
   public Operand evaluate(Operand pOperand) {
       return new Operand(pOperand.getValue() * -1);         
   }

   /*
   * Sets the mathematical precedence.
   */
   @Override
   public int precedence() {
       return 4;
   }

   /*
   * Sets the Stack precedence.
   */
   @Override
   public int stackPrecedence() {
       return 4;
   }

   /*
   * Provided for debuggin purposes.
   */
   @Override
   public String toString() {
       return " -";
   }
}