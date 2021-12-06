import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminRollosComponent } from './admin-rollos.component';

const routes: Routes = [{ path: '', component: AdminRollosComponent }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class AdminRollosRoutingModule { }
