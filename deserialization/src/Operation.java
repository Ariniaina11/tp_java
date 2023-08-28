import java.io.Serializable;

public class Operation implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String numOperation;
	private String typeOperation;
	private String dateOperation;
	private double montant;
	
	public Operation(String numO, String typeO, String dateO, double montant) {
		super();
		this.numOperation = numO;
		this.typeOperation = typeO;
		this.dateOperation = dateO;
		this.montant = montant;
	}
	
	public Operation() {
		super();
	}

	public String getNumOperation() {
		return numOperation;
	}

	public void setNumOperation(String numOperation) {
		this.numOperation = numOperation;
	}

	public String getTypeOperation() {
		return typeOperation;
	}

	public void setTypeOperation(String typeOperation) {
		this.typeOperation = typeOperation;
	}

	public String getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(String dateOperation) {
		this.dateOperation = dateOperation;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}
}
