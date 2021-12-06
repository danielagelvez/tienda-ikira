import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditarRollosComponent } from './editar-rollos.component';

describe('EditarRollosComponent', () => {
  let component: EditarRollosComponent;
  let fixture: ComponentFixture<EditarRollosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EditarRollosComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EditarRollosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
