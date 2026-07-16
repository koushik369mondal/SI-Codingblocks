
function getfun(){
    function hello(){
        console.log("Hello");
    }
    return hello;
}

let fun = getfun();
fun();

