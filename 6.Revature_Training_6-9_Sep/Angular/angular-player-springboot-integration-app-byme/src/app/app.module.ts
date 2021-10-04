import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddPlayerComponent } from './add-player/add-player.component';
import { UpdatePlayerComponent } from './update-player/update-player.component';
import { DeletePlayerComponent } from './delete-player/delete-player.component';
import { FormsModule } from '@angular/forms';
import { ViewPlayersComponent } from './view-players/view-players.component';

@NgModule({
  declarations: [
    AppComponent,
    AddPlayerComponent,
    UpdatePlayerComponent,
    DeletePlayerComponent,
    ViewPlayersComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
