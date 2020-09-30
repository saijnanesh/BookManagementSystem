import { TestBed } from '@angular/core/testing';

import { DatatransferbetweenthecomponentsService } from './datatransferbetweenthecomponents.service';

describe('DatatransferbetweenthecomponentsService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: DatatransferbetweenthecomponentsService = TestBed.get(DatatransferbetweenthecomponentsService);
    expect(service).toBeTruthy();
  });
});
