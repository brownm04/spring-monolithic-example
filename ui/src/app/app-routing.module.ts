import { Injectable, NgModule } from '@angular/core';
import { ActivatedRouteSnapshot, Resolve, RouterModule, RouterStateSnapshot, Routes } from '@angular/router';
import { Observable } from 'rxjs';
import { HomeComponent } from './components/home/home.component';
import { ManufacturerComponent } from './components/manufacturer/manufacturer.component';
import { ManufacturerService } from './services/manufacturer.service';

@Injectable({ providedIn: 'root' })
export class ManufacturerTitleResolver implements Resolve<string> {

  constructor(private manufacturerService: ManufacturerService) {}

  resolve(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): string | Observable<string> | Promise<string> {
    const manufacturer = route.params['manufacturer'];
    const name = this.manufacturerService.getName(manufacturer);

    if (name !== undefined)
      return name;
    else
      return 'Spring Monolithic Example';
  }
}

const routes: Routes = [
  {
    path: 'manufacturer/:manufacturer',
    title: ManufacturerTitleResolver,
    component: ManufacturerComponent
  },
  {
    path: '',
    title: 'Home',
    component: HomeComponent
  },
  {
    path: '**',
    title: 'Home',
    component: HomeComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
