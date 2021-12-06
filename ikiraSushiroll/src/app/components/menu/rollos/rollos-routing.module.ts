import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RollosComponent } from './rollos.component';

const routes: Routes = [{ path: '', component: RollosComponent }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class RollosRoutingModule { }
