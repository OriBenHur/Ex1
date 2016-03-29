import static org.junit.Assert.*;

import org.junit.Test;




import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import org.junit.Test;


public class TEST {
	@Test

	public void test_tiny_1(){

		String s1 = "Boaz-Solution_test1.txt_tinyEWD.txt";
		String s2 = "My-Solution_test1.txt_tinyEWD.txt";

		In Check_File = new In(s1);
		In Ans = new In(s2);

		while((Ans.hasNextLine()) && (Check_File.hasNextLine())){
			String my = Ans.readLine();
			String other = Check_File.readLine();
			if(!my.contains("Results") && !other.contains("SE1_EX1 solution"))
			{
				assertEquals(my, other);

			}
		}
	}


	@Test
	public void test_medium_1(){

		String s1 = "Boaz-Solution_test1.txt_mediumEWD.txt";
		String s2 = "My-Solution_test1.txt_mediumEWD.txt";

		In Check_File = new In(s1);
		In Ans = new In(s2);

		while((Ans.hasNextLine()) && (Check_File.hasNextLine())){
			String my = Ans.readLine();
			String other = Check_File.readLine();
			if(!my.contains("Results") && !other.contains("SE1_EX1 solution"))
			{
				assertEquals(my, other);

			}
		}
	}


	@Test
	public void test_medium_2(){

		String s1 = "Boaz-Solution_test2.txt_mediumEWD.txt";
		String s2 = "My-Solution_test2.txt_mediumEWD.txt";
		
		In Check_File = new In(s1);
		In Ans = new In(s2);

		while((Ans.hasNextLine()) && (Check_File.hasNextLine())){
			String my = Ans.readLine();
			String other = Check_File.readLine();
			if(!my.contains("Results") && !other.contains("SE1_EX1 solution"))
			{
				assertEquals(my, other);

			}
		}
	}
	@Test
	public void test_medium_3(){

		String s1 = "Boaz-Solution_test3.txt_mediumEWD.txt";
		String s2 = "My-Solution_test3.txt_mediumEWD.txt";
		
		In Check_File = new In(s1);
		In Ans = new In(s2);

		while((Ans.hasNextLine()) && (Check_File.hasNextLine())){
			String my = Ans.readLine();
			String other = Check_File.readLine();
			if(!my.contains("Results") && !other.contains("SE1_EX1 solution"))
			{
				assertEquals(my, other);

			}
		}
	}
	
	public void test_medium_4(){

		String s1 = "Boaz-Solution_test4.txt_mediumEWD.txt";
		String s2 = "My-Solution_test4.txt_mediumEWD.txt";
		
		In Check_File = new In(s1);
		In Ans = new In(s2);

		while((Ans.hasNextLine()) && (Check_File.hasNextLine())){
			String my = Ans.readLine();
			String other = Check_File.readLine();
			if(!my.contains("Results") && !other.contains("SE1_EX1 solution"))
			{
				assertEquals(my, other);

			}
		}
	}
	
	@Test
	public void test_large_3(){

		String s1 = "Boaz-Solution_test3.txt_largeEWD.txt";
		String s2 = "My-Solution_test3.txt_largeEWD.txt";

		In Check_File = new In(s1);
		In Ans = new In(s2);

		while((Ans.hasNextLine()) && (Check_File.hasNextLine())){
			String my = Ans.readLine();
			String other = Check_File.readLine();
			if(!my.contains("results") && !other.contains("SE1_EX1 solution"))
			{
				assertEquals(my, other);

			}
		}
	}
	
	@Test
	public void test_large_4(){

		String s1 = "Boaz-Solution_test4.txt_largeEWD.txt";
		String s2 = "My-Solution_test4.txt_largeEWD.txt";

		In Check_File = new In(s1);
		In Ans = new In(s2);
		
		while((Ans.hasNextLine()) && (Check_File.hasNextLine())){
			String my = Ans.readLine();
			String other = Check_File.readLine();
			if(!my.contains("Results") && !other.contains("SE1_EX1 solution"))
			{
				assertEquals(my, other);
			}
		}
	}

}
