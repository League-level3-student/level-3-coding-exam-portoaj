import java.util.ArrayList;

public class VoteProcessor {
	public static String calculateElectionWinner(ArrayList<String> votes)
	{
		String nomineeOne= votes.get(0).toLowerCase();
		int nomineeOneVotes = 0;
		String nomineeTwo = "DEFAULT";
		int nomineeTwoVotes = 0;
		for(String str : votes)
		{
			if(str.equalsIgnoreCase(nomineeOne))
				nomineeOneVotes++;
			else if(nomineeTwo.equals("DEFAULT"))
			{
				nomineeTwo = str.toLowerCase();
				nomineeTwoVotes++;
			}
			else if(str.toLowerCase().equalsIgnoreCase(nomineeTwo))
				nomineeTwoVotes++;
			else
				System.out.println("ERROR" + str);
		}
		System.out.println(nomineeOneVotes + "   " + nomineeTwoVotes);
		if(nomineeOneVotes > nomineeTwoVotes)
			return nomineeOne;
		else if(nomineeTwoVotes > nomineeOneVotes)
			return nomineeTwo;
		else
			return "TIE";
	}
}
