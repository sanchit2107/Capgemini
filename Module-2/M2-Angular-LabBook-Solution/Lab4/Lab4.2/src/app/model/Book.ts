export class Book{
    id:number;
    title:string;
    year:number;
    author:string;
    getId():number{
        return this.id;
    }
    getTitle():string{
        return this.title;
    }
    getYear():number{
        return this.year;
    }
    getAuthor():string{
        return this.author;
    }
    constructor(id:number,title:string,year:number,author:string){
        this.id=id;
        this.title=title;
        this.year=year;
        this.author=author;
    }
}