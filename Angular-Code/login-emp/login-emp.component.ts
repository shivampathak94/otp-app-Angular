import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login-emp',
  templateUrl: './login-emp.component.html',
  styleUrls: ['./login-emp.component.css']
})
export class LoginEmpComponent implements OnInit {

  username : string;
  password : string;

  constructor() { }

  ngOnInit() {
  }

  LoginUser(){
    if(this.username == "Admin" && this.password == "123"){
      console.log("Welcome to Admin portal");
    }
  }

  onSubmit(value: any){
    console.log(value);
  }

}
