// var myobject={
//     foo:"bar",
//     func: function() {
//        var self = this;
//        console.log("outer func : this.foo="+this.foo)
//        console.log("outer func : self.foo="+self.foo)
       
//        (function(){
//            console.log("inner func : this.foo="+this.foo)
//             console.log("inner func : self.foo="+self.foo)
//        }())
//     }
    
// };

// myobject.func();

let usingObjectAsaKey=()=>{
    var a={}, b={key:'b'}, c={key:'c'}
    a[b]=123
    a[c]=456
    console.log(a[c]);

}

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
  
  obj1.valueOfThis(); 
  obj2.valueOfThis(); 

  var spreadOperator=()=>{
    obj1 = {a : 1, b :2}
    obj2 ={c:3, b:4}
    var hello = {...obj1, ...obj2}
    console.log(hello);
  }
  spreadOperator()


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

