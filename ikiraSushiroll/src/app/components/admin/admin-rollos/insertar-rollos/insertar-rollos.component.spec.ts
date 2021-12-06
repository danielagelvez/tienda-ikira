import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InsertarRollosComponent } from './insertar-rollos.component';

describe('InsertarRollosComponent', () => {
  let component: InsertarRollosComponent;
  let fixture: ComponentFixture<InsertarRollosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InsertarRollosComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(InsertarRollosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
