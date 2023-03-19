# MakeChange2

## Overview
 - This project is cash register that returns small dominations from 20's to pennies.
For instance, an item cost $10.67 and a customer gives me a 20 the program should 
return exact change 9.33 in this form ( 1 five, 4 dollars, 1 quarter, 1 nickel, and 3 pennies). 

## Technologies Used
 - Java
 - Eclipse
 - Git

## Lessons Learned
 -Research is important: things like stack overflow, google, and w3school are incredible helpful.
 It is likely that someone else has encounter the same bug/issues I had when writing my program. 
 Researching those bugs/issues not only helped solve problems in my program, but allowed me to read several
 explanations on how I created those bug/issues in my program. Reading all those explanations helped me learned
 why my code didn't work. 
 
 -Math is hard: I also learned that I am having a hard time conceptualizing math equations as code. I understand what needs
 to be written, but I can't seem translate it into the code right away.
 
 -Not every solution works: Not every solution to the same bug/issue is going to solve the ones I created in my program. For 
 example, I was having a hard time getting my changedReturned variable to move it's remaining decimals down the code (33 -25 = 8).
 I could get the code to issue the appropriate number of cents returned in the first line, but then the 1 nickel and 3 pennies would
 disappear. Solutions told me to use something like (a = b / n) % .n %.n ) which didn't work for me. Ultimately I had to moved around 
 subtraction, multiplication, and Math.round() to fix my issues. However I wouldn't have known to play with those operators if I hadn't
 previously researched other bugs.
  