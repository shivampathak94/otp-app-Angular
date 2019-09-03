import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { HttpClientService, CreateEmployee } from '../service/httpclient.service';




@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})


export class RegisterComponent implements OnInit {

  registerForm: FormGroup;
  response:any;
    submitted = false;
   
    user: CreateEmployee = new CreateEmployee("","","","","","","","","",false);

    constructor(private formBuilder: FormBuilder,private httpClientService: HttpClientService) { }
  

    ngOnInit() {
        this.registerForm = this.formBuilder.group({
            firstName: ['', Validators.required],
            lastName: ['', Validators.required],
            empId: ['', Validators.required],
            projectcode: ['', Validators.required],
            projectname: ['', Validators.required],
            projectmanager: ['', Validators.required],
            teamName: ['', Validators.required],
            email: ['', [Validators.required, Validators.email]],
            password: ['', [Validators.required, Validators.minLength(6)]],
            cpassword: ['', [Validators.required, Validators.minLength(6)]]
        });
    }

    // convenience getter for easy access to form fields
    get f() { return this.registerForm.controls; }

    onSubmit() {
       
    }
     createEmployee(): void {

        this.submitted = true;

        // stop here if form is invalid
        if (this.registerForm.invalid) {
            return;
        }

        
        console.log(this.registerForm)
        
         console.log("inside create employee");
         console.log("email :")
         console.log(this.user.email)
         console.log(this.user);
         console.log("after this.user")
        this.httpClientService.createEmployee(this.user)
             .subscribe( (data) => {
               this.response=data;
               console.log("after creatEmployee call")
               alert("You have registered successfully.");
            
             });
         }
}
