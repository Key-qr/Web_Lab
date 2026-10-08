<h1 align="center">Páginas Web</h1>

<p align="center">
  Colección de landing pages en HTML, CSS y JavaScript puro, sin frameworks ni build.<br>
  Cada página vive en su carpeta y se publica con GitHub Pages.
</p>

<p align="center">
  <a href="https://key-qr.github.io/PaginasWeb/"><img alt="Portal" src="https://img.shields.io/badge/portal-en%20vivo-2ea44f?style=flat-square"></a>
  <img alt="HTML" src="https://img.shields.io/badge/HTML5-e34f26?style=flat-square&logo=html5&logoColor=white">
  <img alt="CSS" src="https://img.shields.io/badge/CSS3-1572b6?style=flat-square&logo=css3&logoColor=white">
  <img alt="JavaScript" src="https://img.shields.io/badge/JavaScript-f7df1e?style=flat-square&logo=javascript&logoColor=black">
</p>

---

## Páginas

| Proyecto | Descripción | Enlace |
|---|---|---|
| **Altiplano** | Sitio para una marca de café de altura | [Abrir](https://key-qr.github.io/PaginasWeb/altiplano/) |
| **Cauce** | Landing de un SaaS para que freelancers coticen, facturen y cobren | [Abrir](https://key-qr.github.io/PaginasWeb/cauce/) |
| **Hora Azul** | Página de venta de una masterclass de fotografía nocturna | [Abrir](https://key-qr.github.io/PaginasWeb/hora-azul/) |

Portal con todos los enlaces: https://key-qr.github.io/PaginasWeb/

## Características

- Diseño responsive (móvil y escritorio)
- Modo claro y oscuro automático con `prefers-color-scheme`
- Animaciones con JavaScript nativo (contadores, acordeón, canvas)
- Un solo archivo `index.html` por página, sin dependencias salvo Google Fonts

## Estructura

```
PaginasWeb/
├── index.html        portal con los enlaces
├── altiplano/
├── cauce/
├── hora-azul/
└── archivo/          trabajos anteriores (Python, Java, scaffold de Vite)
```

## Ejecutar en local

```bash
git clone https://github.com/Key-qr/PaginasWeb.git
cd PaginasWeb
python -m http.server 8000
```

Luego abre `http://localhost:8000/` en el navegador. También sirve abrir cualquier `index.html` directamente con doble clic.

## Agregar una página nueva

1. Crea una carpeta con el nombre de la página.
2. Pon dentro su `index.html`.
3. Agrega el enlace en el `index.html` de la raíz y en la tabla de este README.
4. Haz commit y push a `main`. GitHub Pages la publica solo.

---

<p align="center">Hecho por <a href="https://github.com/Key-qr">Keysi Quiñe</a></p>
