import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-editar',
  templateUrl: './editar.component.html',
  styleUrls: ['./editar.component.css']
})
export class EditarComponent implements OnInit {

  EditarE:any={
    id:"",
    nombre_entrada:"",
    ingredientes_entrada:"",
    precio_entrada:"",
    imagen_entrada:"",
  }
  constructor(private rou:Router, private rouvar:ActivatedRoute,  private http: HttpClient) { }

  ngOnInit(): void {
    //visualizar lo que tiene los parametros y colocar el id
    this.EditarE.id=this.rouvar.snapshot.params["x"];

    this.http.get("http://localhost:8080/api/entradas/consultarIndividual/"+this.EditarE.id,{responseType:"json"})
    .subscribe((Res:any)=>{
      console.log(Res);
      this.EditarE.nombre_entrada= Res.nombre_entrada;
      this.EditarE.ingredientes_entrada=Res.ingredientes_entrada;
      this.EditarE.precio_entrada=Res.precio_entrada;
      this.EditarE.imagen_entrada=Res.imagen_entrada

    });
  }

  //Funcion actualizar del botón
  Actualizar(){

     //conexión con el backend- función para actualizar
    this.http.put("http://localhost:8080/api/entradas/actualizar/" +this.EditarE.id,this.EditarE)
    .subscribe((Res:any)=>{
    console.log(Res);
    alert("Actualizado satisfactoriamente");
    this.rou.navigate(["/admin/entradas"]);
  });
  }
  cancelar():void{
    this.rou.navigate(["/admin/entradas"]);
  }

}
