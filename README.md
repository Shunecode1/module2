# Functions and Conceptual Differences
An Array is a fixed structure data structure that is built with a pre-determined capacity. After an array has been created, it is impossible to alter its size. An array can have primitive data types (such as int, char) or objects. An index is a very high-speed structure since it allows access to elements in an array in a very fast way. The main shortcoming of an array is that it is non-portable, which may be inefficient when the size of the elements is unknown (Oracle, n.d.).

An ArrayList, in its turn, belongs to the Java Collections Framework, and it is a resizable-array. Internally, it stores elements using an array, but it automatically expands in cases where the number of elements is larger than the current capacity. This gives a great deal of flexibility. Objects can be put in the arrays, but not primitives, although an autoboxing capability in Java permits us to simply use it with wrapping classes such as Integer and Double. Compared to plain arrays, arraylists have a high number of built-in operations such as addition, removal, and searching of elements, among others (GeeksforGeeks, 2024).

References:
GeeksforGeeks. (2024, January 17). ArrayList in Java. https://www.geeksforgeeks.org/arraylist-in-java/

Oracle. (n.d.). Arrays (The Java™ Tutorials > Learning the Java Language > Language Basics). Retrieved January 28, 2024, from https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html