import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-rollos',
  templateUrl: './rollos.component.html',
  styleUrls: ['./rollos.component.css']
})
export class RollosComponent implements OnInit {
  api_URI="http://ikira.jelastic.saveincloud.net/api/";
  //variable que almacena la informacion backend
  rollo:any;
  //enlazar la router
  constructor(private rou:Router, private http: HttpClient) { }

  ngOnInit(): void {
    this.listar();
  }
  //conexión con el backend- función para buscar
  listar():void{
    this.http.get(this.api_URI+"rollos/consultar",{responseType:"json"})
    .subscribe((Res:any)=>{
      console.log(Res);
      this.rollo=Res ;
    });
  }

}
