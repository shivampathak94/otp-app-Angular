import { TestBed, async } from '@angular/core/testing';
import { RouterTestingModule } from '@angular/router/testing';

import { LoginAdminComponent } from './login-admin.component';
import { By } from '@angular/platform-browser';

describe('LoginAdminComponent', () => {
    beforeEach(async(() => {
      TestBed.configureTestingModule({
        imports: [
          RouterTestingModule
        ],
        declarations: [
            LoginAdminComponent
        ],
      }).compileComponents();
    }));



  it('should be created', () => {
    const service: LoginAdminComponent = TestBed.get(LoginAdminComponent);
    expect(service).toBeTruthy();
  });

  it('should display the text as "Admin Login"', () => {
    const fixture = TestBed.createComponent(LoginAdminComponent);
    const app = fixture.debugElement.componentInstance;
    expect(app.text).toEqual("Employee Login");
  });


  it('should show the input text field as loginadmin', () => {
    const fixture = TestBed.createComponent(LoginAdminComponent);
    const app = fixture.debugElement.componentInstance;
    const loginadminElement=fixture.debugElement.query(By.css('input[id=loginadmin]'));
    expect(loginadminElement.nativeElement.innerHTML).toBe('');
  });

  it('should show the input text field as password', () => {
    const fixture = TestBed.createComponent(LoginAdminComponent);
    const app = fixture.debugElement.componentInstance;
    const passwordElement=fixture.debugElement.query(By.css('input[id=password]'));
    expect(passwordElement.nativeElement.innerHTML).toBe('');
  });


  it('should show the input text field as button', () => {
    const fixture = TestBed.createComponent(LoginAdminComponent);
    const app = fixture.debugElement.componentInstance;
    const submitElement=fixture.debugElement.query(By.css('input[id=button]'));
    expect(submitElement.nativeElement.innerHTML).toBeFalsy('');
  });




});
