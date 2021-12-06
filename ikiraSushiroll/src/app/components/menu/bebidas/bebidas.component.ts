import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';


@Component({
  selector: 'app-bebidas',
  templateUrl: './bebidas.component.html',
  styleUrls: ['./bebidas.component.css']
})
export class BebidasComponent implements OnInit {
  api_URI="http://ikira.jelastic.saveincloud.net/api/";
  //variable que almacena la informacion backend
  bebidas:any;
  //enlazar la router
  constructor(private rou:Router, private http: HttpClient)  { }

  ngOnInit(): void {
    this.listar();
  }

  //conexión con el backend- función para buscar
  listar():void{
    this.http.get(this.api_URI+"bebidas/consultar",{responseType:"json"})
    .subscribe((Res:any)=>{
      console.log(Res);
      this.bebidas=Res ;
    });
  }

}
