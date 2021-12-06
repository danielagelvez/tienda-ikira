import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
//importar desde angular http client las librerias
import { HttpClientModule } from '@angular/common/http';

import { InsertarRollosRoutingModule } from './insertar-rollos-routing.module';
import { InsertarRollosComponent } from './insertar-rollos.component';
//importar ng forma
import { FormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    InsertarRollosComponent
  ],
  imports: [
    CommonModule,
    InsertarRollosRoutingModule,
    //importar una directiva de ng model para usar
    FormsModule,
    HttpClientModule
  ]
})
export class InsertarRollosModule { }
