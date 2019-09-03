import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginEmpComponent } from './login-emp/login-emp.component';
import { LoginAdminComponent } from './login-admin/login-admin.component';
import { AdminportalComponent } from './adminportal/adminportal.component';
import { HomeComponent } from './home/home.component';
import { EmplportalComponent } from './emplportal/emplportal.component';
import { RegisterComponent } from './register/register.component';
import { ContactComponent } from './contact/contact.component';
import { AboutComponent } from './about/about.component';
import { RatingsComponent } from './ratings/ratings.component';
import { ApproveComponent } from './approve/approve.component';
import { ReviewComponent } from './review/review.component';
import { NavbarComponent } from './navbar/navbar.component';
import { HomepageComponent } from './homepage/homepage.component';
import { AllratingsComponent } from './allratings/allratings.component';
import { ApproveratingsComponent } from './approveratings/approveratings.component';
import { RatingdetailsComponent } from './ratingdetails/ratingdetails.component';
import { OtploginComponent } from './otplogin/otplogin.component';
import { OtpvalidationComponent } from './otpvalidation/otpvalidation.component';



const routes: Routes = [
  { path: '', redirectTo: 'home', pathMatch: 'full' },
  { path: 'loginemp', component: LoginEmpComponent},
  { path: 'loginadmin', component: LoginAdminComponent},
  { path: 'adminportal', component: AdminportalComponent},
  { path: 'home', component: HomeComponent},
  { path: 'emplportal', component: EmplportalComponent},
  { path: 'register', component: RegisterComponent},
  { path: 'contact', component: ContactComponent},
  { path: 'about', component: AboutComponent},
  { path: 'approve', component: ApproveComponent},
  { path: 'ratings', component: RatingsComponent},
  { path: 'review', component: ReviewComponent},
  { path: 'navbar', component: NavbarComponent},
  { path: 'homepage', component: HomepageComponent},
  { path: 'allratings', component: AllratingsComponent},
  { path: 'approveratings', component: ApproveratingsComponent},
  { path: 'ratingdetails', component: RatingdetailsComponent},
  { path: 'otpvalidation', component:OtpvalidationComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

