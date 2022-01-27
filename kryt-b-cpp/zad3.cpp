#include <iostream> // importing iostream library

// defining function for summing up the even numbers in a given range
// it accepts two arguments, the minimal value of the range and the maximal, both integers
int sumEvenNumbers(int min, int max) {
  int sum = 0; // defining sum variable that will be returned as the resulting calculated sum

// defining loop that goes over every item between min and max with max included
  for (int i = min; i <= max; i++) {
    if (i % 2 == 0) // checking whether i is even (divisible by 2 with remainder equal to 0)
      sum += i; // if true, adds the current value of i to sum
  }

  return sum; // returns sum after it's been calculated
}

// defining main function
int main() {
  int min, max; // defining min and max variables for the minimal and maximal values in the range, both integers
  std::cout << "This is a program to calculate the sum of even numbers in a "
               "given range"; // displaying program description in console

  std::cout << "Please input the minimal value of the range: "; // displaying message in console
  std::cin >> min; // reading minimal value of the range from the user, saving it in the min variable

  std::cout << "Please input the minimal value of the range: ";
  std::cin >> max; // reading maximal value of the range from the user, saving it in the max variable

  std::cout << sumEvenNumbers(min, max); // displays calculated value in console by calling the summing function with min and max as arguments

  return 0;
}
