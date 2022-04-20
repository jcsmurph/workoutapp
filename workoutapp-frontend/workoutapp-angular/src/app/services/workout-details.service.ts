import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, map } from 'rxjs';
import { WorkoutDetails } from '../common/workout-details';

@Injectable({
  providedIn: 'root',
})
export class WorkoutDetailsService {
  private baseUrl = 'http://localhost:8080/api/workout-details';

  constructor(private httpClient: HttpClient) {}

  getWorkoutDetails(): Observable<WorkoutDetails[]> {
    return this.httpClient
      .get<GetResponse>(this.baseUrl)
      .pipe(map((response) => response._embedded.workoutDetails));
  }
}

interface GetResponse {
  _embedded: {
    workoutDetails: WorkoutDetails[];
  };
}
