// let v;
// let a;
// function add(...a)
// {
//   push(document.getElementById("text"))
//    console.log(v);
// }
let adds=[];
function add(){
adds.push(document.getElementById("text").value);
console.log(adds);
}
display()
{
    adds=[];
}
function display()
{
    document.getElementById("output").innerHTML = "<ul>" + adds.map(item => `<li>${item}</li>`).join("") + "</ul>";     
}
display();
