import { bootstrapApplication } from '@angular/platform-browser';
//import { appConfig } from './app/app.config';
import { AppComponent } from './app/app.component';
import { provideAnimations } from '@angular/platform-browser/animations';
import { provideHttpClient } from '@angular/common/http';

bootstrapApplication(AppComponent,{
  providers: [
    provideAnimations(), // Habilita animaciones (requerido por Angular Material)
    provideHttpClient(), // Habilita HttpClient (opcional, pero útil)
  ],
})
  .catch((err) => console.error(err));
