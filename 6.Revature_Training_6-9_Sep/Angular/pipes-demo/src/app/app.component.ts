import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Pipes Demo App';
  price=25.56;
  fruits=["Apple", "Orange", "Banana", "Grapes"];
  curr_date=new Date();
  num=0.8178;
  myjson={"id":100, "name":"Arpan Halder", "address":{
    "City":"Kolkata", "State":"West Bengal", "Pin":743348
  }, "contact":7384190892}
  firstName="Arpan";
  lastName="Halder";
}
