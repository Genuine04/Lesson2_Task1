package uz.pdp.task1.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Output {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date date;

    @ManyToOne
    private Warehouse warehouse;

    @ManyToOne
    private Currency currency;

    private int factureNumber;

    private String code;

    @ManyToOne
    private Client client;

}
