"use strict";(self.webpackChunkikiraSushiroll=self.webpackChunkikiraSushiroll||[]).push([[88],{7088:(I,u,t)=>{t.r(u),t.d(u,{InsertarRollosModule:()=>h});var p=t(6019),g=t(4522),d=t(1509),e=t(3556),l=t(7537);const m=[{path:"",component:(()=>{class o{constructor(n,r){this.rou=n,this.http=r,this.api_URI="http://ikira.jelastic.saveincloud.net/api/",this.InsertarE={nombre_entrada:"",ingredientes_entrada:"",precio_entrada:"",imagen_entrada:""}}ngOnInit(){}guardar(){this.http.post(this.api_URI+"rollos/insertar",this.InsertarE).subscribe(n=>{console.log(n),alert("Agregado correctamente"),this.rou.navigate(["/admin/rollos"])})}}return o.\u0275fac=function(n){return new(n||o)(e.Y36(d.F0),e.Y36(g.eN))},o.\u0275cmp=e.Xpm({type:o,selectors:[["app-insertar-rollos"]],decls:19,vars:4,consts:[["ngNativeValidate","",3,"submit"],["required","","name","nombre_rollos","type","text","placeholder","Nombre de la entrada",1,"form-control",3,"ngModel","ngModelChange"],["required","","name","ingredientes_rollos","type","text","placeholder","ingredientes de la entrada",1,"form-control",3,"ngModel","ngModelChange"],["required","","name","precio_rollos","type","text","placeholder","Precio de la entrada",1,"form-control",3,"ngModel","ngModelChange"],["required","","name","imagen_rollos","type","text","placeholder","imagen de la entrada",1,"form-control",3,"ngModel","ngModelChange"],["type","submit",1,"btn","btn-success"]],template:function(n,r){1&n&&(e.TgZ(0,"form",0),e.NdJ("submit",function(){return r.guardar()}),e._UZ(1,"br"),e.TgZ(2,"h1"),e._uU(3,"Nuevo rollo"),e.qZA(),e.TgZ(4,"p"),e._uU(5,"Nombre rollo:"),e.qZA(),e.TgZ(6,"input",1),e.NdJ("ngModelChange",function(s){return r.InsertarE.nombre_rollos=s}),e.qZA(),e.TgZ(7,"p"),e._uU(8,"Ingredientes"),e.qZA(),e.TgZ(9,"input",2),e.NdJ("ngModelChange",function(s){return r.InsertarE.ingredientes_rollos=s}),e.qZA(),e.TgZ(10,"p"),e._uU(11,"Precio"),e.qZA(),e.TgZ(12,"input",3),e.NdJ("ngModelChange",function(s){return r.InsertarE.precio_rollos=s}),e.qZA(),e.TgZ(13,"p"),e._uU(14,"Imagen"),e.qZA(),e.TgZ(15,"input",4),e.NdJ("ngModelChange",function(s){return r.InsertarE.imagen_rollos=s}),e.qZA(),e._UZ(16,"hr"),e.TgZ(17,"button",5),e._uU(18,"Guardar"),e.qZA(),e.qZA()),2&n&&(e.xp6(6),e.Q6J("ngModel",r.InsertarE.nombre_rollos),e.xp6(3),e.Q6J("ngModel",r.InsertarE.ingredientes_rollos),e.xp6(3),e.Q6J("ngModel",r.InsertarE.precio_rollos),e.xp6(3),e.Q6J("ngModel",r.InsertarE.imagen_rollos))},directives:[l.JL,l.F,l.Fj,l.Q7,l.JJ,l.On],styles:[""]}),o})()}];let c=(()=>{class o{}return o.\u0275fac=function(n){return new(n||o)},o.\u0275mod=e.oAB({type:o}),o.\u0275inj=e.cJS({imports:[[d.Bz.forChild(m)],d.Bz]}),o})(),h=(()=>{class o{}return o.\u0275fac=function(n){return new(n||o)},o.\u0275mod=e.oAB({type:o}),o.\u0275inj=e.cJS({imports:[[p.ez,c,l.u5,g.JF]]}),o})()}}]);