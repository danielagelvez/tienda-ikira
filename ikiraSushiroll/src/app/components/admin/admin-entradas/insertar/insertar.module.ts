import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

//importar desde angular http client las librerias
import { HttpClientModule } from '@angular/common/http';

import { InsertarRoutingModule } from './insertar-routing.module';
import { InsertarComponent } from './insertar.component';
//importar ng forma
import { FormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    InsertarComponent
  ],
  imports: [
    CommonModule,
    InsertarRoutingModule,
    //importar una directiva de ng model para usar
    FormsModule,
    HttpClientModule
  ]
})
export class InsertarModule { }
