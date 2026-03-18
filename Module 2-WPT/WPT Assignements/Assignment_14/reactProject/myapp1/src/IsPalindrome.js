function Ispalindrome()
{
  let s=""+n;
  //let s = Math.abs(n).toString();
  let len=s.length;

  for(let i=0; i<len/2; i++){
    if (s[i] !== s[len -i -1])
        return false;
    }
    return true;
}

let n=123454321;
if(Ispalindrome(n)=== true){
console.log("True");
}
else
    {
console.log("False")

}

export default Ispalindrome;

