//creating array using literal style
/*let num1=[]
//creating array using new keyword
let num2=new Array();
//creating array using literal style with few values
document.write("Size of array "+num1.length)
document.write("<br>size of array "+num2.length)
let num3=[10,20,30,40];
document.write("<br>size of array "+num3.length)
document.write("<br>all elemts are "+num3);
num3.push(100);
num3.push(200);
num3.unshift(1);
num3.unshift(2);  //it will add elements at beginning
document.write("<br> all elements are "+num3);
num3.pop();  //remove elements from last
num3.shift();  //remove elements from beginning
document.write("<br> all elements are "+num3);
document.write("<br>")
document.write(typeof(num2))*/
let num4=[10,20,30,40,50]
//splice:using this we can add,remove elements in between array
document.write("<br> 0 position value "+num4[0])
document.write("<br>1 postion vaue "+num4[1])
//num4.splice(1,1)       //1st parameter index postion and 2nd parameter number of elements from that position
//num4.splice(1,2)
//num4.splice(1,1,200)     // 1st parameter inex postion and 2nd parameter num of elements from that index 3rd parameter add 200 element
//num4.splice(1,0,200)
//num4.splice(1,0,111,222,333) //from 1 index position add 3 elemnts
num4.splice(1,2,111,222,333) //delete 2 elements from 1 index and add 3 elements
document.write("<br>"+num4)