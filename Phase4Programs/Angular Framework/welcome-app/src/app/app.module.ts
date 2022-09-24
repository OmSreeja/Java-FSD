import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { Child } from './child.component';
import { AppComponent } from './app.component';

@NgModule({
  declarations: [
    AppComponent,Child
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
