// importing necessary libraries - iostream and cmath
#include <cmath>
#include <iostream>

// definining function used to calculate the hypothenuse length
// it accepts two arguments, both integers, corresponding to the two catheus sides' lengths
float hypothenuse(int a, int b) { return std::sqrt(a * a + b * b); } // the function returns the calculated length based on the pythagorean theorem

// defining the main function
int main() {
  int a, b; // defining variables for both of the catheus sides' lenghts, both integers

  std::cout << "This is a program to calculate the hypothenuse of a "
               "right-angled triangle based on the pythagorean theorem"
            << std::endl; // displaying program description in console

  std::cout << "Please input the length first catheus side: (natural number) "; // displaying message in console
  std::cin >> a; // reading first catheus side's length from the user, saving it in variable a
  
  // checking if the inputted number is correct
  if (a <= 0) { // if not, displaying appropriate message and finishing runtime by returning 0
    std::cout << "wrong number inputted";
    return 0;
  }

  std::cout << "Please input the length second catheus side: (natural number) "; // displaying message in console
  std::cin >> b; // reading second catheus side's length from the user, saving it in variable a
  // checking if the inputted number is correct
  if (b <= 0) { // if not, displaying appropriate message and finishing runtime by returning 0
    std::cout << "wrong number inputted";
    return 0;
  }

  std::cout << hypothenuse(a, b); // displaying the calculated hypothenuse length by using the previously defined function with the previously inputted side lengths as arguments

  return 0;
}
