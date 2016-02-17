import javax.swing.JOptionPane;
public class homework_2 {
//รับชื่อนามสกุลแล้วแสดงสระที่มีในชื่อนามสกุล A E I O U

static int A=0;
static int E=0;
static int I=0;
static int O=0;
static int U=0;
	public String input()
	{
		String name = JOptionPane.showInputDialog(null,"Input Name and Surname: = ","INPUT",JOptionPane.QUESTION_MESSAGE);
		name = name.toUpperCase();
		return name;
	}
	
	public static void main(String[] args) {
		

	}

}
