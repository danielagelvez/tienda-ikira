import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

declare const Swal:any;
@Component({
  selector: 'app-franquicias',
  templateUrl: './franquicias.component.html',
  styleUrls: ['./franquicias.component.css']
})
export class FranquiciasComponent implements OnInit {
  api_URI="http://ikira.jelastic.saveincloud.net/api/";

   //estructura de json para almacenar
  franquicia:any={
    nombre_Ufranquicia:"",
    correo_Ufranquicia:"",
    numero_contacto:"",
    horario:"",
    medio:"",
  }
  //en el constructor agrego httpClient
  constructor(private http: HttpClient)  { }

  ngOnInit(): void {
  }

  //función para guardar los datos
  guardar():void{

    //conexión con el backend- función para insertar o guardar datos
    this.http.post(this.api_URI+"franquicias/insertar", this.franquicia)
    .subscribe((Res:any)=>{
      console.log(Res);

      Swal.fire({
        icon: 'success',
        title: 'Gracias por preferirnos',
        showConfirmButton: false,
        timer: 3500
      })

    });
  }

}


