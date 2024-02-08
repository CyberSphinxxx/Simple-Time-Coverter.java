# Simple-Time-Coverter.java

A straightforward Java program that prompts the user to input the number of seconds and converts it into hours, minutes, and seconds.
------------------------------------------------------------------------------------
User Input Prompt:

The Scanner class is utilized to request user input for the number of seconds.

The message "Please enter the number of seconds:" is displayed to guide the user.

------------------------------------------------------------------------------------
Conversion Calculation:

Upon receiving the input, the program calculates the equivalent hours, minutes, and remaining seconds.

The total number of hours is determined by dividing the input seconds by 3600 (the number of seconds in an hour).

The remaining seconds after extracting the hours are divided by 60 to calculate the equivalent minutes.

The remaining seconds after extracting both hours and minutes represent the remaining seconds.

------------------------------------------------------------------------------------
Greeting Output:

The program then displays a formatted message indicating the converted time in hours, minutes, and seconds.

The message includes the calculated hours, minutes, and seconds using concatenation.

------------------------------------------------------------------------------------
Usage:

Execute the program in a Java environment.

Input the desired number of seconds when prompted.

The program will provide the converted time in hours, minutes, and seconds.

Repeat the process as needed to convert different sets of seconds.
