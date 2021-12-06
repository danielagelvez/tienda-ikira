import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { BebidasRoutingModule } from './bebidas-routing.module';
import { BebidasComponent } from './bebidas.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    BebidasComponent],
  imports: [
    CommonModule,
    BebidasRoutingModule,
    HttpClientModule,
    // agregar ng model
    FormsModule
  ]
})
export class BebidasModule { }
