# Project1
Authors: Alec Brownlie & Issac Davidson
----------------------------
Prerequisite
----------------------------
	1) cd src
	2) export CLASSPATH=$CLASSPATH:lib/jcommon-1.0.23.jar:lib/jfreechart-1.0.19.jar 

To compile
----------------------------
	1) cd src
	2) javac com/main/Application.java

To run:
----------------------------
	1) cd src
	2) java com/main/Application

Expected Output for User Mode:
----------------------------
```
----- Project 01: Empirical Analysis of Algorithms -----
      Welcome! Please select mode for analysis: 
1)    User Testing Mode
2)    Scatter Plot Mode
5
Not a choice. Please select mode for analysis: 
1)    User Testing Mode
2)    Scatter Plot Mode
1
Selected: User Testing Mode
----- Running Task 1 -----
Please enter a single positive value for n: 
5
Number of MDavg(n) = 1.8
Number of Davg(n) = 3.2
Average time of modulo divisions in nanoseconds = 12293.0
----- Running Task 2 -----
Please enter a single positive value for k: 
8
m = Fib(k + 1) = 21
n = Fib(k) = 13
GCD(m, n) = 1
Average time of modulo divisions in nanoseconds = 20404.125
----- Running Task 3 -----
Please enter a single positive value for m: 
6
Please enter a single positive value for n: 
5
Prime Numbers ≤ k = m = [2, 3, 5]
Prime Numbers ≤ k = n = [2, 3, 5]
Prime Factors of m = [2, 3]
Prime Factors of n = [5]
GCD(m, n) = 1
```

Expected Output for Scatter Plot Mode:
-----------------------------
```
----- Project 01: Empirical Analysis of Algorithms -----
      Welcome! Please select mode for analysis: 
1)    User Testing Mode
2)    Scatter Plot Mode
2
Selected: Scatter Plot Mode
----- Running Task 1 -----
n = 81
----- Running Task 2 -----
k = 85
----- Running Task 3 -----
List A = [2, 2, 2, 3, 3, 2, 2, 2, 2, 2, 2, 3, 3, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 2, 2, 3, 3, 3, 3, 2, 2, 2, 3, 3, 3, 2, 3, 2, 2, 2, 2, 3, 3, 3, 3, 2, 2, 2, 2, 2, 3, 2, 3, 2, 2, 3, 2, 2, 2, 3, 2, 3, 2, 3, 2, 3, 2, 2, 2, 2, 3, 3, 3, 3, 2, 2, 3, 2, 3, 3, 2, 3, 3, 3, 3, 3, 2, 3, 3, 2, 3, 2, 3, 2, 2, 3, 2, 3, 3, 2, 3, 3, 3, 2, 3, 3, 3, 2, 2, 3, 2, 3, 2, 3, 3, 2, 2, 3, 2, 2, 3, 2, 2, 3, 3, 2, 2, 3, 2, 3, 2, 3, 3, 3, 2, 2, 3, 2, 2, 3, 3, 3, 3, 2, 3, 2, 3, 2, 3, 2]
List B = [3, 3, 2, 2, 2, 3, 3, 3, 2, 3, 2, 2, 2, 2, 3, 3, 2, 2, 3, 3, 3, 3, 2, 2, 3, 2, 2, 2, 3, 3, 3, 2, 2, 2, 3, 2, 3, 2, 3, 2, 3, 3, 2, 3, 3, 2, 2, 3, 2, 2, 3, 3, 2, 3, 2, 3, 2, 2, 2, 2, 2, 3, 3, 3, 3, 2, 3, 2, 3, 2, 3, 3, 3, 2, 3, 2, 3, 3, 2, 2, 3, 3, 2, 2, 2, 3, 2, 3, 3, 2, 3, 2, 2, 2, 3, 3, 2, 2, 3, 3, 2, 3, 2, 3, 2, 2, 2, 3, 3, 2, 2, 2, 2, 2, 2, 2, 2, 3, 2, 2, 2, 3, 2, 3, 3, 3, 2, 2, 2, 3, 3, 2, 2, 2, 3, 3, 2, 2, 2, 2, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2]
```
