import { Component, OnInit } from '@angular/core';
//importar desde angular http client las librerias
import { HttpClient } from '@angular/common/http';

declare const Swal:any;

@Component({
  selector: 'app-contactanos',
  templateUrl: './contactanos.component.html',
  styleUrls: ['./contactanos.component.css']
})
export class ContactanosComponent implements OnInit {
  api_URI="http://ikira.jelastic.saveincloud.net/api/";

  //estructura de json para almacenar
  contacto:any={
    nombre_usuario:"",
    correo_usuario:"",
    sugerencia_usuario:"",
  }
  //en el constructor agrego httpClient
  constructor(private http: HttpClient) { }

  ngOnInit(): void {
  }
  //función para guardar los datos
  guardar():void{

    //conexión con el backend- función para insertar o guardar datos
    this.http.post(this.api_URI+"contactanos/insertar", this.contacto)
    .subscribe((Res:any)=>{
      console.log(Res);

      Swal.fire({
        icon: 'success',
        title: 'Gracias por contáctarnos',
        showConfirmButton: false,
        timer: 2500
      })

    });

  }
}
