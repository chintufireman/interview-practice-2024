## Collection Framework

- **List:** These are the indexed collections in which order is preserved and duplicates are allowed
- Example implementations:
    
    - ArrayList: this will use dynamic array this is not thread safe class
    
    - LinkedList: this will use doubly linked list
    
    - Vector: this will work on dynamic array this is also thread safe class.

        - Stack: child of vector 

- **Set:** Not indexed collection which means doesn't preserve the order and duplicates are not allowed.
-Example Implementations:
    
    - HashSet: Implementation class order wont be preserved and duplicates not allowed here

        - LinkedHashSet: child of HashSet which maintains order and duplicated not allowed
    
    - SortedSet: it is interface Which will maintain order and no duplicates allowed and it will also add element based on sorting

        -TreeSet: Implementation class of SortedSet which will maintain elements in sorted order which is by default ascending order sorting
