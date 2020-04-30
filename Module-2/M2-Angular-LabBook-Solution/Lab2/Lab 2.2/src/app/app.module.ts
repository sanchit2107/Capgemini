import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { MyorderPipe } from './myorder.pipe';
@NgModule({
  declarations: [
    AppComponent,
    MyorderPipe
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule
  ],
  providers: [MyorderPipe],
  bootstrap: [AppComponent]
})
export class AppModule { }
