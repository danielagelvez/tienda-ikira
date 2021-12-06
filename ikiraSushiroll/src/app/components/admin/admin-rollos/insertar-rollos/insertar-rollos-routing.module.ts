import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { InsertarRollosComponent } from './insertar-rollos.component';

const routes: Routes = [{ path: '', component: InsertarRollosComponent }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class InsertarRollosRoutingModule { }
