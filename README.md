# Practice 2013 - 06: Sudoku Solution Checker

## Background
Sudoku is a Japanese word that translates to ”Single Number.” It is also the
name of a Japanese game that is popular in America. A Sudoku board is a 9x9 grid
with numbers in it. In order to solve a Sudoku Puzzle, you must satisfy the
following conditions:
- Each integer 1-9 must appear in each row exactly once
- Each integer 1-9 must appear in each column exactly once
- Each integer 1-9 must appear in each 3x3 square exactly once.

The puzzle to the right is a correctly-completed Sudoku puzzle.

You have recently become obsessed with Sudoku puzzles - you play them all
the time! But you hate the fact that there is no easy way to verify that your
puzzles are completed correctly. Write a program that can identify a
correctly-completed Sudoku board.

## Description

### Input
The first line will be a single integer representing the number of test cases.
Each test-case will be 9 rows, each containing 9 space-separated integers
between 1 and 9. There will be one blank line between each test case.

There will be at most 100 test cases.

### Output
For each case, output the line “Case x:” where x is the case number, on a single
line followed by a single space. Then print ”CORRECT” if the puzzle is solved
correctly, and ”INCORRECT” if it is solved incorrectly.

## Sample
### Input
```
2
1 2 3 5 6 7 4 8 9
3 4 5 6 1 2 4 7 8
7 5 8 3 4 2 1 9 6
1 2 3 5 6 7 4 8 9
3 4 5 6 1 2 4 7 8
7 5 8 3 4 2 1 9 6
1 2 3 5 6 7 4 8 9
3 4 5 6 1 2 4 7 8
7 5 8 3 4 2 1 9 6

3 5 7 9 6 4 2 8 1
4 6 8 1 2 3 5 7 9
9 1 2 5 8 7 4 6 3
6 3 1 7 9 5 8 4 2
7 2 4 3 1 8 6 9 5
8 9 5 2 4 6 1 3 7
1 7 6 4 5 9 3 2 8
5 8 3 6 7 2 9 1 4
2 4 9 8 3 1 7 5 6
```

### Output
```
Case 1: INCORRECT
Case 2: CORRECT
```
