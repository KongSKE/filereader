# Input-Output Tasks
by Varit Assavavisidchai
I ran the tasks on a Vostro 14-5459 with 2.30Ghz 2.40 GHz i5-6200U,
and got these results:
|Task | Time |
|----------------------------------------------|-------|
|Read file 1-char at a time to String          | 1.260782 sec |
|Read file 1-char at a time to StringBuilder   | 0.009644 sec |
|Read file line at a time using BufferedReader | 0.058815 sec |

## Explanation of Results
We use String when an immutable structure is appropriate; obtaining a new character sequence from a String may carry an unacceptable performance penalty, either in CPU time or memory (obtaining substrings is CPU efficient because the data is not copied, but this means a potentially much larger amount of data may remain allocated).
We use StringBuilder when you need to create a mutable character sequence, usually to concatenate several character sequences together.
We use StringBuffer in the same circumstances you would use StringBuilder, but when changes to the underlying string must be synchronized (because several threads are reading/modifyind the string buffer).
