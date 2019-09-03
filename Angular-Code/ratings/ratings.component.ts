import { Component, OnInit } from '@angular/core';

import { HttpClientService, Rating } from '../service/httpclient.service';






@Component({
  selector: 'app-ratings',
  templateUrl: './ratings.component.html',
  styleUrls: ['./ratings.component.css']
})



export class RatingsComponent implements OnInit {

  response:any;
  user: Rating = new Rating("","","","","","","","","","","");

  
  

  marked = false;
  theCheckbox = false;
  theCheckbox1 = false;
  theCheckbox2 = false;
  theCheckbox3 = false;
  theCheckbox4 = false;
  theCheckbox5 = false;
  theCheckbox6 = false;

  constructor(private httpClientService: HttpClientService) { }

  ngOnInit() {
    console.log(this.user);
  }
      
  
  toggleVisibility(e){
    this.marked= e.target.checked;
  }

 
  createRating(): void {

   

    console.log("inside create Rating");
     console.log(this.user);
     console.log("after this.user")
    this.httpClientService.createRating(this.user)
         .subscribe( (data) => {
           this.response=data;
           console.log("after creatEmployee call")
           alert("You have Submitted rating successfully.");
        
         });
     }


// //sending data of rating to springboot -- SA
//      approveRatings(user)
// {
//           user:String[user];
//           console.log("Inside Approve Employee");  
//            console.log(user);
 
           
//            this.httpClientService.approveEmployees(user)
//              .subscribe( (data) => {
//                this.response=data;
//                console.log("after creatEmployee call")
//                alert("You have approved successfully.");

//          //      console.log("before delete employee")
//         //       console.log(this.employees)
//               //  this.httpClientService.deleteEmployee(emp)
//               //  .subscribe( data => {
//               //    this.employees = this.employees.filter(u => u !== emp);
//               //    console.log("Inside delete employee")
//               //    console.log(emp);
//               //  })
//             //   alert("You have registered successfully.");

             
            
//              });  
//          }

//         //  deleteEmployee(user): void {
//         //   this.httpClientService.deleteEmployee(user)
//         //     .subscribe( data => {
//         //       this.user = this.user.filter(u => u !== user);
//         //     })
//         //     alert("You have rejected successfully.");
//         // };  
}
