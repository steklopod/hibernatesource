package hibernate.entity;


import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor @RequiredArgsConstructor
@DynamicInsert @DynamicUpdate

public class Book implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // генерация ID через Autoincrement в MySQL
    private long id;
    @NonNull
    private String name;
    private int author_id;

    @ManyToOne // много книг может принадлежать одному автору
    @JoinColumn
    private Author author;


}
