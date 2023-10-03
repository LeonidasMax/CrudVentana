import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm extends JDialog{
    private JLabel Register;
    private JLabel NombreApellido;
    private JTextField tfNombreApellido;
    private JTextField tfFechaRegistro;
    private JTextField tfSueldo;
    private JTextField tfEdad;
    private JTextField tfLongitud;
    private JTextField tfLatitud;
    private JTextField tfComentario;
    private JLabel FechaRegistro;
    private JLabel SueldoBase;
    private JLabel Edad;
    private JLabel Longitud;
    private JLabel Latitud;
    private JLabel Comentario;
    private JButton agregarButton;
    private JButton eliminarButton;
    private JButton insertarButton;
    private JButton consultaButton;
    private JPanel RegistroPanel;
    public RegistrationForm(JFrame parent){
        super(parent);
        setTitle("Crear un nuevo registro");
        setContentPane(RegistroPanel);
        setMinimumSize(new Dimension(450,474));
        setModal(true);
        setLocationRelativeTo(parent);
        setVisible(true);
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerUser();
            }
        });
        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void registerUser() {
    }

    public static void main(String[] args) {
        RegistrationForm myform=new RegistrationForm(null);
    }
}
