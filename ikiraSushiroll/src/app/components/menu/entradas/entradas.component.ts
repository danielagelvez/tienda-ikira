import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';


@Component({
  selector: 'app-entradas',
  templateUrl: './entradas.component.html',
  styleUrls: ['./entradas.component.css']
})
export class EntradasComponent implements OnInit {
  api_URI="http://ikira.jelastic.saveincloud.net/api/";
  entradas:any;
  //variable que almacena la informacion backend
  infoConsulta:any;

  //enlazar la router
  constructor(private rou:Router, private http: HttpClient) { }

  ngOnInit(): void {
    this.listar();

  }
   //conexión con el backend- función para buscar
  listar():void{
    this.http.get(this.api_URI+"entradas/consultar",{responseType:"json"})
    .subscribe((Res:any)=>{
      console.log(Res);
      this.entradas=Res ;
    });
  }




}
