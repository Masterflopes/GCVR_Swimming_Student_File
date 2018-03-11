import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class AlunosFileReader {

	ArrayList<Alunos> alunos;
	
	public AlunosFileReader() {
		alunos = new ArrayList<Alunos>();
        FileReader fr = null;
        BufferedReader br = null;
        String line = "";
        String nome;
        String data;
        boolean[] bools = new boolean[35];

        try {
            fr = new FileReader("alunos.txt");
            br = new BufferedReader(fr);

            line = br.readLine();
            while(line != null) {
            		bools = new boolean[35];
            		nome = line;
            		data = br.readLine();
            		for(int i = 0; i < 35; i++) {
            			line = br.readLine();
            			if(line.equals("T")) {
            				bools[i] = true;
            			}
            			else {
            				bools[i] = false;
            			}
            		}
            		alunos.add(new Alunos(nome,data,bools));
                line = br.readLine();
            }
            br.close();
            fr.close();
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
	}

	public ArrayList<Alunos> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Alunos> alunos) {
		this.alunos = alunos;
	}
	
	public void save_file() {
		try (PrintWriter out = new PrintWriter("alunos.txt")) {
			for(int i = 0; i < alunos.size(); i++) {
				 out.println(alunos.get(i).getName());
				 out.println(alunos.get(i).getDate());
				 for(int j = 0; j < 35; j++) {
					 if(alunos.get(i).getTicks()[j] == true) {
						 out.println("T");
					 }
					 else {
						 out.println("F");
					 }
				 }
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	

}
