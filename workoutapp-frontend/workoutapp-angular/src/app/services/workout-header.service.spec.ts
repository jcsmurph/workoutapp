import { TestBed } from '@angular/core/testing';

import { WorkoutHeaderService } from './workout-header.service';

describe('WorkoutHeaderService', () => {
  let service: WorkoutHeaderService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(WorkoutHeaderService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
