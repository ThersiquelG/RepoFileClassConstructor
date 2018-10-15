import java.io.File;
import java.io.FileFilter;

public class Testclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String répertoire de recherche
		String rep = "/home/simplon/Documents/Workspace/Eclipse projects/githubrepo/git/RepoFileClassConstructor/FileClass/src";
		
		
		
		File repFile = new File(rep);
		
		//Tableau files
		File [] fichiersJava = repFile.listFiles(new FileFilter() { 
			// cette interface n'a qu'une unique méthode 
			public boolean accept(File pathname) { 
				// on récupère le nom de ce fichier... 
				String fileName = pathname.getName() ; 
				// ... et on teste s'il se termine par .java 
				return fileName.endsWith(".java") ;
				
			}
		});
		
		
		//print des fichiers java
		for(File path:fichiersJava) {
			System.out.println(path);
		}
		
		


	}
}

