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

## Spread operator
```
var spreadOperator=(x,y,z)=>{
    console.log(x+y+z);
  }

  const arr =[1,2,3,4]
  spreadOperator(...arr)
```
- **working:** in array the values are seprated by comma
- **in string:** 
```
var spreadOperator=(x)=>{
    console.log(...x);
  }
  spreadOperator("hars") //you cannot do it with numeric datatype, noncallable iterator error
```
-  in string case it will create array of characters

- **object literals:**
```
var spreadOperator=()=>{
    obj1 = {a : 1, b :2}
    obj2 ={a:3, b:4}
     var hello = {...obj1, ...obj2} //this will btw override value of obj1 with obj2
    console.log(hello);
  }
```
- **difference:** in object case it will separate key value pairs in {} with comma separated values

## object destructuring
```
var destructorObject=()=>{
  const obj={
    strength: 78,
    benches: 39,
    blackBoard:1
  }

  //if we want in new names to store the values
  const{strength:strength2,benches:benches2,blackBoard:blackboard2}=obj
  console.log(strength2, benches2, blackboard2);

  //if we want to store the value as like same property name then simple 
  const{strength,benches, blackBoard}=obj
  console.log(strength);
}
destructorObject()
```
- **Difference in two ways:** in first one u can destructure object property to new variable name using semicolon, in second way if u want same property name used in object then simple remove semicolon.

## array destructuring

```
const arr = [1, 2, 3, 4];
const [first,second,third,fourth] = arr;
console.log(first); // Outputs 1
console.log(second); // Outputs 2
console.log(third); // Outputs 3
console.log(fourth); // Outputs 4
```

## Prototypal

- **info:** 1. in simple terms a way to create an object without creating class as a blueprint for object. 2. they can create 
