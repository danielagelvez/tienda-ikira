import { ComponentFixture, TestBed } from '@angular/core/testing';

import { IkiraComponent } from './ikira.component';

describe('IkiraComponent', () => {
  let component: IkiraComponent;
  let fixture: ComponentFixture<IkiraComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ IkiraComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(IkiraComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
