import Controller.CadastroController;
import Model.UsuarioDAO;
import View.CadastroView;

public class Cadastro {
	public static void main(String[] args) {
	    CadastroView view = new CadastroView();
	    UsuarioDAO model = new UsuarioDAO();      
	    CadastroController controller = new CadastroController(view,model);
	    view.setVisible(true);	 
	}
}
