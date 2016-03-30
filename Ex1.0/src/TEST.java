import static org.junit.Assert.*;

import java.io.File;
import java.util.Vector;
import org.junit.Test;


public class TEST {
	
	public static Vector<String> Name(String Path)
	{
		File folder = new File(Path);
		File[] listOfFiles = folder.listFiles();
		Vector<String> Name = new Vector<>();
		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isFile()) {
				Name.add(listOfFiles[i].getName());
			}
		}
		return Name;
	}
	@Test
	public void test_tiny_1(){

		String t = "test1.txt";
		String p = "tinyEWD.txt";
		String[] Tests = {p,t};
		Helper.run(p,t);
		Main_Ex1.main(Tests);
		String Boazsel="";
		String Mysel = "Solutions/Solution_"+t+"_"+p+".txt";
		Vector<String> tmp = Name("./");
		for(String name : tmp)
		{
			if(name.contains("Solution_"+t+"_"+p+"_")) 
			{
				Boazsel = name;
				break;
			}
		}

		In MySel = new In(Mysel);
		In Boaz = new In(Boazsel);

		while((Boaz.hasNextLine()) && (MySel.hasNextLine())){
			String other = Boaz.readLine();
			String my = MySel.readLine();
			if(!my.contains("Results") && !other.contains("SE1_EX1 solution"))
			{
				assertEquals(my, other);

			}
		}
	}


	@Test
	public void test_tiny_2(){

		String t = "test1.txt";
		String p = "tinyEWG.txt";
		String[] Tests = {p,t};
		Helper.run(p,t);
		Main_Ex1.main(Tests);
		String Boazsel="";
		String Mysel = "Solutions/Solution_"+t+"_"+p+".txt";
		Vector<String> tmp = Name("./");
		for(String name : tmp)
		{
			if(name.contains("Solution_"+t+"_"+p+"_"))
			{
				Boazsel = name;
				break;
			}
		}

		In MySel = new In(Mysel);
		In Boaz = new In(Boazsel);

		while((Boaz.hasNextLine()) && (MySel.hasNextLine())){
			String other = Boaz.readLine();
			String my = MySel.readLine();
			if(!my.contains("Results") && !other.contains("SE1_EX1 solution"))
			{
				assertEquals(my, other);

			}
		}
	}
	
	@Test
	public void test_mid_1(){

		String t = "test1.txt";
		String p = "mediumEWD.txt";
		String[] Tests = {p,t};
		Helper.run(p,t);
		Main_Ex1.main(Tests);
		String Boazsel="";
		String Mysel = "Solutions/Solution_"+t+"_"+p+".txt";
		Vector<String> tmp = Name("./");
		for(String name : tmp)
		{
			if(name.contains("Solution_"+t+"_"+p+"_")) 
			{
				Boazsel = name;
				break;
			}
		}

		In MySel = new In(Mysel);
		In Boaz = new In(Boazsel);

		while((Boaz.hasNextLine()) && (MySel.hasNextLine())){
			String other = Boaz.readLine();
			String my = MySel.readLine();
			if(!my.contains("Results") && !other.contains("SE1_EX1 solution"))
			{
				assertEquals(my, other);

			}
		}
	}
	
	@Test
	public void test_mid_2(){

		String t = "test1.txt";
		String p = "mediumEWG.txt";
		String[] Tests = {p,t};
		Helper.run(p,t);
		Main_Ex1.main(Tests);
		String Boazsel="";
		String Mysel = "Solutions/Solution_"+t+"_"+p+".txt";
		Vector<String> tmp = Name("./");
		for(String name : tmp)
		{
			if(name.contains("Solution_"+t+"_"+p+"_"))
			{
				Boazsel = name;
				break;
			}
		}

		In MySel = new In(Mysel);
		In Boaz = new In(Boazsel);

		while((Boaz.hasNextLine()) && (MySel.hasNextLine())){
			String other = Boaz.readLine();
			String my = MySel.readLine();
			if(!my.contains("Results") && !other.contains("SE1_EX1 solution"))
			{
				assertEquals(my, other);

			}
		}
	}
	
	
	@Test
	public void test_mid_3(){

		String t = "test2.txt";
		String p = "mediumEWD.txt";
		String[] Tests = {p,t};
		Helper.run(p,t);
		Main_Ex1.main(Tests);
		String Boazsel="";
		String Mysel = "Solutions/Solution_"+t+"_"+p+".txt";
		Vector<String> tmp = Name("./");
		for(String name : tmp)
		{
			if(name.contains("Solution_"+t+"_"+p+"_")) 
			{
				Boazsel = name;
				break;
			}
		}

		In MySel = new In(Mysel);
		In Boaz = new In(Boazsel);

		while((Boaz.hasNextLine()) && (MySel.hasNextLine())){
			String other = Boaz.readLine();
			String my = MySel.readLine();
			if(!my.contains("Results") && !other.contains("SE1_EX1 solution"))
			{
				assertEquals(my, other);

			}
		}
	}
	
	@Test
	public void test_mid_4(){

		String t = "test2.txt";
		String p = "mediumEWG.txt";
		String[] Tests = {p,t};
		Helper.run(p,t);
		Main_Ex1.main(Tests);
		String Boazsel="";
		String Mysel = "Solutions/Solution_"+t+"_"+p+".txt";
		Vector<String> tmp = Name("./");
		for(String name : tmp)
		{
			if(name.contains("Solution_"+t+"_"+p+"_")) 
			{
				Boazsel = name;
				break;
			}
		}

		In MySel = new In(Mysel);
		In Boaz = new In(Boazsel);

		while((Boaz.hasNextLine()) && (MySel.hasNextLine())){
			String other = Boaz.readLine();
			String my = MySel.readLine();
			if(!my.contains("Results") && !other.contains("SE1_EX1 solution"))
			{
				assertEquals(my, other);

			}
		}
	}
	
	@Test
	public void test_mid_5(){

		String t = "test3.txt";
		String p = "mediumEWD.txt";
		String[] Tests = {p,t};
		Helper.run(p,t);
		Main_Ex1.main(Tests);
		String Boazsel="";
		String Mysel = "Solutions/Solution_"+t+"_"+p+".txt";
		Vector<String> tmp = Name("./");
		for(String name : tmp)
		{
			if(name.contains("Solution_"+t+"_"+p+"_")) 
			{
				Boazsel = name;
				break;
			}
		}

		In MySel = new In(Mysel);
		In Boaz = new In(Boazsel);

		while((Boaz.hasNextLine()) && (MySel.hasNextLine())){
			String other = Boaz.readLine();
			String my = MySel.readLine();
			if(!my.contains("Results") && !other.contains("SE1_EX1 solution"))
			{
				assertEquals(my, other);

			}
		}
	}
	
	@Test
	public void test_mid_6(){

		String t = "test3.txt";
		String p = "mediumEWG.txt";
		String[] Tests = {p,t};
		Helper.run(p,t);
		Main_Ex1.main(Tests);
		String Boazsel="";
		String Mysel = "Solutions/Solution_"+t+"_"+p+".txt";
		Vector<String> tmp = Name("./");
		for(String name : tmp)
		{
			if(name.contains("Solution_"+t+"_"+p+"_")) 
			{
				Boazsel = name;
				break;
			}
		}

		In MySel = new In(Mysel);
		In Boaz = new In(Boazsel);

		while((Boaz.hasNextLine()) && (MySel.hasNextLine())){
			String other = Boaz.readLine();
			String my = MySel.readLine();
			if(!my.contains("Results") && !other.contains("SE1_EX1 solution"))
			{
				assertEquals(my, other);

			}
		}
	}
	
	@Test
	public void test_larg_1(){

		String t = "test3.txt";
		String p = "largeEWD.txt";
		String[] Tests = {p,t};
		Helper.run(p,t);
		Main_Ex1.main(Tests);
		String Boazsel="";
		String Mysel = "Solutions/Solution_"+t+"_"+p+".txt";
		Vector<String> tmp = Name("./");
		for(String name : tmp)
		{
			if(name.contains("Solution_"+t+"_"+p+"_")) 
			{
				Boazsel = name;
				break;
			}
		}

		In MySel = new In(Mysel);
		In Boaz = new In(Boazsel);

		while((Boaz.hasNextLine()) && (MySel.hasNextLine())){
			String other = Boaz.readLine();
			String my = MySel.readLine();
			if(!my.contains("Results") && !other.contains("SE1_EX1 solution"))
			{
				assertEquals(my, other);

			}
		}
	}
}
