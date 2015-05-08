import javax.swing.JFrame;


public class One {
  public static void main(String args[]){
	Two r= new Two("Чёто там");
	r.setVisible(true);
	r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	r.setSize(500,300);
	r.setResizable(true);
	r.setLocationRelativeTo(null);
  }
}
