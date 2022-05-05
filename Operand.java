//**************************************************************************************************************
// CLASS: Operand
//
//
// CSE205 Object Oriented Programming and Data Structures, Fall and 2021
// Project Number: project 4
//
// AUTHOR: Nicholas Rabine, nrabine, nrabine@asu.edu
// AUTHOR2: Grant Kelsay, gkelsay, gkelsay@asu.edu
//*********************************************************************************************

/**
 * An operand is a numeric value represented as a Double.
 */
public class Operand extends Token {
   private Double mValue;
  
   /*
   * <ctor> Takes in a Double value as an arg which initializes mValue.
   */
   public Operand(Double pValue) {
       setValue(pValue);
   }
  
   /*
   * Provided for debugging.
   */
   @Override
   public String toString() {
       return this.getValue().toString();
   }
  
   // Public accessor method for mValue.
   public Double getValue() {
       return mValue;
   }
  
   // Public mutator method for mValue.
   public void setValue(Double pValue) {
       mValue = pValue;
   }
}
