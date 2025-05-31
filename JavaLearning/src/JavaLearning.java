import java.io.IOException;

public class JavaLearning {
	
	
	class Green{
			public void show() throws Exception {
				System.out.println("ParentClass");
			}
		}
		
		class Red extends Green{
			@Override
			public void show() throws IOException{
				System.out.println("child Class");
			}
		}
	

	public static void main(String[] args) {
		

	}

}

