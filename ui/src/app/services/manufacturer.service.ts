import { Injectable } from '@angular/core';

const manufacturers: Record<string, string> = {
  'bmw': 'BMW',
  'mb': 'Mercedez-Benz',
  'porsche': 'Porsche'
};

@Injectable({
  providedIn: 'root'
})
export class ManufacturerService {

  constructor() { }

  getName(shortName: string): string | undefined {
    if (shortName == undefined || !(shortName in manufacturers))
      return undefined;
    else
      return manufacturers[shortName];
  }
}
