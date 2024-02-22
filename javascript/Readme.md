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

## diff betn var and let in global scope

```
var variable1 = 23;

let variable2 = 89;

function catchValues(){
  console.log(variable1);
  console.log(variable2);

// Both the variables can be accessed anywhere since they are declared in the global scope
}
window.variable1; // Returns the value 23

window.variable2; // Returns undefined
```
- **difference:** this difference is because variable declared with var keyword are added to window/global object and so we can access it using window.variabl1 but let are not added to window/global object

## var vs let in block scope

```
{
  var variable3 = [1, 2, 3, 4];
}

console.log(variable3); // Outputs [1,2,3,4]

{
  let variable4 = [6, 55, -1, 2];
}

console.log(variable4); // Throws error

for(let i = 0; i < 2; i++){
  //Do something
}

console.log(i); // Throws error

for(var j = 0; j < 2; i++){
  // Do something
}

console.log(j) // Outputs 2 

```
- **Difference:** The output of variable declared with var keyword is possible because they don't have block scope the same doesn't apply to let keyword

## Rest parameter

```
function extractingArgs(...args){
  return args[1];
}
// extractingArgs(8,9,1); // Returns 9
```
- **explaination:** it is used because if we don't know how many number of args can come then we use this simple

- **Note:** the important note here is when u define function with both regular parameter and rest parameter then rest should come at last see below
```
function myFunction(a, b, ...rest) {
    // Function body
}
```