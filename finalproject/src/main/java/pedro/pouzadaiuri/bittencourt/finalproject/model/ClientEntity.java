package pedro.pouzadaiuri.bittencourt.finalproject.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

/**
 * @author Pedro Pouzada
 * @author Iuri Bittencourt
 * @version 1.0
 * @since 21/06/2020 - 18:17
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@ToString
@Component
@Entity
@Table(name = "client")
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_client")
    private long id;

    @NotBlank(message = "cannot be null or blank")
    @Column(name = "login")
    private String login;

    @NotBlank(message = "cannot be null or blank")
    @Column(name = "pass")
    private String pass;

    @NotBlank(message = "cannot be null or blank")
    @Column(name = "email")
    private String email;

    @NotBlank(message = "cannot be null or blank")
    @Column(name = "address")
    private String address;

    @NotBlank(message = "cannot be null or blank")
    @Column(name = "phone")
    private String phone;
    
}