import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { AdminEntradasRoutingModule } from './admin-entradas-routing.module';
import { AdminEntradasComponent } from './admin-entradas.component';
import { FormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    AdminEntradasComponent
  ],
  imports: [
    CommonModule,
    AdminEntradasRoutingModule,
    HttpClientModule,
    // agregar ng model
    FormsModule
  ]
})
export class AdminEntradasModule { }
