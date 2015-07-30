package tests;
import java.awt.*;
import javax.swing.JOptionPane;
class DrawingWindow extends Window
{
  String title = "";
  DrawingWindow( Frame f )
  {
    super( f );
    setSize( Toolkit.getDefaultToolkit().getScreenSize() );
    setVisible( true );
  }
  @Override
  public void paint( Graphics g )
  {
    g.drawString( title, 100, 400 );
  }
}
public class PaintIndirect
{
  public static void main( String[] args ) throws Exception
  {
    DrawingWindow w = new DrawingWindow( new Frame() );
    w.title = "Bei den US-Milit�raktionen in Afghanistan sind �ber 800 " +
      "Zivilisten durch milit�rischen Fehlgriffe umgekommen.";
    w.repaint();
    JOptionPane.showMessageDialog( w, "Die Quelle?" );
    w.title = "New York Times und die nichtstaatliche Organisation Global Exchange.";
    w.repaint();
    w.title = JOptionPane.showInputDialog( w, "Antwort" );
    w.repaint();
    JOptionPane.showMessageDialog( w, "Nun ist aber Schluss!" );
    System.exit( 0 );
  }
}