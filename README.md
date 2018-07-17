# Exercises
Exercises from **_Core Java SE 9 for the Impatient_** _(Second Edition)_ _by Cay S. Horstmann_

## Classes:
* **Test1**: Write a program that reads an integer and prints it in binary, octal and exadecimal. Print the reciprocal as a hexadecimal floating-point number.
* **Substring**: Write a program that read a string and prints all of its nonempty substring.
* **Point**: Implements an immutable class _Point_ that describes a point in the plane.
             Provide a constructor to set it to a specific point, a no-arg constructor to set it to the origin, and methods _getX_, _getY_, _translate_, and _scale_.
* **Point2**: Repeat the precedenting exercise but now make _translate_ and _scale_ into mutators.
* **LotteryCom**: Write a program that prints a lottery combination, picking six distinct numbers between 1 and 49.
                  To pick six distinct numbers, start with an array list filled with 1...49. Pick a random index and remove te element. Repeat six times and print the result in sorted order.
* **Car**: Implements a class _Car_ that a models a car traveling along the x-axis, consuming gas as it moves. Provide methods to drive by a give number of gallons to the gas tank,
           and to get the current distance from the origin and fuel level. Specify the fuel efficency (in miles/gallons) in the constructor.
* **BidimensionalArray**: Write a program that reads a two-dimensional array of integers and determines
                          whether it is a magic square (that is, whether the sum of all rows, all columns and the diagonals is the 
                          same).
* **Queue**: Implement a class Queue, an unbounded queue of strings. Provide methods _add_, adding at the tail, and _remove_, removing at the head of the queue. Store elements as a linked list of nodes. Provide an _iterator_-an object that yields the elements of the queue of the preceding class. Make _Iterator_ a nested class with methods _next_ and _hasNext_. Provide a method _itarator()_ of the _Queue_ class that yields a _Queue.Iterator_.
