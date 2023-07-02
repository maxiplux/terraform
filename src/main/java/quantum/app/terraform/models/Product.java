package quantum.app.terraform.models;

import com.fasterxml.jackson.annotation.JsonIdentityReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "PRODUCTS")// with progress user is keywordof
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Name cannot be null")
    private String name;



    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "sector")
    @JsonIdentityReference(alwaysAsId = true)
    private Sector sector;


    private String website;


    private String rank;

}
