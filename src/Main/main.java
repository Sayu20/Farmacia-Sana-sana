package Main;

import Vista.LoginVista;
import Vista.RegistroVista;


public class main {
    public static void main(String[] args) {
    LoginVista login = new LoginVista();   
    login.setVisible(true);
     login.btn_Ingresar.addActionListener(e -> {
            RegistroVista registro = new RegistroVista();
            registro.setVisible(true);
            login.dispose(); 
        });

        login.setVisible(true);
    }
}
   





