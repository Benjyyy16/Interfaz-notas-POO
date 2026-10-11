# Interfaz de Notas (Java Swing)

Aplicación de escritorio que calcula el promedio de 4 notas de un alumno y determina si aprueba. Proyecto académico de programación orientada a objetos con interfaz gráfica en Java Swing (NetBeans).

![Interfaz de Notas](https://github.com/user-attachments/assets/e7887ac7-7ba7-46c7-96c8-71f7d4ce813b)

## Funcionalidades

- Ingreso de nombre, RUT y 4 notas.
- Validación por campo:
  - rango 1.0 a 7.0,
  - texto no numérico,
  - coma o punto decimal.
- Cálculo del promedio y estado **aprobado** (promedio > 3.9) o **reprobado**.
- Botones para limpiar el formulario y salir.

## Estructura

| Archivo | Responsabilidad |
|---|---|
| `interfazNotas.java` / `.form` | Ventana Swing (diseñada en NetBeans) |
| `CalculadoraNotas.java` | Reglas de negocio: parseo, validación, promedio y aprobación |
| `CalculadoraNotasTest.java` | Tests JUnit 5 |

## Requisitos

- JDK 20 o superior
- Maven 3.8+

## Uso

```bash
git clone https://github.com/Benjyyy16/Interfaz-notas-POO.git
cd Interfaz-notas-POO
mvn -q compile exec:java
```

## Tests

```bash
mvn verify
```

Se ejecutan automáticamente en cada Pull Request con GitHub Actions.

## Autor

[Benjamin Aguilar](https://github.com/Benjyyy16) · [aguilarb.tech](https://aguilarb.tech)
