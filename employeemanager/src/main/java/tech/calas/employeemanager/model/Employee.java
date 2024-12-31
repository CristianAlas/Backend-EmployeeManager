package tech.calas.employeemanager.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee implements Serializable {

    // Identificador único del empleado
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    // Nombre del empleado, no puede estar en blanco
    @NotBlank(message = "El nombre es obligatorio")
    @Size(max = 100, message = "El nombre no puede tener más de 100 caracteres")
    private String name;

    // Email del empleado, debe ser un email válido
    @Email(message = "Debe ser un email válido")
    @NotBlank(message = "El email es obligatorio")
    private String email;

    // Título del trabajo del empleado, no puede estar en blanco
    @NotBlank(message = "El título del trabajo es obligatorio")
    @Size(max = 50, message = "El título del trabajo no puede tener más de 50 caracteres")
    private String jobTitle;

    // Teléfono del empleado, debe seguir un patrón específico
    @Pattern(regexp = "\\d{8}", message = "El teléfono debe tener 8 dígitos")
    private String phone;

    // URL de la imagen del empleado
    @Size(max = 255, message = "La URL de la imagen no puede tener más de 255 caracteres")
    private String imageUrl;

    // Código único del empleado, no puede estar en blanco
    //@NotBlank(message = "El código del empleado es obligatorio")
    @Column(nullable = false, updatable = false)
    private String employeeCode;
}
