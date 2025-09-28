# 📰 Actividad 2 - Lector de Noticias

Aplicación móvil desarrollada en **Kotlin** para dispositivos Android.  
Funciona como un lector de noticias sencillo que consume la API de [NewsAPI](https://newsapi.org) para mostrar los titulares más importantes de Estados Unidos.

El proyecto tiene como objetivo practicar el consumo de servicios REST, el uso de arquitectura **MVVM**, componentes de Android Jetpack y librerías modernas para UI y networking.

---

# 🧑‍💻 Integrantes

| Nombre de Integrante             | Carnet   |
| -------------------------------- | -------- |
| Josué Eduardo García Estrada     | GE240098 |
| Jeremy Edenilson Flores Portillo | FP240479 |
| Edgar Josué Gómez Meléndez       | GM240279 |
| Oscar Daniel Soto Jovel          | SJ241841 |

---

## 🚀 Tecnologías Utilizadas

La aplicación fue construida utilizando las siguientes tecnologías y herramientas:

### 📱 Android & Arquitectura

* **Kotlin**  
  Lenguaje principal de la aplicación.

* **MVVM (Model-View-ViewModel)**  
  Arquitectura utilizada para separar lógica de UI y mantener un flujo de datos limpio.

* **Android Jetpack**
    - **ViewModel**: Manejo de estado y lógica de la UI.
    - **LiveData**: Observación reactiva de datos.
    - **RecyclerView**: Renderizado eficiente de la lista de noticias.
    - **SwipeRefreshLayout**: Funcionalidad de "deslizar para refrescar".
    - **Material Components**: Estilo moderno (CardView, botones, etc.).

### 🌐 Networking

* **Retrofit**  
  Cliente HTTP para interactuar con la API.

* **Moshi**  
  Conversión de JSON a objetos Kotlin.

### 🖼️ Carga de Imágenes

* **Glide**  
  Descarga y muestra de imágenes de manera asíncrona.

---

# 📲 ¿Cómo ejecutar el proyecto?

## ✅ Requisitos Previos

Antes de ejecutar el proyecto, se deben cumplir los siguientes requisitos:

* **Android Studio**
* **Java JDK 17**
* **Gradle (versión usada por Android Studio)**
* **Dispositivo físico o emulador (API 24 o superior)**
* **API Key de NewsAPI** (gratuita en [newsapi.org](https://newsapi.org))

---

## ⚙️ Instalación Paso a Paso

### 1. Clonar el Repositorio

```bash
git clone https://github.com/JosueGarcia-UDB/actividad-2-dsm.git
cd actividad-2-dsm
```

### 2. Configurar la API Key

1. En la raíz del proyecto, abrir o crear el archivo `local.properties`.
2. Agregar la siguiente línea, reemplazando `"TU_API_KEY"` por la clave obtenida en NewsAPI:

```properties
API_KEY="TU_API_KEY"
```

> El archivo `local.properties` ya está en el `.gitignore`, por lo que la clave no se subirá al repositorio.

### 3. Abrir el Proyecto

* Abrir Android Studio → `Archivo > Abrir` → seleccionar la carpeta del proyecto.

### 4. Sincronizar con Gradle

* Esperar a que Android Studio descargue e instale las dependencias necesarias.

### 5. Ejecutar la App

* Seleccionar un emulador o conectar un dispositivo físico.
* Presionar ▶️ **Run 'app'** en Android Studio.

---

## 📝 Funcionalidades Principales

* 📰 **Lista de noticias** con imagen, título y descripción.
* 🌍 **Abrir artículos en navegador** mediante un botón.
* 🔄 **Deslizar para refrescar** titulares en tiempo real.
* ⚡ **Manejo de estados**: carga, éxito y error.

---

## 📸 Video demo

Un video demostrativo de la aplicación en funcionamiento puede visualizarse en el siguiente enlace:

👉 [Ver Video Demo](https://share.cleanshot.com/SzPR75vS)
