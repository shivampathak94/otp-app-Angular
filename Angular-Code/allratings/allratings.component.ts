import { Component, OnInit } from '@angular/core';
import { HttpClientService } from '../service/httpclient.service';


@Component({
  selector: 'app-allratings',
  templateUrl: './allratings.component.html',
  styleUrls: ['./allratings.component.css']
})
export class AllratingsComponent implements OnInit {

  employees:string[];
  constructor(private httpClientService:HttpClientService) { }

  ngOnInit() {
     console.log("ON INIT")
     console.log(this.employees)
    this.httpClientService.getRating().subscribe(
      response =>this.handleSuccessfulResponse(response),
     );
     console.log(this.employees)
  }
  handleSuccessfulResponse(response)
{
    this.employees=response;
}

}
