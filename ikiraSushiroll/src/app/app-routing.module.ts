import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { InicioComponent } from './components/inicio/inicio.component';
import { LoginComponent } from './components/login/login.component';
import { AdminComponent } from './components/admin/admin.component';

const routes: Routes = [
{path:"", redirectTo:"/login", pathMatch:"full"}, //redireccionar si no encuentra ningún pack

{path: "inicio", component:InicioComponent,
children:[
{ path: 'entradas', loadChildren: () => import('./components/menu/entradas/entradas.module').then(m => m.EntradasModule) },
{ path: 'rollos', loadChildren: () => import('./components/menu/rollos/rollos.module').then(m => m.RollosModule) },
{ path: 'bebidas', loadChildren: () => import('./components/menu/bebidas/bebidas.module').then(m => m.BebidasModule) },
{ path: 'contactanos', loadChildren: () => import('./components/formularios/contactanos/contactanos.module').then(m => m.ContactanosModule) },
{ path: 'franquicias', loadChildren: () => import('./components/formularios/franquicias/franquicias.module').then(m => m.FranquiciasModule) },
{ path: 'reservas', loadChildren: () => import('./components/formularios/reservas/reservas.module').then(m => m.ReservasModule) },
{ path: 'ikira', loadChildren: () => import('./components/ikira/ikira.module').then(m => m.IkiraModule) },
{ path: 'nosotros', loadChildren: () => import('./components/ikira/nosotros/nosotros.module').then(m => m.NosotrosModule) }
]},
{path: "login", component:LoginComponent,
children:[
  {path: 'adminEntradas', loadChildren: () => import('./components/admin/admin-entradas/admin-entradas.module').then(m => m.AdminEntradasModule) }

]},
{ path: 'admin', component:AdminComponent,
children:[
  {path: 'entradas', loadChildren: () => import('./components/admin/admin-entradas/admin-entradas.module').then(m => m.AdminEntradasModule) },
  {path: 'editar/:x', loadChildren: () => import('./components/admin/admin-entradas/editar/editar.module').then(m => m.EditarModule) },
  {path: 'insertar/:x', loadChildren: () => import('./components/admin/admin-entradas/insertar/insertar.module').then(m => m.InsertarModule) },
  {path: 'rollos', loadChildren: () => import('./components/admin/admin-rollos/admin-rollos.module').then(m => m.AdminRollosModule) },
  {path: 'editarRollos/:x', loadChildren: () => import('./components/admin/admin-rollos/editar-rollos/editar-rollos.module').then(m => m.EditarRollosModule) },
  {path: 'insertarRollos/:x', loadChildren: () => import('./components/admin/admin-rollos/insertar-rollos/insertar-rollos.module').then(m => m.InsertarRollosModule) },

]},



];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
