import com.lucaslgr.ecommerce.checkout.entity

import lombok.Data;
import lombok.Builder;

import javax.persistence.Column;
import javax.persistence.Enumerated;
import javax.persistence.Entity;
import javax.persistence.Id;

@Builder
@Data
@Entity
public class CheckoutEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String code;

    @Column
    @Enumerated(value = EnumType.STRING)
    private Status status;

    enum Status {
        CREATED,
        APPROVED
    }
}