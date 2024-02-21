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


