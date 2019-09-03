import { Component, OnInit } from '@angular/core';
import { OTPLogin, HttpClientService } from '../service/httpclient.service';

import { FormGroup, FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-otplogin',
  templateUrl: './otplogin.component.html',
  styleUrls: ['./otplogin.component.css']
})
export class OtploginComponent implements OnInit {

  user: OTPLogin = new OTPLogin("","");
  submitted = false;
  response:any;

  constructor(private httpClientService: HttpClientService) { }

  ngOnInit() {
  }


  createOTPLogin(): void {

    

    
  
    
     console.log("inside create employee");
     console.log("email :")
    
     console.log(this.user);
     console.log("after this.user")
    this.httpClientService.createOTPLogin(this.user)
         .subscribe( (data) => {
           this.response=data;
           console.log("after creatEmployee call")
           alert("You have registered successfully.");
        
         });
     }
}
