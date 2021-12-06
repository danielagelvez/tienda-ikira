import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

declare const  $:any;
declare const Swal:any;
@Component({
  selector: 'app-admin-rollos',
  templateUrl: './admin-rollos.component.html',
  styleUrls: ['./admin-rollos.component.css']
})
export class AdminRollosComponent implements OnInit {
  api_URI="http://ikira.jelastic.saveincloud.net/api/";
  infoConsulta : any;
  //enlazar la router
  constructor(private rou:Router, private http: HttpClient){ }

  ngOnInit(): void {
    this.listar();
    console.log("Ejecutando");
       //agregar busqueda en la tabla
      $('#tabla_rollos').DataTable();
  }

  //conexión con el backend- función para buscar
  listar():void{
    this.http.get(this.api_URI+"rollos/consultar",{responseType:"json"})
    .subscribe((Res:any)=>{
      console.log(Res);
      this.infoConsulta = Res;
    });
  }

  //función para eliminar
  eliminar(x:any):void{
      Swal.fire({
        title: '¿Esta seguro que desea eliminar el rollo?',
        icon:'warning',
        showCancelButton: true,
        confirmButtonText: 'Eliminar',
      }).then((result:any) => {
        /* Read more about isConfirmed, isDenied below */
        if (result.isConfirmed) {
          Swal.fire('Eliminado', '', 'success');
          this.http.delete(this.api_URI+"rollos/eliminar/"+x)
          .subscribe((Res:any)=>{
          console.log(Res);
          this.listar();
        });
      }
    })
  }

  //Función para editar
  EditarRollos(x:any):void{
  //alert(x);
  this.rou.navigate(["/admin/editarRollos", x]);
  }

  //Función para insertar
  InsertarRollos(x:any):void{
    this.rou.navigate(["/admin/insertarRollos", x]);
  }

}
