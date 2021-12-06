import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

//importar desde angular http client las librerias
import { HttpClientModule } from '@angular/common/http';

import { ContactanosRoutingModule } from './contactanos-routing.module';
import { ContactanosComponent } from './contactanos.component';
//importar ng forma
import { FormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    ContactanosComponent
  ],
  imports: [
    CommonModule,
    ContactanosRoutingModule,
    //importar una directiva de ng model para usar
    FormsModule,
    HttpClientModule
  ]
})
export class ContactanosModule { }
