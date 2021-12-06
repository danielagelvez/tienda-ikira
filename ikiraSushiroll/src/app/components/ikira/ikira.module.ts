import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

//importar desde angular http client las librerias
import { HttpClientModule } from '@angular/common/http';

import { IkiraRoutingModule } from './ikira-routing.module';
import { IkiraComponent } from './ikira.component';

//importar ng forma
import { FormsModule } from '@angular/forms';
@NgModule({
  declarations: [
    IkiraComponent
  ],
  imports: [
    CommonModule,
    IkiraRoutingModule,
    //importar una directiva de ng model para usar
    FormsModule,
    HttpClientModule
  ]
})
export class IkiraModule { }
