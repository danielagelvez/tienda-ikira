import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

declare const  $:any;
declare const Swal:any;

@Component({
  selector: 'app-admin-entradas',
  templateUrl: './admin-entradas.component.html',
  styleUrls: ['./admin-entradas.component.css']
})
export class AdminEntradasComponent implements OnInit {
  infoConsulta : any;
  //enlazar la router
  constructor(private rou:Router, private http: HttpClient) { }

  ngOnInit(): void {
    this.listar();
    console.log("Ejecutando");
       //agregar busqueda en la tabla
      $('#tabla_entradas').DataTable();
  }

  //conexión con el backend- función para buscar
  listar():void{
    this.http.get("http://localhost:8080/api/entradas/consultar",{responseType:"json"})
    .subscribe((Res:any)=>{
      console.log(Res);
      this.infoConsulta = Res;
    });
  }

  //función para eliminar
  eliminar(x:any):void{
      Swal.fire({
        title: '¿Esta seguro que desea eliminar la entrada?',
        icon:'warning',
        showCancelButton: true,
        confirmButtonText: 'Eliminar',
      }).then((result:any) => {
        /* Read more about isConfirmed, isDenied below */
        if (result.isConfirmed) {
          Swal.fire('Eliminado', '', 'success');
          this.http.delete("http://localhost:8080/api/entradas/eliminar/"+x)
          .subscribe((Res:any)=>{
          console.log(Res);
          this.listar();
        });
      }
    })
  }

  //Función para editar
  EditarEntradas(x:any):void{
  //alert(x);
  this.rou.navigate(["/admin/editar",x]);
  }

  //Función para insertar
  InsertarEntradas(x:any):void{
    this.rou.navigate(["/admin/insertar",x]);
  }

}
