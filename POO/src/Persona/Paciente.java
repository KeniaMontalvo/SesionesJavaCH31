package Persona;

public class Paciente {
	
	//1. Atributos
	String numeroSeguroSocial;
	String tipoSangre;
	boolean expediente;
	boolean seguroGastosMedicos;
	String cita;
	String doctorAsignado;
	boolean alergias;
	
	
	
	//2. Constructor - que recopile todos los datos
	Paciente(String numeroSeguroSocial, String tipoSangre, boolean expediente, boolean seguroGastosMedicos,
			String cita, String doctorAsignado, boolean alergias) {
		super();
		this.numeroSeguroSocial = numeroSeguroSocial;
		this.tipoSangre = tipoSangre;
		this.expediente = expediente;
		this.seguroGastosMedicos = seguroGastosMedicos;
		this.cita = cita;
		this.doctorAsignado = doctorAsignado;
		this.alergias = alergias;
	} //Constructor con todos los campos
	
	
	
	//2.1 Constructor - que recopile solo los datos requeridos u obligatorios
	Paciente(String numeroSeguroSocial, boolean expediente, boolean seguroGastosMedicos){
		this.numeroSeguroSocial= numeroSeguroSocial;
		this.expediente = expediente;
		this.seguroGastosMedicos = seguroGastosMedicos;
	} //Constructor con campos obligatorios

	
	
	//3. Métodos
	//Método llamado toString que utiliza datos del tipo String
	@Override
	public String toString() {
		return "Paciente con numeroSeguroSocial: " + numeroSeguroSocial + ", tipoSangre: " + tipoSangre + ", expediente: "
				+ expediente + ", seguroGastosMedicos: " + seguroGastosMedicos + ", cita: " + cita + ", doctorAsignado: "
				+ doctorAsignado + ", alergias: " + alergias;
	} //toString

	
	
	//getter
	public boolean getSeguroGastosMedicos() {
		return seguroGastosMedicos;
	}
	
	
	//setter
	public void setSeguroGastosMedicos(boolean seguroGastosMedicos) {
		this.seguroGastosMedicos = seguroGastosMedicos;
	}
}
