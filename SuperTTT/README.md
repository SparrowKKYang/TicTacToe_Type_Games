# CS611-Assignment 2
## Name of Assignment: Super TTT, Assignment 1 & 2
---------------------------------------------------------------------------
Name: Chengkai Yang
Email:  cyang23@bu.edu


## Files
---------------------------------------------------------------------------

#### 1. GameCenter.java

    - This class serves as the entrance of the entire project.
    - This class is responsible for choosing which game to play
    - Only this class has the main() method.

#### 2. TurnGame.java

    - This class is the interface of turn based game

#### 3. Menu.java

    - This class menu is with options for player to select option with number 1-N
    - Some static functions serve other classes that need to handle IO

#### 4. CellGroup.java

    - This class is group interface for board and cell
    - So the board can contain sub board

#### 5. Checker.java

    - This class is piece for cell with 3 types.

#### 6. Board.java

    - this class represent a configable board for turn based game.

#### 7. Cell.java

    - This class is cell for board. the cell contains a piece with 3 types.

#### 8. TTTGame.java

    - This class defines the game like Tic Tac Toe. other game class inherits it.

#### 9. TicTacToe.java

    - This class inherits from TTTGame.
    - The board's size can be changed, and Its shape can be retangle.

#### 10. OrderAndChaos.java

    - This class inherits from TTTGame.
    - Order and Chaos is on a 6x6 game board with different rules 

#### 11. SuperTicTacToe.java

    - This class inherits from TTTGame.
    - The Super Cells can be accessed using the alphabetic characters A, B, C

#### 12. Player.java

    - This class maintains data of a player.



## Notes
---------------------------------------------------------------------------


#### 1.Common base class TTTGame
```
The base class TTTGame implements the full functionality of a like tic tac toe game. 
All three games inherit this base class and implement their own functions.
They share the same code logic as the base class,
simply overriding the necessary functional functions for customization. 
Increased code reusability.
```

#### 2. Composite designe pattern
```
The class Board and Cell share an interface, CellGroup, to form a combinatorial design pattern.
You can make the board include child boards, which makes it easier to implement Super Tic Tac Toe games.
The code of the base class TTTGame is well reused.
```

#### 3. Rules about SuperTicTacToe
```
getMark for a cell, take the type of the piece.
getMark for a board takes the type of the winner of the board.
The large board contains a small board, and once a winner appears, 
no other pieces are allowed to be placed.
If you can, there will be chaos in the victory of the small chessboard.
Following the previous rule, if the same winner between small boards can connect, 
it means that the player wins
```

#### 4. High Scalability: Flexible board class
```
The board is not limited to squares, it can be rectangular, like m*n, 4x3 board. It is also a configurable x-in-row. These features are convenient for other games. For Tic Tac Toe and Super TTT, player can select their desired board size.
The algorithm for finding the same pieces on a line is O(n), so the complexity of the algorithm for checking the winner of the board is O(n*n)
```
### 5. Input validation checking
Input validation checking is usable in this project. for example:
When a player enters a board size, the input validation will be checked for input data type and then maximum value allowed for input validation. When a player plays Super TTT and enter a sub board and then a cell to place, first they need to enter A-I for sub board and then 1-9 for cell, which is also input validation checked. 


### 6. High Extendability: Turn based Game interface
```
the class TurnGame interface is for turn based game
if a new game that implements this interface, then the logic of GameCenter does not need to be changed, It can be done easily.
```


#### 7. User-friendly
```
It allowed the user to name the square using that number instead of entering of the row 
number and col number of the square.
The game supports exiting halfway, and when you enter position 0, you can exit the current game.
```

    +--+--+--+--+--+--+
    | 1| 2| 3| 4| 5| 6|
    +--+--+--+--+--+--+
    | 7| 8| 9|10|11|12|
    +--+--+--+--+--+--+
    |13|14|15|16|17|18|
    +--+--+--+--+--+--+
    |19|20|21|22|23|24|
    +--+--+--+--+--+--+
    |25|26|27|28|29|30|
    +--+--+--+--+--+--+
    |31|32|33|34|35|36|
    +--+--+--+--+--+--+

    +--+--+--+ +--+--+--+ +--+--+--+ 
    | 1| 2| 3| | 1| 2| 3| | 1| 2| 3| 
    +--+--+--+ +--+--+--+ +--+--+--+ 
    | 4| 5| 6| | 4| 5| 6| | 4| 5| 6| 
    +--+--+--+ +--+--+--+ +--+--+--+ 
    | 7| 8| 9| | 7| 8| 9| | 7| 8| 9| 
    +--+--+--+ +--+--+--+ +--+--+--+ 
    +--+--+--+ +--+--+--+ +--+--+--+ 
    | 1| 2| 3| | 1| 2| 3| | 1| 2| 3| 
    +--+--+--+ +--+--+--+ +--+--+--+ 
    | 4| 5| 6| | 4| 5| 6| | 4| 5| 6| 
    +--+--+--+ +--+--+--+ +--+--+--+ 
    | 7| 8| 9| | 7| 8| 9| | 7| 8| 9| 
    +--+--+--+ +--+--+--+ +--+--+--+ 
    +--+--+--+ +--+--+--+ +--+--+--+ 
    | 1| 2| 3| | 1| 2| 3| | 1| 2| 3| 
    +--+--+--+ +--+--+--+ +--+--+--+ 
    | 4| 5| 6| | 4| 5| 6| | 4| 5| 6| 
    +--+--+--+ +--+--+--+ +--+--+--+ 
    | 7| 8| 9| | 7| 8| 9| | 7| 8| 9| 
    +--+--+--+ +--+--+--+ +--+--+--+ 
    
    The Super TTT board supports user selection on board size range from 3*3 to 5*5, each 3*3 sub board are labeld as follow:

    A B C
    D E F
    G H I

    A B C D
    E F G H
    I J K L
    M N O P

    A B C D E
    F G H I J
    K L M N O
    P Q R S T
    U V W X Y


## How to compile and run
---------------------------------------------------------------------------
Your directions on how to run the code. Ideally should resemble the lines below

1. Navigate to the directory "YourCodeDirectory" after unzipping the files
2. Run the following command line:
    mkdir -p bin && javac *.java -d bin
    java -cp ./bin GameCenter

If using Java GUI to run the program
1. Copy-paste all the files mentioned above to the **/src** folder.   
2. Create a new JAVA project from Exsiting Sources
3. Run the main in GameCenter.java



## Input/Output Example
---------------------------------------------------------------------------
Please give us a full execution of what we should see on the screen. 

Terminal Output :
cyang@Sparrows-MacBook-Air SuperTTT %  /usr/bin/env /Library/Java/JavaVirtualMachines/amazon-corretto-8.jdk/Contents/Home/bin/java -cp /Users/cyang/Desktop/
newJava/SuperTTT/bin GameCenter 
Welcome to play TTT games.
you have 3 games to choose.

1. Tic Tac Toe
2. Order and Chaos
3. Super Tic Tac Toe
4. exit game
Please input 1 - 4: 1
You will play a new Tic Tac Toe
Please enter one player's name: ana
Please enter the other player's name: doomfist
This is Tic Tac Toe.
the width of board is 3 - 9,the height of board is 3 - 9.
The game chooses the smaller one between length and width as x.
The aim of players is to  get x like pieces in a row either vertically, horizontally, or diagonally.

Please Choose who play first.
1. ana
2. doomfist
Please input 1 - 2: 1
Enter a width. Please input 3 - 9: 3
Enter a height. Please input 3 - 9: 3
Tips: who first gets 3 pieces in a row is the winner.
+--+--+--+
| 1| 2| 3|
+--+--+--+
| 4| 5| 6|
+--+--+--+
| 7| 8| 9|
+--+--+--+

Hi, ana:
Enter a position(enter 0 to exit game).Please input 0 - 9: 1
+--+--+--+
|O | 2| 3|
+--+--+--+
| 4| 5| 6|
+--+--+--+
| 7| 8| 9|
+--+--+--+

Hi, doomfist:
Enter a position(enter 0 to exit game).Please input 0 - 9: 2
+--+--+--+
|O |X | 3|
+--+--+--+
| 4| 5| 6|
+--+--+--+
| 7| 8| 9|
+--+--+--+

Hi, ana:
Enter a position(enter 0 to exit game).Please input 0 - 9: 5
+--+--+--+
|O |X | 3|
+--+--+--+
| 4|O | 6|
+--+--+--+
| 7| 8| 9|
+--+--+--+

Hi, doomfist:
Enter a position(enter 0 to exit game).Please input 0 - 9: 3
+--+--+--+
|O |X |X |
+--+--+--+
| 4|O | 6|
+--+--+--+
| 7| 8| 9|
+--+--+--+

Hi, ana:
Enter a position(enter 0 to exit game).Please input 0 - 9: 9
+--+--+--+
|O |X |X |
+--+--+--+
| 4|O | 6|
+--+--+--+
| 7| 8|O |
+--+--+--+

Congratulations ana!
You are the winner!
Would you like to start another round?
Press 'y' to continue, or any other key to exit game.y
This is Tic Tac Toe.
the width of board is 3 - 9,the height of board is 3 - 9.
The game chooses the smaller one between length and width as x.
The aim of players is to  get x like pieces in a row either vertically, horizontally, or diagonally.

Please Choose who play first.
1. ana
2. doomfist
Please input 1 - 2: 1
Enter a width. Please input 3 - 9: 4
Enter a height. Please input 3 - 9: 4
Tips: who first gets 4 pieces in a row is the winner.
+--+--+--+--+
| 1| 2| 3| 4|
+--+--+--+--+
| 5| 6| 7| 8|
+--+--+--+--+
| 9|10|11|12|
+--+--+--+--+
|13|14|15|16|
+--+--+--+--+

Hi, ana:
Enter a position(enter 0 to exit game).Please input 0 - 16: 1
+--+--+--+--+
|O | 2| 3| 4|
+--+--+--+--+
| 5| 6| 7| 8|
+--+--+--+--+
| 9|10|11|12|
+--+--+--+--+
|13|14|15|16|
+--+--+--+--+

Hi, doomfist:
Enter a position(enter 0 to exit game).Please input 0 - 16: 2
+--+--+--+--+
|O |X | 3| 4|
+--+--+--+--+
| 5| 6| 7| 8|
+--+--+--+--+
| 9|10|11|12|
+--+--+--+--+
|13|14|15|16|
+--+--+--+--+

Hi, ana:
Enter a position(enter 0 to exit game).Please input 0 - 16: 6
+--+--+--+--+
|O |X | 3| 4|
+--+--+--+--+
| 5|O | 7| 8|
+--+--+--+--+
| 9|10|11|12|
+--+--+--+--+
|13|14|15|16|
+--+--+--+--+

Hi, doomfist:
Enter a position(enter 0 to exit game).Please input 0 - 16: 3
+--+--+--+--+
|O |X |X | 4|
+--+--+--+--+
| 5|O | 7| 8|
+--+--+--+--+
| 9|10|11|12|
+--+--+--+--+
|13|14|15|16|
+--+--+--+--+

Hi, ana:
Enter a position(enter 0 to exit game).Please input 0 - 16: 11
+--+--+--+--+
|O |X |X | 4|
+--+--+--+--+
| 5|O | 7| 8|
+--+--+--+--+
| 9|10|O |12|
+--+--+--+--+
|13|14|15|16|
+--+--+--+--+

Hi, doomfist:
Enter a position(enter 0 to exit game).Please input 0 - 16: 7
+--+--+--+--+
|O |X |X | 4|
+--+--+--+--+
| 5|O |X | 8|
+--+--+--+--+
| 9|10|O |12|
+--+--+--+--+
|13|14|15|16|
+--+--+--+--+

Hi, ana:
Enter a position(enter 0 to exit game).Please input 0 - 16: 9
+--+--+--+--+
|O |X |X | 4|
+--+--+--+--+
| 5|O |X | 8|
+--+--+--+--+
|O |10|O |12|
+--+--+--+--+
|13|14|15|16|
+--+--+--+--+

Hi, doomfist:
Enter a position(enter 0 to exit game).Please input 0 - 16: 12
+--+--+--+--+
|O |X |X | 4|
+--+--+--+--+
| 5|O |X | 8|
+--+--+--+--+
|O |10|O |X |
+--+--+--+--+
|13|14|15|16|
+--+--+--+--+

Hi, ana:
Enter a position(enter 0 to exit game).Please input 0 - 16: 16
+--+--+--+--+
|O |X |X | 4|
+--+--+--+--+
| 5|O |X | 8|
+--+--+--+--+
|O |10|O |X |
+--+--+--+--+
|13|14|15|O |
+--+--+--+--+

Congratulations ana!
You are the winner!
Would you like to start another round?
Press 'y' to continue, or any other key to exit game.q
Good job, guys!
Player ana gets 2 points
Player doomfist gets 0 points
See you next time.
Welcome to play TTT games.
you have 3 games to choose.

1. Tic Tac Toe
2. Order and Chaos
3. Super Tic Tac Toe
4. exit game
Please input 1 - 4: 2
You will play Order and Chaos
Please enter one player's name: genji
Please enter the other player's name: mercy

Order and Chaos is on a 6x6 game board.
Order plays first, then turns alternate. Order aims to get five like pieces in a row.
The opponent Chaos endeavors to prevent this.
Please Choose who play first.
1. genji
2. mercy
Please input 1 - 2: 1
+--+--+--+--+--+--+
| 1| 2| 3| 4| 5| 6|
+--+--+--+--+--+--+
| 7| 8| 9|10|11|12|
+--+--+--+--+--+--+
|13|14|15|16|17|18|
+--+--+--+--+--+--+
|19|20|21|22|23|24|
+--+--+--+--+--+--+
|25|26|27|28|29|30|
+--+--+--+--+--+--+
|31|32|33|34|35|36|
+--+--+--+--+--+--+

Hi, genji:
Please enter your marker.
1. O
2. X
Please input 1 - 2: 0
Invalid. Please input 1 - 2: 1
Enter a position(enter 0 to exit game).Please input 0 - 36: 1
+--+--+--+--+--+--+
|O | 2| 3| 4| 5| 6|
+--+--+--+--+--+--+
| 7| 8| 9|10|11|12|
+--+--+--+--+--+--+
|13|14|15|16|17|18|
+--+--+--+--+--+--+
|19|20|21|22|23|24|
+--+--+--+--+--+--+
|25|26|27|28|29|30|
+--+--+--+--+--+--+
|31|32|33|34|35|36|
+--+--+--+--+--+--+

Hi, mercy:
Please enter your marker.
1. O
2. X
Please input 1 - 2: 2
Enter a position(enter 0 to exit game).Please input 0 - 36: 2
+--+--+--+--+--+--+
|O |X | 3| 4| 5| 6|
+--+--+--+--+--+--+
| 7| 8| 9|10|11|12|
+--+--+--+--+--+--+
|13|14|15|16|17|18|
+--+--+--+--+--+--+
|19|20|21|22|23|24|
+--+--+--+--+--+--+
|25|26|27|28|29|30|
+--+--+--+--+--+--+
|31|32|33|34|35|36|
+--+--+--+--+--+--+

Hi, genji:
Please enter your marker.
1. O
2. X
Please input 1 - 2: 1
Enter a position(enter 0 to exit game).Please input 0 - 36: 7
+--+--+--+--+--+--+
|O |X | 3| 4| 5| 6|
+--+--+--+--+--+--+
|O | 8| 9|10|11|12|
+--+--+--+--+--+--+
|13|14|15|16|17|18|
+--+--+--+--+--+--+
|19|20|21|22|23|24|
+--+--+--+--+--+--+
|25|26|27|28|29|30|
+--+--+--+--+--+--+
|31|32|33|34|35|36|
+--+--+--+--+--+--+

Hi, mercy:
Please enter your marker.
1. O
2. X
Please input 1 - 2: 2
Enter a position(enter 0 to exit game).Please input 0 - 36: 3
+--+--+--+--+--+--+
|O |X |X | 4| 5| 6|
+--+--+--+--+--+--+
|O | 8| 9|10|11|12|
+--+--+--+--+--+--+
|13|14|15|16|17|18|
+--+--+--+--+--+--+
|19|20|21|22|23|24|
+--+--+--+--+--+--+
|25|26|27|28|29|30|
+--+--+--+--+--+--+
|31|32|33|34|35|36|
+--+--+--+--+--+--+

Hi, genji:
Please enter your marker.
1. O
2. X
Please input 1 - 2: 1
Enter a position(enter 0 to exit game).Please input 0 - 36: 14
+--+--+--+--+--+--+
|O |X |X | 4| 5| 6|
+--+--+--+--+--+--+
|O | 8| 9|10|11|12|
+--+--+--+--+--+--+
|13|O |15|16|17|18|
+--+--+--+--+--+--+
|19|20|21|22|23|24|
+--+--+--+--+--+--+
|25|26|27|28|29|30|
+--+--+--+--+--+--+
|31|32|33|34|35|36|
+--+--+--+--+--+--+

Hi, mercy:
Please enter your marker.
1. O
2. X
Please input 1 - 2: 2
Enter a position(enter 0 to exit game).Please input 0 - 36: 4
+--+--+--+--+--+--+
|O |X |X |X | 5| 6|
+--+--+--+--+--+--+
|O | 8| 9|10|11|12|
+--+--+--+--+--+--+
|13|O |15|16|17|18|
+--+--+--+--+--+--+
|19|20|21|22|23|24|
+--+--+--+--+--+--+
|25|26|27|28|29|30|
+--+--+--+--+--+--+
|31|32|33|34|35|36|
+--+--+--+--+--+--+

Hi, genji:
Please enter your marker.
1. O
2. X
Please input 1 - 2: 1
Enter a position(enter 0 to exit game).Please input 0 - 36: 21
+--+--+--+--+--+--+
|O |X |X |X | 5| 6|
+--+--+--+--+--+--+
|O | 8| 9|10|11|12|
+--+--+--+--+--+--+
|13|O |15|16|17|18|
+--+--+--+--+--+--+
|19|20|O |22|23|24|
+--+--+--+--+--+--+
|25|26|27|28|29|30|
+--+--+--+--+--+--+
|31|32|33|34|35|36|
+--+--+--+--+--+--+

Hi, mercy:
Please enter your marker.
1. O
2. X
Please input 1 - 2: 1
Enter a position(enter 0 to exit game).Please input 0 - 36: 10
+--+--+--+--+--+--+
|O |X |X |X | 5| 6|
+--+--+--+--+--+--+
|O | 8| 9|O |11|12|
+--+--+--+--+--+--+
|13|O |15|16|17|18|
+--+--+--+--+--+--+
|19|20|O |22|23|24|
+--+--+--+--+--+--+
|25|26|27|28|29|30|
+--+--+--+--+--+--+
|31|32|33|34|35|36|
+--+--+--+--+--+--+

Hi, genji:
Please enter your marker.
1. O
2. X
Please input 1 - 2: 1
Enter a position(enter 0 to exit game).Please input 0 - 36: 28
+--+--+--+--+--+--+
|O |X |X |X | 5| 6|
+--+--+--+--+--+--+
|O | 8| 9|O |11|12|
+--+--+--+--+--+--+
|13|O |15|16|17|18|
+--+--+--+--+--+--+
|19|20|O |22|23|24|
+--+--+--+--+--+--+
|25|26|27|O |29|30|
+--+--+--+--+--+--+
|31|32|33|34|35|36|
+--+--+--+--+--+--+

Hi, mercy:
Please enter your marker.
1. O
2. X
Please input 1 - 2: 5
Invalid. Please input 1 - 2: 2
Enter a position(enter 0 to exit game).Please input 0 - 36: 5
+--+--+--+--+--+--+
|O |X |X |X |X | 6|
+--+--+--+--+--+--+
|O | 8| 9|O |11|12|
+--+--+--+--+--+--+
|13|O |15|16|17|18|
+--+--+--+--+--+--+
|19|20|O |22|23|24|
+--+--+--+--+--+--+
|25|26|27|O |29|30|
+--+--+--+--+--+--+
|31|32|33|34|35|36|
+--+--+--+--+--+--+

Hi, genji:
Please enter your marker.
1. O
2. X
Please input 1 - 2: 1
Enter a position(enter 0 to exit game).Please input 0 - 36: 35
+--+--+--+--+--+--+
|O |X |X |X |X | 6|
+--+--+--+--+--+--+
|O | 8| 9|O |11|12|
+--+--+--+--+--+--+
|13|O |15|16|17|18|
+--+--+--+--+--+--+
|19|20|O |22|23|24|
+--+--+--+--+--+--+
|25|26|27|O |29|30|
+--+--+--+--+--+--+
|31|32|33|34|O |36|
+--+--+--+--+--+--+

Congratulations genji!
You are the winner!
Would you like to start another round?
Press 'y' to continue, or any other key to exit game.w
Good job, guys!
Player genji gets 1 points
Player mercy gets 0 points
See you next time.
Welcome to play TTT games.
you have 3 games to choose.

1. Tic Tac Toe
2. Order and Chaos
3. Super Tic Tac Toe
4. exit game
Please input 1 - 4: 3
You will play Super Tic Tac Toe
Please enter one player's name: Ana
Please enter the other player's name: Doomfist
This is Super Tic Tac Toe.
The Super Cells can be accessed using the alphabetic characters A, B, C
A B C
D E F
G H I
If a winner appears on the sub board, the pieces cannot be placed there.

Please Choose who play first.
1. Ana
2. Doomfist
Please input 1 - 2: 1
choose board size
1. 3*3
2. 4*4
3. 5*5
Please input 1 - 3: 1
+--+--+--+ +--+--+--+ +--+--+--+ 
| 1| 2| 3| | 1| 2| 3| | 1| 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4| 5| 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8| 9| | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 1| 2| 3| | 1| 2| 3| | 1| 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4| 5| 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8| 9| | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 1| 2| 3| | 1| 2| 3| | 1| 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4| 5| 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8| 9| | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 

Hi, Ana:
Please enter A-I: A
Enter a position(enter 0 to exit game).Please input 0 - 9: 1
+--+--+--+ +--+--+--+ +--+--+--+ 
|O | 2| 3| | 1| 2| 3| | 1| 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4| 5| 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8| 9| | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 1| 2| 3| | 1| 2| 3| | 1| 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4| 5| 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8| 9| | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 1| 2| 3| | 1| 2| 3| | 1| 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4| 5| 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8| 9| | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 

Hi, Doomfist:
Please enter A-I: A
Enter a position(enter 0 to exit game).Please input 0 - 9: 2
+--+--+--+ +--+--+--+ +--+--+--+ 
|O |X | 3| | 1| 2| 3| | 1| 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4| 5| 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8| 9| | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 1| 2| 3| | 1| 2| 3| | 1| 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4| 5| 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8| 9| | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 1| 2| 3| | 1| 2| 3| | 1| 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4| 5| 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8| 9| | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 

Hi, Ana:
Please enter A-I: A
Enter a position(enter 0 to exit game).Please input 0 - 9: 5
+--+--+--+ +--+--+--+ +--+--+--+ 
|O |X | 3| | 1| 2| 3| | 1| 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4|O | 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8| 9| | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 1| 2| 3| | 1| 2| 3| | 1| 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4| 5| 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8| 9| | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 1| 2| 3| | 1| 2| 3| | 1| 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4| 5| 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8| 9| | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 

Hi, Doomfist:
Please enter A-I: A
Enter a position(enter 0 to exit game).Please input 0 - 9: 3
+--+--+--+ +--+--+--+ +--+--+--+ 
|O |X |X | | 1| 2| 3| | 1| 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4|O | 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8| 9| | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 1| 2| 3| | 1| 2| 3| | 1| 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4| 5| 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8| 9| | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 1| 2| 3| | 1| 2| 3| | 1| 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4| 5| 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8| 9| | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 

Hi, Ana:
Please enter A-I: A
Enter a position(enter 0 to exit game).Please input 0 - 9: 9
+--+--+--+ +--+--+--+ +--+--+--+ 
|O |X |X | | 1| 2| 3| | 1| 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4|O | 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8|O | | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 1| 2| 3| | 1| 2| 3| | 1| 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4| 5| 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8| 9| | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 1| 2| 3| | 1| 2| 3| | 1| 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4| 5| 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8| 9| | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 

Hi, Doomfist:
Please enter A-I: A
The sub-board has a winner, you can't place there
Please enter A-I: B
Enter a position(enter 0 to exit game).Please input 0 - 9: 1
+--+--+--+ +--+--+--+ +--+--+--+ 
|O |X |X | |X | 2| 3| | 1| 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4|O | 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8|O | | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 1| 2| 3| | 1| 2| 3| | 1| 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4| 5| 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8| 9| | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 1| 2| 3| | 1| 2| 3| | 1| 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4| 5| 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8| 9| | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 

Hi, Ana:
Please enter A-I: E
Enter a position(enter 0 to exit game).Please input 0 - 9: 1
+--+--+--+ +--+--+--+ +--+--+--+ 
|O |X |X | |X | 2| 3| | 1| 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4|O | 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8|O | | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 1| 2| 3| |O | 2| 3| | 1| 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4| 5| 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8| 9| | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 1| 2| 3| | 1| 2| 3| | 1| 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4| 5| 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8| 9| | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 

Hi, Doomfist:
Please enter A-I: B
Enter a position(enter 0 to exit game).Please input 0 - 9: 2
+--+--+--+ +--+--+--+ +--+--+--+ 
|O |X |X | |X |X | 3| | 1| 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4|O | 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8|O | | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 1| 2| 3| |O | 2| 3| | 1| 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4| 5| 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8| 9| | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 1| 2| 3| | 1| 2| 3| | 1| 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4| 5| 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8| 9| | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 

Hi, Ana:
Please enter A-I: E
Enter a position(enter 0 to exit game).Please input 0 - 9: 2
+--+--+--+ +--+--+--+ +--+--+--+ 
|O |X |X | |X |X | 3| | 1| 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4|O | 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8|O | | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 1| 2| 3| |O |O | 3| | 1| 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4| 5| 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8| 9| | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 1| 2| 3| | 1| 2| 3| | 1| 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4| 5| 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8| 9| | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 

Hi, Doomfist:
Please enter A-I: B
Enter a position(enter 0 to exit game).Please input 0 - 9: 3
+--+--+--+ +--+--+--+ +--+--+--+ 
|O |X |X | |X |X |X | | 1| 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4|O | 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8|O | | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 1| 2| 3| |O |O | 3| | 1| 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4| 5| 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8| 9| | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 1| 2| 3| | 1| 2| 3| | 1| 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4| 5| 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8| 9| | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 

Hi, Ana:
Please enter A-I: E
Enter a position(enter 0 to exit game).Please input 0 - 9: 3
+--+--+--+ +--+--+--+ +--+--+--+ 
|O |X |X | |X |X |X | | 1| 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4|O | 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8|O | | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 1| 2| 3| |O |O |O | | 1| 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4| 5| 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8| 9| | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 1| 2| 3| | 1| 2| 3| | 1| 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4| 5| 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8| 9| | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 

Hi, Doomfist:
Please enter A-I: E
The sub-board has a winner, you can't place there
Please enter A-I: C
Enter a position(enter 0 to exit game).Please input 0 - 9: 1
+--+--+--+ +--+--+--+ +--+--+--+ 
|O |X |X | |X |X |X | |X | 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4|O | 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8|O | | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 1| 2| 3| |O |O |O | | 1| 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4| 5| 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8| 9| | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 1| 2| 3| | 1| 2| 3| | 1| 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4| 5| 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8| 9| | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 

Hi, Ana:
Please enter A-I: B
The sub-board has a winner, you can't place there
Please enter A-I: I
Enter a position(enter 0 to exit game).Please input 0 - 9: 1
+--+--+--+ +--+--+--+ +--+--+--+ 
|O |X |X | |X |X |X | |X | 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4|O | 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8|O | | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 1| 2| 3| |O |O |O | | 1| 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4| 5| 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8| 9| | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 1| 2| 3| | 1| 2| 3| |O | 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4| 5| 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8| 9| | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 

Hi, Doomfist:
Please enter A-I: C
Enter a position(enter 0 to exit game).Please input 0 - 9: 2
+--+--+--+ +--+--+--+ +--+--+--+ 
|O |X |X | |X |X |X | |X |X | 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4|O | 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8|O | | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 1| 2| 3| |O |O |O | | 1| 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4| 5| 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8| 9| | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 1| 2| 3| | 1| 2| 3| |O | 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4| 5| 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8| 9| | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 

Hi, Ana:
Please enter A-I: I
Enter a position(enter 0 to exit game).Please input 0 - 9: 5
+--+--+--+ +--+--+--+ +--+--+--+ 
|O |X |X | |X |X |X | |X |X | 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4|O | 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8|O | | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 1| 2| 3| |O |O |O | | 1| 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4| 5| 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8| 9| | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 1| 2| 3| | 1| 2| 3| |O | 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4| 5| 6| | 4| 5| 6| | 4|O | 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8| 9| | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 

Hi, Doomfist:
Please enter A-I: I
Enter a position(enter 0 to exit game).Please input 0 - 9: 4
+--+--+--+ +--+--+--+ +--+--+--+ 
|O |X |X | |X |X |X | |X |X | 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4|O | 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8|O | | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 1| 2| 3| |O |O |O | | 1| 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4| 5| 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8| 9| | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 1| 2| 3| | 1| 2| 3| |O | 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4| 5| 6| | 4| 5| 6| |X |O | 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8| 9| | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 

Hi, Ana:
Please enter A-I: I
Enter a position(enter 0 to exit game).Please input 0 - 9: 9
+--+--+--+ +--+--+--+ +--+--+--+ 
|O |X |X | |X |X |X | |X |X | 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4|O | 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8|O | | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 1| 2| 3| |O |O |O | | 1| 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4| 5| 6| | 4| 5| 6| | 4| 5| 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8| 9| | 7| 8| 9| | 7| 8| 9| 
+--+--+--+ +--+--+--+ +--+--+--+ 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 1| 2| 3| | 1| 2| 3| |O | 2| 3| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 4| 5| 6| | 4| 5| 6| |X |O | 6| 
+--+--+--+ +--+--+--+ +--+--+--+ 
| 7| 8| 9| | 7| 8| 9| | 7| 8|O | 
+--+--+--+ +--+--+--+ +--+--+--+ 

Congratulations Ana!
You are the winner!
Would you like to start another round?
Press 'y' to continue, or any other key to exit game.W
Good job, guys!
Player Ana gets 1 points
Player Doomfist gets 0 points
See you next time.
Welcome to play TTT games.
you have 3 games to choose.

1. Tic Tac Toe
2. Order and Chaos
3. Super Tic Tac Toe
4. exit game
Please input 1 - 4: 