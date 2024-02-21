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

## this keyword in arrow function vs normal function

```
var obj1 = {
    valueOfThis: function(){
      return this;
    }
  }
  var obj2 = {
    valueOfThis: ()=>{
      return this;
    }
  }
  
  obj1.valueOfThis(); //Will return the object obj1
  obj2.valueOfThis();//Will return window/global object
  ```
  - **why difference:** in normal function this refers to current object from which function is being called then in arrow function there is no binding with current object so it inherits value from parent scope.