import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

declare const Swal:any;
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  api_URI="http://ikira.jelastic.saveincloud.net/api/";

  loginI:any={
    usuario:"",
    clave_usuario:"",
  }
  constructor(private r:Router,private http: HttpClient) { }

  ngOnInit(): void {
  }
  iniciar():void{
    console.log("Cosita")
    console.log(this.loginI)
    //alert(this.loginI.usu+"  "+this.loginI.con);

    this.http.get(this.api_URI+"usuario/consultarVariosParametros/"+this.loginI.usuario+"/"+this.loginI.clave_usuario+"",{responseType:"json"})
    .subscribe((Res:any)=>{
      console.log(Res);

      if(Res.length===0){
        alert("No existe el registro");
      }

      for(var x of Res){
        if(x.id==="" || x.id===null){
          alert("No existe el registro");
        }
        else{
          //alert("Bienvenido "+x.nombre+" "+x.apellido);
          //this.r.navigate(["/inicio"]);

          Swal.fire({
            icon: 'success',
            title: 'Bienvenido '+x.nombre+" "+x.apellido,
            showConfirmButton: true,
          }).then((result:any) => {
            /* Read more about isConfirmed, isDenied below */
            if (result.isConfirmed) {
              this.r.navigate(["/admin"]);
          }
        })
        }
      }
    });

  }

}
