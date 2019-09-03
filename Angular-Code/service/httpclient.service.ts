import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


export class CreateEmployee
{
      constructor(

        public firstName:string,
        public lastName:string,
        public empId:string,
        public email:string,
        public pass:string,
        public projectcode:string,
        public projectname:string,
        public projectmanager:string,
        public teamname:string,
        public approve:Boolean
      )
      {

      }
}

export class Rating 
{
      constructor(
        public empName:String,
        public empId:String,
        public designation:String,
        public techSkill:String,
        public analysisSkill:String,
        public codeQuality:String,
        public attitude:String,
        public adaptive:String,
        public responsibility:String,
        public delivery:String,
        public comment:String,

      )
      {}
}

export class OTPLogin
{
  constructor(
    public username:String,
    public password:String,
  ){

  }
}

export class OTPValidation
{
  constructor(
    public otp:String,
  ){}
}




@Injectable({
  providedIn: 'root'
})
export class HttpClientService {

  constructor(private httpClient:HttpClient) { }

  createEmployee(reg) {
    console.log("inside reg");
    console.log(reg);
    return this.httpClient.post<any>('http://localhost:8080/emp1/reg',reg);
  }

  createOTPLogin(reg) {
    console.log("inside reg");
    console.log(reg);
    return this.httpClient.post<any>('http://localhost:8080/login/reg',reg);
  }

  

  getEmployees()
  {
    console.log("test call");
    return this.httpClient.get<CreateEmployee[]>('http://localhost:8080/emp1/employees');
  }

  

  approveEmployees(emp1)
  {
    console.log("test call");
    console.log(emp1)
    return this.httpClient.post<any[]>('http://localhost:8080/emp1/upadteuser',emp1);
  }

//sending details to springboot
approveRating(emp1)
{
  console.log("test call");
  console.log(emp1)
  return this.httpClient.post<any[]>('http://localhost:8080/rating/upadteuser',emp1);
}

  public deleteEmployee(employee) {
    console.log(" !! Inside Delete Employee !!")
    console.log(employee.empId)
    return this.httpClient.post<any>("http://localhost:8080/emp1/id",employee.empId);
  }

  public deleteRating(employee) {
    console.log(" !! Inside Delete Employee !!")
    console.log(employee.empId)
    return this.httpClient.post<any>("http://localhost:8080/rating/id",employee.empId);
  }

  createRating(reg) {
    console.log("inside reg");
    console.log(reg);
    return this.httpClient.post<any>('http://localhost:8080/rating/reg',reg);
  }

  getRating()
  {
    console.log("test call");
    return this.httpClient.get<Rating[]>('http://localhost:8080/rating/employees');
  }

  getRating1()
  {
    console.log("test call");
    return this.httpClient.get<Rating[]>('http://localhost:8080/rating/employees1');
  }
  
}
