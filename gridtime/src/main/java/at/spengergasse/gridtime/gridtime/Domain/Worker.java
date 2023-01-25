package at.spengergasse.gridtime.gridtime.Domain;

import jakarta.persistence.Entity;
import lombok.*;
import org.springframework.data.jpa.domain.AbstractPersistable;

@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC )
@EqualsAndHashCode
@ToString
@Entity
public class Worker extends AbstractPersistable<Long>
{
    @Getter
    private String name;
}
