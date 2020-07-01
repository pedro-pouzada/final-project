package pedro.pouzadaiuri.bittencourt.finalproject.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author Pedro Pouzada
 * @author Iuri Bittencourt
 * @version 1.0
 * @since 28/06/2020 - 17:05
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@ToString
@Component
@Entity
@Table(name = "pet")
public class PetEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_pet")
    private long id;

    @NotBlank(message = "cannot be null or blank")
    @Column(name = "name")
    private String name;

    @NotBlank(message = "cannot be null or blank")
    @Column(name = "typePet")
    private String typePet;

    @NotNull(message = "cannot be null or blank")
    @Column(name = "age")
    private int age;

    @NotNull(message = "cannot be null or blank")
    @Column(name = "weight")
    private double weight;

}
