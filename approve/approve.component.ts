import { Component, OnInit } from '@angular/core';

import { HttpClientService, CreateEmployee } from '../service/httpclient.service';

@Component({
  selector: 'app-approve',
  templateUrl: './approve.component.html',
  styleUrls: ['./approve.component.css']
})
export class ApproveComponent implements OnInit {


  
  employees:String[];

 
   
  constructor(
    private httpClientService:HttpClientService
  ) { }

  ngOnInit() {
    this.httpClientService.getEmployees().subscribe(
     response =>this.handleSuccessfulResponse(response),
    );

    console.log("this.employees");
    console.log("Test 1");
    console.log(this.employees);
    console.log("Test 2");
  }
    response:any;
 
handleSuccessfulResponse(response)
{
    this.employees=response;
    console.log(this.employees);
}

approveEmployees(emp)
{
          emp:String[emp];
          console.log("Inside Approve Employee");  
           console.log(emp);
 
           
           this.httpClientService.approveEmployees(emp)
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

         deleteEmployee(emp): void {
          this.httpClientService.deleteEmployee(emp)
            .subscribe( data => {
              this.employees = this.employees.filter(u => u !== emp);
            })
            alert("You have rejected successfully.");
        };  
      

         
}


