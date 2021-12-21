# ASCII2Unary

A program that takes an incoming ASCII message as input and displays as output the message encoded to unary. 
The aim is to convert a string into unary code (blocks of zeros).
First each character must be converted into its binary ascii code, then in unary.

# Here is the encoding principle:
  - The input message consists of ASCII characters (7-bit)
  - The encoded output message consists of blocks of 0
  - A block is separated from another block by a space
  - Two consecutive blocks are used to produce a series of same value bits (only 1 or 0 values):
      First block: it is always 0 or 00. If it is 0, then the series contains 1, if not, it contains 0
      Second block: the number of 0 in this block is the number of bits in the series
