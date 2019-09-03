import { Component, OnInit } from '@angular/core';
import { HttpClientService } from '../service/httpclient.service';

@Component({
  selector: 'app-approveratings',
  templateUrl: './approveratings.component.html',
  styleUrls: ['./approveratings.component.css']
})
export class ApproveratingsComponent implements OnInit {

  employees:string[];
  constructor(private httpClientService:HttpClientService) { }


  ngOnInit() {
    console.log("ON INIT")
    console.log(this.employees)
   this.httpClientService.getRating1().subscribe(
     response =>this.handleSuccessfulResponse(response),
    );
    console.log(this.employees)
 }
 handleSuccessfulResponse(response)
{
   this.employees=response;
}
response:any;

approveRating(emp)
{
          emp:String[emp];
          console.log("Inside Approve Rating !!");  
           console.log(emp);
 
           
           this.httpClientService.approveRating(emp)
             .subscribe( (data) => {
               this.response=data;
               console.log("after creatEmployee call")
               alert("You have approved successfully.");

         //      console.log("before delete employee")
        //       console.log(this.employees)
              //  this.httpClientService.deleteEmployee(emp)
              //  .subscribe( data => {
              //    this.employees = this.employees.filter(u => u !== emp);
              //    console.log("Inside delete employee")
              //    console.log(emp);
              //  })
            //   alert("You have registered successfully.");

             
            
             });
         }

         deleteRating(emp): void {
           console.log("Inside delete rating")
          this.httpClientService.deleteRating(emp)
            .subscribe( data => {
              this.employees = this.employees.filter(u => u !== emp);
            })
            alert("You have rejected successfully.");
        };  
}
