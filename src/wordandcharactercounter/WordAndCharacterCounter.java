package wordandcharactercounter;

/**
 *
 * @author Nejra
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
public class WordAndCharacterCounter extends JFrame implements ActionListener, WindowListener  {
    
    Button count;
    Label word, character;
    TextArea area;

    public WordAndCharacterCounter() {
        count = new Button("Count");
        count.setBounds(100, 400, 100, 30); 
        count.setBackground(Color.gray);
        count.addActionListener(this);
            
        
        word = new Label("Words: "+ 0); 
        word.setBounds(50,50,100,30);
        
        
        character = new Label("Characters: " +0);
        character.setBounds(200,50,100,30);
        
       
        area = new TextArea();
        area.setBounds(20, 100, 300, 300);   
        area.setBackground(Color.lightGray);
        
 
        add(count);
        add(word);
        add(character);
        add(area);
     
        
        setSize(400, 450);    
        setLayout(null);    
        setVisible(true); 
        
    }    
  
    public static void main(String[] args) {
        new WordAndCharacterCounter();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = area.getText();    
        String words[]=text.split("\\s");  
        word.setText("Words: "+words.length);
        character.setText("Characters: "+text.length());
         Toolkit.getDefaultToolkit().beep();         
        }

    @Override
    public void windowOpened(WindowEvent e) {}

    @Override
    public void windowClosing(WindowEvent e) {
        dispose(); 
    }

    @Override
    public void windowClosed(WindowEvent e) {}

    @Override
    public void windowIconified(WindowEvent e) {}

    @Override
    public void windowDeiconified(WindowEvent e) {}

    @Override
    public void windowActivated(WindowEvent e) {}

    @Override
    public void windowDeactivated(WindowEvent e) {}
    
}
