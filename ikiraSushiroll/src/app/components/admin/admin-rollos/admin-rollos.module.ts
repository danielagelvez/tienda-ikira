import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { AdminRollosRoutingModule } from './admin-rollos-routing.module';
import { AdminRollosComponent } from './admin-rollos.component';
import { FormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    AdminRollosComponent
  ],
  imports: [
    CommonModule,
    AdminRollosRoutingModule,
    HttpClientModule,
    // agregar ng model
    FormsModule
  ]
})
export class AdminRollosModule { }
