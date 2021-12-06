import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminRollosComponent } from './admin-rollos.component';

describe('AdminRollosComponent', () => {
  let component: AdminRollosComponent;
  let fixture: ComponentFixture<AdminRollosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdminRollosComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AdminRollosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
