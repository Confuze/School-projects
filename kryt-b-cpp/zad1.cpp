// including iostream library
#include <iostream>

// defining main function
int main() {
  float amount; // defining variable of type float for the amount to calculate fron
  constexpr float exchangeRate = 0.22; // defining variable for the exchange rate (constexpr not necessary but used for good practice the value is constant and can be known at complie time)
  std::cout << "Ten program jest przelicznikiem walut z PLN na EUR (polski "
               "złoty na euro) przyjmujący kurs 1 PLN = 0.22 EUR\n"; // displaying program description in console
  std::cout << "Podaj kwotę do przeliczenia w PLN: "; // displaying message in console
  std::cin >> amount; // reading the value from the console, saving it in the amount variable
  std::cout << "Przeliczona kwota w EUR: " << amount * exchangeRate; // displaying the calculated amount by multiplying the inputted amount by the exchange rate
  return 0;
}
