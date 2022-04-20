import { TestBed } from '@angular/core/testing';

import { WeightliftingMovementsService } from './weightlifting-movements.service';

describe('WeightliftingMovementsService', () => {
  let service: WeightliftingMovementsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(WeightliftingMovementsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
