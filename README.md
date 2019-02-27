# Project 1
Authors: Alec Brownlie & Isaac Davidson
----------------------------
To run:
----------------------------
```
[./Project1]$ sh run.sh
```
Expected Output for User Mode:
----------------------------
- For Task 1, use numbers that exceed 5 digits may noticeably slow down program. This is due to the number of basic operations made by the consecutive integer checking algorithm.
- Console Output:
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
MDavg(n) = 1.8
Davg(n) = 3.2
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
- n for Task 1 is random at runtime between the range 60-150.
- k for Task 2 is set at 85.
- List A and List B contain random number of small prime numbers at runtime and will have a max size of 150.
- When scatter plot graphs are generated, windows for each graph may be stacked on top of another.
- Console Output:
```
----- Project 01: Empirical Analysis of Algorithms -----
      Welcome! Please select mode for analysis: 
1)    User Testing Mode
2)    Scatter Plot Mode
2
Selected: Scatter Plot Mode
----- Running Task 1 -----
n = 124
----- Running Task 2 -----
k = 85
----- Running Task 3 -----
List A = [2, 2, 2, 2, 3, 3, 2, 3, 3, 3, 3, 2, 3, 3, 3, 3, 2, 3, 3, 3, 3, 2, 2, 3, 2, 3, 3, 3, 3, 3, 3, 3, 2, 3, 3, 3, 3, 2, 2, 2, 2, 3, 3, 2, 3, 2, 2, 3, 2, 2, 3, 2, 2, 3, 3, 2, 2, 2, 3, 3, 2, 3, 3, 2, 3, 3, 3, 2, 2, 3, 3, 3, 2, 2, 3, 3, 3, 3, 2, 2, 3, 3, 3, 2, 3, 3, 2, 3, 2, 2, 3, 3, 3, 2, 2, 2, 2, 2, 2, 3, 3, 2, 3, 3, 2, 3, 3, 2, 3, 3, 2, 2, 2, 3, 3, 2, 2, 2, 2, 3, 3, 3, 3, 2, 3, 2, 2, 3, 2, 2, 2, 2, 2, 3, 3, 3, 2, 2, 3, 3, 2, 3, 2, 3, 3, 3, 2, 3, 3, 2]
List B = [2, 3, 3, 2, 2, 3, 2, 2, 3, 3, 2, 2, 2, 3, 2, 3, 2, 2, 2, 2, 3, 2, 3, 2, 2, 3, 2, 2, 3, 3, 3, 3, 3, 2, 3, 3, 2, 3, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 2, 2, 3, 3, 2, 3, 2, 2, 2, 2, 2, 3, 2, 2, 3, 3, 2, 2, 3, 3, 2, 3, 3, 2, 3, 2, 3, 2, 3, 3, 3, 2, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 3, 3, 3, 3, 2, 3, 3, 3, 2, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2, 2, 3, 3, 2, 2, 3, 3, 2, 3, 2, 3, 3, 3, 2, 3, 2, 3, 3, 3, 3, 2, 2, 3, 3, 3, 3, 3, 2, 3, 2, 3, 3, 2, 3, 3, 3, 2, 3, 3, 2]
```
Screenshots of Scatter Plots
-----------------------------
- Task 1
![alt text](https://github.com/alecbrownlie/Project1/blob/master/graphs/task1/euclid_vs_cic.png)
- Task 2
![alt text](https://github.com/alecbrownlie/Project1/blob/master/graphs/task2/euclid_w_fibonacci.png)
- Task 3
![alt text](https://github.com/alecbrownlie/Project1/blob/master/graphs/task3/common_factors.png)

- GitHub link: https://github.com/alecbrownlie/Project1
