import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RollosComponent } from './rollos.component';

describe('RollosComponent', () => {
  let component: RollosComponent;
  let fixture: ComponentFixture<RollosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RollosComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RollosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
