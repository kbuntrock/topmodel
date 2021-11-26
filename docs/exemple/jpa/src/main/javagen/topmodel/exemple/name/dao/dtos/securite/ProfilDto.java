////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package topmodel.exemple.name.dao.dtos.securite;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import topmodel.exemple.name.dao.dtos.utilisateur.UtilisateurDto;

/**
 * Objet métier non persisté représentant Profil.
 */
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class ProfilDto implements Serializable {
	/** Serial ID */
    private static final long serialVersionUID = 1L;

    private long id;
    private List<UtilisateurDto> utilisateurs;

    /**
     * Id technique.
     * Alias of {@link topmodel.exemple.name.dao.entities.securite.Profil#getId() Profil#getId()} 
     *
     * @return value of id.
     */
    public long getId() {
         return this.id;
    }

    /**
     * Liste paginée des utilisateurs de ce profil.
     *
     * @return value of UtilisateurDto.
     */
    public List<UtilisateurDto> getUtilisateurDto() {
        if(UtilisateurDto == null) this.Utilisateurs = new ArrayList<>();
        return this.utilisateurs;
    }
}
