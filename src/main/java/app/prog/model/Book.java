package app.prog.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    private int id;
    private String title;
    private String author;
    @Transient
    private Integer pageNumber;
    @Transient
    private LocalDate releaseDate;

    public boolean hasAuthor() {
        return author != null;
    }

}
