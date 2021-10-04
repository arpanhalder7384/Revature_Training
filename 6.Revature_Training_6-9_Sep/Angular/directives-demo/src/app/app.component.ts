import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Directives Demo App';
  players:Player[]=[
    {
    "id":100,
    "name":"Virat Koheli"
  },{
    "id":101,
    "name":"Sourav Ganguli"
  },{
    "id":102,
    "name":"M S Dhoni"
  },{
    "id":103,
    "name":"S Tendulkar"
  },{
    "id":104,
    "name":"Rohit Sharma"
  },{
    "id":105,
    "name":"B Kumar"
  }];
}

class Player{
  id:number;
  name:string;
}
