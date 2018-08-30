import java.awt.*;
import java.awt.event.*;

class Components{
    public static void main(String args[]){
        Frame f1 = new Frame("CA");
        f1.setVisible(true);
        f1.setSize(500,500);
        f1.setLayout(new FlowLayout());

        Label l1 = new Label();
        l1.setText("NAME");
        
        TextField t1 = new TextField();
        t1.setColumns(15);

        Label l2 = new Label();
        l2.setText("GENDER");

        //radio buttons
        CheckboxGroup g1 = new CheckboxGroup();
        Checkbox r1 = new Checkbox("MALE",true,g1);
        Checkbox r2 = new Checkbox("SHEMALE",false,g1);
        Checkbox r3 = new Checkbox("FEMALE",false,g1);


        Label l3 = new Label();
        l3.setText("CITY");
        Choice c1 = new Choice();
        c1.addItem("Chhindwara");
        c1.addItem("Delhi");
        c1.addItem("Singapur");

        Label l4 = new Label();
        l4.setText("LIKES");
        Checkbox ch1 = new Checkbox("Dancing");
        Checkbox ch2 = new Checkbox("Singing");
        Checkbox ch3 = new Checkbox("Sleeping");
        

        Label l5 = new Label();
        l5.setText("ANY QUES");
        TextArea t2 = new TextArea(5,20);
        
        Button b1 = new Button("SUBMIT");

        f1.add(l1); 
        f1.add(t1);
        f1.add(l2);
        f1.add(r1);
        f1.add(r2);
        f1.add(r3);
        f1.add(l3);
        f1.add(c1);
        f1.add(l4);
        f1.add(ch1);
        f1.add(ch2);
        f1.add(ch3);
        f1.add(l5);
        f1.add(t2);
        f1.add(b1);
        

        //ab hum events pr kam krenge
        f1.addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent we){
            System.exit(0);
            //   f1.dispose();
        }
        });

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                System.out.println("ohohoho");
            }
        });
        
    }
}



