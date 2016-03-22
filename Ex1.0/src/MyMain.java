import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyMain
{
	public static void main(String[] args) //throws Exception
	{
		try
		{
			long start = new Date().getTime();
			String time = new SimpleDateFormat("HH.mm.ss").format(start);
			System.out.println("Start Testing...");
			System.out.println("Loading graph file: " + args[0] + " runing a test " + args[1]);
			String ans = "Solution_" + args[1] + "_" + args[0] + "_" + time + ".txt";

			FileWriter fw = new FileWriter(ans);
			PrintWriter os = new PrintWriter(fw);
			In in = new In(args[0]);
			EdgeWeightedDigraph G = new EdgeWeightedDigraph(in);
			long s1 = new Date().getTime();
			System.out.println("Done loading Graph: " + args[0] + "  in " + (s1 - start) + "  ms");
			FileReader fr = new FileReader(args[1]);
			BufferedReader is = new BufferedReader(fr);
			String num_of_lines = is.readLine();
			String s = is.readLine();
			int ll = 0;
			os.println(num_of_lines + " Results:");
			while ((s != null) && (ll < 20))
			{
				String[] sa = s.split(" ");
				int source = Integer.parseInt(sa[0]);
				int target = Integer.parseInt(sa[1]);
				int size_of_BL = Integer.parseInt(sa[2]);
				int[] BL = new int[size_of_BL];
				for (int i = 0; i < size_of_BL; i++) {
					BL[i] = Integer.parseInt(sa[(i + 3)]);
				}
				double dist = DijkstraSP.sp(G, source, target, BL);
				os.println(s + " " + dist);
				ll++;
				s = is.readLine();
			}
			long s2 = new Date().getTime();
			System.out.println("Done computing shortest paths on Graph: " + args[0] + "  in " + (s2 - s1) + "  ms");
			System.out.println("Total time: " + (s2 - start) + "  ms");
			os.close();
			is.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}


}
