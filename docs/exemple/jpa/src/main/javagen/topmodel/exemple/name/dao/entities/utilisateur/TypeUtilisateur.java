////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package topmodel.exemple.name.dao.entities.utilisateur;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Immutable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import topmodel.exemple.name.dao.references.utilisateur.TypeUtilisateurCode;

/**
 * Type d'utilisateur.
 */
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "TYPE_UTILISATEUR")
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@Immutable
public class TypeUtilisateur implements Serializable {
	/** Serial ID */
    private static final long serialVersionUID = 1L;

    private TypeUtilisateurCode code;
    private String libelle;

    /**
     * Code du type d'utilisateur.
     *
     * @return value of code.
     */
    @Id
    @Column(name = "CODE", nullable = false)
    @Enumerated(EnumType.STRING)
    public TypeUtilisateurCode getCode() {
         return this.code;
    }

    /**
     * Libellé du type d'utilisateur.
     *
     * @return value of libelle.
     */
    @Column(name = "LIBELLE", nullable = false)
    public String getLibelle() {
         return this.libelle;
    }
}
