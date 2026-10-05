classDiagram
class Persona {
#String nombre
#String dui
+presentarse() String
}
class Cliente {
-String telefono
+getTelefono() String
}
class Empleado {
-double salario
+getSalario() double
}
class Estudiante {
-String carnet
-String carrera
+matricular(String materia) void
}
class Docente {
-String especialidad
-int añosExperiencia
+impartirClase(String materia) void
}

    Persona <|-- Cliente : extends
    Persona <|-- Empleado : extends
    Persona <|-- Estudiante : extends
    Persona <|-- Docente : extends