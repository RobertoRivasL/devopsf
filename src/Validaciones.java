import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validaciones {
    public boolean validarNombreApellido(String info) {
        if (info.length() >= 10 && info.length() <= 50) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarFechaNacimiento(String fecha) {
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }

    public boolean validarTelefono(int telefono) {
        if (telefono <= 99999999 && telefono >= 10000000) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarRut(int rut) {
        if (rut >= 1000000 && rut <= 99999999) {

            return true;
        } else {
            return false;
        }
    }

    public boolean validarAfp(String afp) {

        if (afp.length() > 3 && afp.length() <= 30) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarSistemaSalud(int salud) {
        if (salud == 1) {
            return true;
        } else if (salud == 2) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarDireccion(String direccion) {
        if (direccion.length() <= 70) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarComuna(String comuna) {
        if (comuna.length() <= 50) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarEdad(int edad) {
        if (edad >= 0 && edad < 150) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarTitulo(String titulo) {
        if (titulo.length() >= 10 && titulo.length() <= 50) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarFechaingreso(String fechain) {
        if (fechain.matches("\\d{2}/\\d{2}/\\d{4}")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarArea(String area) {

        if (area.length() >= 5 && area.length() <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarIdentificador(int identificador) {
        if (identificador != 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarDia(String dia) {
        String[] diasPermitidos = {"lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo"};
        for (String diaPermitido : diasPermitidos) {
            if (diaPermitido.equalsIgnoreCase(dia)) {
                return true;
            }
        }
        return false;
    }

    public boolean validarHora(String hora) {
        String horaRegex = "^([01]?[0-9]|2[0-3]):[0-5][0-9]$";
        Pattern pattern = Pattern.compile(horaRegex);
        Matcher matcher = pattern.matcher(hora);
        return matcher.matches();
    }

    public boolean validarLugar(String lugar) {
        if (lugar.length() >= 10 && lugar.length() <= 50) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarDuracion(int duracion) {

        if (duracion <= 70) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarCantidadAsistentes(int cantidadAsistentes) {
        if (cantidadAsistentes < 1000) {
            return true;
        } else {
            return false;
        }
    }

    // Valida todos los datos requeridos a un maximo de 100 caracteres
    public boolean validarInfo(String info) {

        if (info.length() <= 100) {
            return true;
        } else {
            return false;
        }

    }

    public String validarEstado(int estado) {

        if (estado == 1) {
            return "Sin Problemas";
        } else if (estado == 2) {
            return "Con observaciones";
        } else {
            return "No aprueba";
        }
    }

}
