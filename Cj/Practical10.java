package practical.pkg10;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Practical10 extends Frame{
    
    TextField txtA, txtB, txtResult;
    Button btnAdd, btnSub, btnMul, btnDiv, btnClr;
    
    Practical10(){
        setLayout(new FlowLayout());
        txtA = new TextField(20);
        txtB = new TextField(20);
        txtResult = new TextField(20);
        btnAdd = new Button("Add");
        btnAdd.addActionListener((ActionEvent e) -> {
              txtResult.setText("" + (get(txtA) + get(txtB)));
        });
        btnSub = new Button("Sub");
        btnSub.addActionListener((ActionEvent e) -> {
              txtResult.setText("" + (get(txtA) - get(txtB)));
        });
        btnMul = new Button("Mul");
        btnMul.addActionListener((ActionEvent e) -> {
              txtResult.setText("" + (get(txtA) * get(txtB)));
        });
        btnDiv = new Button("Div");
        btnDiv.addActionListener((ActionEvent e) -> {
              txtResult.setText("" + (get(txtA) / get(txtB)));
        });
        btnClr = new Button("Clr");
        btnClr.addActionListener((ActionEvent e) -> {
            txtA.setText("");
            txtB.setText("");
            txtResult.setText("");
        });
        add(new Label("A"));
        add(txtA);
        add(new Label("B"));
        add(txtB);
        add(new Label("Result"));
        add(txtResult);
        add(btnAdd);
        add(btnSub);
        add(btnMul);
        add(btnDiv);
        add(btnClr);
        setSize(200,500);
        setVisible(true);
        
    }
    static float get(TextField txt){
        return Float.parseFloat(txt.getText());
    }
    public static void main(String[] args) {
        new Practical10();
    }
    
}
