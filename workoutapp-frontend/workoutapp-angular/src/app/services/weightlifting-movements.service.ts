import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, map } from 'rxjs';
import { WeightliftingMovements } from '../common/weightlifting-movements';

@Injectable({
  providedIn: 'root'
})
export class WeightliftingMovementsService {
  private baseUrl = 'http://localhost:8080/api/workout-details';

  constructor(private httpClient: HttpClient) { }

  getWeightliftingMovements(): Observable<WeightliftingMovements[]> {

    return this.httpClient.get<GetResponse>(this.baseUrl).pipe(
      map(response => response._embedded.weightliftingMovements)
    );

  }
}

interface GetResponse {
  _embedded: {
    weightliftingMovements: WeightliftingMovements[];
  }
}
