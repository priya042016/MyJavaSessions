package ExceptionHandling;

public class ThrowKeyword {

		public static void getData() {
			String data=null;
			try {
				throw new Exception("Data not found exception");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}

		public static void main(String[] args) {
			getData();

		}

}
