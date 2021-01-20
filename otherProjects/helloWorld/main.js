var name = "cadet";

if (process.argv[2]) {
   name = process.argv[2];

welcome(name);


function welcome(name){
   console.log("Hello " + name + ", Welcome to our World!\n");
}
