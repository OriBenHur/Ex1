import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Helper {
	public static void run(String Pointsfile, String Testfile)
	{		
		try
		{


			long start = new Date().getTime();
			String time = new SimpleDateFormat("HH.mm.ss").format(start);
			System.out.println("Start Testing...");
			System.out.println("Loading graph file: " + Pointsfile + " runing a test " + Testfile);
			String ans = "Solutions/Solution_" + Testfile + "_" + Pointsfile+".txt";

			FileWriter fw = new FileWriter(ans);
			PrintWriter os = new PrintWriter(fw);
			In in = new In(Pointsfile);
			EdgeWeightedDigraph G = new EdgeWeightedDigraph(in);
			long t1 = new Date().getTime();
			System.out.println("Done loading Graph: " + Pointsfile + "  in " + (t1 - start) + "  ms");
			FileReader fr = new FileReader(Testfile);
			BufferedReader br = new BufferedReader(fr);
			String num_of_lines = br.readLine();
			String s = br.readLine();
			int ll = 0;
			os.println(num_of_lines + " Results:");
			while ((s != null) && (ll < 20))
			{
				String[] sa = s.split(" ");
				int source = Integer.parseInt(sa[0]);
				int target = Integer.parseInt(sa[1]);
				int size_of_BL = Integer.parseInt(sa[2]);
				int[] BL = new int[size_of_BL];
				for (int i = 0; i < size_of_BL; i++) 
				{
					BL[i] = Integer.parseInt(sa[(i + 3)]);
				}
				double dist = DijkstraSP.sp(G, source, target, BL);
				os.println(s + " " + dist);
				ll++;
				s = br.readLine();
			}
			long t2 = new Date().getTime();
			System.out.println("Done computing shortest paths on Graph: " + Pointsfile + "  in " + (t2 - t1) + "  ms");
			System.out.println("Total time: " + (t2 - start) + "  ms");
			os.close();
			br.close();
		}

		catch (Exception e)
		{
			e.printStackTrace();
		}

	}
}
