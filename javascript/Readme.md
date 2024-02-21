## what happens when we use object as a index in array to add element
```
let usingObjectAsaKey=()=>{
    var a={}, b={key:'b'}, c={key:'c'}
    a[b]=123
    a[c]=456
    console.log(a[c]);
    
}
usingObjectAsaKey()
```
- when you use object as an index here for array it simply gets converted to string like '[object Object]'.
