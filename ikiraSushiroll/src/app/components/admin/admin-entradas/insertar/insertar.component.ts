import { Component, OnInit } from '@angular/core';
//importar desde angular http client las librerias
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-insertar',
  templateUrl: './insertar.component.html',
  styleUrls: ['./insertar.component.css']
})
export class InsertarComponent implements OnInit {

  //estructura de json para almacenar
  InsertarE:any={
    nombre_entrada:"",
    ingredientes_entrada:"",
    precio_entrada:"",
    imagen_entrada:"",
  }

  //en el constructor agrego httpClient
  constructor(private rou:Router,private http: HttpClient) { }

  ngOnInit(): void {
  }

  //función para guardar los datos
  guardar():void{

    //conexión con el backend- función para insertar o guardar datos
    this.http.post("http://localhost:8080/api/entradas/insertar", this.InsertarE)
    .subscribe((Res:any)=>{
      console.log(Res);
      alert("Agregado correctamente");
      this.rou.navigate(["/admin/entradas"]);
    });

  }

}
