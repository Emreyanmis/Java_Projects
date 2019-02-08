package Question17;

public class PhoneBookEntry
{
		private String name;
		private int number;
		
		public PhoneBookEntry(String name, int number) 
		{
			this.name = name;
			this.number = number;
		}

		/**
		 * @return the name
		 */
		public String getName() 
		{
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name)
		{
			this.name = name;
		}

		/**
		 * @return the number
		 */
		public int getNumber() 
		{
			return number;
		}

		/**
		 * @param number the number to set
		 */
		public void setNumber(int number) 
		{
			this.number = number;
		}
		
}
