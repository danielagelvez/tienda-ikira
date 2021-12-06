import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

//importar desde angular http client las librerias
import { HttpClientModule } from '@angular/common/http';

import { FranquiciasRoutingModule } from './franquicias-routing.module';
import { FranquiciasComponent } from './franquicias.component';

//importar ng forma
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    FranquiciasComponent
  ],
  imports: [
    CommonModule,
    FranquiciasRoutingModule,
    //importar una directiva de ng model para usar
    FormsModule,
    HttpClientModule
  ]
})
export class FranquiciasModule { }
