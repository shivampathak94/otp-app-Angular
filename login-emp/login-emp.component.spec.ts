import { TestBed, async } from '@angular/core/testing';
import { RouterTestingModule } from '@angular/router/testing';

import { LoginEmpComponent } from './login-emp.component';
import { By } from '@angular/platform-browser';

describe('LoginEmpComponent', () => {
    beforeEach(async(() => {
      TestBed.configureTestingModule({
        imports: [
          RouterTestingModule
        ],
        declarations: [
            LoginEmpComponent
        ],
      }).compileComponents();
    }));



  it('should be created', () => {
    const service: LoginEmpComponent = TestBed.get(LoginEmpComponent);
    expect(service).toBeTruthy();
  });

  it('should display the text as "Employee Login"', () => {
    const fixture = TestBed.createComponent(LoginEmpComponent);
    const app = fixture.debugElement.componentInstance;
    expect(app.text).toEqual("Employee Login");
  });


  it('should show the input text field as loginemp', () => {
    const fixture = TestBed.createComponent(LoginEmpComponent);
    const app = fixture.debugElement.componentInstance;
    const loginempElement=fixture.debugElement.query(By.css('input[id=loginemp]'));
    expect(loginempElement.nativeElement.innerHTML).toBe('');
  });

  it('should show the input text field as password', () => {
    const fixture = TestBed.createComponent(LoginEmpComponent);
    const app = fixture.debugElement.componentInstance;
    const passwordElement=fixture.debugElement.query(By.css('input[id=password]'));
    expect(passwordElement.nativeElement.innerHTML).toBe('');
  });


  it('should show the input text field as button', () => {
    const fixture = TestBed.createComponent(LoginEmpComponent);
    const app = fixture.debugElement.componentInstance;
    const submitElement=fixture.debugElement.query(By.css('input[id=button]'));
    expect(submitElement.nativeElement.innerHTML).toBeFalsy('');
  });




});
