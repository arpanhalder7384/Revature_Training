import { MyInterface } from "./service";

export class MyServiceImpl implements MyInterface{
    hello1() {
        console.log("Heyyy from hello1 ");
    }
    hello2(): string {
       return "Heyyy from hello2 ";
    }

}