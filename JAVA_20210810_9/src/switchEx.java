
public class switchEx {

	public static void main(String[] args) {
		int score = 75;
		char yourGrade;
		
		switch ( score )
		{
		case 95:
			yourGrade = 'A';
		case 85:
			yourGrade = 'B';
		case 75:
			yourGrade = 'C';
			break;
		default:
			yourGrade = 'D';
		}
		System.out.println("당신의 취득등금은" + yourGrade);
	}

}
