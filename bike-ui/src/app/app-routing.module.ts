import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {AdminComponent} from './components/admin/admin.component';
import {HomeComponent} from './components/home/home.component';
import {ViewRegistrationComponent} from './components/view-registration/view-registration.component';

const routes: Routes = [
  {
    path: 'admin',
    component: AdminComponent
  },
  {
    path: '',
    component: HomeComponent
  },
    {
      path: 'admin/view/:id',
      component: ViewRegistrationComponent
    }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
