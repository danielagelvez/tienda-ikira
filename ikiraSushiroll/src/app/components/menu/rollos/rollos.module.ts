import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { HttpClientModule } from '@angular/common/http';

import { RollosRoutingModule } from './rollos-routing.module';
import { RollosComponent } from './rollos.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    RollosComponent
  ],
  imports: [
    CommonModule,
    RollosRoutingModule,
    HttpClientModule,
    // agregar ng model
    FormsModule
  ]
})
export class RollosModule { }
