import javax.swing.JOptionPane;
public class homework_1 {
//รับเวลาเป็นวินาที แล้วแสดงออกเป็น วัน/ชั่วโมง/นาที/วินาที

int sec=0,today=0,hour=0,minute=0;
public void input()
	{
		String ss;
		ss = JOptionPane.showInputDialog(null,"Input Second : = ","Input",JOptionPane.QUESTION_MESSAGE);
		sec = Integer.parseInt(ss);
	}
	public void calculate(){
		
		minute = sec / 60;
		sec    = sec % 60;
		
		hour   = minute / 60;
		minute = minute % 60;
		
		today = hour / 24;
		hour  = hour % 24;
	}
	public static void main(String[] args) {
		

	}

}
