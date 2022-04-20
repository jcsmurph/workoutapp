import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { WorkoutDetailsComponent } from './component/workout-details/workout-details.component';
import { HttpClientModule } from '@angular/common/http'
import { WorkoutHeaderService } from './services/workout-header.service';
import { WorkoutDetailsService } from './services/workout-details.service';

@NgModule({
  declarations: [
    AppComponent,
    WorkoutDetailsComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [WorkoutHeaderService, WorkoutDetailsService],
  bootstrap: [AppComponent]
})
export class AppModule { }
