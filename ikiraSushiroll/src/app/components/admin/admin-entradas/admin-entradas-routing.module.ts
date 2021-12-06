import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminEntradasComponent } from './admin-entradas.component';

const routes: Routes = [{ path: '', component: AdminEntradasComponent }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class AdminEntradasRoutingModule { }
