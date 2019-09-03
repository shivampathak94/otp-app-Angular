import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login-admin',
  templateUrl: './login-admin.component.html',
  styleUrls: ['./login-admin.component.css']
})
export class LoginAdminComponent implements OnInit {

  username : string;
  password : string;


  constructor() { }

  ngOnInit() {
  }

  onSubmit(value: any){
    console.log(value);
  }
}
