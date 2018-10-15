
public class Testclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(System.getProperty("user.dir")) ; 
		
		
		Employes employ1 = new Employes("didier", "chandouidoui");
		
		Employes employ2 = new Employes();
		employ2.setNom("jacquelin");
		employ2.setPrenom("Mario");
		employ2.setNumerosocial("123123123213123");
		
		
		
		System.out.println(employ2.toString());
		System.out.println(employ1.toString());
		
		
		//java.io.tmpdir
		System.out.println(System.getProperty("java.io.tmpdir"));
	}

}
