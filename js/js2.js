function check(){
var str=document.getElementById("t1").value;
var arr=str.split("");

var ch=arr.reverse().join("");



//  for(i=str.length;i>=0;i--) {
//
//     var ch = ch + str.charAt(i);
//
// }
//
// alert(ch);
// alert(str);
if(ch==str)
 {
    alert("string is palindrome");
}
else
    alert("string is not a palindrome");

}
