## Collection Framework

- **List:** These are the indexed collections in which order is preserved and duplicates are allowed
- Example implementations:
    
    - ArrayList: this will use dynamic array this is not thread safe class
    
    - LinkedList: this will use doubly linked list
        - How to iterate in List: In List we got object of Iterator which can be use to iterate over elements in forward direction and ListIterator Object to iterate in backward direction.
    
    - Vector: this will work on dynamic array this is also thread safe class.

        - Stack: child of vector 
        - Enumeration: The interface in which this was the only way before 1.0v to iterate over elements in vector before 1.1v and 1.2v came out

- **Set:** Not indexed collection which means doesn't preserve the order and duplicates are not allowed.

- Example Implementations:
    
    - HashSet: Implementation class for set, order wont be preserved and duplicates not allowed here

        - LinkedHashSet: child of HashSet which maintains order and duplicated not allowed
    
    - SortedSet: it is interface Which will maintain order and no duplicates allowed and it will also add element based on sorting

        - TreeSet: Implementation class of SortedSet which will maintain elements in sorted order which is by default ascending order sorting
    - Iterating: in set we can only iterate using Iterable in which we can use for-each loop and also forEach() method.

- **MAP:** There are two types to create map
    - HashMap: in which duplicate keys are not allowed and order is not maintained this is class.
        - LinkedHashMap: Is a child class of hashmap in which order of insertion of key is preserved and duplicates are not allowed
    - SortedMap: THis is an interface maybe order of key is maintained and this function sorts the key according to their natural order.
        - TreeMap: is implementation class of SortedMap used to implement SortedMap and does the keywise sorting.

