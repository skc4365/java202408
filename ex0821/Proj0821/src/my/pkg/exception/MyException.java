package my.pkg.exception;

public class MyException {

	public static void main(String[] args) {

		//	예외발생 	
		try {
			Exception e = new Exception("[내가 발생시킨 오류메세지]");
			throw e;
		} catch (Exception e) {
			System.out.println("에러메세지: " + e.getMessage());
			//실제로 발생된 오류를 정보를 확인할 수 있다.
			e.printStackTrace();
		} finally {
			System.out.println("---수행완료---");
		}

	}

}
