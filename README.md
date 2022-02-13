# Python Documentation

# Age in Days Python Script

This repository contains a simple Python script that calculates your age in days. The script prompts the user to input their age in years, and then it multiplies this number by 365 to get the equivalent age in days.

## Script Explanation

The script is a single function called `age_in_days()`. Here's a breakdown of what it does:

```python
def age_in_days():
    age = int(input("Enter your age: "))  # Asks the user to input their age
    days = age * 365  # Multiplies the inputted age by 365 to get the age in days
    print("Your age in days is: ", days)  # Prints the result
```

When you run the script, it will prompt you to enter your age. After you input your age and press enter, it will print out your age in days.

## Libraries

This script does not import any libraries. It uses only built-in Python functions, so there are no dependencies to install.

## How to Run

To run this script, you need to have Python installed on your computer. Then, you can run the script from the command line by navigating to the directory where the script is located and typing `python script_name.py`, replacing "script_name.py" with the name of the script.

## Conclusion

This is a simple script that can be used to calculate your age in days. It's a fun way to see your age from a different perspective!

---

# C# Documentation

# Age Calculator in CSharp

This is a simple console application written in CSharp that calculates your age in days.

## Script Description

The script prompts the user to enter their age in years. It then calculates the equivalent age in days by multiplying the input by 365. The result is then displayed on the console.

Here is the script:

```CSharp
using System;

class Program
{
    static void Main(string[] args)
    {
        Console.Write("Enter your age in years: ");
        int years = Convert.ToInt32(Console.ReadLine());
        int days = years * 365;
        Console.WriteLine("Your age in days is: " + days);
        Console.ReadKey();
    }
}
```

## Imported Libraries

The script uses the following libraries:

- `System`: This is a built-in .NET library that provides fundamental classes and base classes that define commonly-used value and reference data types, events and event handlers, interfaces, attributes, and processing exceptions. In this script, it is used to handle standard I/O operations (via `Console.Write`, `Console.WriteLine`, `Console.ReadLine`, and `Console.ReadKey`), and to convert string to integer (via `Convert.ToInt32`).

## How to Run the Script

To run the script, you need a .NET environment. You can use any text editor or IDE that supports CSharp. Simply copy the script into your editor, save the file with a `.cs` extension, and run it using your CSharp compiler. When the script runs, it will prompt you to enter your age in years, and then it will display your age in days.

---

# Java Documentation

# AgeInDaysConverter

This is a simple Java program that converts a user's age from years to days.

## Description

The AgeInDaysConverter program prompts the user to input their age in years. It then calculates the equivalent age in days by multiplying the input by 365 (the number of days in a year). The result is then displayed to the user.

## Libraries Used

The following libraries are used in this program:

### java.util.Scanner

The Scanner class is a part of the java.util package in Java. It is used to get user input, and it is capable of parsing various types of input like integers, strings, etc. In this program, it is used to read the user's age in years.

## Code Explanation

```java
import java.util.Scanner;
```
This line imports the Scanner class from the java.util package.

```java
public class AgeInDaysConverter {
```
This line declares the AgeInDaysConverter class.

```java
public static void main(String[] args) {
```
This line defines the main method, which is the entry point for any Java program.

```java
Scanner scanner = new Scanner(System.in);
```
This line creates a new Scanner object that reads from the standard input stream (System.in).

```java
System.out.println("Enter your age in years: ");
```
This line prints a message to the console asking the user to enter their age in years.

```java
int ageInYears = scanner.nextInt();
```
This line reads the user's input and stores it in the ageInYears variable.

```java
int ageInDays = ageInYears * 365;
```
This line calculates the user's age in days by multiplying their age in years by 365.

```java
System.out.println("Your age in days is: " + ageInDays);
```
This line prints the user's age in days to the console.

## Usage

To use this program, simply run it in your Java environment, enter your age in years when prompted, and the program will display your age in days.

---
