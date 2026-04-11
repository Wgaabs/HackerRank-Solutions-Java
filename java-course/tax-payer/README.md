# Tax Payer

## Description
Program that reads data from N tax payers (individuals or companies)
and displays the tax paid by each one, as well as the total tax collected.

## Business Rules

### Individual
- Annual income below 20,000: 15% tax rate
- Annual income of 20,000 or above: 25% tax rate
- 50% of health expenditures are deducted from the tax

### Company
- Default tax rate: 16%
- More than 10 employees: 14% tax rate

## Concepts Applied
- Abstract class
- Abstract method
- Inheritance (extends)
- Polymorphism
- Method Override (@Override)

## Technologies
- Java 21

## How to Run
1. Clone the repository
2. Open in IntelliJ IDEA
3. Run Program.java
4. Enter the number of tax payers
5. For each tax payer choose: i (individual) or c (company)