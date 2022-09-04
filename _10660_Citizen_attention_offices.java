import java.io.*;
import java.util.StringTokenizer;
public class _10660_Citizen_attention_offices {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer tk;
		for (int xd = 0; xd < t; xd++){
			int M[][]= new int [5][5],n=Integer.parseInt(br.readLine());
			for (int i = 0; i < n; i++){tk = new StringTokenizer(br.readLine());
				M[Integer.parseInt(tk.nextToken())][Integer.parseInt(tk.nextToken())]=Integer.parseInt(tk.nextToken());}
			int D[][][]= new int [25][5][5],c=0,min=Integer.MAX_VALUE;
			for (int i1 = 0; i1 < 5; i1++){
				for (int i2 = 0; i2 < 5; i2++){
					for (int i = 0; i < 5; i++){
						for (int j = 0; j < 5; j++)D[c][i][j]=M[i][j]*(Math.abs(i1-i)+Math.abs(i2-j));
					}c++;
				}
			}
			StringBuilder sb= new StringBuilder();
			for (int i = 0; i < 5; i++){for (int j = 0; j < 5; j++)M[i][j]=i*5+j;}
			for (int i1 = 0; i1 < 5; i1++){
				for (int j1 = 0; j1 < 5; j1++){
					for (int i2 = i1,c2=j1+1; i2 < 5; i2++,c2=0){
						for (int j2 = c2; j2 < 5; j2++){
							for (int i3 = i2,c3=j2+1; i3 < 5; i3++,c3=0){
								for (int j3 = c3; j3 < 5; j3++){
									for (int i4 = i3,c4=j3+1; i4 < 5; i4++,c4=0){
										for (int j4 = c4; j4 < 5; j4++){
											for (int i5 = i4,c5=j4+1; i5 < 5; i5++,c5=0){
												for (int j5 = c5; j5 < 5; j5++){c=0;
													for (int i = 0; i < 5; i++){
														for (int j = 0; j < 5; j++){
															c+=Math.min(
																	Math.min(
																			Math.min(D[M[i1][j1]][i][j], D[M[i2][j2]][i][j]),
																			Math.min(D[M[i3][j3]][i][j], D[M[i4][j4]][i][j])),
																D[M[i5][j5]][i][j]);
														}
													}
													if(c<min){min=c;
														sb= new StringBuilder(M[i1][j1]+" "+M[i2][j2]+" "+M[i3][j3]+" "+M[i4][j4]+" "+M[i5][j5]);
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		
			pw.println(sb);
		}
		br.close();
		pw.close();
	}
}

/*
4
1
2 2 1
4
0 0 1
4 4 1
0 4 1
4 0 1
5
0 0 1
1 1 1
2 2 1
3 3 1
4 4 1
7
4 2 2
3 3 1
2 4 3
2 1 1
1 3 4
1 2 2
1 0 1



*/