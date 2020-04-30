import { PipeTransform, Pipe } from '@angular/core';

@Pipe({
    name:'ascend'
})
/**
 * ascending order pipe which orders array on any field !
 */
export class AscendingOrder implements PipeTransform{
    
    transform(values: any[], field:string) {
     if(field==null || field==undefined){
         return values;
     }


    //
    //sort method of array takes compare function
    //
    let result:any[]=values.sort(
        //
        // compare arrow function
        //
        (e1, e2)=>{
        //
        //in javascript we can fetch value of a field of object by field's name
        //    
        let e1FieldValue=e1[field];
        let e2FieldValue=e2[field];
        //
        // comparing number
        //
        if(typeof e1FieldValue=="number")
        {
        let compNumber= e1FieldValue-e2FieldValue;
         return compNumber;
        }
        //
        // comparing string
        //
        if(typeof e1FieldValue=="string"){
          let compNumber=  e1FieldValue.localeCompare(e2FieldValue);
          return compNumber;
        }
        return 0;
    }
    );
    return result;
    }


}