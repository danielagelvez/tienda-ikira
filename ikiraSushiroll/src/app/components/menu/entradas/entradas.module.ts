import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';

import { EntradasRoutingModule } from './entradas-routing.module';
import { EntradasComponent } from './entradas.component';
import { FormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    EntradasComponent
  ],
  imports: [
    CommonModule,
    EntradasRoutingModule,
    HttpClientModule,
    // agregar ng model
    FormsModule
  ]
})
export class EntradasModule { }
