# Actividad 2 - Lector de Noticias

## Descripción

Esta es una aplicación para Android que funciona como un lector de noticias simple. La aplicación consume la API de [NewsAPI](https://newsapi.org) para obtener y mostrar los titulares de noticias más importantes de Estados Unidos.

### Características Principales
- Muestra noticias en una lista con imagen, título y descripción.
- Permite al usuario hacer clic en un botón para leer el artículo completo en el navegador web.
- Incluye la funcionalidad "deslizar para refrescar" para volver a cargar los titulares.
- Maneja estados de carga, éxito y error para una mejor experiencia de usuario.

## Integrantes

| Nombre Completo                  | Carnet   |
|----------------------------------|----------|
| Josué Eduardo García Estrada     | GE240098 |
| Jeremy Edenilson Flores Portillo | FP240479 |
| Edgar Josué Gómez Meléndez       | GM240279 |
| Oscar Daniel Soto Jovel          | SJ241841 |

## Tecnologías Utilizadas

- **Lenguaje:** Kotlin
- **Arquitectura:** MVVM (Model-View-ViewModel)
- **Componentes de Android Jetpack:**
    - ViewModel: Para gestionar la lógica de la UI y el estado.
    - LiveData: Para observar cambios en los datos de forma reactiva.
- **UI:**
    - RecyclerView: Para mostrar la lista de noticias de forma eficiente.
    - Material Components: Para los elementos de la interfaz como `CardView` y botones.
    - SwipeRefreshLayout: Para la funcionalidad de "deslizar para refrescar".
- **Networking:**
    - Retrofit: Para realizar las peticiones HTTP a la API.
    - Moshi: Para parsear la respuesta JSON a objetos de Kotlin.
- **Carga de Imágenes:**
    - Glide: Para descargar y mostrar las imágenes de las noticias de forma asíncrona.

## Cómo Ejecutar el Proyecto

Sigue estos pasos para clonar, configurar y ejecutar el proyecto en tu máquina local.

### 1. Obtener la API Key de NewsAPI

Para que la aplicación pueda obtener las noticias, necesitas una clave (API Key) de NewsAPI.

1.  Ir a [newsapi.org](https://newsapi.org).
2.  Hacer clic en **"Get API Key"** y se debe registrar para obtener una cuenta gratuita.
3.  Una vez registrado, se proporcionará una API Key. Se copia.

### 2. Configurar la API Key en el Proyecto

La API Key no debe ser almacenada directamente en el código fuente por seguridad. En su lugar, se debe colocar en el archivo `local.properties`.

1.  En la raíz de tu proyecto de Android Studio, busca o crea un archivo llamado `local.properties`.
2.  Abre el archivo y añade la siguiente línea, reemplazando `"TU_API_KEY"` con la clave que obtuviste en el paso anterior:

    ```properties
    API_KEY="TU_API_KEY"
    ```
3.  Android Studio se encargará de que esta clave sea accesible en el código a través de `BuildConfig.API_KEY`. El archivo `local.properties` ya está incluido en el `.gitignore` para evitar que se suba al repositorio.

### 3. Instalación y Ejecución

1.  **Clona el repositorio** en tu máquina local usando Git:
    ```bash
    git clone <"https://github.com/JosueGarcia-UDB/actividad-2-dsm">
    ```
2.  **Abre el proyecto** con Android Studio.
3.  **Espera a que Gradle se sincronice**. Android Studio descargará automáticamente todas las dependencias necesarias para el proyecto. Este proceso puede tardar unos minutos.
4.  **Ejecuta la aplicación**. Una vez que la sincronización de Gradle haya finalizado, puedes ejecutar la aplicación:
    - Selecciona un emulador de Android o conecta un dispositivo físico.
    - Haz clic en el botón **Run 'app'** (el icono de play verde) en la barra de herramientas superior.
