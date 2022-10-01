package practical.pkg8;
import java.awt.*;
public class Practical8 extends Frame{
    TextField txtName, txtAge, txtPhone;
    Checkbox chkMale, chkFemale;
    Checkbox chkQ1, chkQ2, chkQ3;
    CheckboxGroup cbgGender;
    Button btnSubmit;
    TextArea txaAddress;    
    public Practical8(){
       
        txtName = new TextField(20);
        txtAge = new TextField(20);
        txtPhone = new TextField(20);
        
        cbgGender = new CheckboxGroup();
        chkMale = new Checkbox("Male", false, cbgGender);
        chkFemale = new Checkbox("Female", false, cbgGender);
        chkQ1 = new Checkbox("Msc CS");
        chkQ2 = new Checkbox("Msc IT");
        chkQ3 = new Checkbox("Msc BT");
        
        txaAddress = new TextArea(5, 20);
        
        btnSubmit = new Button("Submit");
        
        add(new Label("Name"));
        add(txtName);
        add(new Label("Age"));
        add(txtAge);
        add(new Label("Phone"));
        add(txtPhone);
        add(new Label("Gender"));
        add(chkMale);
        add(chkFemale);
        add(new Label("Qualification"));
        add(chkQ1);
        add(chkQ2);
        add(chkQ3);
        add(new Label("Address"));
        add(txaAddress);
        add(btnSubmit);
    }
    
    public static void main(String[] args) {
        Practical8 practical8 = new Practical8();
        practical8.setLayout(new FlowLayout());
        practical8.setSize(200,500);
        practical8.setVisible(true);
    }
    
}
