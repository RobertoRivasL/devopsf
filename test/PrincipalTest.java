import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.mockito.Mockito.*;

public class PrincipalTest {

    private Contenedor contenedorMock;
    private Principal principal;

    @Before
    public void setUp() {
        contenedorMock = mock(Contenedor.class);
    }

    @Test
    public void testAlmacenarCliente() {
        String input = "1\n9\n"; // Simula opción 1 seguida de opción 9 para salir
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);
        principal = new Principal(contenedorMock, scanner);

        principal.run();
        verify(contenedorMock).almacenarCliente();
    }

    @Test
    public void testAlmacenarProfesional() {
        String input = "2\n9\n"; // Simula opción 2 seguida de opción 9 para salir
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);
        principal = new Principal(contenedorMock, scanner);

        principal.run();
        verify(contenedorMock).almacenarProfesional();
    }

    @Test
    public void testAlmacenarAdministrativo() {
        String input = "3\n9\n"; // Simula opción 3 seguida de opción 9 para salir
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);
        principal = new Principal(contenedorMock, scanner);

        principal.run();
        verify(contenedorMock).almacenarAdministrativo();
    }

    @Test
    public void testAlmacenarCapacitacion() {
        String input = "4\n9\n"; // Simula opción 4 seguida de opción 9 para salir
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);
        principal = new Principal(contenedorMock, scanner);

        principal.run();
        verify(contenedorMock).almacenarCapacitacion();
    }

    @Test
    public void testEliminarUsuario() {
        String input = "5\n9\n"; // Simula opción 5 seguida de opción 9 para salir
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);
        principal = new Principal(contenedorMock, scanner);

        principal.run();
        verify(contenedorMock).eliminarUsuario();
    }

    @Test
    public void testListarUsuarios() {
        String input = "6\n9\n"; // Simula opción 6 seguida de opción 9 para salir
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);
        principal = new Principal(contenedorMock, scanner);

        principal.run();
        verify(contenedorMock).listarUsuarios();
    }

    @Test
    public void testListarUsuariosTipo() {
        String input = "7\n9\n"; // Simula opción 7 seguida de opción 9 para salir
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);
        principal = new Principal(contenedorMock, scanner);

        principal.run();
        verify(contenedorMock).listarUsuariosTipo();
    }

    @Test
    public void testListarCapacitaciones() {
        String input = "8\n9\n"; // Simula opción 8 seguida de opción 9 para salir
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);
        principal = new Principal(contenedorMock, scanner);

        principal.run();
        verify(contenedorMock).listarCapacitaciones();
    }

    @Test
    public void testSalir() {
        String input = "9\n"; // Simula opción 9 para salir
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);
        principal = new Principal(contenedorMock, scanner);

        principal.run();
        // No se necesita verificación aquí porque solo sale del bucle
    }

    @Test
    public void testOpcionInvalida() {
        String input = "0\n-1\n10\n9\n"; // Simula opciones inválidas seguidas de opción 9
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);
        principal = new Principal(contenedorMock, scanner);

        principal.run();
        // No se puede verificar un método directamente aquí, pero se puede asegurar que no ocurre nada
    }
}