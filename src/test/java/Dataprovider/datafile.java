package Dataprovider;

import org.testng.annotations.DataProvider;

public class datafile {
	//Second Method
		@DataProvider(name="create")
		public Object[][] dataSet1()
		{
			return new Object[][]
			{
				{"standard_user","secret_sauce"},
				{"locked_out_user","secret_sauce"},
				{"problem_user","secret_sauce"},
				{"performance_glitch_user","secret_sauce"}
				
			};
			
		}
		
		
		

		// First Method
		@DataProvider
		public Object[][] dataSet()
		{
			Object[][] dataset=new Object[4][2];
			
			
			//Row no.1
			dataset[0][0]="User1";
			dataset[0][1]="Password1";
			
			
			//Row no.2
			dataset[1][0]="User2";
			dataset[1][1]="Password2";
			
					
			//Row no.3
			dataset[2][0]="User3";
			dataset[2][1]="Password3";
			
					
			//Row no.4
			dataset[3][0]="User4";
			dataset[3][1]="Password4";
			
			return dataset;
			
		}

		
}
