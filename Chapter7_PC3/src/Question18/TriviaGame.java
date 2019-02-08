package Question18;

public class TriviaGame 
{
	String[] answers = {"Mercury","Saturn","Venus","Jupiter","Saturn","Mars","France","Madrid",
			            "Berlin","Atina"};
	
	String[] questions = {"What is the closest planet to the sun?", "asd"};
	
	String[] p1answers = new String[5];
	String[] p2answers = new String[5];
	
     private String question;	
     private String pa1 = "Mars";
     private String pa2 = "Jupiter";
     private String pa3 = "Saturn";
     private String pa4 = "Earth";
     
     private int numCorrect;
    
    /**
	public TriviaGame (String[] p1answers, String[] p2answers, String question,
					String pa1, String pa2, String pa3, String pa4, int numCorrect) 
	{	
		this.p1answers = p1answers;
		this.p2answers = p2answers;
		this.question = question;
		this.pa1 = ;
		this.pa2 = pa2;
		this.pa3 = pa3;
		this.pa4 = pa4;
		this.numCorrect = numCorrect;
	}
	*/

	/**
	 * @return the p1answers
	 */
	public String[] getP1answers()
	{
		return p1answers;
	}

	/**
	 * @param p1answers the p1answers to set
	 */
	public void setP1answers(String[] Mars)
	{
		this.p1answers = Mars;
	}

	/**
	 * @return the p2answers
	 */
	public String[] getP2answers()
	{
		return p2answers;
	}

	/**
	 * @param p2answers the p2answers to set
	 */
	public void setP2answers(String[] p2answers) 
	{
		this.p2answers = p2answers;
	}

	/**
	 * @return the question
	 */
	public String getQuestion() 
	{
		return question;
	}

	/**
	 * @param question the question to set
	 */
	public void setQuestion(String question)
	{
		this.question = question;
	}

	/**
	 * @return the pa1
	 */
	public String getPa1() 
	{
		return pa1 = "Mars";
	}

	/**
	 * @param pa1 the pa1 to set
	 */
	public void setPa1(String pa1) 
	{
		this.pa1 = pa1;
	}

	/**
	 * @return the pa2
	 */
	public String getPa2() 
	{
		return pa2;
	}

	/**
	 * @param pa2 the pa2 to set
	 */
	public void setPa2(String pa2) 
	{
		this.pa2 = pa2;
	}

	/**
	 * @return the pa3
	 */
	public String getPa3() 
	{
		return pa3;
	}

	/**
	 * @param pa3 the pa3 to set
	 */
	public void setPa3(String pa3) 
	{
		this.pa3 = pa3;
	}

	/**
	 * @return the pa4
	 */
	public String getPa4() 
	{
		return pa4;
	}

	/**
	 * @param pa4 the pa4 to set
	 */
	public void setPa4(String pa4) 
	{
		this.pa4 = pa4;
	}

	/**
	 * @return the numCorrect
	 */
	public int getNumCorrect() 
	{
		return numCorrect;
	}

	/**
	 * @param numCorrect the numCorrect to set
	 */
	public void setNumCorrect(int numCorrect)
	{
		this.numCorrect = numCorrect;
	}
	
	
	 
     

	

}
