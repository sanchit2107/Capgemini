import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, observable } from 'rxjs';
import { Book } from '../model/Book';


@Injectable()
export class BookService{
client:HttpClient ;
constructor(client:HttpClient ){
this.client=client;
}
  
books:Book[]=[];


fetchBooks():Observable<Book[]>
{
  console.log("inside fetch books");
  let url='assets/booklist.json';
  let observable:Observable<Book[]> =this.client.get<Book[]>(url);
  return observable;
}

}