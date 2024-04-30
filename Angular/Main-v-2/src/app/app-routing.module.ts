import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/visitor/home/home.component';
import { LoginComponent } from './components/visitor/login/login.component';
import { AboutComponent } from './components/visitor/about/about.component';
import { AdminComponent } from './components/main/admin/admin.component';
import { DashboardComponent } from './components/main/admin/dashboard/dashboard.component';
import { OurProjectsComponent } from './components/visitor/our-projects/our-projects.component';
import { RentComponent } from './components/visitor/rent/rent.component';

const routes: Routes = [
  {path:'',component:HomeComponent},
  {path:'login',component:LoginComponent},
  {path:'about',component:AboutComponent},
  {path:'project',component:OurProjectsComponent},
  {path:'rent',component:RentComponent},
  {path:'admin',component:AdminComponent,
    children:[
      {path:'',component:DashboardComponent}
    ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
