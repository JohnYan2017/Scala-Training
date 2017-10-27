package GUI
import scala.swing._
import scala.swing.event._
/**
  * Created by OP035308 on 2017/10/26.
  */

  object MyScalaGUI extends SimpleSwingApplication {
    def top = new MainFrame {
      title = "My Scala GUI"
      location = new Point(600, 300)
      preferredSize = new Dimension(400, 200)
      val button = new Button {
        text = "Click me"
      }
      val checkbox = new CheckBox{
        text = "checkbox"
      }
      val label = new Label {
        text = "Who am I?"
      }
      contents = new BoxPanel(Orientation.Vertical) {
        contents += button
        contents += label
        contents += checkbox
      }
      listenTo(button)
      listenTo(checkbox)
      reactions += {
        case ButtonClicked(b) => label.text = "Hello, I'm Tom."
      }
    }
  }

