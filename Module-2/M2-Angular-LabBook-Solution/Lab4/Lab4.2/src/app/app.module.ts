import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import {FormsModule} from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { ListBookComponent } from './list-book/list-book.component';
import { BookService } from './services/bookservice';
import { AscendingOrder } from './pipes/ascorder';

@NgModule({
  declarations: [
     AppComponent,
     ListBookComponent,
     AscendingOrder
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [BookService],
  bootstrap: [AppComponent]
})
export class AppModule { }
