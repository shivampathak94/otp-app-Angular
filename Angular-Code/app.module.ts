import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';



import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';



import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginAdminComponent } from './login-admin/login-admin.component';
import { LoginEmpComponent } from './login-emp/login-emp.component';
import { HomeComponent } from './home/home.component';
import { AdminportalComponent } from './adminportal/adminportal.component';
import { RegisterComponent } from './register/register.component';
import { RatingsComponent } from './ratings/ratings.component';
import { EmplportalComponent } from './emplportal/emplportal.component';
import { ReviewComponent } from './review/review.component';
import { LogonComponent } from './logon/logon.component';
import { ContactComponent } from './contact/contact.component';
import { AboutComponent } from './about/about.component';
import { ApproveComponent } from './approve/approve.component';
import { RequestComponent } from './request/request.component';
import { NavbarComponent } from './navbar/navbar.component';
import { HomepageComponent } from './homepage/homepage.component';
import { AllratingsComponent } from './allratings/allratings.component';
import { ApproveratingsComponent } from './approveratings/approveratings.component';
import { RatingdetailsComponent } from './ratingdetails/ratingdetails.component';
import { HttpClientModule } from '@angular/common/http';
import { OtploginComponent } from './otplogin/otplogin.component';
import { OtpvalidationComponent } from './otpvalidation/otpvalidation.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginAdminComponent,
    LoginEmpComponent,
    HomeComponent,
    AdminportalComponent,
    RegisterComponent,
    RatingsComponent,
    EmplportalComponent,
    ReviewComponent,
    LogonComponent,
    ContactComponent,
    AboutComponent,
    ApproveComponent,
    RequestComponent,
    NavbarComponent,
    HomepageComponent,
    AllratingsComponent,
    ApproveratingsComponent,
    RatingdetailsComponent,
    OtploginComponent,
    OtpvalidationComponent,
    

  ],
  imports: [
    BrowserModule,
    AppRoutingModule, FormsModule,ReactiveFormsModule,HttpClientModule,

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
