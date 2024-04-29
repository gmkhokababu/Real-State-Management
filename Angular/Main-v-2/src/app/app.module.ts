import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './components/visitor/home/home.component';
import { HeaderComponent } from './components/visitor/header/header.component';
import { FooterComponent } from './components/visitor/footer/footer.component';
import { AboutComponent } from './components/visitor/about/about.component';
import { LoginComponent } from './components/visitor/login/login.component';
import { LoginService } from './services/login.service';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AdminComponent } from './components/main/admin/admin.component';
import { NavComponent } from './components/main/nav/nav.component';
import { DashboardComponent } from './components/main/admin/dashboard/dashboard.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    HeaderComponent,
    FooterComponent,
    AboutComponent,
    LoginComponent,
    AdminComponent,
    NavComponent,
    DashboardComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [LoginService],
  bootstrap: [AppComponent]
})
export class AppModule { }
