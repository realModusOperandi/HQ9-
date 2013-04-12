This is an implementation of the HQ9+ language as specified by Cliff L Biffle: http://cliffle.com/esoterica/hq9plus.html

It is an interactive interpreter that translates commands in to the Java programming language. Which are then translated to Java bytecode. Which are then translated to assembly. Which are then trasnlated to machine code. Which are then translated to electricity. Which is then translated to heat.

 A series of commands is a program in HQ9+. You may input any combination of characters; if it is a command, that command will be executed. If it is not, it will be assumed to be a comment and skipped, as comments should be.

 Your available commands:
 H      Prints "Hello, World!"
 Q      Prints the source code of the current program.
 9      Prints the full lyrics to the popular song 99 Bottles
 +      Increments the accumulator. In line with the best practices of data hiding, this accumulator does nothing and cannot be accessed in any way.

 -L