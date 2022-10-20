////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package topmodel.exemple.name.entities.utilisateur;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Immutable;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Type d'utilisateur.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
@Entity
@Table(name = "TYPE_UTILISATEUR")
@Immutable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class TypeUtilisateur {

	/**
	 * Code du type d'utilisateur.
	 */
	@Id
	@Column(name = "TUT_CODE", nullable = false, length = 3)
	@Enumerated(EnumType.STRING)
	private TypeUtilisateur.Values code;

	/**
	 * Libellé du type d'utilisateur.
	 */
	@Column(name = "TUT_LIBELLE", nullable = false, length = 3)
	private String libelle;

	/**
	 * No arg constructor.
	 */
	public TypeUtilisateur() {
	}

	/**
	 * Copy constructor.
	 * @param typeUtilisateur to copy
	 */
	public TypeUtilisateur(TypeUtilisateur typeUtilisateur) {
		if(typeUtilisateur == null) {
			return;
		}

		this.code = typeUtilisateur.getCode();
		this.libelle = typeUtilisateur.getLibelle();
	}

	/**
	 * All arg constructor.
	 * @param code Code du type d'utilisateur
	 * @param libelle Libellé du type d'utilisateur
	 */
	public TypeUtilisateur(TypeUtilisateur.Values code, String libelle) {
		this.code = code;
		this.libelle = libelle;
	}

	/**
	 * Getter for code.
	 *
	 * @return value of {@link topmodel.exemple.name.entities.utilisateur.TypeUtilisateur#code code}.
	 */
	public TypeUtilisateur.Values getCode() {
		return this.code;
	}

	/**
	 * Getter for libelle.
	 *
	 * @return value of {@link topmodel.exemple.name.entities.utilisateur.TypeUtilisateur#libelle libelle}.
	 */
	public String getLibelle() {
		return this.libelle;
	}

	/**
	 * Set the value of {@link topmodel.exemple.name.entities.utilisateur.TypeUtilisateur#code code}.
	 * @param code value to set
	 */
	public void setCode(TypeUtilisateur.Values code) {
		this.code = code;
	}

	/**
	 * Set the value of {@link topmodel.exemple.name.entities.utilisateur.TypeUtilisateur#libelle libelle}.
	 * @param libelle value to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * Equal function comparing Code.
	 */
	public boolean equals(Object o) {
		if(o instanceof TypeUtilisateur) {
			TypeUtilisateur typeUtilisateur = (TypeUtilisateur) o;
			if(this == typeUtilisateur)
				return true;

			if(typeUtilisateur == null || this.getCode() == null)
				return false;

			return this.getCode().equals(typeUtilisateur.getCode());
		}

		return false;
	}

	/**
	 * Enumération des champs de la classe {@link topmodel.exemple.name.entities.utilisateur.TypeUtilisateur TypeUtilisateur}.
	 */
	public enum Fields  {
        CODE(TypeUtilisateur.Values.class), //
        LIBELLE(String.class);

		private Class<?> type;

		private Fields(Class<?> type) {
			this.type = type;
		}

		public Class<?> getType() {
			return this.type;
		}
	}

	public enum Values {
		ADM("Administrateur"), //
		GES("Gestionnaire"), //
		CLI("Client"); 

		/**
		 * Libellé du type d'utilisateur.
		 */
		private final String libelle;

		/**
		 * All arg constructor.
		 */
		private Values(String libelle) {
			this.libelle = libelle;
		}

		/**
		 * Libellé du type d'utilisateur.
		 */
		public String getLibelle(){
			return this.libelle;
		}
	}
}
