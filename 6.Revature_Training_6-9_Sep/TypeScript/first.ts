import { car } from "./car";
import { MyServiceImpl } from "./serviceimpl";

console.log("Hello and welcome to TS");

let x:number;
x=1000;
console.log("x= "+x);

function helloFunction(){
    console.log("Hello from TS function"); 
}

export class Myclass{
    constructor(){
        console.log("Hello from Myclass Constructor");
    }
    helloMethod():void{
        console.log("Heyy fom  Myclass Hello method");
    }
}

let c=new Myclass();
c.helloMethod();

let car1=new car("BMW");
console.log(car1.getCar());

console.log(car.iAmStatic());

let service=new MyServiceImpl();
service.hello1();
console.log(service.hello2);