import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { InsertarComponent } from './insertar.component';

const routes: Routes = [{ path: '', component: InsertarComponent }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class InsertarRoutingModule { }
