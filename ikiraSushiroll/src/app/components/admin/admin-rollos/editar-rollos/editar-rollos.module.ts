import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { EditarRollosRoutingModule } from './editar-rollos-routing.module';
import { EditarRollosComponent } from './editar-rollos.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';


@NgModule({
  declarations: [
    EditarRollosComponent
  ],
  imports: [
    CommonModule,
    EditarRollosRoutingModule,
    FormsModule,
    HttpClientModule
  ]
})
export class EditarRollosModule { }
