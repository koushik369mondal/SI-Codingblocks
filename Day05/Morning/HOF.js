// Higer Order Function : 
// Ek function ko return karo dusre function se 

function callfun(fun){
    fun();
}
function hello(){
    console.log("Hello");
}
callfun(hello);