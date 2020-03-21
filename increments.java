//The modulo math operation performs an integer division of one value by another, and returns the remainder of that division.
//The operator for the modulo operation is the percentage (%) character.
int value = 23;
int res = value % 6; // res is 5
//Dividing 23 by 6 returns a quotient of 3, with a remainder of 5. Thus, the value of 5 is assigned to the res variable.

//An increment operator provides a more convenient and compact way to increase the value of a variable by one.
//For example, the statement x=x+1; can be simplified to ++x;
int test = 5;
++test; // test is now 6

//The decrement operator (--) is used to decrease the value of a variable by one.
int test = 5;
--test; // test is now 4

//Use this operator with caution to avoid calculation mistakes.

//Two forms, prefix and postfix, may be used with both the increment and decrement operators.
//With prefix form, the operator appears before the operand, while in postfix form, the operator appears after the operand.

//Prefix: Increments the variable's value and uses the new value in the expression.
int x = 34;
int y = ++x; // y is 35
//The value of x is first incremented to 35, and is then assigned to y, so the values of both x and y are now 35.

//Postfix: The variable's value is first used in the expression and is then increased.
int x = 34;
int y = x++; // y is 34
//x is first assigned to y, and is then incremented by one. Therefore, x becomes 35, while y is assigned the value of 34.

//The same applies to the decrement operator.

//You are already familiar with the assignment operator (=), which assigns a value to a variable.
int value = 5; //This assigned the value 5 to a variable called value of type int.

//Java provides a number of assignment operators to make it easier to write code.

//Addition and assignment (+=):
int num1 = 4;
int num2 = 8;
num2 += num1; // num2 = num2 + num1;
//num2 is 12 and num1 is 4

//Subtraction and assignment (-=):
int num1 = 4;
int num2 = 8;
num2 -= num1; // num2 = num2 - num1;
//num2 is 4 and num1 is 4

//Similarly, Java supports multiplication and assignment (*=), division and assignment (/=), and remainder and assignment (%=).
