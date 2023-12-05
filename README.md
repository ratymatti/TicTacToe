# Tic Tac Toe Game

## Overview

This is a simple command-line-based Tic Tac Toe game implemented in Java. It allows two players to take turns making moves on a 3x3 game board until a player wins or the game ends in a tie.

## How to Play

1. Run the `TicTacToe` class to start the game.
2. Players take turns entering the row and column numbers to make their moves.
3. The game continues until one player wins or it ends in a tie.
4. After each game, the program asks if you want to play again.

## Classes

### 1. `TicTacToe`

- The main class that orchestrates the game loop and manages player turns.

### 2. `GetMove`

- Handles user input for selecting a row and column to make a move.

### 3. `BoardFunctions`

- Provides functions for creating and printing the game board.

### 4. `CheckResult`

- Contains functions to check for a win or tie in the game.

## How to Run

Compile and run the program using a Java compiler or an Integrated Development Environment (IDE)

```bash
javac TicTacToe.java
java TicTacToe
