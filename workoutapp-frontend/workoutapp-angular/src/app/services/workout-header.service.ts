import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, map } from 'rxjs';
import { WorkoutHeader } from '../common/workout-header';

@Injectable({
  providedIn: 'root'
})
export class WorkoutHeaderService {

  private baseUrl = 'http://localhost:8080/api/workout-header';


  constructor(private httpClient: HttpClient) { }

  getWorkoutHeader(): Observable<WorkoutHeader[]> {

    return this.httpClient.get<GetResponse>(this.baseUrl).pipe(
      map(response => response._embedded.workoutHeader)
    );

  }
}

interface GetResponse {
  _embedded: {
    workoutHeader: WorkoutHeader[];
  }
}
