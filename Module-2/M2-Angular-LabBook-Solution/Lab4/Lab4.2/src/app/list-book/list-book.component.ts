import { Component, OnInit } from '@angular/core';
import { Book } from '../model/Book';
import { BookService } from '../services/bookservice';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-list-book',
  templateUrl: './list-book.component.html',
  styleUrls: ['./list-book.component.css']
})
export class ListBookComponent implements OnInit {

  service:BookService;
  books:Book[]=[];
  copy:Book[]=[];
  orderByField:string=null;
  constructor(service:BookService) {
    this.service=service;
    let fetched:Observable<Book[]>= this.service.fetchBooks();
    fetched.subscribe(
      books=>{
            this.books=books;
            this.copy=this.copyArray(this.books);
    },
     err=>{
       console.log("err in fetching="+err);
      });
    
  }
  copyArray(arr:Book[]):Book[]{
    let copied=[];  
    for(let book of arr){
      copied.push(book);
    }
    return copied;
    }

  ngOnInit(): void {
  }
  orderBy(field:string){
    this.orderByField=field;     
  }
  filterById(id:number){
    console.log("inside filterById()id="+id);
    if(id===null || id===undefined){
      this.books=this.copy;// restoring original data
      return;
     }
     let idString=id.toString(); 

     let filtered=[];
     for(let book of this.copy){
       let bookIdStr=book.id.toString();
       let foundFlag=bookIdStr.startsWith(idString);
        if(foundFlag){
          filtered.push(book);
        }
     }
     console.log("filtered sized="+filtered.length);
     this.books=filtered;// changing the component's list so that it will be reflected in view
    
  }

  filterByTitle(name:string){
    console.log("inside filterByTitle(), name="+name);
    if(name===null || name===undefined){
      this.books=this.copy;
      return;
    }
    let filtered=[];
    for(let book of this.copy){
      let foundFlag=book.title.startsWith(name);
       if(foundFlag){
         filtered.push(book);
       }
    }
    console.log("adding filtered, filter length="+filtered.length);
    this.books=filtered;// changing the component's list so that it will be reflected in view
  }

  filterByYear(year:number){
    if(year===null || year===undefined){
      this.books=this.copy;// restoring original data
      return;
     }
     let idString=year.toString(); 

     let filtered=[];
     for(let book of this.copy){
       let bookIdStr=book.year.toString();
       let foundFlag=bookIdStr.startsWith(idString);
        if(foundFlag){
          filtered.push(book);
        }
     }
     this.books=filtered;// changing the component's list so that it will be reflected in view
    
  }
  filterByAuthor(author:string){
    if(author===null || author===undefined){
      this.books=this.copy;
      return;
    }
    let filtered=[];
    for(let book of this.copy){
      let foundFlag=book.author.startsWith(author);
       if(foundFlag){
         filtered.push(book);
       }
    }
    console.log("adding filtered");
    this.books=filtered;// changing the component's list so that it will be reflected in view
  }

}



