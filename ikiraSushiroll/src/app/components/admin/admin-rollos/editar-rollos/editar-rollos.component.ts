import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-editar-rollos',
  templateUrl: './editar-rollos.component.html',
  styleUrls: ['./editar-rollos.component.css']
})
export class EditarRollosComponent implements OnInit {
  EditarE:any={
    id:"",
    nombre_rollos:"",
    ingredientes_rollos:"",
    precio_rollos:"",
    imagen_rollos:"",
  }
  constructor(private rou:Router, private rouvar:ActivatedRoute,  private http: HttpClient){ }

  ngOnInit(): void {
    //visualizar lo que tiene los parametros y colocar el id
    this.EditarE.id=this.rouvar.snapshot.params["x"];

    this.http.get("http://localhost:8080/api/rollos/consultarIndividual/"+this.EditarE.id,{responseType:"json"})
    .subscribe((Res:any)=>{
      console.log(Res);
      this.EditarE.nombre_rollos= Res.nombre_rollos;
      this.EditarE.ingredientes_rollos=Res.ingredientes_rollos;
      this.EditarE.precio_rollos=Res.precio_rollos;
      this.EditarE.imagen_rollos=Res.imagen_rollos

    });
  }
   //Funcion actualizar del botón
  Actualizar(){

    //conexión con el backend- función para actualizar
    this.http.put("http://localhost:8080/api/rollos/actualizar/" +this.EditarE.id,this.EditarE)
    .subscribe((Res:any)=>{
    console.log(Res);
    alert("Actualizado satisfactoriamente");
    this.rou.navigate(["/admin/rollos"]);
  });
  }
  cancelar():void{
    this.rou.navigate(["/admin/rollos"]);
  }

}
