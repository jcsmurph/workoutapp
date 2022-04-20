import { TestBed } from '@angular/core/testing';

import { WorkoutDetailsService } from './workout-details.service';

describe('WorkoutDetailsService', () => {
  let service: WorkoutDetailsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(WorkoutDetailsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
