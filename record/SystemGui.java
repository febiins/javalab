package record;
import java.awt.*;
import java.awt.event.*;


public class SystemGui extends Frame implements ActionListener,ItemListener{
    List l1,l2;
    TextField t1;
    Button add,left,right;
    public SystemGui(){
        l1=new List(5);
        l2=new List(5);
        t1 = new TextField(10);
        add = new Button("Add");
        right = new Button(">>");
        left = new Button("<<");
        setLayout(new FlowLayout());
        add(l1);
        add(left);
        add(right);
        add(l2);
        add(t1);
        add(add);
        add.addActionListener(this);
        right.addActionListener(this);
        left.addActionListener(this);
        setSize(700,700);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==add){
            String s = t1.getText();
            l1.add(s);
            t1.setText(" ");
        }
        else if(ae.getSource()==right){
            int p = l1.getSelectedIndex();
            if(p>=0){
                String s = l1.getSelectedItem();
                l2.add(s);
                l1.remove(p);
            }

        }
        else if(ae.getSource()==left){
            int p = l2.getSelectedIndex();
            if(p>=0){
                String s = l2.getSelectedItem();
                l1.add(s);
                l2.remove(p);
            }

        }
    }
    public void itemStateChanged(ItemEvent ie){

    }
    public static void main(String[] args) {
        new SystemGui();
    }
    
}
