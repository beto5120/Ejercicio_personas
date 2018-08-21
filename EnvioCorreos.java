import java.util.List;

public class EnvioCorreos {

	public void enviar (List listaDePersonas) {
		Object listaDePersona;
		for(Object o : listaDePersona) {
			Persona p = (Persona) o;
			System.out.println("Se ha enviado correo a la direccion: "+p.getEmail());
		}
		
		
	}
}
