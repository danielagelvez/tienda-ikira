import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EditarRollosComponent } from './editar-rollos.component';

const routes: Routes = [{ path: '', component: EditarRollosComponent }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class EditarRollosRoutingModule { }
